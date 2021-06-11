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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "tgvinculoemprego")
@NamedQueries({
    @NamedQuery(name = "Tgvinculoemprego.findAll", query = "SELECT t FROM Tgvinculoemprego t")
    , @NamedQuery(name = "Tgvinculoemprego.findByIdtgvinculoemprego", query = "SELECT t FROM Tgvinculoemprego t WHERE t.idtgvinculoemprego = :idtgvinculoemprego")
    , @NamedQuery(name = "Tgvinculoemprego.findByNome", query = "SELECT t FROM Tgvinculoemprego t WHERE t.nome = :nome")})
@XmlRootElement
public class Tgvinculoemprego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgvinculoemprego")
    private Integer idtgvinculoemprego;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "idtgvinculoemprego")
    private List<Recpaciente> recpacienteList;

    public Tgvinculoemprego() {
    }

    public Tgvinculoemprego(Integer idtgvinculoemprego) {
        this.idtgvinculoemprego = idtgvinculoemprego;
    }

    public Tgvinculoemprego(Integer idtgvinculoemprego, String nome) {
        this.idtgvinculoemprego = idtgvinculoemprego;
        this.nome = nome;
    }

    public Integer getIdtgvinculoemprego() {
        return idtgvinculoemprego;
    }

    public void setIdtgvinculoemprego(Integer idtgvinculoemprego) {
        this.idtgvinculoemprego = idtgvinculoemprego;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgvinculoemprego != null ? idtgvinculoemprego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgvinculoemprego)) {
            return false;
        }
        Tgvinculoemprego other = (Tgvinculoemprego) object;
        if ((this.idtgvinculoemprego == null && other.idtgvinculoemprego != null) || (this.idtgvinculoemprego != null && !this.idtgvinculoemprego.equals(other.idtgvinculoemprego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgvinculoemprego[ idtgvinculoemprego=" + idtgvinculoemprego + " ]";
    }
    
}
