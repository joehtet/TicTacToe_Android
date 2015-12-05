package com.example.joe.tictactoe.GameModel;

/**
 * Class player that assigns a token. (O or X)
 */
public class Player {
    private Token playerToken;

    public Player(Token playerToken){
        this.playerToken = playerToken;
    }

    public Token getPlayerToken(){
        return this.playerToken;
    }
}
