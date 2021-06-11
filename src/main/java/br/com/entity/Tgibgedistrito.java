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
@Table(name = "tgibgedistrito")
@NamedQueries({
    @NamedQuery(name = "Tgibgedistrito.findAll", query = "SELECT t FROM Tgibgedistrito t")
    , @NamedQuery(name = "Tgibgedistrito.findByIdtgibgedistrito", query = "SELECT t FROM Tgibgedistrito t WHERE t.idtgibgedistrito = :idtgibgedistrito")
    , @NamedQuery(name = "Tgibgedistrito.findByCod", query = "SELECT t FROM Tgibgedistrito t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgedistrito.findByCodcompleto", query = "SELECT t FROM Tgibgedistrito t WHERE t.codcompleto = :codcompleto")
    , @NamedQuery(name = "Tgibgedistrito.findByNome", query = "SELECT t FROM Tgibgedistrito t WHERE t.nome = :nome")})
public class Tgibgedistrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgibgedistrito")
    private Integer idtgibgedistrito;
    @Basic(optional = false)
   
    @Column(name = "cod")
    private int cod;
    @Basic(optional = false)
   
    @Column(name = "codcompleto")
    private int codcompleto;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "idtgibgemunicipio", referencedColumnName = "idtgibgemunicipio")
    @ManyToOne(optional = false)
    private Tgibgemunicipio idtgibgemunicipio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgedistrito")
    private List<Tgibgesubdistrito> tgibgesubdistritoList;

    public Tgibgedistrito() {
    }

    public Tgibgedistrito(Integer idtgibgedistrito) {
        this.idtgibgedistrito = idtgibgedistrito;
    }

    public Tgibgedistrito(Integer idtgibgedistrito, int cod, int codcompleto, String nome) {
        this.idtgibgedistrito = idtgibgedistrito;
        this.cod = cod;
        this.codcompleto = codcompleto;
        this.nome = nome;
    }

    public Integer getIdtgibgedistrito() {
        return idtgibgedistrito;
    }

    public void setIdtgibgedistrito(Integer idtgibgedistrito) {
        this.idtgibgedistrito = idtgibgedistrito;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodcompleto() {
        return codcompleto;
    }

    public void setCodcompleto(int codcompleto) {
        this.codcompleto = codcompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tgibgemunicipio getIdtgibgemunicipio() {
        return idtgibgemunicipio;
    }

    public void setIdtgibgemunicipio(Tgibgemunicipio idtgibgemunicipio) {
        this.idtgibgemunicipio = idtgibgemunicipio;
    }

    public List<Tgibgesubdistrito> getTgibgesubdistritoList() {
        return tgibgesubdistritoList;
    }

    public void setTgibgesubdistritoList(List<Tgibgesubdistrito> tgibgesubdistritoList) {
        this.tgibgesubdistritoList = tgibgesubdistritoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgedistrito != null ? idtgibgedistrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgedistrito)) {
            return false;
        }
        Tgibgedistrito other = (Tgibgedistrito) object;
        if ((this.idtgibgedistrito == null && other.idtgibgedistrito != null) || (this.idtgibgedistrito != null && !this.idtgibgedistrito.equals(other.idtgibgedistrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgibgedistrito[ idtgibgedistrito=" + idtgibgedistrito + " ]";
    }
    
}
