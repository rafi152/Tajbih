package org.meicode.tajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   //variable declar

    int count=0;

    TextView tvresult;
    Button Button1,Button2,Button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable porichoy koriye dilam

        Button1=findViewById(R.id.Button1);
        Button2=findViewById(R.id.Button2);
        Button3=findViewById(R.id.Button3);
        tvresult=findViewById(R.id.tvresult);

        //stated onclick method
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count+1;
                tvresult.setText(""+count);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count-1;
                tvresult.setText(""+count);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                tvresult.setText(""+count);
            }
        });
    }
}