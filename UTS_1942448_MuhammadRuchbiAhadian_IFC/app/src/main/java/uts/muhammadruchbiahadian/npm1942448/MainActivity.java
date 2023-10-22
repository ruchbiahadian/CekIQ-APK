package uts.muhammadruchbiahadian.npm1942448;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE = "uts.muhammadruchbiahadian.npm1942448.extra.MESSAGE";
    public static final String EXTRA_NUMBER = "uts.muhammadruchbiahadian.npm1942448.extra.NUMBER";

    private EditText mMessageEditText;
    private EditText nMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText) findViewById(R.id.editText_main);
        nMessageEditText = (EditText) findViewById(R.id.editText_second);
    }

    public void LaunchSecondActivity(View view) {

        if(mMessageEditText.getText().toString().isEmpty() || nMessageEditText.getText().toString().isEmpty()){
            Toast.makeText(this, "Nama Lengkap dan Nilai IQ Harus diisi!", Toast.LENGTH_SHORT).show();

            return;  // Keluar dari Method
        }

        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        int number = Integer.parseInt(nMessageEditText.getText().toString());

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}