package LowLevelTicToc;

import LowLevelTicToc.Model.*;

import java.util.*;

public class TicTocGame {
   static Deque<Player> players;
   static Board gameBoard;
    void initialiseGame(){
players=new LinkedList<>();
PlayingPieceX crossPiece=new PlayingPieceX();
        Player player1=new Player("Player1",crossPiece);
        PlayingPieceO noughtPiece=new PlayingPieceO();
        Player player2=new Player("Player2",noughtPiece);
        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);

    }
    public static void startGame(){
        Player playerTurn=players.removeFirst();
        boolean noWinner=true;
        while (noWinner){
            Player player=players.removeFirst();
            gameBoard.printBoard();
            ArrayList<LowLevelTicToc.Model.Pair> freeCells=gameBoard.getFreeCells();
            
        }
    }


}
