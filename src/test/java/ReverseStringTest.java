import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    public void testReverseString() {
        ReverseString test = new ReverseString();

        assertEquals(test.reverse("abcd"), "dcba");
        assertNotEquals(test.reverse("abcd"), "dcbb");
        assertEquals(test.reverse(""), "");
    }

}