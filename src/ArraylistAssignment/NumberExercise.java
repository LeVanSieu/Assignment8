
package ArraylistAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberExercise {
    static void importData(ArrayList<Integer> arrays){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n=nhap.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("Nhap phan tu: " );
            arrays.add(i, nhap.nextInt());
            System.out.println();
        }
    }
    static void printData(ArrayList<Integer> arrays){
        System.out.println("Mang: "+Arrays.toString(arrays.toArray()));
    }
    static int findMax2(ArrayList<Integer> arrays){
        int gtln = arrays.get(0);
        int Max2 = arrays.get(1);
        if (gtln < Max2) {
            int k;
            k = Max2;
            Max2 = gtln;
            gtln = k;
        }
        for (int i = 0; i < arrays.size(); i++) {
            if (gtln < arrays.get(i)) {
                Max2 = gtln;
                arrays.set(i, arrays.get(i));
            } else {if (gtln!=arrays.get(i)&&Max2 < arrays.get(i)) {
                arrays.set(i, arrays.get(i));
            }
            }
        }

        return Max2;
    }
    static void deleteOddNumber(ArrayList<Integer> arrays){
        arrays.removeAll(arrays);
    }
    static void Menu(ArrayList<Integer> arrays){
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
            } while (1<n&&n>5);
                switch (n){
            case (1):
                importData(arrays);
                break;
            case (2): 
                printData(arrays);
                break;
            case (3):
                findMax2(arrays);
                break;
            case (4):
                deleteOddNumber(arrays);
                break;
        }
        }   while(n!=5);
}
}
 
