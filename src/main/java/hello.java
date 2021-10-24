import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        String doituong;
        int diemso;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Moi nhap doi tuong (Tre em or Nguoi lon): ");
            doituong = scanner.nextLine();
            System.out.print("Moi nhap so diem tich luy: ");
            diemso = scanner.nextInt();
        }

        String printManHinh = kiemthu.tinhtoan(diemso, doituong);
        System.out.print(printManHinh);
    }
}
