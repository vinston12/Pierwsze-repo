import java.util.Scanner;

public class klasaTestowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        name = scanner.nextLine();

        for (int i=0;i<5;i++){
            System.out.println(name);
        }
    }
}
