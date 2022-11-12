package by.itacademy.khinevich_anastasiya;

// Подсчитать количество содержащихся в данном тексте знаков препинания ( я это делаю 3мя способами для одного и того же предложения)

public class Main {
    public static void main(String[] args) {
        String lovelyString = "сегодня прекрасная погода, светит солнце,дует ветер и вообще - осень!";
        PunctuationFirstOption textConsole = new PunctuationFirstOption();
        System.out.println("Count punctuation in the text by first option: ");
        System.out.println(textConsole.countPunctuation());
        PunctuationSecondOption textSecondOption = new PunctuationSecondOption();
        System.out.println("Count punctuation in the text by second option: ");
        System.out.println(textSecondOption.countPunctuation(lovelyString));
        PunctuationThirdOption textThirdOption = new PunctuationThirdOption();
        System.out.println("Count punctuation in the text by third option: ");
        System.out.println(textThirdOption.countPunctuation(lovelyString));
    }
}
