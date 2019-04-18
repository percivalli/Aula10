package br.com.jair;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Curso cursoFull = new Curso("Full Stack");
        Curso cursoAndroid = new Curso("Android");

        Aluno aluno1 = new Aluno(12, "Danilo", "Percivalli", cursoFull);
        Aluno aluno2 = new Aluno(13, "Jair", "Messias", cursoAndroid);
        Aluno aluno3 = new Aluno(14, "Ivan", "Drago", cursoFull);
        Aluno aluno4 = new Aluno(666, "Satanás", "Capeta", cursoAndroid);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        //System.out.println(aluno1.equals(aluno2));
        //System.out.println(alunos.contains(aluno1));
        System.out.println(alunos);


    }

}
