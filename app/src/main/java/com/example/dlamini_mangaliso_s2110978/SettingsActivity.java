/**
 *
 * @author Mangaliso Linda Dlamini S2110978
 */
package com.example.dlamini_mangaliso_s2110978;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final EditText editTextUpdateTime = findViewById(R.id.editTextUpdateTime);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save the user-defined update time
                String updateTime = editTextUpdateTime.getText().toString();
                SharedPreferencesManager.saveUpdateTime(SettingsActivity.this, updateTime);
                Toast.makeText(SettingsActivity.this, "Update time saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

