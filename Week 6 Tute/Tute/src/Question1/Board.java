package Question1;

import java.util.Random;

public class Board {

    int ar[][];

    public Board(int n){
        ar = new int[n][n];

        Random generator = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ar[i][j] = generator.nextInt(101);
            }
        }
    }

    public void findMaxInRow(int row){ //[row][0], [row][1], [row][2]
        int maxRaw = 0;
        if (row < ar.length){
            for (int i = 0; i < ar.length; i++){
                if (maxRaw < ar[row][i]){
                    maxRaw = ar[row][i];
                }
            }
            System.out.println("Max in Row: " + maxRaw);
        } else {
            System.out.println("row value grater than array length");
        }
    }

    public void findMaxInColumn(int column){
        int maxColumn = 0;
        if (column < ar.length){
            for (int i = 0; i < ar.length; i++){
                if (maxColumn < ar[i][column]){
                    maxColumn = ar[i][column];
                }
            }
            System.out.println("Max in Column: " + maxColumn);
        } else {
            System.out.println("Column value grater than array length");
        }
    }

    public void findMaxInDiagonal(){
        int maxDiagonal=0;
        for (int[] r: ar){
            for(int c: r){
                if (maxDiagonal < c){
                    maxDiagonal = c;
                }
            }
        }
        System.out.println("Max Diagonal: " + maxDiagonal);
    }

    public void print(){
        for (int[] r: ar){
            for(int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
