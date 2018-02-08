package com.example.first_example.radioall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.Toolbar;

import com.example.first_example.radioall.R;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        //ImageButton button_radio1 = (ImageButton) findViewById(R.id.imageButton8);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Govt Stations");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Govt Stations");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Internet Stations");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Internet Stations");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("News Stations");
        spec.setContent(R.id.tab3);
        spec.setIndicator("News Stations");
        host.addTab(spec);
    }



    }



