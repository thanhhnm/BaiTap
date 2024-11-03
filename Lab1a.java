import java.util.Scanner;

public class Lab1a {
    /*
     * Viết chương trình nhập vào 4 số nguyên a, b, c, d
     * In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập
     */
   public static int findMax(int a, int b, int c, int d) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        return max;
   }
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số a: ");
    int a = scanner.nextInt();
    System.out.print("Nhập vào số b: ");
    int b = scanner.nextInt();
    System.out.print("Nhập vào số c: ");
    int c = scanner.nextInt();
    System.out.print("Nhập vào số d: ");
    int d = scanner.nextInt();

    int max = findMax(a, b, c, d);

    System.out.println("Số lớn nhất trong 4 số vừa nhập là: " + max);

   }
}

