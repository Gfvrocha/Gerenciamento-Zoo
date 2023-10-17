package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ave extends Animal {

    Scanner scanner = new Scanner(System.in);

    List<Ave> listAve = new ArrayList<>();

    public void cadastrarAve(){

        System.out.println("=0=0= ---| Cadastrar Ave |--- =0=0=");
        System.out.println("Informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe a idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe o sexo { M - F }: ");
        super.setSexo(scanner.nextLine());
        System.out.println("Abto aliemntar de " + getNome() + ": ");
        super.setAbtoAlimentar(scanner.nextLine());
        System.out.println("Informe o ID: ");
        super.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("=0=0= ---| Cadastro Finalizado |--- =0=0=\n ");

    }

    public void adicionarAve(Ave ave){
        listAve.add(ave);
    }

    public void listarAve(){
        System.out.println("=0=0= ---| Lista de Aves |--- =0=0=");
        for (Ave ave : listAve){
            System.out.println("Nome: "+ ave.getNome());
            System.out.println("Id: "+ ave.getId());
            System.out.println(ave.getNome() + ", alocado no alojamento dos repteis.");
        }
        System.out.println("=0=0= ----||---- =0=0= ----||---- =0=0=\n");
    }



}
