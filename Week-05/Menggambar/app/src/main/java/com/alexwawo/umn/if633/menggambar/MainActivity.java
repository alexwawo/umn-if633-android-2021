package com.alexwawo.umn.if633.menggambar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KanvasKu kanvasKu;
        kanvasKu = new KanvasKu(this);
//        kanvasKu.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        this.setContentView(kanvasKu);
    }
}