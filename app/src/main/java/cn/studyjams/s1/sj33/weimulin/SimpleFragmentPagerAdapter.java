package cn.studyjams.s1.sj33.weimulin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author: wml
 * @date : 2016/04/27 01:19
 * @desc : TODO
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[]{"简介", "历史", "规则", "政治", "技战"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroductionFragment.newInstance("", "");
            case 1:
                return HistoryFragment.newInstance("", "");
            case 2:
                return RuleFragment.newInstance("", "");
            case 3:
                return PolityFragment.newInstance("", "");
            case 4:
                return TacticFragment.newInstance("", "");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position < 0 || position > 4) {
            return "";
        } else {
            return tabTitles[position];
        }
    }
}
