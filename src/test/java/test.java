import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    kiemthu unit = new kiemthu();

    @Test
    void test1() {assertEquals(unit.tinhtoan(-1,"tre em"), "Du lieu dau vao khong hop le");}
    @Test
    void test2() {assertEquals(unit.tinhtoan(15,"tre em"), "Giam gia 5%");}
    @Test
    void test3() {assertEquals(unit.tinhtoan(50,"tre em"), "Giam gia 10%");}
    @Test
    void test4() {assertEquals(unit.tinhtoan(125,"tre em"), "Giam gia 20%");}
    @Test
    void test5() {assertEquals(unit.tinhtoan(-1,"Nguoi lon"), "Du lieu dau vao khong hop le");}
    @Test
    void test6() {assertEquals(unit.tinhtoan(15,"Nguoi lon"), "Khong duoc giam gia");}
    @Test
    void test7() {assertEquals(unit.tinhtoan(50,"Nguoi lon"), "Giam gia 5%");}
    @Test
    void test8() {assertEquals(unit.tinhtoan(125,"nguoi lon"), "Giam gia 10%");}
}
