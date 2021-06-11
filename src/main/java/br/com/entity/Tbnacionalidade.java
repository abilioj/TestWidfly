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
@Table(name = "tbnacionalidade")
@NamedQueries({
    @NamedQuery(name = "Tbnacionalidade.findAll", query = "SELECT t FROM Tbnacionalidade t")
    , @NamedQuery(name = "Tbnacionalidade.findByIdtbnacionalidade", query = "SELECT t FROM Tbnacionalidade t WHERE t.idtbnacionalidade = :idtbnacionalidade")
    , @NamedQuery(name = "Tbnacionalidade.findByNome", query = "SELECT t FROM Tbnacionalidade t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tbnacionalidade.findByDdi", query = "SELECT t FROM Tbnacionalidade t WHERE t.ddi = :ddi")})
@XmlRootElement
public class Tbnacionalidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtbnacionalidade")
    private Integer idtbnacionalidade;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @Column(name = "ddi")
    private String ddi;
    @OneToMany(mappedBy = "idtbnacionalidade")
    private List<Recpaciente> recpacienteList;

    public Tbnacionalidade() {
    }

    public Tbnacionalidade(Integer idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public Tbnacionalidade(Integer idtbnacionalidade, String nome) {
        this.idtbnacionalidade = idtbnacionalidade;
        this.nome = nome;
    }

    public Integer getIdtbnacionalidade() {
        return idtbnacionalidade;
    }

    public void setIdtbnacionalidade(Integer idtbnacionalidade) {
        this.idtbnacionalidade = idtbnacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
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
        hash += (idtbnacionalidade != null ? idtbnacionalidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbnacionalidade)) {
            return false;
        }
        Tbnacionalidade other = (Tbnacionalidade) object;
        if ((this.idtbnacionalidade == null && other.idtbnacionalidade != null) || (this.idtbnacionalidade != null && !this.idtbnacionalidade.equals(other.idtbnacionalidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tbnacionalidade[ idtbnacionalidade=" + idtbnacionalidade + " ]";
    }
    
}
