import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pr2Test {
    pr2 pr2 = new pr2();

    @Test
    void sumDigits1() {
        int actual = pr2.sumDigits("aa1bc2d3");
        int expected = 6 ;
        assertEquals(expected, actual);
    }
    @Test
    void sumDigits2() {
        int actual = pr2.sumDigits("aa11b33");
        int expected = 8 ;
        assertEquals(expected, actual);
    }
    @Test
    void sumDigits3() {
        int actual = pr2.sumDigits("Chocolate");
        int expected = 0 ;
        assertEquals(expected, actual);
    }@Test
    void sumDigits4() {
        int actual = pr2.sumDigits("Ліза сонце♥");
        int expected = 0 ;
        assertEquals(expected, actual);
    }@Test
    void sumDigits5() {
        int actual = pr2.sumDigits("jf8f8h6dsg");
        int expected = 22 ;
        assertEquals(expected, actual);
    }
}