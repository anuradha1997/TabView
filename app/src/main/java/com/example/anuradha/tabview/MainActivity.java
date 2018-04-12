package com.example.anuradha.tabview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TabHost) findViewById(R.id.myTab);
        t1.setup();
        TabHost.TabSpec tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("orange");
        tabSpec.setContent(R.id.tab1);
        t1.addTab(tabSpec);
        tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("green");
        tabSpec.setContent(R.id.tab2);
        t1.addTab(tabSpec);
         tabSpec=t1.newTabSpec("");
        tabSpec.setIndicator("blue");
        tabSpec.setContent(R.id.tab3);
        t1.addTab(tabSpec);



    }
}
