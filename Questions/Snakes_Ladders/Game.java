package LLD.Questions.Snakes_Ladders;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;

    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame(10, 5, 5, 1);
    }

    public void initializeGame(int iLength, int iNumSnakes, int iNumLadders, int iNumDice){
        board = new Board(iLength, iNumSnakes, iNumLadders);
        dice = new Dice(iNumDice);
        winner = null;

        addPlayers(2);
    }

    public void addPlayers(int iNumPlayers){
        int iterator = iNumPlayers;
        while(iterator > 0){
            Player currPlayer = new Player(("Player" + (iNumPlayers-iterator + 1)), 0);
            playersList.add(currPlayer);
            iterator--;
        }

    }

    public void startGame(){
        while (winner == null){
            Player playerTurn = findPlayerTurn();

            // print player id and curr pos
            System.out.println(playerTurn.playerId + " curr position: " + playerTurn.currentPosition);
            int num = dice.getNmber();
            playerTurn.currentPosition = jumpCheck(playerTurn.currentPosition + num);

            // print player id and new position
            System.out.println(playerTurn.playerId + " curr position: " + playerTurn.currentPosition);
            
            if (playerTurn.currentPosition >= board.board.length * board.board.length - 1){
                winner = playerTurn; 
            }

        }

        //print winner
        System.out.println("Winner is " + winner.playerId);

    }

    public Player findPlayerTurn(){
        Player playerTurn = playersList.removeFirst();
        playersList.add(playerTurn);

        return playerTurn;
    }

    public int jumpCheck(int iPlayerNewPosition){
        if (iPlayerNewPosition > (board.board.length * board.board.length - 1)){
            return iPlayerNewPosition;
        }

        Space currSpace = board.getSpace(iPlayerNewPosition);

        if (currSpace.jump != null && currSpace.jump.start == iPlayerNewPosition){
            if (currSpace.jump.start < currSpace.jump.end){
                System.out.println("Jump by ladder");
            }
            else if (currSpace.jump.start > currSpace.jump.end){
                System.out.println("Jump by snake");
            }
            return currSpace.jump.end;
        }

        return iPlayerNewPosition;
    }

}
