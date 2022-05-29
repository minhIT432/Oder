
package projectoop;

import java.util.Scanner;


public class App {
        public static void menu(){
        System.out.println("--------------------Danh sach chuc nang--------------------");
        System.out.println("1. Them moi san pham");
        System.out.println("2. Hien thi san pham");        
        System.out.println("3. Sua san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Mua hang");
        System.out.println("6. Hien thi danh sach mua hang");
        System.out.println("7. Thoat");
        }
    
    public static void main(String[] args) {
        int function = 0;
        Scanner input = new Scanner(System.in);
        
        do {            
            menu();
            System.out.print("Chon chuc nang: ");
            function = input.nextInt();
        } while (function != 7);

    }
    

}

