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
@Table(name = "tgibgemesoregiao")
@NamedQueries({
    @NamedQuery(name = "Tgibgemesoregiao.findAll", query = "SELECT t FROM Tgibgemesoregiao t")
    , @NamedQuery(name = "Tgibgemesoregiao.findByIdtgibgemesoregiao", query = "SELECT t FROM Tgibgemesoregiao t WHERE t.idtgibgemesoregiao = :idtgibgemesoregiao")
    , @NamedQuery(name = "Tgibgemesoregiao.findByCod", query = "SELECT t FROM Tgibgemesoregiao t WHERE t.cod = :cod")
    , @NamedQuery(name = "Tgibgemesoregiao.findByNome", query = "SELECT t FROM Tgibgemesoregiao t WHERE t.nome = :nome")})
@XmlRootElement
public class Tgibgemesoregiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtgibgemesoregiao")
    private Integer idtgibgemesoregiao;
    @Basic(optional = false)
   
    @Column(name = "cod")
    private int cod;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemesoregiao")
    private List<Tgibgemacroregiao> tgibgemacroregiaoList;
    @JoinColumn(name = "idtgibgeuf", referencedColumnName = "idtgibgeuf")
    @ManyToOne(optional = false)
    private Tgibgeuf idtgibgeuf;

    public Tgibgemesoregiao() {
    }

    public Tgibgemesoregiao(Integer idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
    }

    public Tgibgemesoregiao(Integer idtgibgemesoregiao, int cod, String nome) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgibgemesoregiao() {
        return idtgibgemesoregiao;
    }

    public void setIdtgibgemesoregiao(Integer idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
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
    public List<Tgibgemacroregiao> getTgibgemacroregiaoList() {
        return tgibgemacroregiaoList;
    }

    public void setTgibgemacroregiaoList(List<Tgibgemacroregiao> tgibgemacroregiaoList) {
        this.tgibgemacroregiaoList = tgibgemacroregiaoList;
    }

    public Tgibgeuf getIdtgibgeuf() {
        return idtgibgeuf;
    }

    public void setIdtgibgeuf(Tgibgeuf idtgibgeuf) {
        this.idtgibgeuf = idtgibgeuf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgemesoregiao != null ? idtgibgemesoregiao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgemesoregiao)) {
            return false;
        }
        Tgibgemesoregiao other = (Tgibgemesoregiao) object;
        if ((this.idtgibgemesoregiao == null && other.idtgibgemesoregiao != null) || (this.idtgibgemesoregiao != null && !this.idtgibgemesoregiao.equals(other.idtgibgemesoregiao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tgibgemesoregiao[ idtgibgemesoregiao=" + idtgibgemesoregiao + " ]";
    }
    
}
