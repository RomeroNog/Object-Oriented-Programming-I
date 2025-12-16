/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A7_ex2;

/**
 *
 * @author manoe
 */
public class Capitulo {
    private int numero;
    private int qntpags;
    private String titulo;
    
    public Capitulo(){}
    public Capitulo(int pags,String titulo)
    {
        this.qntpags = pags;
        this.titulo = titulo;
    }
    
    public int getQntpags()
    {
        return this.qntpags;
    }
    public void setQntpags(int pags)
    {
        qntpags = pags;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public void setNumero(int num)
    {
        this.numero = num;
    }
    
    public void exibir()
    {
        System.out.println("Dados do Capitulo "+this.getNumero());
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Numero de paginas: "+this.getQntpags());
    }
    
    
}
