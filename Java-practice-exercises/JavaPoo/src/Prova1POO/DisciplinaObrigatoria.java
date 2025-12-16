/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author manoe
 */
public class DisciplinaObrigatoria extends Disciplina{
    private float trab;
    
    public DisciplinaObrigatoria(){};
    public DisciplinaObrigatoria(String nome,float nota1,float nota2,float trab)
    {
        super(nome,nota1,nota2);
        this.trab = trab;
    }

    public boolean estaAprovado()
    {
        if(calcularNota()>=5) return true;
        return false;
            
    }
    
    public float calcularNota()
    {
        return (nota1+nota2+trab)/3;
    }
    
    public void exibir()
    {
        System.out.println("Notas de "+ nome+":");
        System.out.println("Nota1:" + nota1);
        System.out.println("Nota2:" + nota2);
        System.out.println("Trabalho:" + trab);
        System.out.println("Nota Final: "+calcularNota());
        System.out.println("Aprovado: "+estaAprovado());
    }
    
    
}
