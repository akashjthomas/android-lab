package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fragment1;
    Button fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1=findViewById(R.id.button1);
        fragment2=findViewById(R.id.button2);
        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new firstfragment()).commit();
            }
        });
fragment2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new secondframe()).commit();
    }
});
    }
}