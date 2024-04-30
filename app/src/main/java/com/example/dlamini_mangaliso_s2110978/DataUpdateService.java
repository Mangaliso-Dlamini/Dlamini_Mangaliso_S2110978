/**
 *
 * @author Mangaliso Linda Dlamini S2110978
 */
package com.example.dlamini_mangaliso_s2110978;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class DataUpdateService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Fetch and update data here
        fetchDataAndUpdate();
        return START_STICKY;
    }

    private void fetchDataAndUpdate() {
        // Your code to fetch and update data
    }
}
