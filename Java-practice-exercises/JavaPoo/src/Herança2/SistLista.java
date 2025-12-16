/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança2;

import java.util.Scanner;

/**
 *
 * @author igor.nogueira_unesp
 */
public class SistLista {
        
        int tamanho = 20;
        
        Lista vetor[] = new Lista[tamanho];
        
        void zerando()
        {
            for(int i=0;i<tamanho;i++)
            {
                vetor[i].numero = -1;
            }
        }
        
        void inserirNum()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero para insercao");
            int num = sc.nextInt();
            int i=-1;
            int k=0;
            while(i==-1)
            {
                if(vetor[k].numero != -1)
                {
                    vetor[k].numero = num;
                    i++;
                }
                k++;
            }
                
            
        }
        
        void removerNum(int nume)
        {
            int posi=0;
            for(int i=0;i<tamanho;i++)
            {   
                if(vetor[i].numero == nume)
                {
                    posi = i;
                }
            }
            vetor[posi].numero = -1;
        }
        
        void contarNum()
        {
            int contador=0;
            for(int i=0;i<tamanho;i++)
            {
                if(vetor[i].numero!=-1)
                {
                   contador++; 
                }
            }
            System.out.println("Numero de elementos: "+ contador);
        }
        
        void numPosiEspecif(int pos)
        {
            if(vetor[pos].numero!=-1)
            {
                System.out.println("Numero nessa posicao: "+vetor[pos].numero);
            }
            else
            {
                System.out.println("Sem numeros nessa posicao");
            }
        }
        
        void numArmaz()
        {
            int vazia=0;
            for(int i=0;i<tamanho;i++)
            {
                if(vetor[i].numero!=-1)
                {
                    System.out.println(vetor[i].numero);
                    vazia++;
                }
            }
            if(vazia==0)
            {
                System.out.println("Nao ha elementos armazenados na lista");
            }
        }
}
