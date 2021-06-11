/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "tgtipologradouro")
@NamedQueries({
    @NamedQuery(name = "Tgtipologradouro.findAll", query = "SELECT t FROM Tgtipologradouro t")
    , @NamedQuery(name = "Tgtipologradouro.findByIdtipolog", query = "SELECT t FROM Tgtipologradouro t WHERE t.idtipolog = :idtipolog")
    , @NamedQuery(name = "Tgtipologradouro.findByNome", query = "SELECT t FROM Tgtipologradouro t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tgtipologradouro.findBySigla", query = "SELECT t FROM Tgtipologradouro t WHERE t.sigla = :sigla")
    , @NamedQuery(name = "Tgtipologradouro.findByAtivo", query = "SELECT t FROM Tgtipologradouro t WHERE t.ativo = :ativo")})
@XmlRootElement
public class Tgtipologradouro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtipolog")
    private Integer idtipolog;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
   
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
   
    @Column(name = "ativo")
    private boolean ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipolog")
    private List<Tgcep> tgcepList;

    public Tgtipologradouro() {
    }

    public Tgtipologradouro(Integer idtipolog) {
        this.idtipolog = idtipolog;
    }

    public Tgtipologradouro(Integer idtipolog, String nome, String sigla, boolean ativo) {
        this.idtipolog = idtipolog;
        this.nome = nome;
        this.sigla = sigla;
        this.ativo = ativo;
    }

    public Integer getIdtipolog() {
        return idtipolog;
    }

    public void setIdtipolog(Integer idtipolog) {
        this.idtipolog = idtipolog;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @XmlTransient
    public List<Tgcep> getTgcepList() {
        return tgcepList;
    }

    public void setTgcepList(List<Tgcep> tgcepList) {
        this.tgcepList = tgcepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipolog != null ? idtipolog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgtipologradouro)) {
            return false;
        }
        Tgtipologradouro other = (Tgtipologradouro) object;
        if ((this.idtipolog == null && other.idtipolog != null) || (this.idtipolog != null && !this.idtipolog.equals(other.idtipolog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgtipologradouro[ idtipolog=" + idtipolog + " ]";
    }
    
}
