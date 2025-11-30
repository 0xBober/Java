//This was heavly fixed by AI not gonna lie :c
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public final class FileReaderUtil {

    private static final Set<String> DEFAULT_BANNED_WORDS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "i","a","oraz","ale","lub","to","na","w","do","o"
    )));

    private static final int DEFAULT_MIN_WORD_LENGTH = 4;

    private FileReaderUtil() {}

    public static Map<String, Integer> countWords(InputStream in) {
        return countWords(in, DEFAULT_BANNED_WORDS, DEFAULT_MIN_WORD_LENGTH);
    }

    public static Map<String, Integer> countWords(InputStream in, int minWordLength) {
        return countWords(in, DEFAULT_BANNED_WORDS, minWordLength);
    }

    public static Map<String, Integer> countWords(InputStream in, Collection<String> bannedWords, int minWordLength) {
        if (in == null) {
            throw new IllegalArgumentException("InputStream must not be null");
        }
        if (minWordLength < 0) {
            throw new IllegalArgumentException("minWordLength must be >= 0");
        }

        Set<String> banned = (bannedWords instanceof Set) ? (Set<String>) bannedWords : new HashSet<>(bannedWords);
        Map<String, Integer> wordCounts = new HashMap<>();

        try (Scanner scanner = new Scanner(in, StandardCharsets.UTF_8)) {
            while (scanner.hasNext()) {
                String token = scanner.next();
                String word = token.toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
                if (word.isEmpty() || word.length() < minWordLength || banned.contains(word)) {
                    continue;
                }
                wordCounts.merge(word, 1, Integer::sum);
            }
        }
        return wordCounts;
    }

    public static Map<String, Integer> countWordsFromResource(String resourcePath) {
        return countWordsFromResource(resourcePath, DEFAULT_MIN_WORD_LENGTH);
    }

    public static Map<String, Integer> countWordsFromResource(String resourcePath, int minWordLength) {
        InputStream in = FileReaderUtil.class.getResourceAsStream(resourcePath);
        if (in == null) {
            throw new IllegalArgumentException("Resource not found: " + resourcePath);
        }
        return countWords(in, DEFAULT_BANNED_WORDS, minWordLength);
    }

    public static List<Map.Entry<String, Integer>> topN(Map<String, Integer> counts, int n) {
        return counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(Math.max(0, n))
                .collect(Collectors.toList());
    }
}
