package org.principal;

import org.model.Marca;
import org.model.Modelo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Modelo mod1 = new Modelo(1, "Ford RANGER", LocalDate.now(),10);
        Modelo mod2 = new Modelo(2, "Focus", LocalDate.now(),5);
        List<Modelo> modelos = new ArrayList<>();

        modelos.add(mod1);
        modelos.add(mod2);

        mod1.setId(3);
        mod1.setNome("Onix");
        mod1.setAnoModelo(LocalDate.of(2024, 5 , 20));
        mod1.setQtModelos(45);

        System.out.println(mod1.getId());
        System.out.println(mod1.getNome());
        System.out.println(mod1.getAnoModelo());
        System.out.println(mod1.getQtModelos());
    }
}
