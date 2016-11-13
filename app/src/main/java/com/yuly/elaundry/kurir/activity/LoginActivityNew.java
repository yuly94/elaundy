/**
 * Author: Ravi Tamada
 * URL: www.androidhive.info
 * twitter: http://twitter.com/ravitamada
 */
package com.yuly.kurir.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.yuly.kurir.R;
import com.yuly.kurir.fragment.LoginFragmentVolley;

public class LoginActivityNew extends Activity {
    private static final String TAG = RegisterActivity.class.getSimpleName();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // pref = getPreferences(0);
        initFragment();
    }


    private void initFragment() {
        Fragment fragment;

        fragment = new LoginFragmentVolley();

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();

    }
}
