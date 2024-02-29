package LowLevelTicToc.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Deque;


public class Board {
  public static int size;
    public static   PlayingPiece [][] board;
   public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }
    
    public static void printBoard(){

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if(board[i][j]!=null){
                    System.out.println(board[i][j].pieceType.name()+" ");
                }
                else {
                    System.out.println(" ");
                }
                System.out.println("|");
            }
            System.out.println();
        }
    }
    public static ArrayList<Pair> getFreeCells()
    {
        ArrayList<Pair> cell=new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if(board[i][j]==null){

                    cell.add(new Pair(i,j));
                }
            }
        }
        return cell;

    }
}
