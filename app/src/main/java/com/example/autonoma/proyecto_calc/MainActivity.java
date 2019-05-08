package com.example.autonoma.proyecto_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,ettot;
    Button btnsum,btnres;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1 =findViewById(R.id.et1);
        et2 =findViewById(R.id.et2);
        ettot =findViewById(R.id.ettot);
        btnsum =findViewById(R.id.btnsum);
        btnres =findViewById(R.id.btnres);


        btnsum.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Double num1,num2,toti ;
                                          String n1,n2;

                                          n1 =et1.getText().toString();
                                          num1=Double.parseDouble(n1);
                                          n2 =et2.getText().toString();
                                          num2=Double.parseDouble(n2);

                                          toti=num1+num2;

                                          ettot.setText(toti.toString());
                                      }
                                  }
        );

        btnres.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Double num1,num2,toti ;
                                          String n1,n2;

                                          n1 =et1.getText().toString();
                                          num1=Double.parseDouble(n1);
                                          n2 =et2.getText().toString();
                                          num2=Double.parseDouble(n2);

                                          toti=num1-num2;

                                          ettot.setText(toti.toString());
                                      }
                                  }


        );







    }
}
