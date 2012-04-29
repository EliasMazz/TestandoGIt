package com.domoticenter;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
public class Domotic_Center_v1LayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
 
        TabHost tabHost = getTabHost();
 
        // Tab for Photos
        TabSpec cozinhaSpec = tabHost.newTabSpec("Cozinha");
        // setting Title and Icon for the Tab
        cozinhaSpec.setIndicator("Cozinha",null);
    
        Intent cozinhaIntent = new Intent(this, CozinhaActivity.class);
        cozinhaSpec.setContent(cozinhaIntent);
 
        // Tab for Songs
        TabSpec quartoSpec = tabHost.newTabSpec("Quarto");
        quartoSpec.setIndicator("Quarto",null);
        Intent quartoIntent = new Intent(this, QuartoActivity.class);
        quartoSpec.setContent(quartoIntent);
      
        
 
        // Adding all TabSpec to TabHost
        tabHost.addTab(cozinhaSpec); // Adding photos tab
        tabHost.addTab(quartoSpec); // Adding songs tab
     
    }
}