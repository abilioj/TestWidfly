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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "tggestor")
@NamedQueries({
    @NamedQuery(name = "Tggestor.findAll", query = "SELECT t FROM Tggestor t")
    , @NamedQuery(name = "Tggestor.findByIdgestor", query = "SELECT t FROM Tggestor t WHERE t.idgestor = :idgestor")
    , @NamedQuery(name = "Tggestor.findByBairro", query = "SELECT t FROM Tggestor t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "Tggestor.findByCidade", query = "SELECT t FROM Tggestor t WHERE t.cidade = :cidade")
    , @NamedQuery(name = "Tggestor.findByCnpj", query = "SELECT t FROM Tggestor t WHERE t.cnpj = :cnpj")
    , @NamedQuery(name = "Tggestor.findByDtfinal", query = "SELECT t FROM Tggestor t WHERE t.dtfinal = :dtfinal")
    , @NamedQuery(name = "Tggestor.findByDtinicial", query = "SELECT t FROM Tggestor t WHERE t.dtinicial = :dtinicial")
    , @NamedQuery(name = "Tggestor.findByEmail", query = "SELECT t FROM Tggestor t WHERE t.email = :email")
    , @NamedQuery(name = "Tggestor.findByEndereco", query = "SELECT t FROM Tggestor t WHERE t.endereco = :endereco")
    , @NamedQuery(name = "Tggestor.findByFantasia", query = "SELECT t FROM Tggestor t WHERE t.fantasia = :fantasia")
    , @NamedQuery(name = "Tggestor.findByInscestadual", query = "SELECT t FROM Tggestor t WHERE t.inscestadual = :inscestadual")
    , @NamedQuery(name = "Tggestor.findByInscmunicipal", query = "SELECT t FROM Tggestor t WHERE t.inscmunicipal = :inscmunicipal")
    , @NamedQuery(name = "Tggestor.findByLogo", query = "SELECT t FROM Tggestor t WHERE t.logo = :logo")
    , @NamedQuery(name = "Tggestor.findByNome", query = "SELECT t FROM Tggestor t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tggestor.findByPais", query = "SELECT t FROM Tggestor t WHERE t.pais = :pais")
    , @NamedQuery(name = "Tggestor.findByTelefone", query = "SELECT t FROM Tggestor t WHERE t.telefone = :telefone")
    , @NamedQuery(name = "Tggestor.findByUf", query = "SELECT t FROM Tggestor t WHERE t.uf = :uf")})
public class Tggestor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idgestor")
    private Integer idgestor;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
   
    @Column(name = "cnpj")
    private String cnpj;
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
   
    @Column(name = "fantasia")
    private String fantasia;
    @Column(name = "inscestadual")
    private String inscestadual;
    @Column(name = "inscmunicipal")
    private String inscmunicipal;
    @Column(name = "logo")
    private BigInteger logo;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @Column(name = "pais")
    private String pais;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "uf")
    private String uf;
    @ManyToMany(mappedBy = "tggestorList")
    private List<Gugusuarios> gugusuariosList;
    @OneToMany(mappedBy = "idgestor")
    private List<Tgunidade> tgunidadeList;

    public Tggestor() {
    }

    public Tggestor(Integer idgestor) {
        this.idgestor = idgestor;
    }

    public Tggestor(Integer idgestor, String cnpj, Date dtfinal, Date dtinicial, String fantasia, String nome) {
        this.idgestor = idgestor;
        this.cnpj = cnpj;
        this.dtfinal = dtfinal;
        this.dtinicial = dtinicial;
        this.fantasia = fantasia;
        this.nome = nome;
    }

    public Integer getIdgestor() {
        return idgestor;
    }

    public void setIdgestor(Integer idgestor) {
        this.idgestor = idgestor;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Gugusuarios> getGugusuariosList() {
        return gugusuariosList;
    }

    public void setGugusuariosList(List<Gugusuarios> gugusuariosList) {
        this.gugusuariosList = gugusuariosList;
    }

    public List<Tgunidade> getTgunidadeList() {
        return tgunidadeList;
    }

    public void setTgunidadeList(List<Tgunidade> tgunidadeList) {
        this.tgunidadeList = tgunidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgestor != null ? idgestor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tggestor)) {
            return false;
        }
        Tggestor other = (Tggestor) object;
        if ((this.idgestor == null && other.idgestor != null) || (this.idgestor != null && !this.idgestor.equals(other.idgestor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tggestor[ idgestor=" + idgestor + " ]";
    }
    
}
