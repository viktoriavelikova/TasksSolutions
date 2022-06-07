import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IterateArrayListTest {
    @Test
    public void IterateArrayList() {
        IterateArrayList arr = new IterateArrayList();
        ArrayList<String> list = new ArrayList<>();
        list.add("lemon");
        list.add("banana");
        assertEquals(arr.iterateArrayList(list), "lemonbanana");
    }
}