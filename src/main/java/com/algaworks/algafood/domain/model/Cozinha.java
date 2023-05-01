package com.algaworks.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@JsonRootName("gastronomia") //atribui um nome ao retorno no xml - cozinha
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cozinha {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@JsonIgnore => ignora esse atributo no retorno json ou xml
	@JsonProperty("titulo") //atribui um nome a esse atributo no retorno json ou xml
	@Column(nullable = false)
	private String nome;


}
