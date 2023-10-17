package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String nome, sexo, abtoAlimentar;
    private int idade;
    private int id;

    List<Animal> listAnimal = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbtoAlimentar(){ return abtoAlimentar; }

    public void setAbtoAlimentar(String abtoAlimentar){ this.abtoAlimentar = abtoAlimentar; }

    public void adicionarAnimal(Animal animal){
        listAnimal.add(animal);
    }

    public void listarAnimal() {
        System.out.println("=0=0= ---| Lista completa dos Animais |--- =0=0=");
        for (Animal animal : listAnimal) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Id: " + animal.getId());

        }
        System.out.println("=0=0= ----||---- =0=0= ----||---- =0=0=\n");

    }







}
