
package date;
public class Date {

    
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);
        java.text.SimpleDateFormat Dt = new java.text.SimpleDateFormat("MM-dd-yyyy  hh/mm");
        System.out.println(Dt.format(dt));
    }
    
}
