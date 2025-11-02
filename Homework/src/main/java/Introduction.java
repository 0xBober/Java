import java.util.Scanner;

public class Introduction {



    public void task_1(){

        System.out.println("Write a program that displays some information about yourself on the screen.");
        System.out.println("I love CyberSecurity!❤️");

    }

    public void task_2(){

        System.out.println("2. Write a program in which basic information about yourself (e.g., age, height, weight) is stored in variables and then displayed on the screen.");

        String name = "Mike";
        String lastName = "Bob";
        double height = 174.9;
        int weight = 60;
        boolean isStudent = true;

        System.out.printf("Name: %s \tLast Name: %s \tHeight: %f.1 \tWeight: %d Is a ObjAndClassPK.Student: %b\n", name, lastName, height, weight, isStudent );


    }

    public void task_3(){


        System.out.println("3. Write a program that displays a multiplication table for numbers from 1 to 10.");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print((i*j + "\t"));
            }
            System.out.println();
        }


    }

    public void task_4(){

        System.out.println("4. Write a program that converts the digits 1–7 into the full names of the days of the week using a switch statement.");

        //would prefer not to open multiple scanners 😂

        for (int i = 1; i <= 7; i++){
            switch(i){
                case 1 -> System.out.printf("%d: Sunday\n", i);
                case 2 -> System.out.printf("%d: Monday\n", i);
                case 3 -> System.out.printf("%d: Tuesday\n", i);
                case 4 -> System.out.printf("%d: Wednesday\n", i);
                case 5 -> System.out.printf("%d: Thursday\n", i);
                case 6 -> System.out.printf("%d: Friday\n", i);
                case 7 -> System.out.printf("%d: Saturday\n", i);
            }
        }
    }

    public void task_5(){
        System.out.println("5. Write a program that, using a do...while loop, sums all integers from 1 to 100.");

        int sum = 0;
        int count = 1;

        do{
            sum += count;
        }while(count++ <= 100);

        System.out.println("The sum is: " + sum);
    }

    public void task_6(){
        System.out.println("""
                6. Write a program that uses a for loop to count up to a number n, where n is provided by the user. Perform the following steps:
                
                Print all numbers from 1 to n on separate lines.
                
                Next to each number, display:
                
                "EVEN" if the number is even,
                
                "ODD" if the number is odd.
                
                Additionally:
                
                If the number is divisible by 3 → append "FIZZ",
                
                If the number is divisible by 5 → append "BUZZ".
                """);

        System.out.print("Please enter a number: ");
        int n = Main.input.nextInt();

        String number;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){ number = "EVEN";}
            else{ number = "ODD";}

            if(i % 3 == 0){ number += "FIZZ";}
            else if(i % 5 == 0){ number += "BUZZ";}

            System.out.printf("%d: %s\n", i, number);
        }
    }

}
