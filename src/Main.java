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
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int r = 0; r < arr1.length; r++){
            System.out.print("[");
            for (int c = 0; c < arr1[r].length; c++){
                if (c != arr1[r].length - 1){
                    System.out.print(arr1[r][c] + ", ");
                }
                else{
                    System.out.print(arr1[r][c]);
                }
            }
            System.out.println("]");
        }
        ////
        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for (int r = 0; r < arr2.length; r++){
            System.out.print("[");
            for (int c = 0; c < arr2[r].length; c++){
                if (c != arr2[r].length - 1){
                    System.out.print(arr2[r][c] + ", ");
                }
                else{
                    System.out.print(arr2[r][c]);
                }
            }
            System.out.println("]");
        }

        System.out.println(arr1[0][2] + arr2[2][0]);

    }
}

//public void printList(){}//how to make gen method to print array