/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author manoe
 */
public class Aluno {
    public String nome;
    public String RA;
    public float t1,t2,p1,p2;
    
    public Aluno()
    {

    }
    public Aluno(String nome,String RA,float t1,float t2,float p1,float p2)
    {
        this.nome = nome;
        this.RA = RA;
        this.t1 = t1;
        this.t2 = t2;
        this.p1 = p1;
        this.p2 = p2;
    }
    public boolean APROVADO()
    {
         
           if(calcularMedia()>=5)
           {
               return true;
           }
           else
           {
               return false;
           }
    }
    float calcularMedia()
    {
        return (t1+t2+p1+p2)/4.0f;
    }
    
    void setNome(String nome)
    {
        this.nome = nome;
    }
    
    void setRa(String RA)
    {
        this.RA = RA;
    }
    
    void setT1(float t1)
    {
        this.t1 = t1;
    }
    void setT2(float t2)
    {
        this.t2 = t2;
    }
    void setP1(float p1)
    {
        this.p1 = p1;
    }
    void setP2(float p2)
    {
        this.p2 = p2;
    }
    
    public String getNome()
    {
        return nome;
    }
    public String getRA()
    {
        return RA;
    }
    public float getT1()
    {
        return t1;
    }
    public float getT2()
    {
        return t2;
    }
    public float getP1()
    {
        return p1;
    }
    public float getP2()
    {
        return p2;
    }

}
