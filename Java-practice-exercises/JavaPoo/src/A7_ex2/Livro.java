/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A7_ex2;

/**
 *
 * @author manoe
 */
public class Livro {
    private String isbn;
    private String titulo;
    private String editora = Constantes.editora;
    
    private int numMaxCap = Constantes.MAXCAPS;
    private Capitulo caps[] = new Capitulo[numMaxCap];
    private int contaCaps=0;
    
    public Livro(){}
    public Livro(String isbn,String titulo)
    {
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
    public String getIsbn()
    {
        return this.isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getEditora()
    {
        return this.editora;
    }
    
    public int getContaCaps()
    {
        return this.contaCaps;
    }
       
    public void addCapitulo(Capitulo c)
    {
        if(contaCaps<numMaxCap)
        {
            c.setNumero(Constantes.NumDoCap++);
            caps[contaCaps++] = c;
        }
        else
        {
            System.out.println("Nao foi possivel adiconar o capitulo");
        }
    }
    
    public int NumTotPags()
    {
        int soma=0;
        for(int i=0;i<contaCaps;i++)
        {
            soma+=caps[i].getQntpags();
        }
        return soma;
    }
    
    public void exibir()
    {
        System.out.println("Dados do livro");
        System.out.println("Editora: "+this.getEditora());
        System.out.println("ISBN: "+this.getIsbn());
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Numero de capitulos: "+this.getContaCaps());
        System.out.println("Numero total de paginas: "+this.NumTotPags());
        for(int i=0;i<contaCaps;i++)
        {
            caps[i].exibir();
        }
    }
    
    
}
