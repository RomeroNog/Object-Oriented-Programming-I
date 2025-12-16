/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Principal {
    public static void main (String[] args)
    {
               
        Peca a = new PecaImportada("peita",34.5f,23.7f,11.4f,5.6f);
          
        //a.exibir();
               
        SistProduto pr = new SistProduto();  
        
        //pr.menu();
    }
}