/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author manoe
 */
public class teste {
    public static void main(String[] args)
    {
        // Aluno 1
        Aluno aluno1 = new Aluno("123", "João", 4);
        aluno1.setMaxDisci(4);
        aluno1.addDisciplina(new DisciplinaObrigatoria("POO", 7.5f, 8.0f, 9.0f));
        aluno1.addDisciplina(new DisciplinaObrigatoria("Estrutura de Dados", 6.0f, 5.5f, 4.0f));
        aluno1.addDisciplina(new DisciplinaOptativa("Matemática", 8.0f, 7.5f));
        aluno1.addDisciplina(new DisciplinaOptativa("História", 5.0f, 5.0f));

        // Aluno 2
        Aluno aluno2 = new Aluno("456", "Maria", 4);
        aluno2.setMaxDisci(4);
        aluno2.addDisciplina(new DisciplinaObrigatoria("POO", 3.0f, 4.0f, 2.0f)); // Reprovada
        aluno2.addDisciplina(new DisciplinaObrigatoria("Estrutura de Dados", 6.5f, 7.0f, 8.0f));
        aluno2.addDisciplina(new DisciplinaOptativa("Matemática", 6.0f, 6.0f));
        aluno2.addDisciplina(new DisciplinaOptativa("História", 3.0f, 4.0f)); // Reprovada

        // Exibir dados do aluno 1
        aluno1.exibirAluno();
        aluno1.disciAprovado();
        if (aluno1.possuiReprova()) {
            System.out.println("Situação: Aluno REPROVADO em pelo menos uma disciplina.");
        } else {
            System.out.println("Situação: Aluno APROVADO em todas as disciplinas.");
        }
        aluno1.mediaFinal();
        System.out.println("----------------------------------------------------");

        // Exibir dados do aluno 2
        aluno2.exibirAluno();
        aluno2.disciAprovado();
        if (aluno2.possuiReprova()) {
            System.out.println("Situação: Aluno REPROVADO em pelo menos uma disciplina.");
        } else {
            System.out.println("Situação: Aluno APROVADO em todas as disciplinas.");
        }
        aluno2.mediaFinal();
    }

}
