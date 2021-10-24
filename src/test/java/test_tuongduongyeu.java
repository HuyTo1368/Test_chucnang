import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_tuongduongyeu {
    kiemthu unit = new kiemthu();

    @Test
    void test1() {
        assertEquals(unit.tinhtoan(-1,"tre em"), "Du lieu dau vao khong hop le");
    }

    @Test
    void test2() {
        assertEquals(unit.tinhtoan(15,"nguoi lon"), "Khong duoc giam gia");
    }

    @Test
    void test3() {
        assertEquals(unit.tinhtoan(50,"tre em"), "Giam gia 10%");
    }

    @Test
    void test4() {
        assertEquals(unit.tinhtoan(125,"nguoi lon"), "Giam gia 10%");
    }

}
