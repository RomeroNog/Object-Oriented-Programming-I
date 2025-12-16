/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Tecnico extends Funcionario{
    private String funcao;
    
    public Tecnico(){}
    public Tecnico(String codigo,String nome,String nivel,String funcao)
    {
        super(codigo,nome,nivel);
        this.funcao = funcao;
        
    }

    public String getFuncao()
    {
        return funcao;
    }

    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }
    
    public double calcularSalario()
    {
        if(this.nivel.equals("T1"))
        {
            return this.salario+ this.salario*0.1; 
        }
        if(this.nivel.equals("T2"))
        {
            return this.salario + this.salario*0.2;
        }
        else return this.salario;
    }
    
    
    public void exibir()
    {
        System.out.println("Dados do Funionario Tecnico");
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Salario: "+this.calcularSalario());
        System.out.println("Nível: "+this.nivel);
        System.out.println("Função: "+this.funcao);
    }
}
