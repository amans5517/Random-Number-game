package com.example.amans.randomnumber20;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    ConstraintLayout  cs=new ConstraintLayout();
    int r_no=0;
    EditText input;
    String input_string;
    int input_no=0;
    int count=5;
    TextView counter;
    Button restart_button;

    void generate_rno()
    {
        Random r_obj=new Random();

        r_no=r_obj.nextInt(10);

    }

    void check() {


        //if (input_string != " ") {
        input_string = input.getText().toString();
        input_no = Integer.parseInt(input_string);

        if (input_no == r_no) {
            Toast.makeText(getApplicationContext(), "CORRECT!!", Toast.LENGTH_LONG).show(); }
            else {
            Toast.makeText(getApplicationContext(), "INCORRECT!!", Toast.LENGTH_LONG).show(); }
        //}
        //else
        //{
            //Toast.makeText(getApplicationContext(), "YOU NEED TO ENTER SOMETHING!!", Toast.LENGTH_LONG).show();

        //}
    }


    public void res_button(View view)
    {


       // if(input_string.equals(" "))
        //{

           //// generate_rno();

           // check();
        //}

        //else
        //{
           //input.setOnClickListener(new View.OnClickListener() {
               //@Override
               //public void onClick(View view) {
                   Toast.makeText(this,"GAME is Restarted!!",Toast.LENGTH_LONG).show();
                   input.setText(" ");


               //}
           //});
            generate_rno();

            //check();
        //}



    }

    public void but_fn(View view)
    {
        //if(input_string.equals(" ")) {
           // Toast.makeText(getApplicationContext(), "Write an answer Buddy!", Toast.LENGTH_LONG).show();
        //}

        //check();
        count--;

        if(count>0)
        {

            counter.setText("Chances Left:"+count);
            check();

        }
        else
        {



            cs.setVisibility(View.INVISIBLE);
            restart_button.setVisibility(View.VISIBLE);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText) findViewById(R.id.number_button);
        counter=(TextView) findViewById(R.id.chance_text);
        cs=findViewById(R.id.group);
        restart_button=findViewById(R.id.button2);
        generate_rno();
    }
}
