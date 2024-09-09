package W13;

public class W13_01_introArray {

    public static void main(String[] args) {

        //ประกาศตัวแปร Array แบบที่1 รู้ข้อมูลล่วงหน้า
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yello", "Orange", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};

        //เป็นการแสดงผลลัพธ์ index ของ Array
        System.out.println("The first color is" + colors[0]);
        System.out.println("The Third alphabets is" + alphabets[2]);

        //แสดงผลโดยใช้ Loop
        System.out.println(" ");
        for (int i = 0; i < 6; i++) {
            System.out.println(colors[i] + " ");

        }

        System.out.println();
        System.out.println("===========================");
        for (int i = 6; i <= 0; i--) {
            System.out.println(colors[i] + " ");

        }

        System.out.println();
        System.out.println("===========================");
        System.out.println("Bank in the array  are :");
        for (int i = 0; i < banks.length; i++) {
            System.out.println(colors[i] + " ");

        }

    }

}
