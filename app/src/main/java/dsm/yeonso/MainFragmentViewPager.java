package dsm.yeonso;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dsm2016 on 2018-04-18.
 */

public class MainFragmentViewPager extends FragmentPagerAdapter {
    private Context context;

    public MainFragmentViewPager(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MainTabFragment1();
        } else
            return new MainTabFragment2();
    }

    @Override
    public int getCount() {
        return 1;
    }
}
