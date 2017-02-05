package com.example.sollymanul.moneysharingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class UnverifiedUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unverified_user);

        Bundle bundle = getIntent().getExtras();
        String userInfo = bundle.getString("UserInfo");

        Toast.makeText(getApplicationContext(), userInfo, Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}
