/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

import javax.management.Descriptor;

/**
 *
 * @author igor.nogueira_unesp
 */
public class ProdutoImportado {
    String descric;
    float val;
    float impos;
    float tax;
    float taxImport;

    public ProdutoImportado(){}
    public ProdutoImportado(String descric,float val)
    {
        this.descric=descric;
        this.val=val;
    }
    
    void setDescric(String descric)
    {
        this.descric=descric;
    }
    String getDescric()
    {
        return descric;
    }
    
    void setVal(float val)
    {
        this.val=val;
    }
    float getVal()
    {
        return val;
    }
    
    float getImpos()
    {
        return impos;
    }
    float getTax()
    {
        return tax;
    }
    float getTaxImport()
    {
        return taxImport;
    }
    
    float calcImpos(float val)
    {
        return val*0.1f;
    }
    float calcTax(float val)
    {
        return val*0.05f;
    }
    float calTaxImport(float val)
    {
        return val*0.05f;
    }
}
