/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "tgunidade")
@NamedQueries({
    @NamedQuery(name = "Tgunidade.findAll", query = "SELECT t FROM Tgunidade t")
    , @NamedQuery(name = "Tgunidade.findByIdunidade", query = "SELECT t FROM Tgunidade t WHERE t.idunidade = :idunidade")
    , @NamedQuery(name = "Tgunidade.findByBairro", query = "SELECT t FROM Tgunidade t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "Tgunidade.findByCidade", query = "SELECT t FROM Tgunidade t WHERE t.cidade = :cidade")
    , @NamedQuery(name = "Tgunidade.findByCnes", query = "SELECT t FROM Tgunidade t WHERE t.cnes = :cnes")
    , @NamedQuery(name = "Tgunidade.findByCnpjunidade", query = "SELECT t FROM Tgunidade t WHERE t.cnpjunidade = :cnpjunidade")
    , @NamedQuery(name = "Tgunidade.findByDtfinal", query = "SELECT t FROM Tgunidade t WHERE t.dtfinal = :dtfinal")
    , @NamedQuery(name = "Tgunidade.findByDtinicial", query = "SELECT t FROM Tgunidade t WHERE t.dtinicial = :dtinicial")
    , @NamedQuery(name = "Tgunidade.findByEmail", query = "SELECT t FROM Tgunidade t WHERE t.email = :email")
    , @NamedQuery(name = "Tgunidade.findByEndereco", query = "SELECT t FROM Tgunidade t WHERE t.endereco = :endereco")
    , @NamedQuery(name = "Tgunidade.findByNome", query = "SELECT t FROM Tgunidade t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tgunidade.findByFantasia", query = "SELECT t FROM Tgunidade t WHERE t.fantasia = :fantasia")
    , @NamedQuery(name = "Tgunidade.findByIbge", query = "SELECT t FROM Tgunidade t WHERE t.ibge = :ibge")
    , @NamedQuery(name = "Tgunidade.findByInscestadual", query = "SELECT t FROM Tgunidade t WHERE t.inscestadual = :inscestadual")
    , @NamedQuery(name = "Tgunidade.findByInscmunicipal", query = "SELECT t FROM Tgunidade t WHERE t.inscmunicipal = :inscmunicipal")
    , @NamedQuery(name = "Tgunidade.findByLogo", query = "SELECT t FROM Tgunidade t WHERE t.logo = :logo")
    , @NamedQuery(name = "Tgunidade.findByPais", query = "SELECT t FROM Tgunidade t WHERE t.pais = :pais")
    , @NamedQuery(name = "Tgunidade.findByTelefone", query = "SELECT t FROM Tgunidade t WHERE t.telefone = :telefone")
    , @NamedQuery(name = "Tgunidade.findByUf", query = "SELECT t FROM Tgunidade t WHERE t.uf = :uf")})
public class Tgunidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idunidade")
    private Integer idunidade;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cnes")
    private String cnes;
    @Column(name = "cnpjunidade")
    private String cnpjunidade;
    @Basic(optional = false)
   
    @Column(name = "dtfinal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfinal;
    @Basic(optional = false)
   
    @Column(name = "dtinicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinicial;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
   
    @Column(name = "fantasia")
    private String fantasia;
    @Column(name = "ibge")
    private String ibge;
    @Column(name = "inscestadual")
    private String inscestadual;
    @Column(name = "inscmunicipal")
    private String inscmunicipal;
    @Column(name = "logo")
    private BigInteger logo;
    @Column(name = "pais")
    private String pais;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "uf")
    private String uf;
    @JoinColumn(name = "idgestor", referencedColumnName = "idgestor")
    @ManyToOne
    private Tggestor idgestor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Recpaciente> recpacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Guggrupos> guggruposList;

    public Tgunidade() {
    }

    public Tgunidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public Tgunidade(Integer idunidade, Date dtfinal, Date dtinicial, String nome, String fantasia) {
        this.idunidade = idunidade;
        this.dtfinal = dtfinal;
        this.dtinicial = dtinicial;
        this.nome = nome;
        this.fantasia = fantasia;
    }

    public Integer getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    public String getCnpjunidade() {
        return cnpjunidade;
    }

    public void setCnpjunidade(String cnpjunidade) {
        this.cnpjunidade = cnpjunidade;
    }

    public Date getDtfinal() {
        return dtfinal;
    }

    public void setDtfinal(Date dtfinal) {
        this.dtfinal = dtfinal;
    }

    public Date getDtinicial() {
        return dtinicial;
    }

    public void setDtinicial(Date dtinicial) {
        this.dtinicial = dtinicial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getInscestadual() {
        return inscestadual;
    }

    public void setInscestadual(String inscestadual) {
        this.inscestadual = inscestadual;
    }

    public String getInscmunicipal() {
        return inscmunicipal;
    }

    public void setInscmunicipal(String inscmunicipal) {
        this.inscmunicipal = inscmunicipal;
    }

    public BigInteger getLogo() {
        return logo;
    }

    public void setLogo(BigInteger logo) {
        this.logo = logo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Tggestor getIdgestor() {
        return idgestor;
    }

    public void setIdgestor(Tggestor idgestor) {
        this.idgestor = idgestor;
    }

    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    public List<Guggrupos> getGuggruposList() {
        return guggruposList;
    }

    public void setGuggruposList(List<Guggrupos> guggruposList) {
        this.guggruposList = guggruposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidade != null ? idunidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgunidade)) {
            return false;
        }
        Tgunidade other = (Tgunidade) object;
        if ((this.idunidade == null && other.idunidade != null) || (this.idunidade != null && !this.idunidade.equals(other.idunidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgunidade[ idunidade=" + idunidade + " ]";
    }
    
}
