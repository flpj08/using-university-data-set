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
@Table(name = "universidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Universidade.findAll", query = "SELECT u FROM Universidade u")
    , @NamedQuery(name = "Universidade.findByIdUniversidade", query = "SELECT u FROM Universidade u WHERE u.idUniversidade = :idUniversidade")
    , @NamedQuery(name = "Universidade.findByEstado", query = "SELECT u FROM Universidade u WHERE u.estado = :estado")
    , @NamedQuery(name = "Universidade.findByLocalizacao", query = "SELECT u FROM Universidade u WHERE u.localizacao = :localizacao")
    , @NamedQuery(name = "Universidade.findByControle", query = "SELECT u FROM Universidade u WHERE u.controle = :controle")
    , @NamedQuery(name = "Universidade.findByNumeroEstudantesInicial", query = "SELECT u FROM Universidade u WHERE u.numeroEstudantesInicial = :numeroEstudantesInicial")
    , @NamedQuery(name = "Universidade.findByNumeroEstudantesFinal", query = "SELECT u FROM Universidade u WHERE u.numeroEstudantesFinal = :numeroEstudantesFinal")
    , @NamedQuery(name = "Universidade.findByPorcentagemMasculinos", query = "SELECT u FROM Universidade u WHERE u.porcentagemMasculinos = :porcentagemMasculinos")
    , @NamedQuery(name = "Universidade.findByValorDespesasInicial", query = "SELECT u FROM Universidade u WHERE u.valorDespesasInicial = :valorDespesasInicial")
    , @NamedQuery(name = "Universidade.findByValorDespesasFinal", query = "SELECT u FROM Universidade u WHERE u.valorDespesasFinal = :valorDespesasFinal")
    , @NamedQuery(name = "Universidade.findByPorcentagemAjudaFinanceira", query = "SELECT u FROM Universidade u WHERE u.porcentagemAjudaFinanceira = :porcentagemAjudaFinanceira")
    , @NamedQuery(name = "Universidade.findByNumeroCandidatosInicial", query = "SELECT u FROM Universidade u WHERE u.numeroCandidatosInicial = :numeroCandidatosInicial")
    , @NamedQuery(name = "Universidade.findByNumeroCandidatosFinal", query = "SELECT u FROM Universidade u WHERE u.numeroCandidatosFinal = :numeroCandidatosFinal")
    , @NamedQuery(name = "Universidade.findByPorcentagemAdmissao", query = "SELECT u FROM Universidade u WHERE u.porcentagemAdmissao = :porcentagemAdmissao")
    , @NamedQuery(name = "Universidade.findByPorcentagemMatriculados", query = "SELECT u FROM Universidade u WHERE u.porcentagemMatriculados = :porcentagemMatriculados")
    , @NamedQuery(name = "Universidade.findByEscalaAcademica", query = "SELECT u FROM Universidade u WHERE u.escalaAcademica = :escalaAcademica")
    , @NamedQuery(name = "Universidade.findByEscalaSocial", query = "SELECT u FROM Universidade u WHERE u.escalaSocial = :escalaSocial")
    , @NamedQuery(name = "Universidade.findByEscalaQualidadeVida", query = "SELECT u FROM Universidade u WHERE u.escalaQualidadeVida = :escalaQualidadeVida")})
public class Universidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_universidade")
    private Integer idUniversidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "localizacao")
    private String localizacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 355)
    @Column(name = "controle")
    private String controle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_estudantes_inicial")
    private int numeroEstudantesInicial;
    @Column(name = "numero_estudantes_final")
    private Integer numeroEstudantesFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentagem_masculinos")
    private int porcentagemMasculinos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_despesas_inicial")
    private int valorDespesasInicial;
    @Column(name = "valor_despesas_final")
    private Integer valorDespesasFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentagem_ajuda_financeira")
    private int porcentagemAjudaFinanceira;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_candidatos_inicial")
    private int numeroCandidatosInicial;
    @Column(name = "numero_candidatos_final")
    private Integer numeroCandidatosFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentagem_admissao")
    private int porcentagemAdmissao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentagem_matriculados")
    private int porcentagemMatriculados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "escala_academica")
    private int escalaAcademica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "escala_social")
    private int escalaSocial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "escala_qualidade_vida")
    private int escalaQualidadeVida;
    @ManyToMany(mappedBy = "universidadeList")
    private List<EnfaseAcademica> enfaseAcademicaList;

    public Universidade() {
    }

    public Universidade(Integer idUniversidade) {
        this.idUniversidade = idUniversidade;
    }

    public Universidade(Integer idUniversidade, String estado, String localizacao, String controle, int numeroEstudantesInicial, int porcentagemMasculinos, int valorDespesasInicial, int porcentagemAjudaFinanceira, int numeroCandidatosInicial, int porcentagemAdmissao, int porcentagemMatriculados, int escalaAcademica, int escalaSocial, int escalaQualidadeVida) {
        this.idUniversidade = idUniversidade;
        this.estado = estado;
        this.localizacao = localizacao;
        this.controle = controle;
        this.numeroEstudantesInicial = numeroEstudantesInicial;
        this.porcentagemMasculinos = porcentagemMasculinos;
        this.valorDespesasInicial = valorDespesasInicial;
        this.porcentagemAjudaFinanceira = porcentagemAjudaFinanceira;
        this.numeroCandidatosInicial = numeroCandidatosInicial;
        this.porcentagemAdmissao = porcentagemAdmissao;
        this.porcentagemMatriculados = porcentagemMatriculados;
        this.escalaAcademica = escalaAcademica;
        this.escalaSocial = escalaSocial;
        this.escalaQualidadeVida = escalaQualidadeVida;
    }

    public Integer getIdUniversidade() {
        return idUniversidade;
    }

    public void setIdUniversidade(Integer idUniversidade) {
        this.idUniversidade = idUniversidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public int getNumeroEstudantesInicial() {
        return numeroEstudantesInicial;
    }

    public void setNumeroEstudantesInicial(int numeroEstudantesInicial) {
        this.numeroEstudantesInicial = numeroEstudantesInicial;
    }

    public Integer getNumeroEstudantesFinal() {
        return numeroEstudantesFinal;
    }

    public void setNumeroEstudantesFinal(Integer numeroEstudantesFinal) {
        this.numeroEstudantesFinal = numeroEstudantesFinal;
    }

    public int getPorcentagemMasculinos() {
        return porcentagemMasculinos;
    }

    public void setPorcentagemMasculinos(int porcentagemMasculinos) {
        this.porcentagemMasculinos = porcentagemMasculinos;
    }

    public int getValorDespesasInicial() {
        return valorDespesasInicial;
    }

    public void setValorDespesasInicial(int valorDespesasInicial) {
        this.valorDespesasInicial = valorDespesasInicial;
    }

    public Integer getValorDespesasFinal() {
        return valorDespesasFinal;
    }

    public void setValorDespesasFinal(Integer valorDespesasFinal) {
        this.valorDespesasFinal = valorDespesasFinal;
    }

    public int getPorcentagemAjudaFinanceira() {
        return porcentagemAjudaFinanceira;
    }

    public void setPorcentagemAjudaFinanceira(int porcentagemAjudaFinanceira) {
        this.porcentagemAjudaFinanceira = porcentagemAjudaFinanceira;
    }

    public int getNumeroCandidatosInicial() {
        return numeroCandidatosInicial;
    }

    public void setNumeroCandidatosInicial(int numeroCandidatosInicial) {
        this.numeroCandidatosInicial = numeroCandidatosInicial;
    }

    public Integer getNumeroCandidatosFinal() {
        return numeroCandidatosFinal;
    }

    public void setNumeroCandidatosFinal(Integer numeroCandidatosFinal) {
        this.numeroCandidatosFinal = numeroCandidatosFinal;
    }

    public int getPorcentagemAdmissao() {
        return porcentagemAdmissao;
    }

    public void setPorcentagemAdmissao(int porcentagemAdmissao) {
        this.porcentagemAdmissao = porcentagemAdmissao;
    }

    public int getPorcentagemMatriculados() {
        return porcentagemMatriculados;
    }

    public void setPorcentagemMatriculados(int porcentagemMatriculados) {
        this.porcentagemMatriculados = porcentagemMatriculados;
    }

    public int getEscalaAcademica() {
        return escalaAcademica;
    }

    public void setEscalaAcademica(int escalaAcademica) {
        this.escalaAcademica = escalaAcademica;
    }

    public int getEscalaSocial() {
        return escalaSocial;
    }

    public void setEscalaSocial(int escalaSocial) {
        this.escalaSocial = escalaSocial;
    }

    public int getEscalaQualidadeVida() {
        return escalaQualidadeVida;
    }

    public void setEscalaQualidadeVida(int escalaQualidadeVida) {
        this.escalaQualidadeVida = escalaQualidadeVida;
    }

    @XmlTransient
    public List<EnfaseAcademica> getEnfaseAcademicaList() {
        return enfaseAcademicaList;
    }

    public void setEnfaseAcademicaList(List<EnfaseAcademica> enfaseAcademicaList) {
        this.enfaseAcademicaList = enfaseAcademicaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUniversidade != null ? idUniversidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidade)) {
            return false;
        }
        Universidade other = (Universidade) object;
        if ((this.idUniversidade == null && other.idUniversidade != null) || (this.idUniversidade != null && !this.idUniversidade.equals(other.idUniversidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inteligencia.aplicada.model.Universidade[ idUniversidade=" + idUniversidade + " ]";
    }
    
}
