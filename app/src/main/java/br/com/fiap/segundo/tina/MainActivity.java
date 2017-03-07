package br.com.fiap.segundo.tina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       private int count = 0;
       TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int count = 0;
        txtView = (TextView)findViewById(R.id.textView);
    }

    public void incrementar(View v) {
     if (count < 10){
         count++;
     }  else {
         Toast.makeText(this, R.string.toast_incrementar, Toast.LENGTH_SHORT).show();
     }
        txtView.setText("" + count);
    }


    public void decrementar (View v){
        if (count > 0){
            count--;
        }else{
            Toast.makeText(this, R.string.toast_decrementar, Toast.LENGTH_SHORT).show();
        }
        txtView.setText("" + count);
    }
}
