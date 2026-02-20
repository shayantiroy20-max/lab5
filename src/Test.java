import java.util.Scanner;
import Marketing.sales;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);
        s.display();
    }
}