package by.itacademy.khinevich_anastasiya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationThirdOption {
    private int count = 0;
    public int countPunctuation(String lovelyString) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(lovelyString);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
