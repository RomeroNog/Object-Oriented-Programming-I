/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

import java.util.Scanner;

/**
 *
 * @author igor.nogueira_unesp
 */
public class SistProduto {
    int tam = 30;
    int cont = 0;
    Produto prod[] = new Produto[tam];
    
    
    void menu()
    {
        System.out.println("MENU ");
        System.out.println("1-Cadastrar Produto Estadual");
        System.out.println("2-Cadastrar Produto Nacional");
        System.out.println("3-Cadastrar Produto Importado");
        System.out.println("4-Exibir Produto Estaduais");
        System.out.println("5-Exibir Produto Nacionais");
        System.out.println("6-Exibir Produto Importados");
        System.out.println("7-Exibir Todos Produtos");
        System.out.println("9-Sair");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        exec(op);
    }
    
    void exec(int op)
    {
        switch(op)
        {
            case 1: 
                if(cont < tam)
                {
                    Scanner sc = new Scanner(System.in);
                    prod[cont] = new Estadual();
                    
                    System.out.println("Descricao: ");
                    prod[cont].descricao = sc.nextLine();
                    
                    System.out.println("Valor: ");
                    prod[cont].valor = sc.nextFloat();  
                }
                cont++;
                menu();
                break;
                
            case 2:
                if(cont < tam)
                {
                    Scanner sc = new Scanner(System.in);
                    prod[cont] = new Nacional();
                    
                    System.out.println("Descricao: ");
                    prod[cont].descricao = sc.nextLine();
                    
                    System.out.println("Valor: ");
                    prod[cont].valor = sc.nextFloat();
                }
                cont++;
                menu();
                break;
            
            case 3:
                if(cont < tam)
                {
                    Scanner sc = new Scanner(System.in);
                    prod[cont] = new Importado();
                    
                    System.out.println("Descricao: ");
                    prod[cont].descricao = sc.nextLine();
                    
                    System.out.println("Valor: ");
                    prod[cont].valor = sc.nextFloat();
                }
                cont++;
                menu();
                break;
            
            case 4:
                System.out.println("Produtos Estaduais");
                for(int i=0;i<cont;i++)
                {
                   if(prod[i].getClass().equals(Estadual.class))
                   {
                        prod[i].exibir();
                   }
                }
                menu();
                break;
                
            case 5:
                System.out.println("Produtos Nacionais");
                for(int i=0;i<cont;i++)
                {
                   if(prod[i].getClass().equals(Nacional.class))
                   {
                        prod[i].exibir();
                   }
                }
                menu();
                break;
                
            case 6:
                System.out.println("Produtos Importados");
                for(int i=0;i<cont;i++)
                {
                   if(prod[i].getClass().equals(Importado.class))
                   {
                        prod[i].exibir();
                   }
                }
                menu();
                break;
            
            case 7:
                System.out.println("Produtos");
                for(int i=0;i<cont;i++)
                {
                    prod[i].exibir();
                }
                menu();
                break;
            
            case 9:
                System.out.println("Saindo");
                break;
        }
    }
    
    
    
}
