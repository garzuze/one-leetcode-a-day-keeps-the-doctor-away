import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> banned = new HashSet<>();
        Collections.addAll(banned, bannedWords);

        int count = 0;

        for (String m : message)     {
            if (banned.contains(m)) {
                count++;
                if (count == 2) return true;
            }
        }

        return false;
    }
}
