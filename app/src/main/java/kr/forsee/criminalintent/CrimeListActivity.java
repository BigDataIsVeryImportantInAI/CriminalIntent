package kr.forsee.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Eungi on 2017-05-22.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
