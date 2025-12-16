/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author manoe
 */
public class Academia {
    public String nome;
    public int idade;
    public float peso,altura;
    
    Academia(){}
    Academia(String nome,int idade,float peso,float altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    boolean isMenor()
    {
        if(idade <18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    float IMC()
    {
        return (peso)/(altura*altura);
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    void setIdade(int idade)
    {
        this.idade = idade;
    }
    void setPeso(float peso)
    {
        this.peso = peso;
    }
    void setAltura(float altura)
    {
        this.altura = altura;
    }
    
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public float getPeso()
    {
        return peso;
    }
    public float getAltura()
    {
        return altura;
    }
    
}
