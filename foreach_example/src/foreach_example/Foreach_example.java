
package foreach_example;


public class Foreach_example {

    public static void main(String[] args) {
        try1[] name={ new try1("ANAS"),new try1("MEHMET"),new try1("HANAN")};
        String[] names = {"ANAS","AHMED","AYMEN"};
        int array [] = {1,3,7,6,9};
        for ( String isimler:names){
            System.out.println(isimler);
        }
        System.out.println("ur name is : "+names[1]);
                for ( int  numbers :array){
                                System.out.println(numbers);

                }
                        for ( try1 isim : name){
                     isim.display();
                   System.out.println(isim);

                        }


    }
    
}
