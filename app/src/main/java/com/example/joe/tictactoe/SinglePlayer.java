package com.example.joe.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joe.tictactoe.GameModel.Board;
import com.example.joe.tictactoe.GameModel.Token;
import com.example.joe.tictactoe.GameModel.GameState;
import com.example.joe.tictactoe.GameModel.Player;

public class SinglePlayer extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        // Get view for each cell on the board
        View cell_1 = (View) findViewById(R.id.cell_1);
        View cell_2 = (View) findViewById(R.id.cell_2);
        View cell_3 = (View) findViewById(R.id.cell_3);
        View cell_4 = (View) findViewById(R.id.cell_4);
        View cell_5 = (View) findViewById(R.id.cell_5);
        View cell_6 = (View) findViewById(R.id.cell_6);
        View cell_7 = (View) findViewById(R.id.cell_7);
        View cell_8 = (View) findViewById(R.id.cell_8);
        View cell_9 = (View) findViewById(R.id.cell_9);


        // initialize
            // instantiate 3x3 board with empty cells.
        Board board = new Board(3,3);

            // create players and assign tokens to players
        Player player1 = new Player(Token.CIRCLE);
        Player player2 = new Player(Token.CROSS);

            // initialized userinterface
        UserInterface userInterface = new UserInterface();
            // variables
        Player currentPlayer = player2;  // player1 makes first move
        int[] move = new int[2];
        GameState gameState = GameState.ONGOING;

        // start game loop
        while(gameState==GameState.ONGOING){

            if(currentPlayer==player1){currentPlayer = player2;}
            else{currentPlayer = player1;}

            // Set OnClickListener for each cell
            cell_1.setOnClickListener(this);
            cell_2.setOnClickListener(this);
            cell_3.setOnClickListener(this);
            cell_4.setOnClickListener(this);
            cell_5.setOnClickListener(this);
            cell_6.setOnClickListener(this);
            cell_7.setOnClickListener(this);
            cell_8.setOnClickListener(this);
            cell_9.setOnClickListener(this);

            move = userInterface.getMove(currentPlayer);  // returns row and column index of the player's placement
            board.updateBoard(currentPlayer,move[0],move[1]);
            userInterface.render(board);
            gameState = board.updateGameState();
        }
        // display win message
    }

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

    };
}
