/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insansifati;


public abstract class  Insan {
    private String Name;
    private int age ;
    private Double weghit;

    public Insan(String Name, int age, Double weghit) {
       this.Name = Name;
        this.age = age;
        this.weghit = weghit;
    }

    @Override
    public String toString() {
        return "Inasn{" + "Name=" + Name + ", age=" + age + ", weghit=" + weghit + '}';
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

    public Double getWeghit() {
        return weghit;
    }

    public void setWeghit(Double weghit) {
        this.weghit = weghit;
    }
    
    
}
