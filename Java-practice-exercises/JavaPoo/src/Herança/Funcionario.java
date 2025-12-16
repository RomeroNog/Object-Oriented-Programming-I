/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Funcionario {
        String codigo;
        String nome;
        float salario;
        
        public Funcionario(){}
        public Funcionario(String codigo,String nome,float salario)
        {
            this.codigo = codigo;
            this.nome = nome;
            this.salario = salario;
        }
        
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
        
        void setSalario(float salario)
        {
            this.salario = salario;
        }
        float getSalario()
        {
            return salario;
        }
        
        void exibir()
        {
            System.out.println("Codigo: "+codigo);
            System.out.println("Nome: "+nome);
            System.out.println("Salario: "+salario);
        }
}
