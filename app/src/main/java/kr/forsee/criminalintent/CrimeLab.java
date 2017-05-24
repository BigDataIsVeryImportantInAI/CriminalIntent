package kr.forsee.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Eungi on 2017-05-22.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        // addCrime()의 추가로 필요가 없음
        //for (int i = 0; i < 100; i++) {
        //    Crime crime = new Crime();
        //    crime.setTitle("범죄 #" + i);
        //    crime.setSolved(i % 2 == 0);
        //    mCrimes.add(crime);
        //}
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

}
