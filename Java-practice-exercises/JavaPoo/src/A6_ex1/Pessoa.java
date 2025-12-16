/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A6_ex1;

/**
 *
 * @author manoe
 */
public class Pessoa {
    private Contato contatos[];
    private String nome;
    private int MAX;
    private int cont =0;
    
    //Contrutores
    public Pessoa(){};
    public Pessoa(String nome, int MAX)
    {
        this.nome = nome;
        this.MAX = MAX;
        this.contatos = new Contato[MAX];
    }
    //getters e setters
    public String getNome()
    {
        return nome;
    }
    public void setNome(String Nome)
    {
        nome = Nome;
    }
    
    public int getMAX()
    {
        return MAX;
    }
    public void setMAX(int MAX)
    {
        this.MAX = MAX;
    }
    public int getContador()
    {
        return cont;
    }
    //Metodos da classe
    public void addContato(Contato c)
    {
        if(cont<MAX)
        {
            contatos[cont] = c;
            cont++;
        }
    }
    
    public Contato[] getContatos()
    {
        return contatos;
    }
    
    public Contato[] getContatos(String tipo)
    {
        int totreq=0;
        for(int i=0;i<cont;i++)
        {
            if(contatos[i]!= null && tipo.equals(contatos[i].getTipo()))
            {
                totreq++;
            }     
        }      
        Contato requeridos[] = new Contato[totreq];
        int contreq=0;      
                
        for(int i=0;i<cont;i++)
        {
            if(contatos[i]!= null && tipo.equals(contatos[i].getTipo()))
            {
                requeridos[contreq] = contatos[i];
                contreq++;
            }
        }            
        return requeridos;       
    }
    
    public boolean possuiEmail()
    {
        int possui=0;
        for(int i=0;i<cont;i++)
        {
            if(contatos[i] != null && contatos[i].getTipo().equals("email"))
            {
               possui=1; 
            }
        }
        if(possui==1)
        {
            return true;
        }
        else
        {
            return false;
        }     
    }
    
    public boolean possuiTelefone()
    {
        int possui=0;
        for(int i=0;i<cont;i++)
        {
            if(contatos[i] != null && contatos[i].getTipo().equals("telefone"))
            {
               possui=1; 
            }
        }
        if(possui==1)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
    
    public void exibirContatos()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Contatos: ");
        for(int i=0;i<cont;i++)
        {
            if(contatos[i] != null)
            {
                System.out.println("Tipo: " + contatos[i].getTipo());
                contatos[i].exibir();
                
            }
        }
    }
}
