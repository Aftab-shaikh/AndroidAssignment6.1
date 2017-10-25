package com.example.user1.assignment61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // private variable to assinge Id's

     private EditText textname;
     private EditText textpass;
     private Button button;
     private TextView loginresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Id's assisnged to reference variables
        textname = (EditText) findViewById(R.id.EditText1);
        textpass = (EditText) findViewById(R.id.Edittext2);
        button= (Button) findViewById(R.id.button);
        loginresult= (TextView) findViewById(R.id.TextVieww);


        // onclick listener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // this method perameters check the value take from user
               check(textname.getText().toString(),textpass.getText().toString());

            }
        });

    }

        // this check method checks the value wther it is right or wrong
    private void check(String name, String password){
       if((name=="Aftab") & (password=="1234")){
           // if name is Aftab and password is 1234
           // then intent will run
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
        }else{
           //else it will show login failed
         loginresult.setText("Login Failed");

       }

    }
}
