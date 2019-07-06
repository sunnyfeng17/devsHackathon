package com.example.scammer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        BottomNavigationItemView item = findViewById(R.id.action_settings);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        homePage();
//                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_report:
//                        reportPage();
//                        Toast.makeText(MainActivity.this, "Report", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_settings:
                        settingsPage();
//                        Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

    void homePage() {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }

    void settingsPage() {
        Intent setting = new Intent(this, Settings.class);
        startActivity(setting);
    }
}
