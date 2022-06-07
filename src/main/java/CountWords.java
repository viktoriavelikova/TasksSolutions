import java.util.HashMap;
public class CountWords {
    public int countWords(String s) {
        // Count all words including the duplicates
        String words[] = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, 1);
        }
        return map.size();

    }
}

