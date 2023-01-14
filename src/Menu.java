import java.util.Scanner;
public class Menu {
    public static int printActionMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("(1) to attack\n(2) to defend \n(3) to use special move");
        String input = scan.nextLine();
        while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
            System.out.println("(1) to attack\n(2) to defend \n(3) to use special move");
        }
        return Integer.parseInt(input);
    }


}
