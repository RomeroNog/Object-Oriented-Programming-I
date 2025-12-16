/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class PecaImportada extends Peca{
    float taximport;
    float taxfrete;
    

    public PecaImportada(){}
    public PecaImportada(String nome,float custo,float lucro,float taximport,float taxfrete)
    {
        super(nome, custo, lucro);
        this.taximport = taximport;
        this.taxfrete = taxfrete;
    }
    
    void setTaximport(float taximport)
    {
        this.taximport = taximport;
    }
    float getTaximport()
    {
        return taximport;
    }
    
    void setTaxfrete(float taxfrete)
    {
        this.taxfrete = taxfrete;
    }
    float getTaxfrete()
    {
        return taxfrete;
    }
    
    @Override
    float calcPreco()
    {
        return super.calcPreco()+taximport+taxfrete;
    }
    
    void exibir()
    {
        super.exibir();
        System.out.println("Taxa de importacao: "+getTaximport());
        System.out.println("Taxa de frete: "+getTaxfrete());
    }
}

