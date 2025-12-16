/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

/**
 *
 * @author igor.nogueira_unesp
 */
public class ProdutoEstadual {
    String descricao;
    float valor;
    float imposto;

    public ProdutoEstadual(){}
    public ProdutoEstadual(String descr,float valor)
    {
        this.descricao=descr;
        this.valor=valor;
    }
    
    void setDescricao(String descricao)
    {
        this.descricao=descricao;
    }
    String getDescricao()
    {
        return descricao;
    }
    
    void setValor(float valor)
    {
        this.valor=valor;
    }
    float getValor()
    {
        return valor;
    }
    
    float getImposto()
    {
        return imposto;
    }
    
    float calcImposto(float val)
    {
         return (val*0.1f);
    }

    String getTaxa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
