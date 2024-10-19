package com.example.week3;

public class Week3 {

    public static double tinhTienDien(int soDien, String loaiDichVu) {
        if (soDien < 0 || soDien > 1000) {
            return -1;  // Trả về -1 nếu số điện không hợp lệ
        }
        double sum = 0;
        if (loaiDichVu.equals("dien kinh doanh")) {
            sum = soDien * 2870;  // Giá điện kinh doanh là cố định 2870
        } else if (loaiDichVu.equals("dien sinh hoat")) {
            sum = tinhTienDienSinhHoat(soDien);  // Gọi hàm tính tiền điện sinh hoạt
        } else {
            return -1;  // Trả về -1 nếu loại dịch vụ không hợp lệ
        }
        return sum;
    }

    public static double tinhTienDienSinhHoat(double x) {
        double sum = 0;

        if (x > 413) {
            sum = 52 * 1806 + 52 * 1866 + 103 * 2167 + 103 * 2729 + 103 * 3050 + (x - 413) * 3151;
        } else if (x > 310) {
            sum = 52 * 1806 + 52 * 1866 + 103 * 2167 + 103 * 2729 + (x - 310) * 3050;
        } else if (x > 207) {
            sum = 52 * 1806 + 52 * 1866 + 103 * 2167 + (x - 207) * 2729;
        } else if (x > 104) {
            sum = 52 * 1806 + 52 * 1866 + (x - 104) * 2167;
        } else if (x > 52) {
            sum = 52 * 1806 + (x - 52) * 1866;
        } else {
            sum = x * 1806;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(tinhTienDien(999, "dien kinh doanh"));  // Tính tiền điện kinh doanh
        System.out.println(tinhTienDien(999, "dien sinh hoat"));   // Tính tiền điện sinh hoạt
        System.out.println(tinhTienDien(150, "dien sinh hoat"));   // Tính tiền điện sinh hoạt cho số điện 150
        System.out.println(tinhTienDien(80, "dien sinh hoat"));    // Tính tiền điện sinh hoạt cho số điện 80
    }
}
