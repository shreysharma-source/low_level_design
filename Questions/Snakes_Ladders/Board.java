package LLD.Questions.Snakes_Ladders;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int length;
    // int width;

    int numSnakes;
    int numLadders;

    Space board[][]; 

    Board(int iLength, int iNumSnakes, int iNumLadders){
        length = iLength;
        numSnakes = iNumSnakes;
        numLadders = iNumLadders;
        this.board = new Space[length][length];

        for (int i=0; i< length; i++){
            for (int j = 0; j< length; j++){
                board[i][j] = new Space();
            }
        }

        addSnakesLadders(iNumSnakes, iNumLadders);
    }

    public void addSnakesLadders(int iNumSnakes, int iNumLadders){
        while(iNumSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, (length*length - 1));
            int snakeTail = ThreadLocalRandom.current().nextInt(1, (length*length - 1));

            if (snakeHead <= snakeTail){
                continue;
            }
            Jump snake = new Jump(snakeHead, snakeTail);
            Space spaceObj = getSpace(snakeHead);
            spaceObj.jump = snake;
            iNumSnakes--;
        }

        while(iNumSnakes > 0){
            int ladderBottom = ThreadLocalRandom.current().nextInt(1, (length*length - 1));
            int ladderTop = ThreadLocalRandom.current().nextInt(1, (length*length - 1));

            if (ladderBottom >= ladderTop){
                continue;
            }
            Jump ladder = new Jump(ladderBottom, ladderTop);
            Space spaceObj = getSpace(ladderBottom);
            spaceObj.jump = ladder;
            iNumLadders--;
        }
    }

    Space getSpace(int iCurrPosition){
        return this.board[iCurrPosition / length][iCurrPosition % length];
    }

    


}
