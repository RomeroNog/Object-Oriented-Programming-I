/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A6_ex1;

/**
 *
 * @author manoe
 */
public abstract class Contato {
    protected String tipo;
    
    public Contato(){};
    public Contato(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void exibir();
}
