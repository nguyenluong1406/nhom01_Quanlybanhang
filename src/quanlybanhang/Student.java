
package quanlybanhang;


public class Student {
    private final String maSV;
    private final String hoTen;
    private final double diem;

    public Student(String maSV, String hoTen, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void hienThi() {
        System.out.println(
            maSV + " - " + hoTen + " - " + diem
        );
    }
}


