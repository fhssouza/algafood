package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TodosRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);

        List<Restaurante> listaRestaurante = new ArrayList<>();
        listaRestaurante = restaurantes.todas();

        for (Restaurante restaurant : listaRestaurante) {
            System.out.printf("%s - %f - %s\n", restaurant.getNome(),
                    restaurant.getTaxaFrete(), restaurant.getCozinha().getNome());
        }

    }
}
