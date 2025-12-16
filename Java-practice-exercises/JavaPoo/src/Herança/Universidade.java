/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Universidade {
        String nome;
        int tam = 5;
        int cont = 0;
        Departamento vet[] = new Departamento[tam];
        
        
        void setNome(String nome)
        {
            this.nome = nome;
        }
        String getNome()
        {
            return nome;
        }
        
        void exibir()
        {
            System.out.println("Nome: "+nome);
            for(int i=0;i<cont;i++)
            {
                vet[i].exibir();
            }
        }
}
