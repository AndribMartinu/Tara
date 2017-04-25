package com.example.rubybajet.tara;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ruby Bajet on 4/20/2017.
 */

public class TaraApp extends Application
{
    public void saveUserData(String username, String password) {

        SharedPreferences prefs = getSharedPreferences("com.example.rubybajet.tara", Context.MODE_PRIVATE);
        SharedPreferences.Editor edt = prefs.edit();

        edt.putString("USERNAME", username);
        edt.putString("PASSWORD", password);
        edt.commit();
        return;
    }

    public String getAppUser() {
        SharedPreferences prefs = getSharedPreferences("com.example.rubybajet.tara", Context.MODE_PRIVATE);
        return prefs.getString("USERNAME", "");
    }

    public String getAppUserPassword() {
        SharedPreferences prefs = getSharedPreferences("com.example.rubybajet.tara", Context.MODE_PRIVATE);
        return prefs.getString("PASSWORD", "");
    }
}
