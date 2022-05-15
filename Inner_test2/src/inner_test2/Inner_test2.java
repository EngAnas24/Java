
package inner_test2;


public class Inner_test2 {
   public   void Show(){
    System.out.print("show the information");
    }
class Inner {

        
      public   void Display(){
              System.out.print("..........");
        }
      public    static final int  x = 50;

}

    public static void main(String[] args) {
        Inner_test2.Inner i = new Inner_test2().new Inner();
        Inner_test2 inner = new Inner_test2();
        inner.Show();
             i.Display();
             
    }
    
}
