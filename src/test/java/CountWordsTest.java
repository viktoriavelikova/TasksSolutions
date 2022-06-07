import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountWordsTest {
    @Test
    public void testCountWords() {
        CountWords count=new CountWords();

        assertEquals(count.countWords("This is an example"), 4);
        assertNotEquals(count.countWords("Next one"), 3);

    }

}