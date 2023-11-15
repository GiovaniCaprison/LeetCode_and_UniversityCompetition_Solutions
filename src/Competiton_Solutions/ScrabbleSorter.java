public class ScrabbleSorter {
    private static int scrabbleScore(String word) {
        int score = 0;
        Map<Character, Integer> scoreMap = new HashMap<>() {{
            put('A', 1); put('E', 1); put('I', 1); put('O', 1); put('U', 1); put('L', 1); put('N', 1); put('S', 1); put('T', 1); put('R', 1);
            put('D', 2); put('G', 2);
            put('B', 3); put('C', 3); put('M', 3); put('P', 3);
            put('F', 4); put('H', 4); put('V', 4); put('W', 4); put('Y', 4);
            put('K', 5);
            put('J', 8); put('X', 8);
            put('Q', 10); put('Z', 10);
        }};

        for (char c : word.toUpperCase().toCharArray()) {
            score += scoreMap.getOrDefault(c, 0);
        }
        return score;
    }

    private static void bubbleSort(List<String> words) {
        int n = words.size();
        String temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareScrabble(words.get(j), words.get(j + 1)) > 0) {
                    temp = words.get(j);
                    words.set(j, words.get(j + 1));
                    words.set(j + 1, temp);
                }
            }
        }
    }

    private static int compareScrabble(String word1, String word2) {
        int score1 = scrabbleScore(word1);
        int score2 = scrabbleScore(word2);

        if (score1 == score2) {
            return word1.compareTo(word2);
        }
        return score1 - score2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        bubbleSort(words);

        for (String word : words) {
            System.out.println(word);
        }
    }
}