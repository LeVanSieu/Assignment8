
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
}
 
