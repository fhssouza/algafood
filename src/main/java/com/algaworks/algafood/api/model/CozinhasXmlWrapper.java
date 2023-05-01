package com.algaworks.algafood.api.model;

import com.algaworks.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@JacksonXmlRootElement(localName = "cozinhas") //alterar o retorno xml incluindo o título cozinhas, ou pode usar JsonRootName
@Data
public class CozinhasXmlWrapper {

    @JsonProperty("cozinha") //alterar o retorno xml incluindo o título cozinhas, ou pode usar @JsonXmlProperty
    @JacksonXmlElementWrapper(useWrapping = false) //desabilitando um embrulho
    @NonNull //Ao utilizar o @Data ele criar os construtores e o @NonNul informa de qual atributo vai ser utilizado
    private List<Cozinha> cozinhas;

}
