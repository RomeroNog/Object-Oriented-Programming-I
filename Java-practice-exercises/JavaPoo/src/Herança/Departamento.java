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
public class Departamento {
        String codigo;
        String nome;
        int tamanho=30;
        int cont=0;
        Funcionario vetor[] = new Funcionario[tamanho];
        
        void setCodigo(String codigo)
        {
            this.codigo = codigo;
        }
        String getCodigo()
        {
            return codigo;
        }
        
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
            System.out.println("Codigo: "+codigo);
            System.out.println("Nome: "+nome);
            for(int i=0;i<cont;i++)
            {
                  vetor[i].exibir();
            }
        }
        
        void linkFunctoDep(Funcionario func)
        {
            if(cont<tamanho)
            {
                vetor[cont++] = func;
            }
            
        }
        
        float salarioTotalDep()
        {
            float saltot = 0.4f;
            for(int i=0;i<cont;i++)
            {
                saltot+=vetor[i].salario;
            }
            return saltot;
        }
        
}       
