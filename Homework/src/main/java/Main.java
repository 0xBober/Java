import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean mainBool = true;

        while (mainBool) {
            lineFill();
            System.out.println("Please Chose a Topic:");
            System.out.println("1. Introduction");
            System.out.println("2. Strings and Tables");
            System.out.println("3. Objects and Classes");
            System.out.println("4. Inheritance");
            System.out.println("5. Interfaces");
            System.out.println("6. Exceptions");
            System.out.println("7. Collections");
            System.out.println("0. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> Intro();
                case 2 -> SAT();
                case 3 -> OAC();
                case 4 -> Inhare();
                case 5 -> Inter();
                case 6 -> Except();
                case 7 -> Collect();
                case 0 -> {
                    System.out.println("Good Bye!");
                    mainBool = false;
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }

    public static void lineFill(){
        System.out.println("******************************************************************************");
    }


    public static void Intro(){
        Introduction intro = new Introduction();

        boolean IntroBool = false;

        while(!IntroBool) {
            lineFill();
            System.out.println("Introduction Choose a task: (1-6, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> intro.task_1();
                case 2 -> intro.task_2();
                case 3 -> intro.task_3();
                case 4 -> intro.task_4();
                case 5 -> intro.task_5();
                case 6 -> intro.task_6();
                case 0 -> {
                    IntroBool = true;
                    System.out.println("Exiting Intro!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }


    public static void SAT() {
        stringsAndTables sat = new stringsAndTables();

        boolean SATBool = false;

        while (!SATBool) {
            lineFill();
            System.out.println("Strings And Tables Choose a task: (1-8, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> sat.task_1();
                case 2 -> sat.task_2();
                case 3 -> sat.task_3();
                case 4 -> sat.task_4();
                case 5 -> sat.task_5();
                case 6 -> sat.task_6();
                case 7 -> sat.task_7();
                case 8 -> sat.task_8();
                case 0 -> {
                    SATBool = true;
                    System.out.println("exiting Strings And Tables!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }


    public static void OAC() {
        objectsAndClasses oac = new objectsAndClasses();

        boolean OACBool = false;

        while (!OACBool) {
            lineFill();
            System.out.println("Strings And Tables Choose a task: (1-5, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> oac.task_1();
                case 2 -> oac.task_2();
                case 3 -> oac.task_3();
                case 4 -> oac.task_4_5();
                case 5 -> oac.task_4_5();
                case 0 -> {
                    OACBool = true;
                    System.out.println("exiting Strings And Tables!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }


    public static void Inhare() {
        Inheritance inhare = new Inheritance();

        boolean inhareBool = false;

        while (!inhareBool) {
            lineFill();
            System.out.println("Inheritance Choose a task: (1-3, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> inhare.task_1();
                case 2 -> inhare.task_2();
                case 3 -> inhare.task_3();
                case 0 -> {
                    inhareBool = true;
                    System.out.println("exiting Strings And Tables!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }


    public static void Inter() {
        Interfaces inter = new Interfaces();

        boolean interBool = false;

        while (!interBool) {
            lineFill();
            System.out.println("Interfaces Choose a task: (1-4, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> inter.task_1();
                case 2 -> inter.task_2();
                case 3 -> inter.task_3();
                case 4 -> inter.task_4();
                case 0 -> {
                    interBool = true;
                    System.out.println("exiting Strings And Tables!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }

    public static void Except() {
        Exceptions exe = new Exceptions();

        boolean interExcept = false;

        while (!interExcept) {
            lineFill();
            System.out.println("Exceptions Choose a task: (1-3, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> exe.task_1();
                case 2 -> exe.task_2();
                case 3 -> exe.task_3();
                case 0 -> {
                    interExcept = true;
                    System.out.println("exiting Exceptions!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }

    public static void Collect() {
        Colect col = new Colect();

        boolean interCollect = false;

        while (!interCollect) {
            lineFill();
            System.out.println("Collections Choose a task: (1-2, 0 - Exit)");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> col.task_1();
                case 2 -> col.task_2();
                case 0 -> {
                    interCollect = true;
                    System.out.println("exiting Exceptions!");
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }
}
