import java.util.*;
import java.lang.Math;

public class menumakan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] menumakanan = new String[10];
        int[] banyakpesanan = new int[10];
        int menu;
        int i;
        int j;
        
        i = 1;
        j = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Pesan Nasi Goreng Biasa");
            System.out.println("2. Pesan Nasi Goreng Seafood");
            System.out.println("3. Pesan Nasi Goreng Istimewa");
            System.out.println("0. Keluar");
            menu = input.nextInt();
            System.out.println(menu);
            if (menu == 1) {
                menumakanan[i] = "Nasi Goreng Biasa = ";
                System.out.print("Banyak = ");
                banyakpesanan[i] = input.nextInt();
            } else {
                if (menu == 2) {
                    menumakanan[i] = "Nasi Goreng Seafood = ";
                    System.out.print("banyak = ");
                    banyakpesanan[i] = input.nextInt();
                } else {
                    if (menu == 3) {
                        menumakanan[i] = "Nasi Goreng Istimewa = ";
                        System.out.print("banyak = ");
                        banyakpesanan[i] = input.nextInt();
                    }
                }
            }
            i = i + 1;
        } while (menu > 0);
        for (j = 1; j <= i - 2; j++) {
            System.out.print(menumakanan[j]);
            System.out.println(banyakpesanan[j]);
        }
    }
}
