import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class taskTest {
    task test = new task();

    @Test
    void withoutString1() {
        String actual = test.withoutString("catcat","a");
       String  expected = "ctct";
        assertEquals(expected, actual);
    }
    @Test
    void withoutString2() {
        String actual = test.withoutString("Hello there","llo");
        String  expected = "He there";
        assertEquals(expected, actual);
    }
    @Test
    void withoutString3() {
        String actual = test.withoutString("Hello there","e");
        String  expected = "Hllo thr";
        assertEquals(expected, actual);
    }
    @Test
    void withoutString4() {
        String actual = test.withoutString("Hello  there"," ");
        String  expected = "Hellothere";
        assertEquals(expected, actual);
    }
    @Test
    void withoutStrin5() {
        String actual = test.withoutString("catcat","a");
        String  expected = "ctct";
        assertEquals(expected, actual);
    }

}