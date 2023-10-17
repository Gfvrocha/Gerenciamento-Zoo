package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reptil extends Animal {

    Scanner scanner = new Scanner(System.in);

    List<Reptil> listReptil = new ArrayList<>();


    public void cadastrarReptil(){

        System.out.println("=0=0= ---| Cadastrar Réptil |--- =0=0=");
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

    public void adicionarReptil(Reptil reptil){
        listReptil.add(reptil);
    }

    public void listarReptil(){
        System.out.println("=0=0= ---| Lista de Repteis |--- =0=0=");
        for (Reptil reptil : listReptil){
            System.out.println("Nome: "+ reptil.getNome());
            System.out.println("Id: "+ reptil.getId());
            System.out.println(reptil.getNome() + ", alocado no alojamento dos repteis.");
        }
        System.out.println("=0=0= ----||---- =0=0= ----||---- =0=0=\n");
    }


}
