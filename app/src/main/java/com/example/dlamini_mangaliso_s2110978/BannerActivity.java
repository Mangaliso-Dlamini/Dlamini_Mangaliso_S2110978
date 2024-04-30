/**
 *
 * @author Mangaliso Linda Dlamini S2110978
 */
package com.example.dlamini_mangaliso_s2110978;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class BannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        Button button = findViewById(R.id.getStarted);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BannerActivity.this, MainActivity.class);

                if (!isNetworkAvailable()) {
                    // Display error message if no internet connection
                    Toast.makeText(BannerActivity.this, "No internet connection. Please check your network settings.", Toast.LENGTH_LONG).show();
                } else {
                    // Continue with app functionality
                    startActivity(intent);
                }
            }
        });


    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }
}
