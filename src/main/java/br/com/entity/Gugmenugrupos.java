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

/**
 *
 * @author jose.camilo
 */
@Entity
@Table(name = "gugmenugrupos")
@NamedQueries({
    @NamedQuery(name = "Gugmenugrupos.findAll", query = "SELECT g FROM Gugmenugrupos g")
    , @NamedQuery(name = "Gugmenugrupos.findByIdmenugrupo", query = "SELECT g FROM Gugmenugrupos g WHERE g.idmenugrupo = :idmenugrupo")})
public class Gugmenugrupos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idmenugrupo")
    private Integer idmenugrupo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGugmenugrupos")
    private List<Gugfavoritos> gugfavoritosList;
    @JoinColumn(name = "id_guggrupos", referencedColumnName = "idguggrupos")
    @ManyToOne(optional = false)
    private Guggrupos idGuggrupos;
    @JoinColumn(name = "id_menu", referencedColumnName = "idmenu")
    @ManyToOne(optional = false)
    private Tgmenu idMenu;

    public Gugmenugrupos() {
    }

    public Gugmenugrupos(Integer idmenugrupo) {
        this.idmenugrupo = idmenugrupo;
    }

    public Integer getIdmenugrupo() {
        return idmenugrupo;
    }

    public void setIdmenugrupo(Integer idmenugrupo) {
        this.idmenugrupo = idmenugrupo;
    }

    public List<Gugfavoritos> getGugfavoritosList() {
        return gugfavoritosList;
    }

    public void setGugfavoritosList(List<Gugfavoritos> gugfavoritosList) {
        this.gugfavoritosList = gugfavoritosList;
    }

    public Guggrupos getIdGuggrupos() {
        return idGuggrupos;
    }

    public void setIdGuggrupos(Guggrupos idGuggrupos) {
        this.idGuggrupos = idGuggrupos;
    }

    public Tgmenu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Tgmenu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenugrupo != null ? idmenugrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gugmenugrupos)) {
            return false;
        }
        Gugmenugrupos other = (Gugmenugrupos) object;
        if ((this.idmenugrupo == null && other.idmenugrupo != null) || (this.idmenugrupo != null && !this.idmenugrupo.equals(other.idmenugrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Gugmenugrupos[ idmenugrupo=" + idmenugrupo + " ]";
    }
    
}
