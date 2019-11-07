package com.example.rollerdice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rollerdice.MainActivity;
import com.example.rollerdice.R;

public class AddNewIceBreaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_ice_breaker);
    }

    public void Save(View view)
    {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
    public void Cancel(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
