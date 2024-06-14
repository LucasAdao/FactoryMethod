package com.lucas.models;

import java.util.Random;

public class FactoryMethod {

    public static Pessoa getInstanceNascimento(){
        Pessoa pessoa = new Pessoa();
        Random rand = new Random();
        int sexo = rand.nextInt(2);
        if(sexo == 0){
            pessoa.setSexo(Sexo.MASCULINO);
            pessoa.setEhMasculino(true);
        }else{
            pessoa.setSexo(Sexo.FEMININO);
            pessoa.setEhMasculino(false);
        }
        int raca = rand.nextInt(5);
        switch (raca) {
            case 0:
                pessoa.setRaca(Raca.BRANCO);
                break;
            case 1:
                pessoa.setRaca(Raca.NEGRO);
                break;
            case 2:
                pessoa.setRaca(Raca.PARDO);
                break;
            case 3:
                pessoa.setRaca(Raca.OCIDENTAL);
                break;
            case 4:
                pessoa.setRaca(Raca.SIMPSOM);
                break;
            default:
                throw new IllegalArgumentException("Não foi possivel criar sua pessoa!");
        }
        return pessoa;

    }
}
