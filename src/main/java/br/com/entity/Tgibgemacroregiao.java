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
@Table(name = "tgibgemacroregiao")
@NamedQueries({
    @NamedQuery(name = "Tgibgemacroregiao.findAll", query = "SELECT t FROM Tgibgemacroregiao t")
    , @NamedQuery(name = "Tgibgemacroregiao.findByIdtgibgemacroregiao", query = "SELECT t FROM Tgibgemacroregiao t WHERE t.idtgibgemacroregiao = :idtgibgemacroregiao")
    , @NamedQuery(name = "Tgibgemacroregiao.findByCod", query = "SELECT t FROM Tgibgemacroregiao t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgemacroregiao.findByNome", query = "SELECT t FROM Tgibgemacroregiao t WHERE t.nome = :nome")})
public class Tgibgemacroregiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgibgemacroregiao")
    private Integer idtgibgemacroregiao;
    @Basic(optional = false)
   
    @Column(name = "cod")
    private int cod;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "idtgibgemesoregiao", referencedColumnName = "idtgibgemesoregiao")
    @ManyToOne(optional = false)
    private Tgibgemesoregiao idtgibgemesoregiao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemacroregiao")
    private List<Tgibgemunicipio> tgibgemunicipioList;

    public Tgibgemacroregiao() {
    }

    public Tgibgemacroregiao(Integer idtgibgemacroregiao) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
    }

    public Tgibgemacroregiao(Integer idtgibgemacroregiao, int cod, String nome) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgibgemacroregiao() {
        return idtgibgemacroregiao;
    }

    public void setIdtgibgemacroregiao(Integer idtgibgemacroregiao) {
        this.idtgibgemacroregiao = idtgibgemacroregiao;
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

    public Tgibgemesoregiao getIdtgibgemesoregiao() {
        return idtgibgemesoregiao;
    }

    public void setIdtgibgemesoregiao(Tgibgemesoregiao idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
    }

    public List<Tgibgemunicipio> getTgibgemunicipioList() {
        return tgibgemunicipioList;
    }

    public void setTgibgemunicipioList(List<Tgibgemunicipio> tgibgemunicipioList) {
        this.tgibgemunicipioList = tgibgemunicipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgemacroregiao != null ? idtgibgemacroregiao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgemacroregiao)) {
            return false;
        }
        Tgibgemacroregiao other = (Tgibgemacroregiao) object;
        if ((this.idtgibgemacroregiao == null && other.idtgibgemacroregiao != null) || (this.idtgibgemacroregiao != null && !this.idtgibgemacroregiao.equals(other.idtgibgemacroregiao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgibgemacroregiao[ idtgibgemacroregiao=" + idtgibgemacroregiao + " ]";
    }
    
}
