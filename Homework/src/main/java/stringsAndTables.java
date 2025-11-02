import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Random;

public class stringsAndTables {
    public void task_1(){
        System.out.println("1. Transform the given string \"Java to wspaniały język\" into \"Java to najlepszy język\" using substring methods.");

        String text = "Java to wspaniały język";

        System.out.printf("Text befor: %s\n", text);

        text = text.replace("wspaniały", "najlepszy");

        System.out.printf("Text after: %s\n", text);
    }

    public void task_2(){
        System.out.println("""
                2. Ask the user to enter a complete sentence (e.g., "Ala ma kota, kot ma Ale"), and then:
                
                ●Split it into words using String.split()
                
                ●Store the words in a String[] array
                
                ●Count how many times each word appears and display that information
                """);

        Main.lineFill();
        System.out.println("""
                Feel Free to copy and paste this test text:
                Java is a versatile and powerful programming language. Many developers enjoy Java because it allows them to create applications that run on multiple platforms. Java’s object-oriented design and vast ecosystem of libraries make it a popular choice for web development, mobile apps, and large-scale enterprise systems. Learning Java can be challenging at first, but with practice, it becomes an enjoyable and rewarding experience. Many projects, both small and large, rely on Java every day.
                """);
        Main.lineFill();
        System.out.print("Enter a complete sentence: ");
        Main.input.nextLine();
        String userInput = Main.input.nextLine();

        //set all letter to lowercase and remove all special chars(non letter)
        userInput = userInput.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");

        //splitting words into a list
        String[] words = userInput.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        //count words
        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //sorting the Map using TreeMap

        Map<String, Integer> sortedWordCount = new TreeMap<>(wordCount);

        System.out.println("List of words and their frequencies:");

        for(Map.Entry<String, Integer> entry : sortedWordCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public void task_3(){
        System.out.println("3. Using StringBuilder: join words entered by the user in a loop into a single string.");

        StringBuilder sentence = new StringBuilder();
        String userInput;
        System.out.println("Enter words to create a sentence(entering nothing will stop the loop):");

        Main.input.nextLine(); //To get rid of trailing new line
        do {
            userInput = Main.input.nextLine();
            if(userInput.isBlank()) {
                break;
            }
            sentence.append(userInput).append(" ");
        }while(true);

        System.out.println(sentence);
    }

    public void task_4(){
        System.out.println("""
                4. Create a StringBuilder object based on a text provided by the user, then perform the following steps (in order):
                
                ●Reverse the entire text (reverse())
                
                ●Insert the phrase "START-" at the beginning
                
                ●Remove all characters from index 3 to 6 (including index 3, but before 6)
                
                ●Replace the characters from index 2 to 5 with the phrase "XYZ"
                """);

        StringBuilder sentence = new StringBuilder();

        Main.input.nextLine(); //remove \n
        System.out.print("Enter a sentence: ");
        sentence.append(Main.input.nextLine());

        System.out.println("Sentence: " + sentence);
        System.out.println("Sentence but insert \"Start\" at the beginning: " + sentence.insert(0, "Start"));
        System.out.println("Sentence Reversed: " +  sentence.reverse());
        System.out.println("Sentence but removing all chars between index 3 to 6: " + sentence.delete(2, 5));
        System.out.println("Sentence but changing characters from index 2 to 5: " + sentence.replace(1, 4, "XYZ"));
    }

    public void task_5(){
        System.out.println("""
                5. Perform a micro-benchmark in code to check the time difference of appending "X" 100,000 times to an initially empty string using two methods:
                
                ●Using the regular + operator
                
                ●Using StringBuilder and append()
                
                ●Display the duration of each operation (you can use long time = System.nanoTime())
                """);

        System.out.println("I'll let you chose how many iterations to do (value saved into a long):");
        long n = Main.input.nextLong();

        String sentence1 = "";
        StringBuilder sentence2 = new StringBuilder();

        //String concatenation method
        long start1 = System.nanoTime();
        for(int i = 1; i <= n; i++) {
//            if(n % i == n * 0.1) {
//                System.out.println(((double)i / (double)n ) * 100 + "%");
//            } I took a while and want to see the progress
            sentence1 = sentence1 + i;
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        long seconds1 = time1 / 1_000_000_000;
        long minutes1 = seconds1 / 60;
        seconds1 = seconds1 % 60;

        System.out.println("Sentence 1 concatenated " + n + " times");
        System.out.println("Time: " + minutes1 + " mins " +  seconds1 + " secs ==== " + time1 + " ns");

        //Append Method from Sting Builder
        long start2 = System.nanoTime();
        for(int i = 0; i < n; i++) {
           sentence2.append(i);
        }
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        long seconds2 = time2 / 1_000_000_000;
        long minutes2 = seconds2 / 60;
        seconds2 = seconds2 % 60;

        System.out.println("Sentence 2 appended " + n + " times");
        System.out.println("Time: " + minutes2 + " mins " +  seconds2 + " secs ==== " + time2 + " ns");

        if(time1 > time2) {
            System.out.printf("Appending is %f times faster\n", (double)time1/(double)time2);
        }else{
            System.out.printf("Concatenating is %f times faster\n", (double)time2/(double)time1); //pretty sure this will never happen 😂
        }
    }

    public void task_6(){
        System.out.println(" 6. Write a program that prints all vowels and their positions in any string entered by the user. ");

        System.out.print("Enter a string: ");
        Main.input.nextLine();
        StringBuilder sentence = new StringBuilder();
        sentence.append(Main.input.nextLine().toLowerCase());
        String vowels = "aeiou";
        char letter;

        for(int i = 0; i < sentence.length(); i++) {
            letter = sentence.charAt(i);
            if(vowels.indexOf(letter) >= 0) {
                System.out.printf("%c is a vowel at index %d\n", letter, i);
            }
        }
    }

    public void task_7(){
        System.out.println("7. Write a program that places numbers from 9 to 0 in a one-dimensional array of 10 elements and prints them on the screen.");

        int[] intTable = new int[10];

        for(int i = 0; i < intTable.length; i++) {
            intTable[i] = 9 - i;
        }

        for(int j :  intTable) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    public void task_8(){
        System.out.println("""
        8. Write a program that creates a one-dimensional array of 10 integers and fills it with random values in the range {-20, …, 20}, then:

        ●Determine the smallest and largest element in the array

        ●Calculate the arithmetic mean of the array elements

        ●Determine how many elements are smaller and how many are greater than the average

        ●Count how many times each number occurs in the array
        """);

        int[] table =  new int[10];
        Random random = new Random();
        double sum = 0;
        int smallest = 0;
        int largest = 0;

        for(int i = 0; i < 10; i++){
            table[i] = random.nextInt(-20, 20);
            System.out.printf("table[%d]→%d\n", i, table[i]);
            sum +=  table[i];

            if(table[i] > largest){
            largest = table[i];
            }else if(table[i] < smallest){
                smallest = table[i];
            }
        }

        System.out.println();
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        double mean = sum / table.length;
        System.out.println("The mean is " + mean);

        int smaller = 0;
        int larger = 0;
        int equal = 0;
        for(int i = 0; i < table.length; i++) {
            if (table[i] > mean) {
                larger += 1;
            } else if (table[i] < mean) {
                smaller += 1;
            } else {
                equal += 1;
            }
        }

        System.out.printf("Smaller: %d \t Larger: %d \t Equal: %d\n", smaller, larger, equal);

        Map<Integer, Integer>numTable = new HashMap<>();

        for(int num : table){
            numTable.put(num, numTable.getOrDefault(num, 0) + 1);
        }

        numTable = new TreeMap<>(numTable);

        System.out.println("Number of times a number appears in the table:");
        for(int num : numTable.keySet()){
            System.out.printf("%d\t→\t%d\n", num, numTable.get(num));
        }


    }


}
