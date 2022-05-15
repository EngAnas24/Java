
package atm;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        String kullanci_adi;
        String parola;
        
        Scanner input = new Scanner(System.in);
        System.out.println("kullanci adi gir: ");
        kullanci_adi=input.nextLine();
        System.out.println("parola:");
        parola = input.nextLine();
        if (hesap.getKullancinin_adi().equals(kullanci_adi) && hesap.getParola().equals(parola)){
                        return true;

        }
        else
            return false;
        
    }
}
