public class Main {
    public static void main(String[] args) {
        //p1
        String[][] seatingChart = new String[][]{{"Abby", "Don", "George", "Kim"},
                                                  {"Brian", "Elenor", "Harry", "Lenny"},
                                                   {"Cathy", "Fred", "Jill", "Matt"}};

        seatingChart[1][2] = "Paul";

        for (int r = 0; r < seatingChart.length; r++){
            System.out.print("[");
            for (int c = 0; c < seatingChart[r].length; c++){
                if (c != seatingChart[r].length - 1){
                    System.out.print(seatingChart[r][c] + ", ");
                }
                else{
                    System.out.print(seatingChart[r][c]);
                }
            }
            System.out.println("]");
        }
        //predict
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
        //
        //p2
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;


    }
}