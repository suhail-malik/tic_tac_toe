package com.suhail_malik.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class maingame extends AppCompatActivity {



    //true for cross
    int []gamestate={2,2,2,2,2,2,2,2,2};
    int [][]winpos={{1,2,3},{4,5,6},{7,8,9},{1,5,9},{3,5,7},{1,4,7},{2 ,5,8},{3,6,9}};


    int activePlayer=1;
    public void dropin(View view) {
        ImageView counter = (ImageView) view;
        int a = (Integer.parseInt(counter.getTag().toString()));

if(gamestate[a-1]==2){

    gamestate[a-1] = activePlayer;
    counter.setTranslationY(-2000);
        if (activePlayer == 1) {

            //1  for cross
            counter.setImageResource(R.drawable.cross);
            activePlayer = 0;
        } else if (activePlayer == 0) {
            //zero for zero
            counter.setImageResource(R.drawable.zero);
            activePlayer = 1;


        }


        counter.animate().translationYBy(2000).rotation(360).setDuration(400);
        for(int[] winpos:winpos)

        {
            String winner="";
            if(gamestate[winpos[0]-1]== gamestate[winpos[1]-1] && gamestate[winpos[1]-1]==gamestate[winpos[2]-1] && gamestate[winpos[0]-1]!=2)
            {
                if(activePlayer==1)
            {
                winner="Blue wins";

            }
            else if(activePlayer==0){

                winner="Red wins";

                }

                Button button=findViewById(R.id.button3);
                Button home=findViewById(R.id.button4);

                TextView winnerNameDisplay=findViewById(R.id.textView2);
                button.setVisibility(View.VISIBLE);
                home.setVisibility(View.VISIBLE);
                winnerNameDisplay.setText(winner);
                winnerNameDisplay.setVisibility(View.VISIBLE);


            }

        }


    }
    }

    public void playagain(View view){

        Button button=findViewById(R.id.button3);
        Button home=findViewById(R.id.button4);
        TextView winnerNameDisplay=findViewById(R.id.textView2);
        button.setVisibility(View.INVISIBLE);
        winnerNameDisplay.setVisibility(View.INVISIBLE);
        home.setVisibility(View.INVISIBLE);
        GridLayout gridLayout=findViewById(R.id.gridlayout);

        for (int i=0;i<gridLayout.getChildCount() ;i++)
        {
            ImageView counter=(ImageView)gridLayout.getChildAt(i);
            counter.setImageDrawable(null);


        }
        for(int j=0;j<gamestate.length;j++)
        {
            gamestate[j]=2;
        }
        activePlayer=1;


    }

    public void home(View view){

        Intent intent=new Intent(this.getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);



        Button restart=findViewById(R.id.button3);
        restart.setVisibility(View.INVISIBLE);
        Button home=findViewById(R.id.button4);
        home.setVisibility(View.INVISIBLE);





}


}