import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public String arrangeWords(String text) {
        List<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        
        words.sort(Comparator.comparingInt(String::length));

        StringBuilder result = new StringBuilder();
        
        String first = words.get(0).substring(0, 1).toUpperCase() + words.get(0).substring(1).toLowerCase();
        result.append(first);

        for (int i = 1; i < words.size(); i++) {
            result.append(" ");
            result.append(words.get(i).toLowerCase());
        }

        return result.toString();
    }
}
