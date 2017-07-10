package com.megyemix.view;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import megyemix.com.megyemix.R;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.app_bar)
    android.support.v7.widget.Toolbar toolbar;

    @BindString(R.string.app_name)
    String appname;

    @BindString(R.string.draweritem1)
    String draweritem1;
    @BindString(R.string.draweritem2)
    String draweritem2;
    @BindString(R.string.draweritem3)
    String draweritem3;
    @BindString(R.string.draweritem4)
    String draweritem4;
    @BindString(R.string.draweritem5)
    String draweritem5;


    @BindString(R.string.twice_to_back)
    String twiceback;
    private boolean  doubleBackToExitPressedOnce =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //Azért van külön meghívva, hogy szinkronba lehessen hozni később az animált materialdrawerrel illetve a későbbi recyclerview-val
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(appname);



        //LOADING OF THE MATERIAL NAVIGATION DRAWER
        //----------------------------------------------
        //----------------------------------------------


        //TODO ide fog majd jönni a materialdrawer header-jéhez a
        /*AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(backgroundimage)
                .addProfiles(
                        new ProfileDrawerItem().withName(FirebaseAuth.getInstance().getCurrentUser().getEmail())
                                .withIcon(accounticonsample01),
                        new ProfileDrawerItem().withName("Dummy profil")
                                .withIcon(accounticonsample02)
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();*/





        new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
/*
                .withAccountHeader(headerResult)
*/

/* Az ikonok még változatva lesznek, van olyan elem a drawerben amihez még nem találtam */
                .addDrawerItems(
                        new SecondaryDrawerItem().withName(draweritem1).withIcon(
                                new IconicsDrawable(this)
                                        .icon(GoogleMaterial.Icon.gmd_check)
                                        .color(ContextCompat.getColor(this, R.color.colorPrimary))),
                        new SecondaryDrawerItem().withName(draweritem2).withIcon(
                                new IconicsDrawable(this)
                                        .icon(GoogleMaterial.Icon.gmd_playlist_add_check)
                                        .color(ContextCompat.getColor(this, R.color.colorPrimary))),
                        new SecondaryDrawerItem().withName(draweritem3).withIcon(
                                new IconicsDrawable(this)
                                        .icon(GoogleMaterial.Icon.gmd_home)
                                        .color(ContextCompat.getColor(this, R.color.colorPrimary))),
                        new SecondaryDrawerItem().withName(draweritem4).withIcon(
                                new IconicsDrawable(this)
                                        .icon(GoogleMaterial.Icon.gmd_map)
                                        .color(ContextCompat.getColor(this, R.color.colorPrimary))),
                        new SecondaryDrawerItem().withName(draweritem5).withIcon(
                                new IconicsDrawable(this)
                                        .icon(GoogleMaterial.Icon.gmd_info_outline)
                                        .color(ContextCompat.getColor(this, R.color.colorPrimary))))
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        switch (position) {


                        }

                        return false;
                    }
                })
                .build();





    }

    @Override
    public void onBackPressed() {


        // Csupán kényelmi funkció arra az esetre, ha véletlenül nyomná meg a vissza gombot. Sok nívósabb alkalmazásnak eleme.
        // Ha feleslegesnek érzed, nyugodtan töröld.
        if (doubleBackToExitPressedOnce) {
            this.finish();
        } else {

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, twiceback, Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 3000);
        }

    }

    //Szerintem nem kell. Material designnak csak nagyon ritkán a része :/
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    /*@Override
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
    }*/

   /* @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/


    //TODO visszaállítani

   /* @OnClick(R.id.exampleButton)
    public void submit(View view) {
        TextView mTextView = (TextView) findViewById(R.id.helloText);

        AdatbankManager adatbankManager = new AdatbankManager("",0);
        adatbankManager.GetRoundMatches("megye1","round_1");
    }*/

}
