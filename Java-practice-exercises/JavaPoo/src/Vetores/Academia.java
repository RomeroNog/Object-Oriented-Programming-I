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
public class Academia {
    public int id,idade;
    public float peso,altura;
    public String nome;
    
    
    Academia(){}
    Academia(int idade,int id,float p,float altura,String nome)
    {
        this.idade = idade;
        this.id = id; 
        this.altura = altura;
        this.peso = p;
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    public int getId()
    {
        return id;
    }
    public int getIdade()
    {
        return idade;
    }
    
    public float getPeso()
    {
        return peso;
    }
    public float getAltura()
    {
        return altura;
    }
    
    void setNome(String nome)
    {
        this.nome=nome;
    }
    void setId(int id)
    {
        this.id = id;
    }
    void setIdade(int idade)
    {
        this.idade=idade;
    }
    void setPeso(float peso)
    {
        this.peso=peso;
    }
    void setAltura(float altura)
    {
        this.altura=altura;
    }
    
    private void exibir(Academia vet)
    {
        Academia ac = vet;
        System.out.println("Nome: "+ac.getNome());
        System.out.println("ID: "+ac.getId());
        System.out.println("Idade: "+ac.getIdade());
        System.out.println("Peso: "+ac.getPeso());
        System.out.println("Altura: "+ac.getAltura());
        System.out.println("IMC: "+ac.calcIMC());
    }
    
    float calcIMC()
    {
        return (peso)/(altura*altura);
    }
    
    public int tam=20;
    public int cont=0;
    public Academia vetor[] = new Academia[tam];

    void menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.println("1-Cadastrar Aluno");
        System.out.println("2-Listar Aluno");
        System.out.println("3-Relatorio Geral");
        System.out.println("9-Sair");
        int op = sc.nextInt();
        exec(op);
        
    }
    void exec(int op)
    {
        switch(op)
        {
            case 1:
                if(cont<=tam)
                {
                    vetor[cont] = new Academia();
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Nome: ");
                    vetor[cont].nome = sc.nextLine();

                    System.out.println("ID: ");
                    vetor[cont].id = sc.nextInt();

                    System.out.println("Idade: ");
                    vetor[cont].idade = sc.nextInt();

                    System.out.println("Peso: ");
                    vetor[cont].peso = sc.nextFloat();

                    System.out.println("Altura: ");
                    vetor[cont].altura = sc.nextFloat();
                }
                
                cont++;
                menu();
                break;
                
            case 2:
                for(int i=0;i<cont;i++)
                {
                    System.out.println(vetor[i].getNome());
                }
                menu();
                break;
                
            case 3:
                for(int i=0;i<cont;i++)
                {
                   exibir(vetor[i]);
                }
                menu();
                break;
            case 9:
                break;
        }
        
        
        
        
    }
}
