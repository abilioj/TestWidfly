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
@Table(name = "guggrupos")
@NamedQueries({
    @NamedQuery(name = "Guggrupos.findAll", query = "SELECT g FROM Guggrupos g")
    , @NamedQuery(name = "Guggrupos.findByIdguggrupos", query = "SELECT g FROM Guggrupos g WHERE g.idguggrupos = :idguggrupos")
    , @NamedQuery(name = "Guggrupos.findByNome", query = "SELECT g FROM Guggrupos g WHERE g.nome = :nome")})
public class Guggrupos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idguggrupos")
    private Integer idguggrupos;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idgrupo")
    private List<Gugusuarios> gugusuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGuggrupos")
    private List<Gugmenugrupos> gugmenugruposList;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne(optional = false)
    private Tgunidade idunidade;

    public Guggrupos() {
    }

    public Guggrupos(Integer idguggrupos) {
        this.idguggrupos = idguggrupos;
    }

    public Guggrupos(Integer idguggrupos, String nome) {
        this.idguggrupos = idguggrupos;
        this.nome = nome;
    }

    public Integer getIdguggrupos() {
        return idguggrupos;
    }

    public void setIdguggrupos(Integer idguggrupos) {
        this.idguggrupos = idguggrupos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Gugusuarios> getGugusuariosList() {
        return gugusuariosList;
    }

    public void setGugusuariosList(List<Gugusuarios> gugusuariosList) {
        this.gugusuariosList = gugusuariosList;
    }

    public List<Gugmenugrupos> getGugmenugruposList() {
        return gugmenugruposList;
    }

    public void setGugmenugruposList(List<Gugmenugrupos> gugmenugruposList) {
        this.gugmenugruposList = gugmenugruposList;
    }

    public Tgunidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Tgunidade idunidade) {
        this.idunidade = idunidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idguggrupos != null ? idguggrupos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guggrupos)) {
            return false;
        }
        Guggrupos other = (Guggrupos) object;
        if ((this.idguggrupos == null && other.idguggrupos != null) || (this.idguggrupos != null && !this.idguggrupos.equals(other.idguggrupos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Guggrupos[ idguggrupos=" + idguggrupos + " ]";
    }
    
}
