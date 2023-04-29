package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNome("Peixaria");
        restaurante1.setTaxaFrete(new BigDecimal("3.50"));

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNome("Acai");
        restaurante2.setTaxaFrete(new BigDecimal("2.0"));

        restaurante1 = restaurantes.adicionar(restaurante1);
        restaurante2 = restaurantes.adicionar(restaurante2);

        System.out.printf("%d - %s\n", restaurante1.getId(), restaurante1.getNome());
        System.out.printf("%d - %s\n", restaurante2.getId(), restaurante2.getNome());

    }
}
