/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Substituto extends Docente{
    
    private int cargaHoraria;
    
    public Substituto(){}
    public Substituto(String codigo,String nome,String nivel,String titulacao,int carga)
    {
        super(codigo,nome,nivel,titulacao);
        cargaHoraria = carga;
    }
    
    public int getCargaHoraria()
    {
        return cargaHoraria;
    }
    public void setCargaHoraria(int carga)
    {
        cargaHoraria = carga;
    }
    
    public double calcularSalario()
    {
        if(this.nivel.equals("S1"))
        {
            return this.salario+this.salario*0.05;
        }
        if(this.nivel.equals("S2"))
        {
            return this.salario+this.salario*0.1;
        }
        else return this.salario;
    }
    
    @Override
    public void exibir()
    {
        super.exibir();
        System.out.println("Carga Horaria: "+this.cargaHoraria);
    }
}
