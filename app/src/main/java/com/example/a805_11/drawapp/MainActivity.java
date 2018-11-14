package com.example.a805_11.drawapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    CheckBox Ch_Btn;
    LinearLayout Img_Layout;
    RadioGroup radio;
    RadioButton radio_01, radio_02, radio_03;
    Button choice;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ch_Btn = findViewById(R.id.Ch_Btn);
        Img_Layout = findViewById(R.id.Img_Layout);
        radio = findViewById(R.id.radio);
        radio_01 = findViewById(R.id.radio_01);
        radio_02 = findViewById(R.id.radio_02);
        radio_03 = findViewById(R.id.radio_03);
        choice = findViewById(R.id.choice);
        imageView = findViewById(R.id.imageView);

        Ch_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Ch_Btn.isChecked() == true){
                    Img_Layout.setVisibility(View.VISIBLE);

                    choice.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            switch (radio.getCheckedRadioButtonId()){
                                case R.id.radio_01:
                                    imageView.setImageResource(R.drawable.img_01);
                                    break;

                                case R.id.radio_02:
                                    imageView.setImageResource(R.drawable.img_02);
                                    break;

                                case R.id.radio_03:
                                    imageView.setImageResource(R.drawable.img_03);
                            }
                        }
                    });
                }else{
                    Img_Layout.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
