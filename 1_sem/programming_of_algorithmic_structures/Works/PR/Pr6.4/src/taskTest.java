import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class taskTest {

    task objtest = new task();
    @Test
    void endOther1() {
        boolean actual = objtest.endOther("cat","dogcat");
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    void endOther2() {
        boolean actual = objtest.endOther("cat","dogcat");
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    void endOther3() {
        boolean actual = objtest.endOther("dogcat","cat");
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    void endOther4() {
        boolean actual = objtest.endOther("catca","dogcat");
        boolean expected = false ;
        assertEquals(actual,expected);
    }
    @Test
    void endOther5() {
        boolean actual = objtest.endOther("cat","doggggcat");
        boolean expected = true ;
        assertEquals(actual,expected);
    }
}