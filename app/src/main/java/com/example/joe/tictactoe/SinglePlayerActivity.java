package com.example.joe.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import com.example.joe.tictactoe.GameModel.Board;
import com.example.joe.tictactoe.GameModel.GameState;
import com.example.joe.tictactoe.GameModel.Player;
import com.example.joe.tictactoe.GameModel.Token;

public class SinglePlayerActivity extends AppCompatActivity implements View.OnTouchListener{

    SurfaceView view = (SurfaceView) findViewById(R.id.game_board);

    // Game Logic starts here
    GameLoop gameLoop = new GameLoop();

    // instantiate 3x3 board with empty cells.
    Board board = new Board(3,3);

    // create players and assign tokens to players
    Player player1 = new Player(Token.CIRCLE);
    Player player2 = new Player(Token.CROSS);

    // variables
    Player currentPlayer;
    int[] move = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(view);

        currentPlayer = player2;  // player1 makes first move
        gameLoop.setGameState(GameState.ONGOING);
        gameLoop.start();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
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
