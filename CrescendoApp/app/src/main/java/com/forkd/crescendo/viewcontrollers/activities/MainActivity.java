package com.forkd.crescendo.viewcontrollers.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.forkd.crescendo.R;
import com.forkd.crescendo.viewcontrollers.fragments.ArtistsFragment;
import com.forkd.crescendo.viewcontrollers.fragments.DemosFragment;
import com.forkd.crescendo.viewcontrollers.fragments.FavoritesFragment;
import com.forkd.crescendo.viewcontrollers.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return navigateTo(item);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigateTo(navigation.getMenu().findItem(R.id.navigation_artists));

    }

    private Fragment getFragmentFor(MenuItem item){
        switch (item.getItemId()) {
            case R.id.navigation_artists: return new ArtistsFragment();
            case R.id.navigation_favorites:return new FavoritesFragment();
            case R.id.navigation_demos:return new DemosFragment();
            case R.id.navigation_profile:return new ProfileFragment();
            default:return  new ArtistsFragment();
        }
    }
    private boolean navigateTo(MenuItem item){
        item.setChecked(true);
        return getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content,getFragmentFor(item))
                .commit()>0;
    }




}
