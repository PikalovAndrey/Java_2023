package Laba6;

public class WordCount {
    public static void main(String[] args) {
        // Приклад використання методу для пiдрахунку слiв
        String sentence = "The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago";
        int wordCount = countWords(sentence);
        System.out.println("Кiлькiсть слiв у реченнi: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнiм або null.");
        }

        // Роздiлити речення на слова за допомогою пробiлiв як роздiльник
        String[] words = sentence.split("\\s+");

        int wordCount = 0;
        for (String word : words) {
            // Використовуємо регулярний вираз для перевiрки, чи слово складається лише з лiтер i цифр
            if (word.matches("^[a-zA-Z0-9]*$")) {
                wordCount++;
            }
        }

        return wordCount;
    }
}
