//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[6]);
        int b = Integer.parseInt(args[2]);

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        }
        System.out.println("a  *  b = " + (a  *  b));
    }
}
