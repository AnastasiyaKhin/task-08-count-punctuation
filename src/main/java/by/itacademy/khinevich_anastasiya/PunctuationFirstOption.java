package by.itacademy.khinevich_anastasiya;

import java.util.Scanner;

public class PunctuationFirstOption {
    private char[] punctuation = {'.',',','?','!',':',';','-','«','»'};
    private int count = 0;
    Scanner console = new Scanner(System.in);
    private String text = console.nextLine();
    public int countPunctuation(){
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < punctuation.length; j++) {
                if (text.charAt(i) == punctuation[j]) {
                    ++count;
                    break;
                }
            }
        }
        return count;
    }
}
