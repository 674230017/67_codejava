package W15;

// การสร้าง method ประกอบด้วยส่วนต่าง ๆ ดังนี้:
// ชื่อ method: ชื่อที่ใช้ในการเรียก method
// พารามิเตอร์ (Parameters): ข้อมูลที่ส่งเข้าไปให้ method ทำงาน (อาจมีหรือไม่มี)
// เนื้อหาของ method: คำสั่งที่ method จะดำเนินการ
// ==============================================================
// returnType methodName(parameters) {
//     // คำสั่งที่ต้องการให้ทำงาน
//     return value; // ถ้ามีการคืนค่า
// }
// ==============================================================
public class W15_01_method_intro {

    // 1) Method ที่ไม่มีการรับค่าและคืนค่า
    static void printHello() {
        System.out.println("Hello World");

    }

    // 2) Method ที่รับค่าแต่ไม่คืนค่า
    static void sayHelloTo(String name) {
        System.out.println("Hello" + name);

    }

    // 3) Method ที่ไม่รับค่าและคืนค่า
    static String getITname() {

        return " IT ";

    }

    // 4) Method ที่รับค่าและคืนค่า
    static int add(int a, int b) {
        System.out.print(a + "+" + b + "=");
        return a + b;
    }

    // 5) Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
    static void printLine() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {

        // 1) Method ที่ไม่มีการรับค่าและคืนค่า
        printHello();
        printLine();
        // 2) Method ที่รับค่าและไม่คืนค่า
        sayHelloTo("Thanasak");
        printLine();
        // 3) Method ที่ไม่รับค่าและคืนค่า
        System.out.println(" my major is " + getITname());
        printLine();
        // 4) Method ที่รับค่าและคืนค่า
        System.out.println(add(13, 9));
        printLine();
    }
}
