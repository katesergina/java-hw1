import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main5 {

    public static String solveEquation(String aStr, String bStr, int expectedResult) {
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(aStr.replace("?", Integer.valueOf(i).toString()));
            for (int j = 0; j < 10; j++) {
                int b = Integer.parseInt(bStr.replace("?", Integer.valueOf(j).toString()));

                if (a + b == expectedResult) {
                    return a + " + " + b + " = " + expectedResult;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String eq = "2? + ?5 = 69";
        String a = eq.split(" \\+ ")[0];
        String b = eq.split(" \\+ ")[1].split(" ")[0];
        int expectedResult = Integer.parseInt(eq.split(" = ")[1]);

        String result = solveEquation(a, b, expectedResult);
        System.out.println(Objects.requireNonNullElse(result, "Решения нет"));
    }
}
