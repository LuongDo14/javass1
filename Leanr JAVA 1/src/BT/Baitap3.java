package BT;
import java.util.Scanner;
public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap chieu rong :");
        float weight = scanner.nextFloat();
        System.out.print("hay nhap chieu dai :");
        float height = scanner.nextFloat();
        float area;
        area = weight * height;
        System.out.println("area :"+ area);
    }
}
