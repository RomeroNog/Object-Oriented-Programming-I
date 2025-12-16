/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Horario {
    public int hora;
    public int minuto;
    public int segundo;
    
    Horario(){}
    Horario(int hora,int minuto,int segundo)
    {
        this.hora = hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }
    void setHora(int hora)
    {
        this.hora = hora;
    }
    void setMinuto(int minuto)
    {
        this.minuto=minuto;
    }
    void setSegundo(int segundo)
    {
        this.segundo=segundo;
    }
    
    int getHora()
    {
        return hora;
    }
    int getMinuto()
    {
        return minuto;
    }
    int getSegundo()
    {
        return segundo;                                     
    }
    
    void ExibirHora()
    {
        System.out.println(getHora()+":"+getMinuto()+":"+getSegundo());
    }
    int calcSeg()
    {
        int segs=0;
        segs+=getSegundo();
        segs+=getMinuto()*60;
        segs+=getHora()*3600;
        
        return segs;
    }
    
}
