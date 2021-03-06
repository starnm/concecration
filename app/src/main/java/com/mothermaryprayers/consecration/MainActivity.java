package com.mothermaryprayers.consecration;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mothermaryprayers.consecration.fragment.ChooseAConsecrationFragment;
import com.mothermaryprayers.consecration.fragment.FirstWeekFragment;
import com.mothermaryprayers.consecration.fragment.PreparationFragment;
import com.mothermaryprayers.consecration.fragment.SecondWeekFragment;
import com.mothermaryprayers.consecration.fragment.ThirdWeekFragment;
import com.mothermaryprayers.consecration.fragment.prayer.BibleVerusFragment;
import com.mothermaryprayers.consecration.fragment.prayer.OJesusLivingInMaryFragment;
import com.mothermaryprayers.consecration.fragment.prayer.PrayerAveMagnificatFragment;
import com.mothermaryprayers.consecration.fragment.prayer.PrayerAveMariasStellaFragment;
import com.mothermaryprayers.consecration.fragment.prayer.PrayerLitanyOfBlessedVirginMaryFragment;
import com.mothermaryprayers.consecration.fragment.prayer.PrayerLitanyOfHolyNameOfJesusFragment;
import com.mothermaryprayers.consecration.fragment.prayer.PrayerLitanyOfTheHolyGhostFragment;
import com.mothermaryprayers.consecration.fragment.prayer.StLouisDeMontfortsPrayerFragment;
import com.mothermaryprayers.consecration.fragment.prayer.VeniCreatorFragment;
import com.mothermaryprayers.consecration.fragment.twelvedaypreparation.DayOneFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment mainContent = ChooseAConsecrationFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, mainContent)
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment mainContent = null;
        if (id == R.id.nav_choose_a_concecration) {
            mainContent = DayOneFragment.newInstance();
        } else if (id == R.id.nav_preparation) {
            mainContent = PreparationFragment.newInstance();
        } else if (id == R.id.nav_prayer_ave_magnificat) {
            mainContent = PrayerAveMagnificatFragment.newInstance();
        } else if (id == R.id.nav_prayer_ave_marias_stella) {
            mainContent = PrayerAveMariasStellaFragment.newInstance();
        } else if (id == R.id.nav_prayer_litany_of_holy_ghost) {
            mainContent = PrayerLitanyOfTheHolyGhostFragment.newInstance();
        } else if (id == R.id.nav_prayer_litany_of_the_blessed_virgin_mary) {
            mainContent = PrayerLitanyOfBlessedVirginMaryFragment.newInstance();
        } else if (id == R.id.nav_prayer_litany_of_the_holy_name_of_jesus) {
            mainContent = PrayerLitanyOfHolyNameOfJesusFragment.newInstance();
        } else if (id == R.id.nav_twelve_day_preparation) {
            mainContent = PrayerLitanyOfHolyNameOfJesusFragment.newInstance();
        } else if (id == R.id.nav_first_week) {
            mainContent = FirstWeekFragment.newInstance();
        } else if (id == R.id.nav_second_week) {
            mainContent = SecondWeekFragment.newInstance();
        } else if (id == R.id.nav_third_week) {
            mainContent = ThirdWeekFragment.newInstance();
        } else if (id == R.id.nav_prayer_veni_creator) {
            mainContent = VeniCreatorFragment.newInstance();
        } else if (id == R.id.nav_prayer_st_louis_de_montforts) {
            mainContent = StLouisDeMontfortsPrayerFragment.newInstance();
        } else if (id == R.id.nav_prayer_o_jesus_living_in_mary) {
            mainContent = OJesusLivingInMaryFragment.newInstance();
        }
        if (mainContent != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack if needed
            transaction.replace(R.id.content_frame, mainContent);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBibleVersusClicked(int day) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack if needed
        transaction.replace(R.id.content_frame, BibleVerusFragment.newInstance(day));
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }
}
