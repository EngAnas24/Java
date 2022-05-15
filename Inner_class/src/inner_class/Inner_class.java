
package inner_class;


public class Inner_class {
 
    
     void Show(){
        System.out.println("lets see if it will work or not ! ");
    class Inner{
           private String name;
           private int number;
           private int ID;

             public String getName() {
                 return name;
             }

             public void setName(String name) {
                 this.name = name;
             }

             public int getNumber() {
                 return number;
             }

             public void setNumber(int number) {
                 this.number = number;
             }

             public int getID() {
                 return ID;
             }

             public void setID(int ID) {
                 this.ID = ID;
             }

             public Inner(String name, int number, int ID) {
                 this.name = name;
                 this.number = number;
                 this.ID = ID;
             }

             @Override
             public String toString() {
                 return "Inner{" + "name=" + name + ", number=" + number + ", ID=" + ID + '}';
             }
        
          void test(){
            System.out.println("inner class  is working");
        }
       
    
    }
    Inner n = new Inner("ANAS",484354, 1);
         System.out.println(n.toString());
    n.test();
    
    }
    public static void main(String[] args) {
//        Inner_class.Inner i = new Inner_class().new Inner();
//        i.test();
//     Inner_class n = new Inner_class();
//     n.Show();
Inner_class i = new Inner_class();
i.Show();
    }
    
}
