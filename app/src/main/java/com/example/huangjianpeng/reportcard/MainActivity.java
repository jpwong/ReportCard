package com.example.huangjianpeng.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard myCard = new ReportCard(2016, ReportCard.WINRERTERM);
        myCard.setmChinese(99);
        myCard.setmMaths(99);
        myCard.setmEnglish(99);

        Log.i("Jpwong",myCard.toString());
    }
}
