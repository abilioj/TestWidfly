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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "gugusuarios")
@NamedQueries({
    @NamedQuery(name = "Gugusuarios.findAll", query = "SELECT g FROM Gugusuarios g"),
    @NamedQuery(name = "Gugusuarios.findByIdusuarios", query = "SELECT g FROM Gugusuarios g WHERE g.idusuarios = :idusuarios"),
    @NamedQuery(name = "Gugusuarios.findByAtivo", query = "SELECT g FROM Gugusuarios g WHERE g.ativo = :ativo"),
    @NamedQuery(name = "Gugusuarios.findByBloqueado", query = "SELECT g FROM Gugusuarios g WHERE g.bloqueado = :bloqueado"),
    @NamedQuery(name = "Gugusuarios.findByCpf", query = "SELECT g FROM Gugusuarios g WHERE g.cpf = :cpf"),
    @NamedQuery(name = "Gugusuarios.findByNome", query = "SELECT g FROM Gugusuarios g WHERE g.nome = :nome")})
public class Gugusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "idusuarios")
    private Integer idusuarios;
    @Basic(optional = false)

    @Column(name = "ativo")
    private short ativo;
    @Basic(optional = false)

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gugusuarios")
    private List<Gugfavoritos> gugfavoritosList;

    @Column(name = "bloqueado")
    private short bloqueado;
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @JoinTable(name = "gugusuario_gestor", joinColumns = {
        @JoinColumn(name = "idgugusuario", referencedColumnName = "idusuarios")}, inverseJoinColumns = {
        @JoinColumn(name = "idguggestor", referencedColumnName = "idgestor")})
    @ManyToMany
    private List<Tggestor> tggestorList;
    @JoinColumn(name = "idgrupo", referencedColumnName = "idguggrupos")
    @ManyToOne(optional = false)
    private Guggrupos idgrupo;

    public List<Gugfavoritos> getGugfavoritosList() {
        return gugfavoritosList;
    }

    public void setGugfavoritosList(List<Gugfavoritos> gugfavoritosList) {
        this.gugfavoritosList = gugfavoritosList;
    }

   

    public Gugusuarios() {
    }

    public Gugusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Gugusuarios(Integer idusuarios, short ativo, short bloqueado, String nome) {
        this.idusuarios = idusuarios;
        this.ativo = ativo;
        this.bloqueado = bloqueado;
        this.nome = nome;
    }

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public short getAtivo() {
        return ativo;
    }

    public void setAtivo(short ativo) {
        this.ativo = ativo;
    }

    public short getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(short bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tggestor> getTggestorList() {
        return tggestorList;
    }

    public void setTggestorList(List<Tggestor> tggestorList) {
        this.tggestorList = tggestorList;
    }

    public Guggrupos getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Guggrupos idgrupo) {
        this.idgrupo = idgrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gugusuarios)) {
            return false;
        }
        Gugusuarios other = (Gugusuarios) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Gugusuarios[ idusuarios=" + idusuarios + " ]";
    }

}
