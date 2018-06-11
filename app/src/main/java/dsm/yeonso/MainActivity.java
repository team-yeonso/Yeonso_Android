package dsm.yeonso;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.Menu;
import android.view.MenuItem;

import dsm.yeonso.Adapter.MainFragmentViewPagerAdapter;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Intent intent;
    private MainFragmentViewPagerAdapter mainFragmentViewPager;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.content_main2_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.content_main2_viewPager);

        mainFragmentViewPager = new MainFragmentViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(mainFragmentViewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // itemIconTintList를 null로 함으로써 본래의 색깔이 드러나게 함.
        navigationView.setItemIconTintList(null);

        // 글씨 색 바꾸기 완료함.
        Menu menu = navigationView.getMenu();

        MenuItem myPage = menu.findItem(R.id.nav_myPage);
        SpannableString sMyPage = new SpannableString(myPage.getTitle());
        sMyPage.setSpan(new TextAppearanceSpan(this, R.style.Navigation),0,sMyPage.length(),0);
        myPage.setTitle(sMyPage);
        navigationView.setNavigationItemSelectedListener(this);

        MenuItem chatList = menu.findItem(R.id.nav_chatList);
        SpannableString sChatList = new SpannableString(chatList.getTitle());
        sChatList.setSpan(new TextAppearanceSpan(this, R.style.Navigation),0,sChatList.length(),0);
        chatList.setTitle(sChatList);
        navigationView.setNavigationItemSelectedListener(this);

        MenuItem setting = menu.findItem(R.id.nav_setting);
        SpannableString sSetting = new SpannableString(setting.getTitle());
        sSetting.setSpan(new TextAppearanceSpan(this, R.style.Navigation),0,sSetting.length(),0);
        setting.setTitle(sSetting);
        navigationView.setNavigationItemSelectedListener(this);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_myPage) {
//            intent = new Intent(getApplicationContext(), MyPageActivity.class);
//            startActivity(new Intent(getApplicationContext(),MyPageActivity.class));
            intent = new Intent(getApplicationContext(), MyPageActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_chatList) {
            intent = new Intent(getApplicationContext(),ChatListActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_setting) {
            intent = new Intent(getApplicationContext(),SettingActivity.class);
            startActivity(intent);
        } 

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
