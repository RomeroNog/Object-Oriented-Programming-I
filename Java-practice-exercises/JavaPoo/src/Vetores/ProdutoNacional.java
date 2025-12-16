/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

/**
 *
 * @author igor.nogueira_unesp
 */
public class ProdutoNacional {
    String descrica;
    float valo;
    float impost;
    float taxa;

    public ProdutoNacional(){}
    public ProdutoNacional(String descrica,float valo)
    {
        this.descrica=descrica;
        this.valo=valo;
    }
    
    void setDescrica(String descrica)
    {
        this.descrica=descrica;
    }
    String getDescrica()
    {
        return descrica;
    }
   
    void setValor(float valor)
    {
        this.valo=valor;
    }
    float getValor()
    {
        return valo;
    }
    
    float getImposto()
    {
        return impost;
    }
    float getTaxa()
    {
        return taxa;
    }
    
    float calcImpost(float valor)
    {
        return (valor*0.1f);
    }
    float calcTaxa(float valor)
    {
        return (valor*0.05f);
    }
    
    
}
