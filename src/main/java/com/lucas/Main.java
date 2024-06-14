package com.lucas;

import com.lucas.models.FactoryMethod;
import com.lucas.models.Pessoa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Pessoa pessoa =  FactoryMethod.getInstanceNascimento();
//        System.out.println("Seu filho é assim:");
//        System.out.println(pessoa);
//        System.out.println("#############################");
//        System.out.println("Qual é o nome do bebê?");
//
//
//        pessoa.setNome(sc.nextLine());
//        System.out.println(pessoa);
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = FactoryMethod.getInstanceNascimento();
        System.out.println(pessoa);
        System.out.println("Qual o nome do seu filho?");
        String nome = sc.nextLine();
        pessoa.setNome(nome);
        System.out.println(pessoa);
    }
}
