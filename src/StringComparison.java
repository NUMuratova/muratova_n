public class StringComparison {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
