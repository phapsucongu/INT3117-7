package com.example.week3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Week3Test {

    @Test
    public void testTinhTienDien1() {
        // For "dien kinh doanh"
        assertEquals(0, Week3.tinhTienDien(0, "dien kinh doanh"), 0.001);
        assertEquals(2870000, Week3.tinhTienDien(1000, "dien kinh doanh"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(-1, "dien kinh doanh"), 0.001);
        assertEquals(2870, Week3.tinhTienDien(1, "dien kinh doanh"), 0.001);
        assertEquals(2867130, Week3.tinhTienDien(999, "dien kinh doanh"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(1001, "dien kinh doanh"), 0.001);
        assertEquals(1435000, Week3.tinhTienDien(500, "dien kinh doanh"), 0.001);

        // For "dien sinh hoat"
        assertEquals(0, Week3.tinhTienDien(0, "dien sinh hoat"), 0.001);
        assertEquals(2859019, Week3.tinhTienDien(1000, "dien sinh hoat"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(-1, "dien sinh hoat"), 0.001);
        assertEquals(1806, Week3.tinhTienDien(1, "dien sinh hoat"), 0.001);
        assertEquals(2855868, Week3.tinhTienDien(999, "dien sinh hoat"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(1001, "dien sinh hoat"), 0.001);
        assertEquals(1283519, Week3.tinhTienDien(500, "dien sinh hoat"), 0.001);
    }

    @Test
    public void testTinhTienDien2() {
        // Various test cases for "dien kinh doanh" and "dien sinh hoat"
        assertEquals(-1, Week3.tinhTienDien(-1, "a"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(1, "a"), 0.001);
        assertEquals(2870, Week3.tinhTienDien(1, "dien kinh doanh"), 0.001);
        assertEquals(1806, Week3.tinhTienDien(1, "dien sinh hoat"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(53, "a"), 0.001);
        assertEquals(152110, Week3.tinhTienDien(53, "dien kinh doanh"), 0.001);
        assertEquals(95778, Week3.tinhTienDien(53, "dien sinh hoat"), 0.001);
        assertEquals(301350, Week3.tinhTienDien(105, "dien kinh doanh"), 0.001);
        assertEquals(193111, Week3.tinhTienDien(105, "dien sinh hoat"), 0.001);
        assertEquals(596960, Week3.tinhTienDien(208, "dien kinh doanh"), 0.001);
        assertEquals(416874, Week3.tinhTienDien(208, "dien sinh hoat"), 0.001);
        assertEquals(892570, Week3.tinhTienDien(311, "dien kinh doanh"), 0.001);
        assertEquals(698282, Week3.tinhTienDien(311, "dien sinh hoat"), 0.001);
        assertEquals(1188180, Week3.tinhTienDien(414, "dien kinh doanh"), 0.001);
        assertEquals(1012533, Week3.tinhTienDien(414, "dien sinh hoat"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(-1, "dien sinh hoat"), 0.001);
        assertEquals(2870, Week3.tinhTienDien(1, "dien kinh doanh"), 0.001);
        assertEquals(1806, Week3.tinhTienDien(1, "dien sinh hoat"), 0.001);
        assertEquals(152110, Week3.tinhTienDien(53, "dien kinh doanh"), 0.001);
        assertEquals(95778, Week3.tinhTienDien(53, "dien sinh hoat"), 0.001);
        assertEquals(-1, Week3.tinhTienDien(53, "a"), 0.001);
    }
}
