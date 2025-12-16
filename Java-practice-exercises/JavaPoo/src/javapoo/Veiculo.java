/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Veiculo {
    public String marca; 
    public String modelo;
    public int ano;
    public boolean disponivel;
    
    
    Veiculo(){}
    Veiculo(String marca,String modelo,int ano,boolean disponivel)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.disponivel=disponivel;
    }
    void emprestar()
    {
        disponivel = false;
    }
    
    void devolver()
    {
        disponivel = true;
    }
    
    boolean estaDisponivel()
    {
        return disponivel;
    }
    
    void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    void setAno(int ano)
    {
        this.ano=ano;
    }

    public String getModelo()
    {
        return modelo;
    }

    void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }
    public int getAno()
    {
        return ano;
    }
    
}
