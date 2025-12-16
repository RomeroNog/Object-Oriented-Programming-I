/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public abstract class Docente extends Funcionario{
    protected String titulacao;
    
    public Docente(){}
    public Docente(String codigo,String nome,String nivel,String titulacao)
    {
        super(codigo,nome,nivel);
        this.titulacao = titulacao;
    }
    
    public String getTitulacao()
    {
        return titulacao;
    }
    public void setTitulacao(String titulacao)
    {
        this.titulacao = titulacao;
    }
    
    public abstract double calcularSalario();
    
    public void exibir()
    {
        System.out.println("Dados do Funionario Docente");
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Salario: "+this.calcularSalario());
        System.out.println("Nível: "+this.nivel);
        System.out.println("Titulação: "+this.titulacao);
    }
    
    
}
