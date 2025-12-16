/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Docente extends Funcionario{
        String titulacao;
        
        public Docente(){}
        public Docente(String codigo,String nome,float salario,String titulacao)
        {
            super(codigo,nome,salario);
            this.titulacao = titulacao;
        }
        
        public void setTitulacao(String titulacao)
        {
            this.titulacao = titulacao;
        }
        String getTitulacao()
        {
            return titulacao;
        }
        
        void exibir()
        {
            super.exibir();
            System.out.println("Titulacao: "+titulacao);
        }
}
