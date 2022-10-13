import java.util.Scanner;

class Main {

    private static String auxRod;
    private static String startingRod;
    private static String endingRod;

    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");
        System.out.println("Program by Justin Smith");

        System.out.println("Enter Starting Rod (A, B, or C): ");
        Scanner sc = new Scanner(System.in);
        String startingRod = sc.nextLine();
        System.out.println("Enter Ending Rod (A, B, or C): ");
        String endingRod = sc.nextLine();

        while(endingRod.equals(startingRod)){
            System.out.println("Sorry. Starting and ending rod cannot be the same.");
            System.out.println("Enter Ending Rod (A, B, or C): ");
            endingRod = sc.nextLine();
        }

        System.out.println("OK. Starting with discs 1, 2, and 3 on rod " + startingRod);

        if(startingRod.equals("A") && endingRod.equals("B")){
            auxRod = "C";
        }else if(endingRod.equals("A") && startingRod.equals("B")){
            auxRod = "C";
        }else if(startingRod.equals("C") && endingRod.equals("B")){
            auxRod = "A";
        }else if(endingRod.equals("C") && startingRod.equals("B")){
            auxRod = "A";
        }else if(startingRod.equals("C") && endingRod.equals("A")){
            auxRod = "B";
        }else if(endingRod.equals("C") && startingRod.equals("A")){
            auxRod = "B";
        }


        Tower.towerOfHanoi(3, startingRod, endingRod, auxRod);

        System.out.println("All done! Took a total of " + (Tower.counter - 1) + " moves.");


    }
}