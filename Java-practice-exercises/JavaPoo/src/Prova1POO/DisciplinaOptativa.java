/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author manoe
 */
public class DisciplinaOptativa extends Disciplina{
    
    public DisciplinaOptativa(){}
    public DisciplinaOptativa(String nome,float nota1,float nota2)
    {
        super(nome,nota1,nota2);
    }
    
    public boolean estaAprovado()
    {
        if(calcularNota()>=6) return true;
        return false;
    }
    
    public void exibir()
    {
        System.out.println("Notas de "+ nome+":");
        System.out.println("Nota1:" + nota1);
        System.out.println("Nota2:" + nota2);
        System.out.println("Nota Final: "+calcularNota());
        System.out.println("Aprovado: "+estaAprovado());
    }
}
