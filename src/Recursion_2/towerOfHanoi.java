package Recursion_2;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of disks you want to move");
        int T = obj.nextInt();
        towerOfHanoiSolver(T, 'A', 'B', 'C');
    }

    public static void towerOfHanoiSolver(int disk, char source, char auxiliary, char destination) {
        if (disk == 1) {
            System.out.println("Move disk" + disk + " from " + source + " to " + destination);
            return;
        }
        if (disk == 0)
            return;

        towerOfHanoiSolver(disk - 1, source, destination, auxiliary);
        System.out.println("Move disk" + disk + " from " + source + " to " + destination);

        towerOfHanoiSolver(disk - 1, auxiliary, source, destination);
    }
}

//         Logic :-
//     	   step 1:- Move (n - 1) from A to B using C
//         step 2:- Move nth from A to C
//         step 3:- Move (n - 1) from B to C using A

