package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Reptil refListReptil = new Reptil();
    Ave refListAve = new Ave();
    Mamifero refListMamifero = new Mamifero();

    Animal refListAnimal = new Animal();
    Animal animal = new Animal();

    public void iniciarMenu(){

        boolean sair = true;
        int escolhaUsuario = 0;

        while (sair){

        System.out.println("|--------------------------------|");
        System.out.println("|------Zoológico Senai-----------|");
        System.out.println("|--------------------------------|");
        System.out.println("|--------------MENU--------------|");
        System.out.println("|--------------------------------|");
        System.out.println("|1 - Cadastrar Reptil            |");
        System.out.println("|2 - Cadastrar Ave               |");
        System.out.println("|3 - Cadastrar Mamifero          |");
        System.out.println("|4 - Listar Reptil               |");
        System.out.println("|5 - Listar Ave                  |");
        System.out.println("|6 - Listar Mamifero             |");
        System.out.println("|7 - Pesquisar Animal            |");
        System.out.println("|8 - Sair                        |");
        System.out.println("|--------------------------------|");

        System.out.println("\nEscolha a opção desejada: ");
        escolhaUsuario = scanner.nextInt();
        scanner.nextLine();

            switch (escolhaUsuario){

                case 1:

                    Reptil reptil = new Reptil();
                    reptil.cadastrarReptil();
                    refListReptil.adicionarReptil(reptil);
                    refListAnimal.adicionarAnimal(reptil);
                    reptil.listarReptil();
                    break;

                case 2:
                    Ave ave = new Ave();
                    ave.cadastrarAve();
                    refListAve.adicionarAve(ave);
                    refListAnimal.adicionarAnimal(ave);
                    break;

                case 3:
                    Mamifero mamifero = new Mamifero();
                    mamifero.cadastrarMamifero();
                    refListMamifero.adicionarMamifero(mamifero);
                    refListAnimal.adicionarAnimal(mamifero);
                    break;

                case 4:
                    refListReptil.listarReptil();

                    break;

                case 5:
                    refListAve.listarAve();
                    break;

                case 6:
                    refListMamifero.listarMamifero();
                    break;

                case 7:

                    System.out.println("Informe o nome do Animal: ");
                    String animalPesquisado = scanner.nextLine();
                    boolean validaAnimal = false;

                    if (animalPesquisado != null && animalPesquisado != "") {
                        validaAnimal = refListMamifero.pesquisarMamifero(animalPesquisado);

                    }

                    if (validaAnimal){
                        System.out.println("Informações do animal: ");
                        System.out.println();
                    } else {
                        System.out.println("Animal inexistente em nosso Zoo");
                    }


                    break;


                case 8:
                    sair = false;
                    break;

                case 9:
                    refListAnimal.listarAnimal();
                    break;


            }
        }


    }
}
