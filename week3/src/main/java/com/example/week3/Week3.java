package com.example.week3;

public class Week3 {

    public static double tinhTienDien(int soDien, String loaiDichVu) {
        if (soDien < 0||soDien>1000) {
            //System.out.println("Input không hợp lệ!");
            return -1;
        }
        double sum = 0;
        if (loaiDichVu.equals("dien kinh doanh")) {
            sum = soDien * 2870;
        } else if (loaiDichVu.equals("dien sinh hoat")) {
            sum = tinhTienDienSinhHoat(soDien);
        } else {
            //System.out.println("Input không hợp lệ!");
            return -1;
        }
        return sum;
    }

    public static double tinhTienDienSinhHoat(double x) {
        double sum = 0;

        if (x > 413) {
            sum += (x - 413) * 3151;
            x = 413;
        }
        if (x > 310) {
            sum += (x - 310) * 3050;
            x = 310;
        }
        if (x > 207) {
            sum += (x - 207) * 2729;
            x = 207;
        }
        if (x > 104) {
            sum += (x - 104) * 2167;
            x = 104;
        }
        if (x > 52) {
            sum += (x - 52) * 1866;
            x = 52;
        }
        if (x > 0) {
            sum += x * 1806;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(tinhTienDien(999, "dien kinh doanh"));
    }
}
