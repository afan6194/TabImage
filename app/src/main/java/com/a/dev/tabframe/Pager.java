package com.a.dev.tabframe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Asus on 13/03/2017.
 */

public class Pager extends FragmentStatePagerAdapter{

    //integer to count number of tab
    int tabCount;

   //contractor to the class
    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        //initial tabcount
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Utama t1=new Utama();
                return t1;
            case 1:
                Author t2=new Author();
                return t2;
            case 2:
                About t3=new About();
                return t3;
        default:
            return null;
        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }
}
