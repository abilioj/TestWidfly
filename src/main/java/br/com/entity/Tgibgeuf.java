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
@Table(name = "tgibgeuf")
@NamedQueries({
    @NamedQuery(name = "Tgibgeuf.findAll", query = "SELECT t FROM Tgibgeuf t")
    , @NamedQuery(name = "Tgibgeuf.findByIdtgibgeuf", query = "SELECT t FROM Tgibgeuf t WHERE t.idtgibgeuf = :idtgibgeuf")
    , @NamedQuery(name = "Tgibgeuf.findByCod", query = "SELECT t FROM Tgibgeuf t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgeuf.findByNome", query = "SELECT t FROM Tgibgeuf t WHERE t.nome = :nome")})
@XmlRootElement
public class Tgibgeuf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgibgeuf")
    private Integer idtgibgeuf;
    @Basic(optional = false)
   
    @Column(name = "cod")
    private int cod;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgeuf")
    private List<Tgibgemesoregiao> tgibgemesoregiaoList;

    public Tgibgeuf() {
    }

    public Tgibgeuf(Integer idtgibgeuf) {
        this.idtgibgeuf = idtgibgeuf;
    }

    public Tgibgeuf(Integer idtgibgeuf, int cod, String nome) {
        this.idtgibgeuf = idtgibgeuf;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgibgeuf() {
        return idtgibgeuf;
    }

    public void setIdtgibgeuf(Integer idtgibgeuf) {
        this.idtgibgeuf = idtgibgeuf;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Tgibgemesoregiao> getTgibgemesoregiaoList() {
        return tgibgemesoregiaoList;
    }

    public void setTgibgemesoregiaoList(List<Tgibgemesoregiao> tgibgemesoregiaoList) {
        this.tgibgemesoregiaoList = tgibgemesoregiaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgeuf != null ? idtgibgeuf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgeuf)) {
            return false;
        }
        Tgibgeuf other = (Tgibgeuf) object;
        if ((this.idtgibgeuf == null && other.idtgibgeuf != null) || (this.idtgibgeuf != null && !this.idtgibgeuf.equals(other.idtgibgeuf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgibgeuf[ idtgibgeuf=" + idtgibgeuf + " ]";
    }
    
}
