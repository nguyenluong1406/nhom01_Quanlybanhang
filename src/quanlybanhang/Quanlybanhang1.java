

package Quanlybanhang;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlybanhang1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> ds = new ArrayList<>();
            int chon;
            
            do {
                System.out.println("\n1. Them sinh vien");
                System.out.println("2. Hien thi sinh vien");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon: ");
                
                chon = sc.nextInt();
                sc.nextLine();
                
                if (chon == 1) {
                    System.out.print("Ma sinh vien: ");
                    String ma = sc.nextLine();
                    
                    System.out.print("Ho ten: ");
                    String ten = sc.nextLine();
                    
                    System.out.print("Diem: ");
                    double diem = sc.nextDouble();
                    sc.nextLine();
                    
                    ds.add(new Student(ma, ten, diem));
                    System.out.println("Them thanh cong!");
                } else if (chon == 2) {
                    for (Student sv : ds) {
                        sv.hienThi();
                    }
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    }
                }
            } while (chon != 0);
        }
    }
}




