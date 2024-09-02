package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int choice;

        do {
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");

            System.out.print("Enter your choice:");
            choice = kb.nextInt();
            System.out.println("------------------------------------");

            switch (choice) {
                case 1:

                    System.out.print("Enter the first number: ");
                    int num1 = kb.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = kb.nextInt();
                    int sum = num1 + num2;
                    System.out.println("the sum is " + sum);

                case 2:

                    System.out.print("Enter the first number: ");
                    int num3 = kb.nextInt();
                    System.out.print("Enter the second number: ");
                    int num4 = kb.nextInt();
                    int difference = num3 + num4;
                    System.out.println("the difference is " + difference);

                case 3:

                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        // แสดงเมนู
        // รับค่าเลือกเมนู
        // แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
        // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        // ปิด Scanner object
    }
}
