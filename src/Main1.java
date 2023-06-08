public class Main1 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Сумма чисел от 1 до " + n + ": ");
        System.out.println(sum);
    }
}
