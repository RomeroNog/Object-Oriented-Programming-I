/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Tecnico extends Funcionario{
        protected String nivel;
        
        public Tecnico(){}
        public Tecnico(String codigo,String nome,float salario,String nivel)
        {
            super(codigo,nome,salario);
            this.nivel = nivel;
        }
        
        public void setNivel(String nivel)
        {
            this.nivel = nivel;
        }
        String getNivel()
        {
            return nivel;
        }
        
        void exibir()
        {
            super.exibir();
            System.out.println("Nivel: "+nivel);
        }
}
