/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Peca {
    
   protected String nome;
   protected float custo;
   protected float lucro;
    

    public Peca(String nome,float custo,float lucro)
    {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }
    public Peca(){}
    
    void setNome(String nome)
    {
        this.nome = nome;
    }
    String getNome()
    {
        return nome;
    }
    
    void setCusto(float custo)
    {
        this.custo = custo;
    }
    float getCusto()
    {
        return custo;
    }
    
    void setLucro(float lucro)
    {
        this.lucro = lucro;
    }
    float getLucro()
    {
        return lucro;
    }
    
    float calcPreco()
    {
        return custo+lucro;
    }
    
    void exibir()
    {
        System.out.println("Peca:  ");
        System.out.println("Nome: "+getNome());
        System.out.println("Custo: "+getCusto());
        System.out.println("Lucro: "+getLucro());
        System.out.println("Preco: "+calcPreco());
        
    }
    
}
