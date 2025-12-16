/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A7_ex1;

/**
 *
 * @author manoe
 */
public class TesteStatic {
    private int MAX = 30;
    private int vetor[] = new int[MAX];
    private int conta=0;
    
    public static float somaVet(float vet[])
    {
        float soma = 0;
        for(int i=0;i<vet.length;i++)
        {
            soma+=vet[i];
        }  
        return soma;
    }
    
    public static float mediaVet(float vet[])
    {
        float soma = TesteStatic.somaVet(vet);
        return (float)soma/vet.length;
    }
    
    public static float maiorVet(float vet[])
    {
       float maior = vet[0];
       for(int i=1;i<vet.length;i++)
       {
           if(maior<vet[i])
           {
               maior = vet[i];
           }
       }
       return maior;
    }
    
    public static float menorVet(float vet[])
    {
        float menor = vet[0];
        for(int i=1;i<vet.length;i++)
        {
            if(menor>vet[i])
            {
                menor = vet[i];
            }
        }
        return menor;
    }
    
    public static int maxNUm(int n1,int n2)
    {
        if(n1>n2) return n1;
        return n2;
    }
    
    public static void main(String[] args)
    {
        float[] vet = new float[10];
        System.out.println("Vetor:");
        for(int i=0;i<10;i++)
        {
            vet[i] = i*3;
            System.out.print(vet[i]+ " ");
        }
        System.out.println("");
        
        System.out.println("Soma: "+TesteStatic.somaVet(vet));
        System.out.println("Media: "+TesteStatic.mediaVet(vet));
        System.out.println("Maior: "+TesteStatic.maiorVet(vet));
        System.out.println("Menor: "+TesteStatic.menorVet(vet));
        System.out.println("Max entre 4 e 9: "+TesteStatic.maxNUm(4, 9));
        
    }
    
}
