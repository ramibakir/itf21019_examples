package com.lavima.after_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NavController controller = Navigation.findNavController(this, R.id.fragment);

        BottomNavigationView bottonNavigation = findViewById(R.id.bottom_navigation);
        NavigationUI.setupWithNavController(bottonNavigation, controller);


        NavigationView drawerView = findViewById(R.id.navigation_view);
        /*drawerView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Log.d("Drawer", "Testing");
                return true;
            }
        });*/
        NavigationUI.setupWithNavController(drawerView, controller);

    }
}