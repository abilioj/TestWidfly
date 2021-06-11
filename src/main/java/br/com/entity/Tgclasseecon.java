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
@Table(name = "tgclasseecon")
@NamedQueries({
    @NamedQuery(name = "Tgclasseecon.findAll", query = "SELECT t FROM Tgclasseecon t")
    , @NamedQuery(name = "Tgclasseecon.findByIdtgclasseecon", query = "SELECT t FROM Tgclasseecon t WHERE t.idtgclasseecon = :idtgclasseecon")
    , @NamedQuery(name = "Tgclasseecon.findByNome", query = "SELECT t FROM Tgclasseecon t WHERE t.nome = :nome")})
public class Tgclasseecon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgclasseecon")
    private Integer idtgclasseecon;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "idtgclasseecon")
    private List<Recpaciente> recpacienteList;

    public Tgclasseecon() {
    }

    public Tgclasseecon(Integer idtgclasseecon) {
        this.idtgclasseecon = idtgclasseecon;
    }

    public Tgclasseecon(Integer idtgclasseecon, String nome) {
        this.idtgclasseecon = idtgclasseecon;
        this.nome = nome;
    }

    public Integer getIdtgclasseecon() {
        return idtgclasseecon;
    }

    public void setIdtgclasseecon(Integer idtgclasseecon) {
        this.idtgclasseecon = idtgclasseecon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        hash += (idtgclasseecon != null ? idtgclasseecon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgclasseecon)) {
            return false;
        }
        Tgclasseecon other = (Tgclasseecon) object;
        if ((this.idtgclasseecon == null && other.idtgclasseecon != null) || (this.idtgclasseecon != null && !this.idtgclasseecon.equals(other.idtgclasseecon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgclasseecon[ idtgclasseecon=" + idtgclasseecon + " ]";
    }
    
}
