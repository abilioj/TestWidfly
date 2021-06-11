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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "tgibgemunicipio")
@NamedQueries({
    @NamedQuery(name = "Tgibgemunicipio.findAll", query = "SELECT t FROM Tgibgemunicipio t")
    , @NamedQuery(name = "Tgibgemunicipio.findByIdtgibgemunicipio", query = "SELECT t FROM Tgibgemunicipio t WHERE t.idtgibgemunicipio = :idtgibgemunicipio")
    , @NamedQuery(name = "Tgibgemunicipio.findByCod", query = "SELECT t FROM Tgibgemunicipio t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgemunicipio.findByCodcompleto", query = "SELECT t FROM Tgibgemunicipio t WHERE t.codcompleto = :codcompleto")
    , @NamedQuery(name = "Tgibgemunicipio.findByNome", query = "SELECT t FROM Tgibgemunicipio t WHERE t.nome = :nome")})
@XmlRootElement
public class Tgibgemunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgibgemunicipio")
    private Integer idtgibgemunicipio;
    @Basic(optional = false)
   
    @Column(name = "cod")
    private int cod;
    @Basic(optional = false)
   
    @Column(name = "codcompleto")
    private int codcompleto;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemunicipio")
    private List<Tgibgedistrito> tgibgedistritoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemunicipio")
    private List<Tgcep> tgcepList;
    @OneToMany(mappedBy = "idtnaturalidade")
    private List<Recpaciente> recpacienteList;
    @JoinColumn(name = "idtgibgemacroregiao", referencedColumnName = "idtgibgemacroregiao")
    @ManyToOne(optional = false)
    private Tgibgemacroregiao idtgibgemacroregiao;

    public Tgibgemunicipio() {
    }

    public Tgibgemunicipio(Integer idtgibgemunicipio) {
        this.idtgibgemunicipio = idtgibgemunicipio;
    }

    public Tgibgemunicipio(Integer idtgibgemunicipio, int cod, int codcompleto, String nome) {
        this.idtgibgemunicipio = idtgibgemunicipio;
        this.cod = cod;
        this.codcompleto = codcompleto;
        this.nome = nome;
    }

    public Integer getIdtgibgemunicipio() {
        return idtgibgemunicipio;
    }

    public void setIdtgibgemunicipio(Integer idtgibgemunicipio) {
        this.idtgibgemunicipio = idtgibgemunicipio;
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

    @XmlTransient
    public List<Tgibgedistrito> getTgibgedistritoList() {
        return tgibgedistritoList;
    }

    public void setTgibgedistritoList(List<Tgibgedistrito> tgibgedistritoList) {
        this.tgibgedistritoList = tgibgedistritoList;
    }

    @XmlTransient
    public List<Tgcep> getTgcepList() {
        return tgcepList;
    }

    public void setTgcepList(List<Tgcep> tgcepList) {
        this.tgcepList = tgcepList;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    public Tgibgemacroregiao getIdtgibgemacroregiao() {
        return idtgibgemacroregiao;
    }

    public void setIdtgibgemacroregiao(Tgibgemacroregiao idtgibgemacroregiao) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgemunicipio != null ? idtgibgemunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgemunicipio)) {
            return false;
        }
        Tgibgemunicipio other = (Tgibgemunicipio) object;
        if ((this.idtgibgemunicipio == null && other.idtgibgemunicipio != null) || (this.idtgibgemunicipio != null && !this.idtgibgemunicipio.equals(other.idtgibgemunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgibgemunicipio[ idtgibgemunicipio=" + idtgibgemunicipio + " ]";
    }
    
}
