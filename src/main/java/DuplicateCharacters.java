public class DuplicateCharacters {
    public String duplicates(String s) {
        String ch = "";
        String duplicates = "";
        for (int i = 0; i < s.length(); i++) {
            String current = Character.toString(s.charAt(i));
            if (ch.contains(current)) {
                if (!duplicates.contains(current)) {
                    duplicates += current + " ";
                }
            }
            ch += current;
        }
        return duplicates;
    }
}
