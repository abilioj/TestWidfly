/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "tgcep")
@NamedQueries({
    @NamedQuery(name = "Tgcep.findAll", query = "SELECT t FROM Tgcep t")
    , @NamedQuery(name = "Tgcep.findByCep", query = "SELECT t FROM Tgcep t WHERE t.cep = :cep")
    , @NamedQuery(name = "Tgcep.findByLogradouro", query = "SELECT t FROM Tgcep t WHERE t.logradouro = :logradouro")
    , @NamedQuery(name = "Tgcep.findByBairro", query = "SELECT t FROM Tgcep t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "Tgcep.findByUf", query = "SELECT t FROM Tgcep t WHERE t.uf = :uf")
    , @NamedQuery(name = "Tgcep.findByAtivo", query = "SELECT t FROM Tgcep t WHERE t.ativo = :ativo")})
public class Tgcep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "cep")
    private Integer cep;
    @Basic(optional = false)
   
    @Column(name = "logradouro")
    private String logradouro;
    @Basic(optional = false)
   
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
   
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
   
    @Column(name = "ativo")
    private boolean ativo;
    @JoinColumn(name = "idtgibgemunicipio", referencedColumnName = "idtgibgemunicipio")
    @ManyToOne(optional = false)
    private Tgibgemunicipio idtgibgemunicipio;
    @JoinColumn(name = "idtipolog", referencedColumnName = "idtipolog")
    @ManyToOne(optional = false)
    private Tgtipologradouro idtipolog;
    @OneToMany(mappedBy = "idcep")
    private List<Recpaciente> recpacienteList;

    public Tgcep() {
    }

    public Tgcep(Integer cep) {
        this.cep = cep;
    }

    public Tgcep(Integer cep, String logradouro, String bairro, String uf, boolean ativo) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.uf = uf;
        this.ativo = ativo;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Tgibgemunicipio getIdtgibgemunicipio() {
        return idtgibgemunicipio;
    }

    public void setIdtgibgemunicipio(Tgibgemunicipio idtgibgemunicipio) {
        this.idtgibgemunicipio = idtgibgemunicipio;
    }

    public Tgtipologradouro getIdtipolog() {
        return idtipolog;
    }

    public void setIdtipolog(Tgtipologradouro idtipolog) {
        this.idtipolog = idtipolog;
    }

    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cep != null ? cep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgcep)) {
            return false;
        }
        Tgcep other = (Tgcep) object;
        if ((this.cep == null && other.cep != null) || (this.cep != null && !this.cep.equals(other.cep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgcep[ cep=" + cep + " ]";
    }
    
}
