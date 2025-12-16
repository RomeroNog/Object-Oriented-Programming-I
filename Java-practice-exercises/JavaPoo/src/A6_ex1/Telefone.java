/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A6_ex1;

/**
 *
 * @author manoe
 */
public class Telefone extends Contato{
    private String telefone;
    
    public Telefone(){};
    public Telefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void exibir()
    {
        System.out.println("Telefone: "+telefone);
    }
}
