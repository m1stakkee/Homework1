import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 01. Знак целого
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("positive");
        } else if (n == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

        // 02. Минимум из двух
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a, b));

        // 03. Максимум из трёх
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        System.out.println(Math.max(Math.max(a1, b1), c1));

        // 04. Квадрат или прямоугольник
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        if (w == h) {
            System.out.println("square");
        } else {
            System.out.println("rectangle");
        }

        // 05. Принадлежность отрезку
        int x = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        if (x >= l && x <= r) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }

        // 07. Регистр буквы
        scanner.nextLine(); // Очистка буфера
        char ch = scanner.nextLine().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("upper");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower");
        } else {
            System.out.println("not a letter");
        }

        // 08. Равенство строк без учёта регистра
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // 09. Ближайшее целое
        double x1 = scanner.nextDouble();
        System.out.println(Math.round(x1));

        // 10. Площадь круга
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);

        scanner.close();
    }
}