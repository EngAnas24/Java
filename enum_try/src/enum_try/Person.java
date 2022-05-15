
package enum_try;


public class Person {
    private String Fname ;
   private String Lname ;
   Gender Type;

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public Gender getType() {
        return Type;
    }

    public void setType(Gender Type) {
        this.Type = Type;
    }

    public Person(String Fname, String Lname, Gender Type) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Type = Type;
    }
public void Display(){
    System.out.println("ur  name is "+Fname+" "+Lname+"\n  ur gender is: "+Type);
}
}
