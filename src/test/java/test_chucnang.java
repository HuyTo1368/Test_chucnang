import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_chucnang {
    kiemthu unit = new kiemthu();

    @Test
    void test1() {assertEquals(unit.tinhtoan(125,"tre em"), "Giam gia 20%");} //1-2-3-4
    @Test
    void test2() {assertEquals(unit.tinhtoan(50,"tre em"), "Giam gia 10%");} //1-2-3-5
    @Test
    void test3() {assertEquals(unit.tinhtoan(15,"tre em"), "Giam gia 5%");} //1-2-3-6
    @Test
    void test4() {assertEquals(unit.tinhtoan(125,"nguoi lon"), "Giam gia 10%");} //1-2-3-7
    @Test
    void test5() {assertEquals(unit.tinhtoan(50,"Nguoi lon"), "Giam gia 5%");} //1-2-3-8
    @Test
    void test6() {assertEquals(unit.tinhtoan(15,"Nguoi lon"), "Khong duoc giam gia");} //1-2-3-9
    @Test
    void test7() {assertEquals(unit.tinhtoan(-1,"Nguoi lon"), "Du lieu dau vao khong hop le");}
    //1-2-3-10


}
