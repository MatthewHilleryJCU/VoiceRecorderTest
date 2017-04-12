package au.com.hillnet.voicerecordertest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        this.setTitle("Colour Settings");
        preferences = getSharedPreferences("colours", MODE_PRIVATE);

        Button buttonAqua = (Button) findViewById(R.id.buttonAqua);
        buttonAqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.aqua)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        Button buttonBlack = (Button) findViewById(R.id.buttonBlack);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.black)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        Button buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.blue)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        Button buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.green)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        Button buttonGrey = (Button) findViewById(R.id.buttonGrey);
        buttonGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.grey)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        Button buttonLime = (Button) findViewById(R.id.buttonLime);
        buttonLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.lime)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        Button buttonMaroon = (Button) findViewById(R.id.buttonMaroon);
        buttonMaroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.maroon)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        Button buttonNavy = (Button) findViewById(R.id.buttonNavy);
        buttonNavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.navy)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        Button buttonOlive = (Button) findViewById(R.id.buttonOlive);
        buttonOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.olive)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        Button buttonPurple = (Button) findViewById(R.id.buttonPurple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.purple)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

    }
}
