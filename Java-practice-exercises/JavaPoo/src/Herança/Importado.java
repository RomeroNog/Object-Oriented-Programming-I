/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Importado extends Produto{
        float taxa;
        float imposto;
        float taxaImport;
        
        float calcTaxaImport()
        {
            return valor *0.05f;
        }
        float getTaxaImport()
        {
            return taxaImport;
        }
        
        float calcImposto()
        {
            return valor*0.1f;
        }
        float getImposto()
        {
            return imposto;
        }
        
        float calcTaxa()
        {
            return valor*0.05f;
        }
        float getTaxa()
        {
            return taxa;
        }
        
        @Override
        protected float calcPreco()
        {
            return super.calcPreco()+calcImposto()+calcTaxa()+calcTaxaImport();
        }
        
        @Override
        protected void exibir()
        {
            super.exibir();
            System.out.println("Imposto: "+calcImposto());
            System.out.println("Taxa: "+calcTaxa());
            System.out.println("Taxa Importacao: "+calcTaxaImport());
        }
}
