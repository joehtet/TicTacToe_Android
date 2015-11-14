package com.example.joe.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joe.tictactoe.GameModel.Board;
import com.example.joe.tictactoe.GameModel.Token;
import com.example.joe.tictactoe.GameModel.GameState;
import com.example.joe.tictactoe.GameModel.Player;

public class SinglePlayerActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        GameLoop gameLoop = new GameLoop();
        gameLoop.setGameState(GameState.ONGOING);
        gameLoop.start();
    }
}

/*


    @Override
    public void onClick(View view){
        int move[] = new int[2];
        //
        switch(view.getId()) {
            case R.id.cell_1:
                move[0] = 0;
                move[1] = 0;
                break;
            case R.id.cell_2:
                move[0] = 0;
                move[1] = 1;
                break;
            case R.id.cell_3:
                move[0] = 0;
                move[1] = 2;
                break;
            case R.id.cell_4:
                move[0] = 1;
                move[1] = 0;
                break;
            case R.id.cell_5:
                move[0] = 1;
                move[1] = 1;
                break;
            case R.id.cell_6:
                move[0] = 1;
                move[1] = 2;
                break;
            case R.id.cell_7:
                move[0] = 2;
                move[1] = 0;
                break;
            case R.id.cell_8:
                move[0] = 2;
                move[1] = 1;
                break;
            case R.id.cell_9:
                move[0] = 2;
                move[1] = 2;
                break;
            default:
                break;
        }

    };*/
