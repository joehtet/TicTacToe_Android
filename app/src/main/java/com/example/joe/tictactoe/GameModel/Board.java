package com.example.joe.tictactoe.GameModel;

/**
 * The Board class contains a 2d array of Cell objects.
 */
public class Board{

    public static Cell[][] board;
    private int row, column; // number of rows x columns on the board.

    // Create row x column board with empty cells
    public Board(int row, int column){
        board = new Cell[row][column];
        this.row = row; this.column = column;
        for(int i=0;i<row;i++){
             for(int j=0;j<column;j++){
                 board[i][j] = new Cell(i,j);
                 board[i][j].setCellState(Token.EMPTY);
             }
        }
    }


    public void updateBoard(Player currentPlayer, int moveRow, int moveColumn){
        board[moveRow][moveColumn].setCellState(currentPlayer.playerToken);
    }

    public GameState updateGameState(){
        for(int i=0;i<row;i++){
            // check rows
            if(board[i][0] == board[i][1] && board[i][1]==board[i][2]){
                return GameState.WIN;
            }

            // check columns
            else if(board[0][i] == board[1][i] && board[1][i]==board[2][i]){
                return GameState.WIN;
            }
        }

        // check diagonals
        if((board[0][0]==board[1][1] && board[1][1]==board[2][2])||
                (board[2][0]==board[1][1] && board[1][1]==board[0][2])){
            return GameState.WIN;
        }

        return GameState.ONGOING;
    }
}
