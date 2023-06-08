import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Укажите операцию, которую надо выполнить с этими числами: ");
        String op = reader.readLine();

        // Вычисляем результа
        float result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> Integer.valueOf(a).floatValue() / Integer.valueOf(b).floatValue();
            default -> 0;
        };

        System.out.println("Ответ: " + result);
    }
}
