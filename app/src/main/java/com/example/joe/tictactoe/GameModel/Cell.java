package com.example.joe.tictactoe.GameModel;

/**
 * The cell class models a tile on the game board.
 * The cell can either be empty, occupied by a circle or occupied by a cross.
 */

public class Cell {
    private int row;
    private int column;
    public Token cellState;

    public Cell(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void setCellState(Token cellState){
        this.cellState = cellState;
    };
    public Token getCellState(){
        return this.cellState;
    }
}
