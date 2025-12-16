/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Efetivo extends Docente{
    private String area;
    
    public Efetivo(){}
    public Efetivo(String codigo,String nome,String nivel,String titulacao,String area)
    {
        super(codigo,nome,nivel,titulacao);
        this.area = area;
    }
    
    public String getArea()
    {
        return area;
    }
    public void setArea(String area)
    {
        this.area = area;
    }
    
    public double calcularSalario()
    {
        if(this.nivel.equals("D1"))
        {
            return this.salario+ this.salario*0.05;
        }
        if(this.nivel.equals("D2"))
        {
            return this.salario+ this.salario*0.1;
        }
        if(this.nivel.equals("D3"))
        {
            return this.salario+this.salario*0.2;
        }
        else return this.salario;
    }
    
    public void exibir()
    {
        super.exibir();
        System.out.println("Area: "+this.area);
    }
    
}
