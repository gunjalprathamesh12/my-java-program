package array_s;
import java.util.*;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZ EOF ARRAY YOU WANT=");
        int size = sc.nextInt();
        int i;
        int[] number = new int[size];
        System.out.println("ENTER ELEMENTS");
        for (i = 0; i <= size; i++) {
            number[i] = sc.nextInt();
            sc.close();    
        }
        System.out.println("ENTER ELEMENT YOU WNAT TO SEARCH=");
        int key = sc.nextInt();
        for (i = 0; i <= size; i++) {
            if (number[i] == key) {
                System.out.println("ELEMENT IS FOUND AT POS=" + i);
            } else {
                System.out.print("NUMBER DOSENT EXIST");
            }
            
        }
    }

}
