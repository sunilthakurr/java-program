package CodeForces.EducationalRound140Div2;

import java.util.Scanner;

public class CutTheTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int x1 = obj.nextInt();
            int y1 = obj.nextInt();

            int x2 = obj.nextInt();
            int y2 = obj.nextInt();

            int x3 = obj.nextInt();
            int y3 = obj.nextInt();

            if ((x1 == x2 || x1 == x3 || x2 == x3) && (y1 == y2 || y1 == y3 || y2 == y3)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
