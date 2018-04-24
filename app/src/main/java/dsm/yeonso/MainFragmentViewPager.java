package dsm.yeonso;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by dsm2016 on 2018-04-18.
 */

public class MainFragmentViewPager extends FragmentStatePagerAdapter {

    private int tabCount;

    public MainFragmentViewPager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MainTabFragment1 mainTabFragment1 = new MainTabFragment1();
                return mainTabFragment1;
            case 1:
                MainTabFragment2 mainTabFragment2 = new MainTabFragment2();
                return mainTabFragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
