import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_dongdulieu {
    kiemthu unit = new kiemthu();

    @Test
    void test1() {
        assertEquals(unit.tinhtoan(200,"tre em"), "Giam gia 20%");
    }
}