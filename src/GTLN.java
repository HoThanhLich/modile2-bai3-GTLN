import java.util.Arrays;
import java.util.Scanner;

public class GTLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2, b;
        System.out.println("Khoi tao mang 2 chieu: ");
        System.out.println("Mang co so hang = 2 ");
        System.out.println("Nhap so cot: ");
        b = sc.nextInt();

        int mangHaiChieu[][] = new int[a][b];
        System.out.println("--------------------");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("nhap phan tu [%d][%d]",i,j);
                mangHaiChieu[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("mang vua nhap la: ");
        for (int i = 0; i < a; i++) {
            System.out.print("[");
            for (int j = 0; j < b; j++) {
                System.out.printf("%d,",mangHaiChieu[i][j]);;
            }
            System.out.print("] ");
        }

        int max = mangHaiChieu[0][0];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (mangHaiChieu[i][j] > max) {
                    max = mangHaiChieu[i][j];
                }
            }
        }
        System.out.println("GTLN cua mang: " + max);

    }
}
