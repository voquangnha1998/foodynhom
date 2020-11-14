package com.example.foody;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView buttomnav = findViewById(R.id.btnnavigation);
        buttomnav.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_save:
                fragment = new SaveFragment();
                break;
            case R.id.nav_order:
                fragment = new OrderFragment();
                break;
            case R.id.nav_noti:
                fragment = new NotiFragment();
                break;
            case R.id.nav_account:
                fragment = new AccountFragment();
                break;
        }
        return loadFragment(fragment);
    }
    private  boolean loadFragment(Fragment fragment){
        if(fragment!= null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }

}