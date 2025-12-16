/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A6_ex1;

/**
 *
 * @author manoe
 */
public class Agenda {
    private String proprietario;
    private Pessoa pessoas[];
    private int max;
    private int contador;
    
    //Construtores
    public Agenda(){};
    public Agenda(String proprietario,int max)
    {
        this.proprietario = proprietario;
        this.max = max;
        pessoas = new Pessoa[max];
    }
    
    //Getters e Setters
    public String getProprietario()
    {
        return proprietario;
    }
    public void setProprietario(String proprietario)
    {
        this.proprietario = proprietario;
    }
    
    public int getmax()
    {
        return max;
    }
    public void setmax(int max)
    {
        this.max = max;
    }
    
    //Metodos
    public void addPessoa(Pessoa p)
    {
        if(contador<max)
        {
            pessoas[contador] = p;
            contador++;
        }
    }
    
    public Pessoa buscarPessoa(String nome)
    {
        for(int i=0;i<contador;i++)
        {
            if(pessoas[i]!=null && nome.equals(pessoas[i].getNome()))
            {
                return pessoas[i];
            }
        }
        return null; 
    }
    
    public void addContato(String nome,Contato c)
    {
        Pessoa people;
        people = buscarPessoa(nome);
        
        if(people != null)
        {
            people.addContato(c);
        }
    }
    
    public void exibirTodasPessoas()
    {
        for(int i=0;i<contador;i++)
        {
            if(pessoas[i]!=null)
            {
                pessoas[i].exibirContatos();
            }
        }
    }
    
    public void exibirContatosPessoa(String nome)
    {
        Pessoa people = new Pessoa();
        people = buscarPessoa(nome);
        
        if(people != null)
        {
            people.exibirContatos();
        }  
    }
    
    public void exibirPessoasComEmail()
    {
        for(int i=0;i<contador;i++)
        {
            if(pessoas[i]!=null && pessoas[i].possuiEmail())
            {
                pessoas[i].getNome();
            }
        }
    }
    
    public void recuperarPessoaPorEmail(String email)
    {
        boolean encontrou = false;
        for(int i=0;i<contador;i++)
        {
            if(pessoas[i]!=null)
            {
                Contato contact[] = pessoas[i].getContatos();
                int contTemp = pessoas[i].getContador();
                for(int j=0;j<contTemp;j++)
                {
                    if(contact[j]!=null && contact[j] instanceof Email)
                    {
                        if(((Email)contact[j]).getEmail().equals(email))
                        {
                            if(!encontrou)
                            {
                                System.out.println("Nome das pessoas que possuem o email:");
                                encontrou = true;   
                            }
                            System.out.println("Nome: "+pessoas[i].getNome());
                            break;
                        }
                    }
                }
                
            }
        }
        if(!encontrou)
        {
            System.out.println("Nenhuma pessoas encontrada com o email: "+email);  
        }
    }
    
    public void recuperarPessoaPorTelefone(String telefone)
    {
        boolean encontrou = false;
        for(int i=0;i<contador;i++)
        {
            if(pessoas[i]!=null)
            {
                Contato contact[] = pessoas[i].getContatos();
                int contTemp = pessoas[i].getContador();
                for(int j=0;j<contTemp;j++)
                {
                    if(contact[j] instanceof Telefone && ((Telefone) contact[j]).getTelefone().equals(telefone))
                    {
                        if(!encontrou)
                        {
                            System.out.println("Nome das pessoas que possuem o telefone:");
                            encontrou = true;
                        }
                        System.out.println("Nome: " + pessoas[i].getNome());
                        break;
                    }
                }
                
            }
        }
        if(!encontrou)
        {
            System.out.println("Nenhuma pessoas encontrada com o telefone: "+telefone);  
        }
    }
}
