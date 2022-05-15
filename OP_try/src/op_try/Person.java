
package op_try;


public class Person {
    private String Name ;
    private int age;

    public Person(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
