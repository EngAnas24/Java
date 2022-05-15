/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elma;

/**
 *
 * @author dell
 */
public class Elma {
 int elma_sayisi=1;
 Elma topla(){
     elma_sayisi++;
     return this;
 }
 void goster(){
     System.out.println("elma sayisi: "+elma_sayisi);
 }
    public static void main(String[] args) {
        // TODO code application logic here
        Elma e = new Elma();
        e.topla().topla().topla().topla().goster();
        
    }
    
}
