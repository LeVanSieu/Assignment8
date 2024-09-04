
package ArraylistAssignment;

import static ArraylistAssignment.NumberExercise.deleteOddNumber;
import static ArraylistAssignment.NumberExercise.findMax2;
import static ArraylistAssignment.NumberExercise.importData;
import static ArraylistAssignment.NumberExercise.printData;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static void Menu2(ArrayList<Integer> arrays){
        Scanner nhap = new Scanner(System.in);
        int n;
        do{ 
            System.out.println("1. Nhap mang ");
            System.out.println("2. In ra mang ");
            System.out.println("3. Tim gia tri lon thu 2 ");
            System.out.println("4. Xoa mang");
            System.out.println("5. Thoat Menu");
            System.out.println("Nhap lua chon cua ban: ");
            do {
                    n=nhap.nextInt();
                    if (n<1||n>5){
                        System.out.println("Lua chon khong hop le vui long chon lai: ");
                    }
            } while (1>n||n>5);
                switch (n){
            case (1) -> importData(arrays);
            case (2) -> printData(arrays);
            case (3) -> System.out.println("Gia tri lon thu hai cua mang: "+findMax2(arrays));
            case (4) -> deleteOddNumber(arrays);
        }
        }   while(n!=5);
}
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<>();
        Menu2(arrays);
    }
    }

