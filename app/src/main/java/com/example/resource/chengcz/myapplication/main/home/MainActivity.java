package com.example.resource.chengcz.myapplication.main.home;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.config.KeyContacts;
import com.example.resource.chengcz.myapplication.main.home.adapter.MainViewPagerAdapter;
import com.example.resource.chengcz.myapplication.main.home.other.HomeMainTabCilcklistener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager;
    private FloatingActionButton fab;
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private int currentIndex;
    private MainViewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
        initData(savedInstanceState);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        viewPager = (ViewPager) findViewById(R.id.main_content);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        setSupportActionBar(toolbar);
        viewPager.setOffscreenPageLimit(7);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initData(Bundle savedInstanceState) {
        pagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changeSelect(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        if (savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt(KeyContacts.KEY_HOMETABINDEX);
            changeCurrentItem(currentIndex,false);
        } else {
            changeCurrentItem(0,false);
        }


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(KeyContacts.KEY_HOMETABINDEX, currentIndex);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.containsKey(KeyContacts.KEY_HOMETABINDEX)) {
            currentIndex = savedInstanceState.getInt(KeyContacts.KEY_HOMETABINDEX);
            changeCurrentItem(currentIndex,false);
        }

    }

    /**
     * 描述:修改当前显示页面
     * 作者:wangww
     * 时间:2015/11/11 17:50
     * 版本:3.1.3
     */
    public void changeCurrentItem(int position, boolean needRefreshMenu) {
        if (position == currentIndex) {
            Fragment fragment = (Fragment) pagerAdapter.instantiateItem(viewPager, position);
            if (fragment instanceof HomeMainTabCilcklistener) {
                ((HomeMainTabCilcklistener) pagerAdapter.instantiateItem(viewPager, position)).onTabClick();
            }
        }
        viewPager.setCurrentItem(position, false);
        if (needRefreshMenu) {
            changeSelect(position);
        }
    }

    private void changeSelect(int position) {
        if (navigationView != null) {
//            if(position>3){
//                navigationView.getMenu().getItem(4).getSubMenu().getItem(position%4).setChecked(true);
//            }else{
            navigationView.getMenu().getItem(position).setChecked(true);}
       // }
    }

    @Override
    public void onBackPressed() {
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
            Toast.makeText(this,R.string.toast_settings,Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_color) {
            changeCurrentItem(0,false);
        } else if (id == R.id.nav_text) {
            changeCurrentItem(1,false);
        } else if (id == R.id.nav_line) {
            changeCurrentItem(2,false);
        } else if (id == R.id.nav_bold_line) {
            changeCurrentItem(3,false);
        } else if (id == R.id.nav_square) {
            changeCurrentItem(4,false);
        } else if (id == R.id.nav_circle) {
            changeCurrentItem(5,false);
        } else if (id == R.id.nav_corner_rectangle) {
            changeCurrentItem(6,false);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
