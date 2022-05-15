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
public class MyBook {
    private  int Id ;
    private String Title;
        private String Author;
        private int nbr_page;
        
        
        public MyBook (int id,String title,String author, int nbr){

    this.Id=id;
    this.Title=title;
    this.Author=author;
    this.nbr_page=nbr;
   
}

    

   
    /**
     * @return the nbr_page
     */
    public int getNbr_page() {
        return nbr_page;
    }

    /**
     * @param nbr_page the nbr_page to set
     */
    public void setNbr_page(int nbr_page) {
        this.nbr_page = nbr_page;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    void getnbr_page() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

                }
 


      //  void display(){
       
/*     System.out.println("id: "+this.Id+ "\ntitle : "+this.Title+"\nathour : "+this.Author+"\nnbr: "+this);
        }*/
        
        

