/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author igor.nogueira_unesp
 */
public class SistProd {
    int tam=30;
    int cont=0;
    int cont1=0;
    int cont2=0;
    ProdutoEstadual vetor[] = new ProdutoEstadual[tam/3];
    ProdutoNacional vet[] = new ProdutoNacional[tam/3];
    ProdutoImportado v[] = new ProdutoImportado[tam/3];
    
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
                if(cont<tam)
                {
                    Scanner sc = new Scanner(System.in);
                    vetor[cont] = new ProdutoEstadual();
                    
                    System.out.println("Descricao: ");
                    vetor[cont].descricao = sc.nextLine();
                    
                    System.out.println("Valor: ");
                    vetor[cont].valor = sc.nextFloat();
                    
                    vetor[cont].imposto = vetor[cont].calcImposto(vetor[cont].valor);
                }
                cont++;
                menu();
                break;
            
            case 2:
                if(cont<tam)
                {
                    Scanner sa = new Scanner(System.in);
                    vet[cont1] = new ProdutoNacional();
                    
                    System.out.println("Descricao: ");
                    vet[cont1].descrica = sa.nextLine();
                    
                    System.out.println("Valor: ");
                    vet[cont1].valo = sa.nextFloat();
                    vet[cont1].impost = vet[cont1].calcImpost(vet[cont1].valo);
                    vet[cont1].taxa = vet[cont1].calcTaxa(vet[cont1].valo);
                    
                }
                cont1++;
                menu();
                break;
            
            case 3:
                if(cont<tam)
                {
                    Scanner sn = new Scanner(System.in);
                    v[cont2] = new ProdutoImportado();
                    
                    System.out.println("Descricao: ");
                    v[cont2].descric = sn.nextLine();
                    
                    System.out.println("Valor: ");
                    v[cont2].val = sn.nextFloat();
                    v[cont2].impos = v[cont2].calcImpos(v[cont2].val);
                    v[cont2].tax = v[cont2].calcTax(v[cont2].val);
                    v[cont2].taxImport = v[cont2].calTaxImport(v[cont2].val);
                }
                cont2++;
                menu();
                break;
                
            case 4:
                System.out.println("Produtos Estaduais");
                for(int i=0;i<cont;i++)
                {
                    exibir(vetor[i]);
                }
                menu();
                break;
                
            case 5:
                System.out.println("Produtos Nacionais");
                for(int i=0;i<cont1;i++)
                {
                    exibir1(vet[i]);
                }
                menu();
                break;
                
            case 6:
                System.out.println("Produtos Internacionais");
                for(int i=0;i<cont2;i++)
                {
                    exibir2(v[i]);
                }
                menu();
                break;
                
            case 7:
                System.out.println("Produtos Estaduais");
                for(int i=0;i<cont;i++)
                {
                    exibir(vetor[i]);
                }
                
                System.out.println("Produtos Nacionais");
                for(int i=0;i<cont1;i++)
                {
                    exibir1(vet[i]);
                }
                
                System.out.println("Produtos Internacionais");
                for(int i=0;i<cont2;i++)
                {
                    exibir2(v[i]);
                }
                menu();
                break;
                
            case 9:
                break;
        }
    }
    private void exibir(ProdutoEstadual pe)
    {
        ProdutoEstadual ac = pe;
        System.out.println("Descricao: "+ac.getDescricao());
        System.out.println("Valor: "+ac.getValor());
        System.out.println("Imposto: "+ac.getImposto());

    }
    
    private void exibir1(ProdutoNacional pe)
    {
        ProdutoNacional ac = pe;
        System.out.println("Descricao: "+ac.getDescrica());
        System.out.println("Valor: "+ac.getValor());
        System.out.println("Imposto: "+ac.getImposto());
        System.out.println("Taxa: "+ac.getTaxa());
    }
        
    private void exibir2(ProdutoImportado pe)
    {
        ProdutoImportado ac = pe;
        System.out.println("Descricao: "+ac.getDescric());
        System.out.println("Valor: "+ac.getVal());
        System.out.println("Imposto: "+ac.getImpos());
        System.out.println("Taxa: "+ac.getTax());
        System.out.println("Taxa Importacao: "+ac.getTaxImport());

    }
}
