package com.example.matkaexhibitioncentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;



import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.matkaexhibitioncentre.adapter.NavPageAdapter;
import com.example.matkaexhibitioncentre.fragments.ExhibitionFragment;
import com.example.matkaexhibitioncentre.fragments.HistoryFragment;
import com.example.matkaexhibitioncentre.fragments.MoreFragment;
import com.example.matkaexhibitioncentre.fragments.VideosFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
         bottomNav.setOnNavigationItemSelectedListener(navListener);

        final ViewPager viewPager = findViewById(R.id.view_pager);
        NavPageAdapter adapter = new NavPageAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

//        bottomNav.(viewPager);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()){
                        case R.id.nav_history :
                            selectedFragment = new HistoryFragment();
                            break;
                        case R.id.nav_exhibition :
                            selectedFragment = new ExhibitionFragment();
                            break;
                        case R.id.nav_videos :
                            selectedFragment = new VideosFragment();
                            break;
                        case R.id.nav_more :
                            selectedFragment = new MoreFragment();
                            break;
                    }
                   getSupportFragmentManager().beginTransaction().replace(R.id.view_pager,selectedFragment).commit();
                    return true;
                }


            };
}
