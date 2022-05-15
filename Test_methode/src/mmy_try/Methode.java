

package mmy_try;

public class Methode {
   private String Student_name;
   private int Student_ID;


    public  String Explnation(String about){
        return "this student is " +about;
    }
    public String getStudent_name() {
        return Student_name;
    }

    /**
     * @param Student_name the Student_name to set
     */
    public void setStudent_name(String Student_name) {
        this.Student_name = Student_name;
    }

    /**
     * @return the Student_ID
     */
    public int getStudent_ID() {
        return Student_ID;
    }

    /**
     * @param Student_ID the Student_ID to set
     */
    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public Methode(String Student_name, int Student_ID) {
        this.Student_name = Student_name;
        this.Student_ID = Student_ID;
    }
   
   public void Display(){
       System.out.println(getStudent_name()+"\n"+getStudent_ID() );
}
}