 class Main {
    public static void main(String[] args) {
        String input = "This is a test string to find the word with the highest number of repeated letters";
        String wordWithMaxRepeatedLetters = findWordWithMaxRepeatedLetters(input);
        System.out.println("Word with the highest number of repeated letters: " + wordWithMaxRepeatedLetters);
    }

    public static String findWordWithMaxRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        String resultWord = "";
        int maxRepeatedLetters = 0;

        for (String word : words) {
            int repeatedLetters = countRepeatedLetters(word);
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                resultWord = word;
            }
        }

        return maxRepeatedLetters > 1 ? resultWord : "-1";
    }

    public static int countRepeatedLetters(String word) {
        int[] letterOccur = new int[26]; 

        for (char letter : word.toCharArray()) {
            letterOccur[letter - 'a']++;
        }

        int repeatedLetters = 0;
        for (int count : letterOccur) {
            if (count > 1) {
                repeatedLetters += count;
            }
        }

        return repeatedLetters;
    }
}