/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "recpaciente")
@NamedQueries({
    @NamedQuery(name = "Recpaciente.findAll", query = "SELECT r FROM Recpaciente r")
    , @NamedQuery(name = "Recpaciente.findByIdpaciente", query = "SELECT r FROM Recpaciente r WHERE r.idpaciente = :idpaciente")
    , @NamedQuery(name = "Recpaciente.findByNome", query = "SELECT r FROM Recpaciente r WHERE r.nome = :nome")
    , @NamedQuery(name = "Recpaciente.findByNomesocial", query = "SELECT r FROM Recpaciente r WHERE r.nomesocial = :nomesocial")
    , @NamedQuery(name = "Recpaciente.findByDatanascimento", query = "SELECT r FROM Recpaciente r WHERE r.datanascimento = :datanascimento")
    , @NamedQuery(name = "Recpaciente.findByApelido", query = "SELECT r FROM Recpaciente r WHERE r.apelido = :apelido")
    , @NamedQuery(name = "Recpaciente.findByDatacadastro", query = "SELECT r FROM Recpaciente r WHERE r.datacadastro = :datacadastro")
    , @NamedQuery(name = "Recpaciente.findByIdentidade", query = "SELECT r FROM Recpaciente r WHERE r.identidade = :identidade")
    , @NamedQuery(name = "Recpaciente.findByOrgaoemissor", query = "SELECT r FROM Recpaciente r WHERE r.orgaoemissor = :orgaoemissor")
    , @NamedQuery(name = "Recpaciente.findByDataemissao", query = "SELECT r FROM Recpaciente r WHERE r.dataemissao = :dataemissao")
    , @NamedQuery(name = "Recpaciente.findByCpf", query = "SELECT r FROM Recpaciente r WHERE r.cpf = :cpf")
    , @NamedQuery(name = "Recpaciente.findByCns", query = "SELECT r FROM Recpaciente r WHERE r.cns = :cns")
    , @NamedQuery(name = "Recpaciente.findByDnv", query = "SELECT r FROM Recpaciente r WHERE r.dnv = :dnv")
    , @NamedQuery(name = "Recpaciente.findByCartorio", query = "SELECT r FROM Recpaciente r WHERE r.cartorio = :cartorio")
    , @NamedQuery(name = "Recpaciente.findByLivro", query = "SELECT r FROM Recpaciente r WHERE r.livro = :livro")
    , @NamedQuery(name = "Recpaciente.findByFolha", query = "SELECT r FROM Recpaciente r WHERE r.folha = :folha")
    , @NamedQuery(name = "Recpaciente.findByDtemissaocart", query = "SELECT r FROM Recpaciente r WHERE r.dtemissaocart = :dtemissaocart")
    , @NamedQuery(name = "Recpaciente.findByNumendereco", query = "SELECT r FROM Recpaciente r WHERE r.numendereco = :numendereco")
    , @NamedQuery(name = "Recpaciente.findByComplementoend", query = "SELECT r FROM Recpaciente r WHERE r.complementoend = :complementoend")
    , @NamedQuery(name = "Recpaciente.findByNumeroagencia", query = "SELECT r FROM Recpaciente r WHERE r.numeroagencia = :numeroagencia")
    , @NamedQuery(name = "Recpaciente.findByTelefone", query = "SELECT r FROM Recpaciente r WHERE r.telefone = :telefone")
    , @NamedQuery(name = "Recpaciente.findByDddtelefone", query = "SELECT r FROM Recpaciente r WHERE r.dddtelefone = :dddtelefone")
    , @NamedQuery(name = "Recpaciente.findByDditelefone", query = "SELECT r FROM Recpaciente r WHERE r.dditelefone = :dditelefone")
    , @NamedQuery(name = "Recpaciente.findByCelular", query = "SELECT r FROM Recpaciente r WHERE r.celular = :celular")
    , @NamedQuery(name = "Recpaciente.findByDddcelular", query = "SELECT r FROM Recpaciente r WHERE r.dddcelular = :dddcelular")
    , @NamedQuery(name = "Recpaciente.findByDdicelular", query = "SELECT r FROM Recpaciente r WHERE r.ddicelular = :ddicelular")
    , @NamedQuery(name = "Recpaciente.findByTelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.telcomercial = :telcomercial")
    , @NamedQuery(name = "Recpaciente.findByDddtelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.dddtelcomercial = :dddtelcomercial")
    , @NamedQuery(name = "Recpaciente.findByDditelcomercial", query = "SELECT r FROM Recpaciente r WHERE r.dditelcomercial = :dditelcomercial")
    , @NamedQuery(name = "Recpaciente.findByEmail", query = "SELECT r FROM Recpaciente r WHERE r.email = :email")
    , @NamedQuery(name = "Recpaciente.findByLocaltrabalho", query = "SELECT r FROM Recpaciente r WHERE r.localtrabalho = :localtrabalho")
    , @NamedQuery(name = "Recpaciente.findByCargo", query = "SELECT r FROM Recpaciente r WHERE r.cargo = :cargo")
    , @NamedQuery(name = "Recpaciente.findByRegistrofuncionario", query = "SELECT r FROM Recpaciente r WHERE r.registrofuncionario = :registrofuncionario")
    , @NamedQuery(name = "Recpaciente.findByComplpaciente", query = "SELECT r FROM Recpaciente r WHERE r.complpaciente = :complpaciente")
    , @NamedQuery(name = "Recpaciente.findByNumeroconta", query = "SELECT r FROM Recpaciente r WHERE r.numeroconta = :numeroconta")
    , @NamedQuery(name = "Recpaciente.findByNomeparentesco", query = "SELECT r FROM Recpaciente r WHERE r.nomeparentesco = :nomeparentesco")
    , @NamedQuery(name = "Recpaciente.findByCpfparentesco", query = "SELECT r FROM Recpaciente r WHERE r.cpfparentesco = :cpfparentesco")
    , @NamedQuery(name = "Recpaciente.findByDataparentesco", query = "SELECT r FROM Recpaciente r WHERE r.dataparentesco = :dataparentesco")})
@XmlRootElement
public class Recpaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente")
    private Integer idpaciente;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @Column(name = "nomesocial")
    private String nomesocial;
    @Basic(optional = false)
   
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Column(name = "apelido")
    private String apelido;
    @Basic(optional = false)
   
    @Column(name = "datacadastro")
    @Temporal(TemporalType.DATE)
    private Date datacadastro;
    @Column(name = "identidade")
    private String identidade;
    @Column(name = "orgaoemissor")
    private String orgaoemissor;
    @Column(name = "dataemissao")
    @Temporal(TemporalType.DATE)
    private Date dataemissao;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "cns")
    private String cns;
    @Column(name = "dnv")
    private String dnv;
    @Column(name = "cartorio")
    private String cartorio;
    @Column(name = "livro")
    private String livro;
    @Column(name = "folha")
    private String folha;
    @Column(name = "dtemissaocart")
    @Temporal(TemporalType.DATE)
    private Date dtemissaocart;
    @Column(name = "numendereco")
    private String numendereco;
    @Column(name = "complementoend")
    private String complementoend;
    @Column(name = "numeroagencia")
    private String numeroagencia;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "dddtelefone")
    private String dddtelefone;
    @Column(name = "dditelefone")
    private String dditelefone;
    @Column(name = "celular")
    private String celular;
    @Column(name = "dddcelular")
    private String dddcelular;
    @Column(name = "ddicelular")
    private String ddicelular;
    @Column(name = "telcomercial")
    private String telcomercial;
    @Column(name = "dddtelcomercial")
    private String dddtelcomercial;
    @Column(name = "dditelcomercial")
    private String dditelcomercial;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email")
    private String email;
    @Column(name = "localtrabalho")
    private String localtrabalho;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "registrofuncionario")
    private String registrofuncionario;
    @Column(name = "complpaciente")
    private String complpaciente;
    @Column(name = "numeroconta")
    private String numeroconta;
    @Column(name = "nomeparentesco")
    private String nomeparentesco;
    @Column(name = "cpfparentesco")
    private String cpfparentesco;
    @Column(name = "dataparentesco")
    @Temporal(TemporalType.DATE)
    private Date dataparentesco;
    @JoinColumn(name = "idsexoparentesco", referencedColumnName = "idsexo")
    @ManyToOne(optional = false)
    private Recsexo idsexoparentesco;
    @JoinColumn(name = "idsexopaciente", referencedColumnName = "idsexo")
    @ManyToOne
    private Recsexo idsexopaciente;
    @JoinColumn(name = "idtbnacionalidade", referencedColumnName = "idtbnacionalidade")
    @ManyToOne
    private Tbnacionalidade idtbnacionalidade;
    @JoinColumn(name = "idtgbanco", referencedColumnName = "idtgbanco")
    @ManyToOne
    private Tgbanco idtgbanco;
    @JoinColumn(name = "idcep", referencedColumnName = "cep")
    @ManyToOne
    private Tgcep idcep;
    @JoinColumn(name = "idtgclasseecon", referencedColumnName = "idtgclasseecon")
    @ManyToOne
    private Tgclasseecon idtgclasseecon;
    @JoinColumn(name = "idtgvinculoemprego", referencedColumnName = "idtgvinculoemprego")
    @ManyToOne
    private Tgvinculoemprego idtgvinculoemprego;
    @JoinColumn(name = "idtgetnia", referencedColumnName = "idtgetnia")
    @ManyToOne(optional = false)
    private Tgetnia idtgetnia;
    @JoinColumn(name = "idtggrauinstrucao", referencedColumnName = "idtggrauinstrucao")
    @ManyToOne
    private Tggrauinstrucao idtggrauinstrucao;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne(optional = false)
    private Tgunidade idunidade;
    @JoinColumn(name = "idtnaturalidade", referencedColumnName = "idtgibgemunicipio")
    @ManyToOne
    private Tgibgemunicipio idtnaturalidade;
    @JoinColumn(name = "idtgparentesco", referencedColumnName = "idtgparentesco")
    @ManyToOne
    private Tgparentesco idtgparentesco;
    @JoinColumn(name = "ididtgreligiao", referencedColumnName = "idtgreligiao")
    @ManyToOne(optional = false)
    private Tgreligiao ididtgreligiao;
    @JoinColumn(name = "idtgprofissaocbo", referencedColumnName = "idtgprofissaocbo")
    @ManyToOne
    private Tgprofissaocbo idtgprofissaocbo;

    public Recpaciente() {
    }

    public Recpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Recpaciente(Integer idpaciente, String nome, Date datanascimento, Date datacadastro) {
        this.idpaciente = idpaciente;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.datacadastro = datacadastro;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomesocial() {
        return nomesocial;
    }

    public void setNomesocial(String nomesocial) {
        this.nomesocial = nomesocial;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getOrgaoemissor() {
        return orgaoemissor;
    }

    public void setOrgaoemissor(String orgaoemissor) {
        this.orgaoemissor = orgaoemissor;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getDnv() {
        return dnv;
    }

    public void setDnv(String dnv) {
        this.dnv = dnv;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getFolha() {
        return folha;
    }

    public void setFolha(String folha) {
        this.folha = folha;
    }

    public Date getDtemissaocart() {
        return dtemissaocart;
    }

    public void setDtemissaocart(Date dtemissaocart) {
        this.dtemissaocart = dtemissaocart;
    }

    public String getNumendereco() {
        return numendereco;
    }

    public void setNumendereco(String numendereco) {
        this.numendereco = numendereco;
    }

    public String getComplementoend() {
        return complementoend;
    }

    public void setComplementoend(String complementoend) {
        this.complementoend = complementoend;
    }

    public String getNumeroagencia() {
        return numeroagencia;
    }

    public void setNumeroagencia(String numeroagencia) {
        this.numeroagencia = numeroagencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDddtelefone() {
        return dddtelefone;
    }

    public void setDddtelefone(String dddtelefone) {
        this.dddtelefone = dddtelefone;
    }

    public String getDditelefone() {
        return dditelefone;
    }

    public void setDditelefone(String dditelefone) {
        this.dditelefone = dditelefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDddcelular() {
        return dddcelular;
    }

    public void setDddcelular(String dddcelular) {
        this.dddcelular = dddcelular;
    }

    public String getDdicelular() {
        return ddicelular;
    }

    public void setDdicelular(String ddicelular) {
        this.ddicelular = ddicelular;
    }

    public String getTelcomercial() {
        return telcomercial;
    }

    public void setTelcomercial(String telcomercial) {
        this.telcomercial = telcomercial;
    }

    public String getDddtelcomercial() {
        return dddtelcomercial;
    }

    public void setDddtelcomercial(String dddtelcomercial) {
        this.dddtelcomercial = dddtelcomercial;
    }

    public String getDditelcomercial() {
        return dditelcomercial;
    }

    public void setDditelcomercial(String dditelcomercial) {
        this.dditelcomercial = dditelcomercial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocaltrabalho() {
        return localtrabalho;
    }

    public void setLocaltrabalho(String localtrabalho) {
        this.localtrabalho = localtrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRegistrofuncionario() {
        return registrofuncionario;
    }

    public void setRegistrofuncionario(String registrofuncionario) {
        this.registrofuncionario = registrofuncionario;
    }

    public String getComplpaciente() {
        return complpaciente;
    }

    public void setComplpaciente(String complpaciente) {
        this.complpaciente = complpaciente;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getNomeparentesco() {
        return nomeparentesco;
    }

    public void setNomeparentesco(String nomeparentesco) {
        this.nomeparentesco = nomeparentesco;
    }

    public String getCpfparentesco() {
        return cpfparentesco;
    }

    public void setCpfparentesco(String cpfparentesco) {
        this.cpfparentesco = cpfparentesco;
    }

    public Date getDataparentesco() {
        return dataparentesco;
    }

    public void setDataparentesco(Date dataparentesco) {
        this.dataparentesco = dataparentesco;
    }

    public Recsexo getIdsexoparentesco() {
        return idsexoparentesco;
    }

    public void setIdsexoparentesco(Recsexo idsexoparentesco) {
        this.idsexoparentesco = idsexoparentesco;
    }

    public Recsexo getIdsexopaciente() {
        return idsexopaciente;
    }

    public void setIdsexopaciente(Recsexo idsexopaciente) {
        this.idsexopaciente = idsexopaciente;
    }

    public Tbnacionalidade getIdtbnacionalidade() {
        return idtbnacionalidade;
    }

    public void setIdtbnacionalidade(Tbnacionalidade idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public Tgbanco getIdtgbanco() {
        return idtgbanco;
    }

    public void setIdtgbanco(Tgbanco idtgbanco) {
        this.idtgbanco = idtgbanco;
    }

    public Tgcep getIdcep() {
        return idcep;
    }

    public void setIdcep(Tgcep idcep) {
        this.idcep = idcep;
    }

    public Tgclasseecon getIdtgclasseecon() {
        return idtgclasseecon;
    }

    public void setIdtgclasseecon(Tgclasseecon idtgclasseecon) {
        this.idtgclasseecon = idtgclasseecon;
    }

    public Tgvinculoemprego getIdtgvinculoemprego() {
        return idtgvinculoemprego;
    }

    public void setIdtgvinculoemprego(Tgvinculoemprego idtgvinculoemprego) {
        this.idtgvinculoemprego = idtgvinculoemprego;
    }

    public Tgetnia getIdtgetnia() {
        return idtgetnia;
    }

    public void setIdtgetnia(Tgetnia idtgetnia) {
        this.idtgetnia = idtgetnia;
    }

    public Tggrauinstrucao getIdtggrauinstrucao() {
        return idtggrauinstrucao;
    }

    public void setIdtggrauinstrucao(Tggrauinstrucao idtggrauinstrucao) {
        this.idtggrauinstrucao = idtggrauinstrucao;
    }

    public Tgunidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Tgunidade idunidade) {
        this.idunidade = idunidade;
    }

    public Tgibgemunicipio getIdtnaturalidade() {
        return idtnaturalidade;
    }

    public void setIdtnaturalidade(Tgibgemunicipio idtnaturalidade) {
        this.idtnaturalidade = idtnaturalidade;
    }

    public Tgparentesco getIdtgparentesco() {
        return idtgparentesco;
    }

    public void setIdtgparentesco(Tgparentesco idtgparentesco) {
        this.idtgparentesco = idtgparentesco;
    }

    public Tgreligiao getIdidtgreligiao() {
        return ididtgreligiao;
    }

    public void setIdidtgreligiao(Tgreligiao ididtgreligiao) {
        this.ididtgreligiao = ididtgreligiao;
    }

    public Tgprofissaocbo getIdtgprofissaocbo() {
        return idtgprofissaocbo;
    }

    public void setIdtgprofissaocbo(Tgprofissaocbo idtgprofissaocbo) {
        this.idtgprofissaocbo = idtgprofissaocbo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recpaciente)) {
            return false;
        }
        Recpaciente other = (Recpaciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Recpaciente[ idpaciente=" + idpaciente + " ]";
    }
    
}
