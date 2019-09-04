import java.util.Scanner;

public class canbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b");
        double b = sc.nextDouble();
        System.out.println("Nhập vào c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Phương trình cho 2 nghiệm là r1 = " + quadraticEquation.getRoot1() +"và r2 = "+ quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phương trình cho 1 nghiệm r = "+ quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
