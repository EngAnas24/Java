
package foreach_example;

public class try1 {
    private String name;

    @Override
    public String toString() {
        return "name : "+name; //To change body of generated methods, choose Tools | Templates.
    }

    public try1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void display(){
        System.out.println(name);
}
}
