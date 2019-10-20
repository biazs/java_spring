package br.pucminas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import antlr.collections.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "CATEGORIAS")
public class Categoria extends AbstractEntity<Long>{
	
	@NotBlank
	@Size(min=3, max=60)
	@Column(name="descricao", nullable=false, unique=true, length=60)
	private String descricao;

	@OneToMany(mappedBy = "categoria")
	private List despesas; 
	
	public List getDespesas() {
		return despesas;
	}

	public void setDespesas(List despesas) {
		this.despesas = despesas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}