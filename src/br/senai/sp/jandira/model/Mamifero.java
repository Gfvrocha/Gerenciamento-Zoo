package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamifero extends Animal {

    Scanner scanner = new Scanner(System.in);
    List<Mamifero> listMamifero = new ArrayList<>();

    public void cadastrarMamifero(){

        System.out.println("=0=0= ---| Cadastrar Mamifero |--- =0=0=");
        System.out.println("Informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe a idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe o sexo { M - F }: ");
        super.setSexo(scanner.nextLine());
        System.out.println("Informe o ID: ");
        super.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("=0=0= ---| Cadastro Finalizado |--- =0=0=\n ");

    }

    public void adicionarMamifero(Mamifero mamifero){
        listMamifero.add(mamifero);
    }

    public void listarMamifero(){
        System.out.println("=0=0= ---| Lista de Repteis |--- =0=0=");
        for (Mamifero mamifero : listMamifero){
            System.out.println("Nome: "+ mamifero.getNome());
            System.out.println("Id: "+ mamifero.getId());
            System.out.println(mamifero.getNome() + ", alocado no alojamento dos repteis.");
        }
        System.out.println("=0=0= ----||---- =0=0= ----||---- =0=0=\n");
    }




}
