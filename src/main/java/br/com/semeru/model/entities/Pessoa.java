package br.com.semeru.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    @Column(name="IdPessoa", nullable = false)
    private Integer idPessoa;
    @Column(name="Name", nullable = false, length = 80)
    private String nome;
    @Column(name="Email", nullable = false, length = 80)
    private String email;
    @Column(name="Telefone", nullable = false, length = 15) // (061)99999-8888
    private String telefone;
    @Column(name="CPF", nullable = false, length = 14) 
    private String cpf;
    @Column(name="DataDeNascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(name="DataDeCadastro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDeCadastro;

    @ManyToOne(optional = false)
    @ForeignKey(name = "PessoaSexo")
    private Sexo sexo;

    public Pessoa() {}

    
    
    public Integer getIdPessoa() {
        return idPessoa;
    }



    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }



    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }



    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }



    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }



    public Sexo getSexo() {
        return sexo;
    }



    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (idPessoa == null) {
            if (other.idPessoa != null)
                return false;
        } else if (!idPessoa.equals(other.idPessoa))
            return false;
        return true;
    }

    
    
    
}
