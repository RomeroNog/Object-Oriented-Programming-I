/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Estadual extends Produto{
    float imposto;
    
    
    float calcImposto()
    {
        return valor*0.1f;
    }
    float getImposto()
    {
        return imposto;
    }
    
    @Override
    public float calcPreco()
    {
        return super.calcPreco()+calcImposto();
    }
    
    @Override
    public void exibir()
    {
        super.exibir();
        System.out.println("Imposto: "+calcImposto());
    }
    
}
