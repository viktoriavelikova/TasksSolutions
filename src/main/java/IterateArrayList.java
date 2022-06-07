import java.util.ArrayList;

public class IterateArrayList {

    public static String iterateArrayList(ArrayList<String> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        return str;

    }

    public static String iterateArrayList2(ArrayList<String> list) {
        String str = "";
        int i = 0;
        while (i < list.size()) {
            str += list.get(i++);
        }
        return str;
    }
}
