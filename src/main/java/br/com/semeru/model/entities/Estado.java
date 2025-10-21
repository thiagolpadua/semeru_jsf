package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ForeignKey;

public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name="IdEstado", nullable = false)
    private Integer idEstado;

    @Column(name = "Nome", length = 80, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
    @ForeignKey(name = "EstadoEndereco")
    private List<Endereco> enderecos;

    public Estado() {
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEstado == null) ? 0 : idEstado.hashCode());
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
        Estado other = (Estado) obj;
        if (idEstado == null) {
            if (other.idEstado != null)
                return false;
        } else if (!idEstado.equals(other.idEstado))
            return false;
        return true;
    }
    
    
}
