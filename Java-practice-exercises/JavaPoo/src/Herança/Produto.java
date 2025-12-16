/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Produto {
    String descricao;
    float valor;

    public Produto(){}
    public Produto(String descricao,float valor)
    {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public String getDescricao()
    {
        return descricao;
    }
    
    void setValor(float valor)
    {
        this.valor = valor;
    }
    public float getValor()
    {
        return valor;
    }
    

    protected float calcPreco()
    {
        return valor;
    }
    protected void exibir()
    {
        System.out.println("Descriacao: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("Preco: "+calcPreco());
    }
}
