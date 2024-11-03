import java.util.Scanner; // Là import class Scanner : Dòng này cho phép sử dụng lớp Scanner để nhập dữ liệu từ bàn phím.

public class Lab2a { //Khai báo class Lab2a
    /*
     * Bài 2 : Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
     * Ghi chú :
     * 1. Khái Niệm Về Ước Số:
     * 1 số được coi là ước khi 1 số nào đó chia hết cho nó. Ví dụ 9 chia hết cho 3 thì 3 là ước
     * Ước số nhỏ nhất luôn là 1. Vì thế khi cho chạy vòng lặp for thì cho chạy từ 1 là hợp lý.
     */

    public static int countDivisor(int num) { 
        //Method (hàm) countDivisor nhận 1 tham số num (với kiểu dữ liệu là int), và trả về số lượng ước số 
        int count = 0; // Khởi tạo biến count để đếm số ước.
        // Biến count được sử dụng để đếm số lượng ước số tìm thấy. 
        //Khi bắt đầu, chưa có ước số nào được tìm thấy, vì vậy giá trị ban đầu của count phải là 0.
        
        for (int i = 1; i <= num; i++) { //Vòng lặp chạy từ 1 đến num để kiểm tra từng số xem có phải là ước số của num không.
            if (num % i == 0) {
                System.out.println("Uoc: " + i + " ");
                count++; // kiểm tra xem i có phải là ước số của num không. Nếu điều kiện đúng, in ra ước số i và tăng biến đếm count.
            }
        }
        return count; //phương thức trả về giá trị của count
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // tạo đối tượng scanner để đọc dữ liệu từ bàn phím.
    System.out.print("Nhap vao so n");
    int n = scanner.nextInt(); //Khai báo biến n là số n, có giá trị là số nguyên nhập từ bàn phím

    int count = countDivisor(n); //Khai báo biến count bằng cách gọi phương thức countDivisor (Divisor là ước số)
    //gọi phương thức countDivisor với số đã nhập và lưu số lượng ước số vào biến count
    System.out.println("So uoc so cua " + n + "la: " + count);
    }

}