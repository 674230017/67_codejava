package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int score;

        do {

            System.out.print("Enter your score between 1 and 100: ");
            score = kb.nextInt();

        } while (score < 1 || score > 100);
        if (score >= 101) {
            System.out.println("Please enter a value between 0 and 100");

        } else if (score <= 0) {
            System.out.println("Please enter a value between 0 and 100");

        } else if (score >= 80) {
            System.out.println("Grade A");

        } else if (score >= 70) {
            System.out.println("Grade B");

        } else if (score >= 60) {
            System.out.println("Grade C");

        } else if (score >= 50) {
            System.out.println("Grade D");

        } else {
            System.out.println("Grade E");
        }
        kb.close(); // ปิด Scanner object
    }
}
