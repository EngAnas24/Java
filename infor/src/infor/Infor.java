/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infor;

/**
 *
 * @author dell
 */
public class Infor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBook book = new MyBook();
        book.setId(9);
        book.setAuthor("ANAS");              
     book.setTitle("to ALlah belong");
               
        book.setNbr_page(891);
                
        System.out.println("id: "+book.getId()+ "\ntitle : "+book.getTitle()+"\nathour : "+book.getAuthor()+"\nnbr: "+book.getNbr_page());
        

    
