package com.example.shakiltic_tac_toe_game123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
int flag=0;
int count=0;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
TextView txtres;
LinearLayout li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inti();




    }

    private void inti() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        txtres=findViewById(R.id.txtres);
        li=findViewById(R.id.li);
    }
    public void onclick(View view){
        Button btncurrentposition=(Button) view;
        if(btncurrentposition.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btncurrentposition.setText("X");
                flag = 1;
            } else {
                btncurrentposition.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b1);
                    li.setBackgroundColor(getResources().getColor(R.color.purple_200));


                    //newgame() method tao call kore korte pari..oitai easy..method ta nise korsi..but call kori nai..
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;



                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b4);
                    li.setBackgroundColor(getResources().getColor(R.color.teal_700));
                    //newgame() method tao call kore korte pari..oitai easy..method ta nise korsi..but call kori nai..

                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b7);
                    li.setBackgroundColor(getResources().getColor(R.color.purple_2000));
                    //newgame() method tao call kore korte pari..oitai easy..method ta nise korsi..but call kori nai..

                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b1);
                    li.setBackgroundColor(getResources().getColor(R.color.teal_700));
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b3);
                    li.setBackgroundColor(getResources().getColor(R.color.purple_200));
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b1);
                    li.setBackgroundColor(getResources().getColor(R.color.teal_200));
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b2);
                    li.setBackgroundColor(getResources().getColor(R.color.purple_200));
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    txtres.setText("Winner is "+b3);
                    li.setBackgroundColor(getResources().getColor(R.color.white));
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    flag=0;
                    count=0;

                }
                else if(count==9){
                    Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show();
                    txtres.setText("Game is Drawn");
                    li.setBackgroundColor(getResources().getColor(R.color.black));
                    newgame();
                }


            }
        }



    }
    public void newgame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;

    }
}