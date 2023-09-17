package vehicles;

public class MainEquals {
    public static void main(String[] args) {
        System.out.println(5 == 4);
        System.out.println(5 == 5);

        String first = new String("a");
        String second = new String("a");
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
