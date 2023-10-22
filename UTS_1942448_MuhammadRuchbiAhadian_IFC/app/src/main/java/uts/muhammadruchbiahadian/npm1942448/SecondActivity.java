package uts.muhammadruchbiahadian.npm1942448;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

     private String tingkatIQ(int iq){
        String output = "";
         if(iq < 30){
             output = "Idiot";
        }else if(iq < 50){
             output = "Imbecile";
         }else if(iq < 70){
             output = "Debil";
         }else if(iq < 80){
             output = "Bodoh";
         }else if(iq < 90 ){
             output = "Normal Rendah";
         }else if(iq < 110){
             output = "Normal Sedang";
         }else if(iq < 120){
             output = "Normal Tinggi";
         }else if(iq < 130){
             output = "Cerdas";
         }else if(iq < 140){
             output = "Sangat Cerdas";
         }else{
             output = "Genius";
         }

        return output;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back);
        ImageView icon = (ImageView) findViewById(R.id.imageView2);
        TextView textView = (TextView) findViewById(R.id.text_message);
        TextView textView2 = (TextView) findViewById(R.id.text_number);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if(number < 90){
            icon.setImageResource(R.drawable.idiot_icon);
            textView.setTextColor(Color.parseColor("#FB1C1C"));
            textView2.setTextColor(Color.parseColor("#FB1C1C"));
        }else if(number < 130){
            icon.setImageResource(R.drawable.normal_icon);
            textView.setTextColor(Color.parseColor("#47ACD6"));
            textView2.setTextColor(Color.parseColor("#47ACD6"));
        }
        textView.setText(message);
        textView2.setText(tingkatIQ(number));

    }
}