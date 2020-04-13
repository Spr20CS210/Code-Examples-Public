package midterm3;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleArea {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Double radius = Double.valueOf(scanner.nextLine());

        Double area = PI * pow(radius, 2);

        System.out.println(area);

    }

}
