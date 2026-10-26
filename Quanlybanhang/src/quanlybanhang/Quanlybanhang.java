package quanlybanhang;

import java.util.ArrayList;
import java.util.Scanner;

// Lớp Student (mô hình sinh viên)
class Student {
    private String maSV;
    private String hoTen;
    private double diem;

    public Student(String maSV, String hoTen, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void hienThi() {
        System.out.println("Mã SV: " + maSV + " | Họ tên: " + hoTen + " | Điểm: " + diem);
    }
}

public class Quanlybanhang {

    // Chức năng tìm kiếm sinh viên (Nhiệm vụ của Sinh viên 4)
    public static void timKiemSinhVien(ArrayList<Student> danhSach, String tuKhoa) {
        boolean found = false;
        System.out.println("\n--- KẾT QUẢ TÌM KIẾM CHO TỪ KHÓA: \"" + tuKhoa + "\" ---");
        for (Student sv : danhSach) {
            if (sv.getMaSV().toLowerCase().contains(tuKhoa.toLowerCase()) || 
                sv.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase())) {
                sv.hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp!");
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> danhSachSV = new ArrayList<>();
        
        // Thêm dữ liệu mẫu để test chức năng
        danhSachSV.add(new Student("SV01", "Nguyen Van An", 8.5));
        danhSachSV.add(new Student("SV02", "Tran Thi Binh", 7.0));
        danhSachSV.add(new Student("SV03", "Le Van Cuong", 9.0));

        // Nhập từ bàn phím để tìm kiếm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hoặc tên sinh viên cần tìm: ");
        String tuKhoa = scanner.nextLine();
        
        timKiemSinhVien(danhSachSV, tuKhoa);
    }
}
