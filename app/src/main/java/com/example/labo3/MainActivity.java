package com.example.labo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int tiempo = Toast.LENGTH_LONG;
        Toast aviso = Toast.makeText(this, "Tostada", tiempo);
        aviso.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
        aviso.show();


    }

    public void Cambiar(View view){
        Intent i = new Intent(this, Segunda.class);
        startActivityForResult(i, 600);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        try {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == 600  && resultCode  == RESULT_OK) {

                String requiredValue = data.getStringExtra("key");
                Toast.makeText(this, requiredValue,
                        Toast.LENGTH_SHORT).show();
            }
        } catch (Exception ex) {
            Toast.makeText(this, ex.toString(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}