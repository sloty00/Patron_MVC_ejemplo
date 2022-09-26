/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jvargas
 */
public class modelo {
    private int valor1=30;
    private int valor2=40;
    private int total=sumar();
    
    public modelo() {
        
    }

    public void setValor1(int val) {
        this.valor1 = val;
    }

    public int getValor1() {
        return this.valor1;
    }
    
    public void setValor2(int val) {
        this.valor2 = val;
    }

    public int getValor2() {
        return this.valor2;
    }

    public int sumar(){
        this.total =  this.valor1 + this.valor2;
        return this.total;
    }
    
    public int getTotal() {
        return this.total;
    }
    
    
}