import java.util.*;
public class GameMain {

    public static void menu(){
        System.out.println("Hi! Select a Race. (player1)");
    }

    public static void print(){

        int rows = 40;
        int columns = 40;

        int[][] array = new int[rows][columns];

        for(int i = 0; i<rows; i++)
            for(int j = 0; j<columns; j++)
                array[i][j] = 1;

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private int roundCounter;
    private boolean gameOn = true;

    public void rounds (Race Player1, Race Player2){
        while (gameOn){
            while (moves > 0){

            }
        }
    }

    public static void main(String[] args){
        menu();
        print();
    }
}
