import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) throws Exception {
        Scanner userLimit = new Scanner(System.in); // Create a Scanner object
        System.out.println("Insira um número!");

        int limit = Integer.parseInt(userLimit.next());

        System.out.println("Pirâmide de" + " " + limit);

        for (int i = 1; i <= limit; i++) {
            String line = "";

            for (int j = 1; j <= i; j++) {
                line += i;
            }
            System.out.println(line);
        }
        userLimit.close();
    }
}
