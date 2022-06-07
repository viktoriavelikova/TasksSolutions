import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharactersTest {
    @Test
    public void duplicate() {
        DuplicateCharacters dup = new DuplicateCharacters();

        assertEquals(dup.duplicates("This is an example"), "i s a e ");
        assertNotEquals(dup.duplicates("Next one"), "e m");
    }
}