/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public abstract class Funcionario{
    protected String codigo;
    protected String nome;
    protected String nivel;
    protected double salario = 1500.5;
    
    public Funcionario(){}
    public Funcionario(String codigo,String nome,String nivel)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.nivel = nivel;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String cod)
    {
        codigo = cod;
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String name)
    {
        nome = name;
    }
    
    public String getNivel()
    {
        return nivel;
    }
    public void setNivel(String level)
    {
        nivel = level;
    }
    
    public double getSalario()
    {
       return salario;
    }

    public abstract double calcularSalario(); 
    public abstract void exibir();
}
