package by.itacademy.khinevich_anastasiya;

public class PunctuationSecondOption {
    private int count = 0;
    private char symbol;
    public int countPunctuation(String lovelyString) {
        for (int i = 0; i < lovelyString.length(); i++) {
            switch (lovelyString.charAt(i)){
                case '.',',','?','!',':',';','-','«','»':
                    count++;
                    break;
            }
        }
        return count;
    }
}
