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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tgetnia")
@NamedQueries({
    @NamedQuery(name = "Tgetnia.findAll", query = "SELECT t FROM Tgetnia t")
    , @NamedQuery(name = "Tgetnia.findByIdtgetnia", query = "SELECT t FROM Tgetnia t WHERE t.idtgetnia = :idtgetnia")
    , @NamedQuery(name = "Tgetnia.findByDescricao", query = "SELECT t FROM Tgetnia t WHERE t.descricao = :descricao")})
public class Tgetnia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtgetnia")
    private Integer idtgetnia;
    @Basic(optional = false)
   
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgetnia")
    private List<Recpaciente> recpacienteList;

    public Tgetnia() {
    }

    public Tgetnia(Integer idtgetnia) {
        this.idtgetnia = idtgetnia;
    }

    public Tgetnia(Integer idtgetnia, String descricao) {
        this.idtgetnia = idtgetnia;
        this.descricao = descricao;
    }

    public Integer getIdtgetnia() {
        return idtgetnia;
    }

    public void setIdtgetnia(Integer idtgetnia) {
        this.idtgetnia = idtgetnia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        hash += (idtgetnia != null ? idtgetnia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgetnia)) {
            return false;
        }
        Tgetnia other = (Tgetnia) object;
        if ((this.idtgetnia == null && other.idtgetnia != null) || (this.idtgetnia != null && !this.idtgetnia.equals(other.idtgetnia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgetnia[ idtgetnia=" + idtgetnia + " ]";
    }
    
}
