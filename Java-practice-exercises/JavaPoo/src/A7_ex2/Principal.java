/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A7_ex2;

/**
 *
 * @author manoe
 */
public class Principal {
    public static void main(String[] args)
    {
        // Cria um livro com ISBN e título
        Livro livro = new Livro("978-85-365-1234-5", "Programação Orientada a Objetos");

        // Cria alguns capítulos
        Capitulo cap1 = new Capitulo(10, "Introdução à POO");
        Capitulo cap2 = new Capitulo(15, "Encapsulamento e Atributos");
        Capitulo cap3 = new Capitulo(20, "Herança e Polimorfismo");

        // Adiciona capítulos ao livro
        livro.addCapitulo(cap1);
        livro.addCapitulo(cap2);
        livro.addCapitulo(cap3);

        // Exibe o relatório completo do livro
        livro.exibir();        
    }
}
