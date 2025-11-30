import java.util.*;

public class Colect {

    public void task_1(){
        System.out.println("""
                Task 1 — List Processing Function
                
                Create a function that takes a list of numbers as its parameter (of any length).
                The function should perform the following steps:
                
                ●Convert any negative numbers to positive (if such appear)
                ●Check whether there are duplicates; if so, remove them
                ●Sort the numbers in ascending order
                
                The function should return the resulting list.
                """);

        List<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for(int i = 0; i < 100; i++){
            list.add(rand.nextInt(100));
        }

        System.out.println("Randomly Pre Edited List:");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%5d", list.get(i));
            if((i + 1) % 20 == 0 ){
                System.out.println();
            }
        }

        System.out.println("Edited List:");
        edit_unique_sorted_set(list);

        for(int i = 0; i < list.size(); i++){
            System.out.printf("%5d", list.get(i));
            if((i + 1) % 20 == 0 ){
                System.out.println();
            }
        }
        System.out.println();
    }

    public void edit_unique_sorted_set(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 0){
                list.set(i, -1 *  list.get(i));
            }
        }

        Set<Integer> tempSet = new HashSet<>(list); //Yes we could use TreeSet<>(list) but we wont :)

        list.clear();
        list.addAll(tempSet);

        list.sort(null);
    }

    public void task_2(){
        System.out.println("""
                Task 2 — Word Counter Using a Map
                
                Using a Map collection, create a word counter and return the N most frequent words.
                For a selected text:
                
                ●Count all words
                ●Ignore simple stopwords:
                    ["i","a","oraz","ale","lub","to","na","w","do","o"]
                ●Return the most frequently occurring words.
                """);

        try {
            // Load from classpath resource `/silaczka.txt`
            Map<String, Integer> counts = FileReaderUtil.countWordsFromResource("/silaczka.txt");// can select a min word count

            // Get top 10 words
            List<Map.Entry<String, Integer>> top = FileReaderUtil.topN(counts, 10);

            System.out.println("Top 10 words (minimum length 4 letters):");
            for (Map.Entry<String, Integer> entry : top) {
                System.out.printf("%-20s %d%n", entry.getKey(), entry.getValue());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Resource not found: " + e.getMessage());
            System.out.println("Place `silaczka.txt` under `src/main/resources` (classpath) and rebuild.");
        }
    }
}
