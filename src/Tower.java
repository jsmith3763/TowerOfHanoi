class Tower {
    public static int counter = 1;
    static void towerOfHanoi(int n, String fromRod, String toRod, String auxRod) {

     if (n == 1){

         System.out.println(counter++ + ". Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
         return;

    }

        towerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println(counter++ + ". Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n-1, auxRod, toRod, fromRod);

    }

}