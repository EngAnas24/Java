
package enc;


public class student {
   private String name;
    private String age;
      private int level;

          
public void display(){
    System.out.println(getName()+getAge()+getLevel());
}
//      public student(String age,int level){
//          this("ANAS\n",age,level);
//      }

      
      
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

   public student(String name, String age, int level) {
       this.name = name;
       this.age = age;
        this.level = level;
    }

}
