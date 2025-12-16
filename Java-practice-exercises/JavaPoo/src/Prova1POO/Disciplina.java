/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author manoe
 */
public abstract class Disciplina {
    protected String nome;
    protected float nota1;
    protected float nota2;
    
    public Disciplina(){}
    public Disciplina(String nome,float nota1,float nota2)
    {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public abstract boolean  estaAprovado();
    public float calcularNota()
    {
        return (nota1+nota2)/2;
    }
    public abstract void exibir();
    
    
}
