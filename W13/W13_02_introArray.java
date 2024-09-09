package W13;

import java.util.Scanner;

public class W13_02_introArray {

    public static void main(String[] args) {

        //ประกาศตัวแปร Array แบบที่2 ไม่รู้ข้อมูลล่วงหน้า
        String[] brandCars = new String[10];
        Scanner kb = new Scanner(System.in);

        brandCars[0] = " Toyota ";
        brandCars[3] = " Honda ";
        brandCars[9] = " Nissan ";

        System.out.println("Default Brand of cars in the array are :");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.println(brandCars[i] + " ");

        }

        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.println("Enter brand" + (i + 1) + ": ");
            brandCars[i] = kb.next();

        }

        System.out.println("\nNew Brand of cars in the array are :");
        for (String car : brandCars) {
            System.out.println(car + " / ");

        }

    }
}
