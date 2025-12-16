/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Principal {
    public static void main(String[] args) {
       
        String nome1 = "Alberto";
        String nome = "alberto";
        if (nome1.equals(nome))
        {
            System.out.println(nome1 + " igual a " + nome);
        }
        else
        {
            System.out.println(nome1 + " diferente de " + nome);
        }
        if (nome1.equalsIgnoreCase(nome)) //ignora maiúscula e minúscula
        {        
            System.out.println(nome1 + " igual a " + nome);
        }
        else
        {
            System.out.println(nome1 + " diferente de " + nome);
        }
       Academia ac = new Academia();
       //ac.menu();
       
      // ContaEspecial ce = new ContaEspecial();
       //ce.menu();
       SistProd a = new SistProd();
       //a.menu();
       ContaEspecial b = new ContaEspecial("1234","jakson",500,250);
       b.saque(510);
       System.out.println("saldo"+b.getSaldo());
       b.menu();
       
        System.out.println(10+20+"30"+40);
    }
}
