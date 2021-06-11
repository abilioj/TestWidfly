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
@Table(name = "tggrauinstrucao")
@NamedQueries({
    @NamedQuery(name = "Tggrauinstrucao.findAll", query = "SELECT t FROM Tggrauinstrucao t")
    , @NamedQuery(name = "Tggrauinstrucao.findByIdtggrauinstrucao", query = "SELECT t FROM Tggrauinstrucao t WHERE t.idtggrauinstrucao = :idtggrauinstrucao")
    , @NamedQuery(name = "Tggrauinstrucao.findByNome", query = "SELECT t FROM Tggrauinstrucao t WHERE t.nome = :nome")})
public class Tggrauinstrucao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idtggrauinstrucao")
    private Integer idtggrauinstrucao;
    @Basic(optional = false)
   
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "idtggrauinstrucao")
    private List<Recpaciente> recpacienteList;

    public Tggrauinstrucao() {
    }

    public Tggrauinstrucao(Integer idtggrauinstrucao) {
        this.idtggrauinstrucao = idtggrauinstrucao;
    }

    public Tggrauinstrucao(Integer idtggrauinstrucao, String nome) {
        this.idtggrauinstrucao = idtggrauinstrucao;
        this.nome = nome;
    }

    public Integer getIdtggrauinstrucao() {
        return idtggrauinstrucao;
    }

    public void setIdtggrauinstrucao(Integer idtggrauinstrucao) {
        this.idtggrauinstrucao = idtggrauinstrucao;
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
        hash += (idtggrauinstrucao != null ? idtggrauinstrucao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tggrauinstrucao)) {
            return false;
        }
        Tggrauinstrucao other = (Tggrauinstrucao) object;
        if ((this.idtggrauinstrucao == null && other.idtggrauinstrucao != null) || (this.idtggrauinstrucao != null && !this.idtggrauinstrucao.equals(other.idtggrauinstrucao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tggrauinstrucao[ idtggrauinstrucao=" + idtggrauinstrucao + " ]";
    }
    
}
