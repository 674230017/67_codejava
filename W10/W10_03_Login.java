package W10;

import java.util.Scanner;

public class W10_03_Login {
    public static void main(String[] args) {
      
        String username = "admin";
        String password = "1234";

        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนชื่อ : ");
        String inputUsername = kb.nextLine();

        System.out.print("ป้อนรหัสผ่าน : ");
        String inputPassword = kb.nextLine();

        if(username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("เข้าสู่ระบบสำเร็จ");
        } else {
            if(!username.equals(inputUsername) && password.equals(inputPassword)){
                System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");
            }else if(username.equals(inputUsername) && !password.equals(inputPassword)){

            }else{
                System.out.println("รหัสผ่านไม่ถูกต้อง");
            }
        }

    }

}
