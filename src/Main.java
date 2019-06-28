/**
 * Created by AMBE on 28/6/2019 at 16:21 PM.
 */
public class Main {

    public static void showMenu() {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Add student.", "|");
        System.out.printf("\n| %-90s %7s", "2. Edit student by id.", "|");
        System.out.printf("\n| %-90s %7s", "3. Delete student by id.", "|");
        System.out.printf("\n| %-90s %7s", "4. Sort student by gpa.", "|");
        System.out.printf("\n| %-90s %7s", "5. Sort student by name.", "|");
        System.out.printf("\n| %-90s %7s", "6. Show student.", "|");
        System.out.printf("\n| %-90s %7s", "0. Exit.", "|");
        printLine();
        System.out.printf("\n  %-90s ", "Please choose: ");

    }

    public static void printLine() {
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i == 1 || i == 100) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
