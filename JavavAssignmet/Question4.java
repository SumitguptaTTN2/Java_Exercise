
//Q4) Create a two dimensional array of integers and display:
//
//        sum of all elements of each column
//        sum of all elements of each row


public class Question4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        long rowsum = 0;
        long colsum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowsum += array[i][j];

            }
            System.out.println("rowsum of row :" + rowsum);
            rowsum = 0;
        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                colsum += array[j][i];


            }
            System.out.println("rowsum of col :" + colsum);
            colsum = 0;
        }
    }
}
