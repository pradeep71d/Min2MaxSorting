package com.example.sortingmin2max;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[]={4,45,6,25,35,26,40};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
