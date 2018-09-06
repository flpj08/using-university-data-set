/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligencia.aplicada.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author flpj0
 */
@Entity
@Table(name = "enfase_academica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnfaseAcademica.findAll", query = "SELECT e FROM EnfaseAcademica e")
    , @NamedQuery(name = "EnfaseAcademica.findByIdEnfaseAcademica", query = "SELECT e FROM EnfaseAcademica e WHERE e.idEnfaseAcademica = :idEnfaseAcademica")
    , @NamedQuery(name = "EnfaseAcademica.findByLocalizacao", query = "SELECT e FROM EnfaseAcademica e WHERE e.localizacao = :localizacao")})
public class EnfaseAcademica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_enfase_academica")
    private Integer idEnfaseAcademica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "localizacao")
    private String localizacao;
    @JoinTable(name = "universidade_enfase_academica", joinColumns = {
        @JoinColumn(name = "id_enfase_academica", referencedColumnName = "id_enfase_academica")}, inverseJoinColumns = {
        @JoinColumn(name = "id_universidade", referencedColumnName = "id_universidade")})
    @ManyToMany
    private List<Universidade> universidadeList;

    public EnfaseAcademica() {
    }

    public EnfaseAcademica(Integer idEnfaseAcademica) {
        this.idEnfaseAcademica = idEnfaseAcademica;
    }

    public EnfaseAcademica(Integer idEnfaseAcademica, String localizacao) {
        this.idEnfaseAcademica = idEnfaseAcademica;
        this.localizacao = localizacao;
    }

    public Integer getIdEnfaseAcademica() {
        return idEnfaseAcademica;
    }

    public void setIdEnfaseAcademica(Integer idEnfaseAcademica) {
        this.idEnfaseAcademica = idEnfaseAcademica;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @XmlTransient
    public List<Universidade> getUniversidadeList() {
        return universidadeList;
    }

    public void setUniversidadeList(List<Universidade> universidadeList) {
        this.universidadeList = universidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnfaseAcademica != null ? idEnfaseAcademica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnfaseAcademica)) {
            return false;
        }
        EnfaseAcademica other = (EnfaseAcademica) object;
        if ((this.idEnfaseAcademica == null && other.idEnfaseAcademica != null) || (this.idEnfaseAcademica != null && !this.idEnfaseAcademica.equals(other.idEnfaseAcademica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inteligencia.aplicada.model.EnfaseAcademica[ idEnfaseAcademica=" + idEnfaseAcademica + " ]";
    }
    
}
