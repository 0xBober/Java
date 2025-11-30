public class Exceptions {

    public void task_1(){
        System.out.println("""
                Task 1:
                
                Write a program that reads two integers from the user, then divides the first by the second.
                
                ●Ensure safety in case the user attempts to divide by zero.
                ●Use a NumberFormatException when the number format is invalid.
                """);

        Main.input.nextLine(); //get rid of trailing \n

        System.out.print("Enter the first number: ");

        int numberA;
        int numberB;

        try {
            numberA = Integer.parseInt(Main.input.nextLine());
            System.out.println("You entered: " + numberA);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format, terminating task!");
            return;
        }

        System.out.print("Enter the second number: ");

        try {
            numberB = Integer.parseInt(Main.input.nextLine());
            System.out.println("You entered: " + numberB);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format, terminating task!");
            return;
        }

        int DividedNumber;

        try{
            DividedNumber = numberA / numberB;
            System.out.printf("%d / %d = %d\n", numberA, numberB, DividedNumber);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero! Terminating task!");
        }


    }

    public void task_2(){
        System.out.println("""
                Task 2:
                
                Create a method int getCharIndex(String text, char ch)
                
                The method should return the first index at which the given character appears.
                
                ●If the character does not appear in the text, throw an IllegalArgumentException.
                ●If the text is null, throw a NullPointerException.
                """);

        Main.input.nextLine();
        System.out.println("Please enter a sentence:");
        String sentence = Main.input.nextLine();
        System.out.println("Please enter a char:");
        char ch = Main.input.nextLine().charAt(0);

        int index = getCharIndex(sentence, ch);

        System.out.println("Char found at index: " + index);
    }

    public int getCharIndex(String text, char ch){
        int index = 0;

        if(text == null){
            throw new NullPointerException("The text is null!");
        }

        while(index < text.length()) {
            if (text.charAt(index) == ch) {
                return index;
            } else {
                index++;
            }
        }
        throw new IllegalArgumentException("Character does not appear in the text!");
    }

    public void task_3(){
        System.out.println("""
                Task 3:
                
                Create an exception class AgeTooLowException that extends Exception.
                Then create the method: void registerUser(int age) throws AgeTooLowException
                
                ●If the age passed to the method is less than 18, throw your custom exception with the message: "The user must be an adult."
                ●Test the solution in Main, handling the exceptions and printing the message.
                """);

        System.out.println("Please enter your age:");

        int age = Main.input.nextInt();

        try{
        registerUser(age);}
        catch (AgeToLowException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void registerUser(int age)throws AgeToLowException{
        if(age < 18){
            throw new AgeToLowException("The age is less than 18!");
        }

        System.out.println("Successfully registered user!");
    }
}
