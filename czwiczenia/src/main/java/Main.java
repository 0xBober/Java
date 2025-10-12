import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Please Select a task 1-4, 0 - will end the application");
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    task_1();
                    break;
                case 2:
                    task_2();
                    break;
                case 3:
                    task_3();
                    break;
                case 4:
                    task_4();
                    break;
                default:
                    System.out.println("Good Bye!");
            }
        } while (userInput != 0);
        sc.close();
    }

    public static void task_1(){
        //Task 1
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        String line, sentence;

        System.out.println("Please enter some text, typing nothing and hitting enter will quit the program");
        do{
            line = input.nextLine();
            builder.append(line).append(" ");
        }while(!line.isEmpty());

        System.out.println("Here is the text you entered:");
        sentence = builder.toString();
        System.out.println(sentence);
    }

    public static void task_2(){
        Student student_1 = new Student();
        Student student_2 = new Student("John", 20, 5.9);

        student_1.name = "Steven";
        student_1.setAge(21);
        student_1.height = 6.1;
        System.out.println(student_1);
        System.out.println(student_2);
    }

    public static void task_3(){
        StringUtils utils = new StringUtils();
        String[] test_cases = {
                "Listen",
                "Silent",
                "Astronomer",
                "Moon starer",
                "The Morse Code",
                "Here come dots",
                "Hello",
                "World"
        };

        for(int i = 1; i < test_cases.length; i++){
            if(utils.isAnagram(test_cases[i-1], test_cases[i])){
                System.out.println("\"" + test_cases[i-1] + "\" and \"" + test_cases[i] + "\" are anagrams.");
            } else {
                System.out.println("\"" + test_cases[i-1] + "\" and \"" + test_cases[i] + "\" are NOT anagrams.");
            }
        }
    }

    public static void task_4(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Allice", 600.99, "10/11", "Random Address"));
        employees.add(new Employee(2, "Ron", 1000.69, "10/11", "Random Address"));
        employees.add(new Employee(3, "Tom", 6969.69, "10/11", "Random Address"));
        employees.add(new Employee());

        for (Employee e : employees) {
            System.out.printf(e.getInfo());
        }

        System.out.println("===================================================");
        employees.get(0).setNewAddress("123 Wardlaw");
        employees.get(1).setNewAddress("456 Road Street");
        employees.get(2).setNewAddress("789 Highway Avenue");

        for (Employee e : employees) {
            System.out.printf(e.getInfo());
        }

        System.out.println("===================================================");
        Random randomSalaryRaise = new Random();

        for (Employee e : employees) {
            e.raiseSalary(randomSalaryRaise.nextDouble(0.9, 2.0));
        }

        for (Employee e : employees) {
            System.out.printf(e.getInfo());
        }
    }
}
