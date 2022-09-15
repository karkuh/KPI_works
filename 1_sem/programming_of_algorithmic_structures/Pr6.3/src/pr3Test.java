import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class pr3Test {

    task test = new task();

    @Test
    void catDog1() {
        boolean actual = test.catDog("catdog");
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void catDog2() {
        boolean actual = test.catDog("catcat");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void catDog3() {
        boolean actual = test.catDog("1cat1cadodog");
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void catDog4() {
        boolean actual = test.catDog("catdogcat1");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void catDog5() {
        boolean actual = test.catDog("jfsapaf");
        boolean expected = true;
        assertEquals(expected, actual);

    }
}