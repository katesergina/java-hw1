public class Main2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.print("Произведение чисел от 1 до " + n + ": ");
        System.out.println(result);
    }
}
