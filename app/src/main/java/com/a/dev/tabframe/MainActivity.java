package com.a.dev.tabframe;

import android.content.DialogInterface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set gradient colour
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.gradasi));

            //adding tollbar to the actifity
        //getSupportActionBar().setDisplayShowTitleEnabled(false);//menghapus title bar
        getSupportActionBar().setTitle("Halaman Utama");

            //initializing the tab layout
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        //adding the tab using asstab method

        tabLayout.addTab(tabLayout.newTab().setText("").setIcon(getResources().getDrawable(R.drawable.utama)));//set tab title
        tabLayout.addTab(tabLayout.newTab().setText("").setIcon(getResources().getDrawable(R.drawable.author)));
        tabLayout.addTab(tabLayout.newTab().setText("").setIcon(getResources().getDrawable(R.drawable.about)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //initial view pagger
        viewPager=(ViewPager)findViewById(R.id.pager);

        //creating out pagger adapter
        Pager adapter = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());

        //adding adapter to pager
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //adding onTabSelecListener to swipe Views
        tabLayout.setOnTabSelectedListener(this);
    }
    public int[] tabicon={
            R.drawable.utama,
            R.drawable.author,
            R.drawable.about

    };

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        //viewPager.setCurrentItem(tab.getPosition());
        switch (tab.getPosition()){
            case 0:
                viewPager.setCurrentItem(0);
                getSupportActionBar().setTitle("Halaman Utama");
                break;
            case 1:
                viewPager.setCurrentItem(1);
                getSupportActionBar().setTitle("Halaman Author");
                break;
            case 2:
                viewPager.setCurrentItem(2);
                getSupportActionBar().setTitle("Halaman About");
                break;
            default:
                getSupportActionBar().setTitle("Halaman Utama");
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("KELUAR")
                .setMessage("Anda Yakin Mau Keluar?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
                finish();
            }
        }).setNegativeButton("Tidak", null).show();
    }
}

