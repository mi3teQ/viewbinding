package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;
    Switch WylaczNick, WylaczImie, WylaczNazwe, WylaczWiek, WylaczNumer, WylaczEmail;
    EditText PodajNick, PodajImie, PodajNazwe, PodajWiek, PodajNumer, PodajEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        WylaczNick = (Switch) findViewById(R.id.WylaczNick);
        WylaczImie = (Switch) findViewById(R.id.WylaczImie);
        WylaczNazwe = (Switch) findViewById(R.id.WylaczNazwe);
        WylaczWiek = (Switch) findViewById(R.id.WylaczWiek);
        WylaczNumer = (Switch) findViewById(R.id.WylaczNumer);
        WylaczEmail = (Switch) findViewById(R.id.WylaczEmail);

        PodajNick = (EditText) findViewById(R.id.PodajNick);
        PodajImie = (EditText) findViewById(R.id.PodajImie);
        PodajNazwe = (EditText) findViewById(R.id.PodajNazwe);
        PodajWiek = (EditText) findViewById(R.id.PodajWiek);
        PodajNumer = (EditText) findViewById(R.id.PodajNumer);
        PodajEmail = (EditText) findViewById(R.id.PodajEmail);


        WylaczNick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajNick.setEnabled(false);
                }else{
                    PodajNick.setEnabled(true);
                }
            }
        });

        WylaczImie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajImie.setEnabled(false);
                }else{
                    PodajImie.setEnabled(true);
                }
            }
        });
        WylaczNazwe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajNazwe.setEnabled(false);
                }else{
                    PodajNazwe.setEnabled(true);
                }
            }
        });
        WylaczWiek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajWiek.setEnabled(false);
                }else{
                    PodajWiek.setEnabled(true);
                }
            }
        });
        WylaczNumer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajNumer.setEnabled(false);
                }else{
                    PodajNumer.setEnabled(true);
                }
            }
        });
        WylaczEmail.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    PodajEmail.setEnabled(false);
                }else{
                    PodajEmail.setEnabled(true);
                }
            }
        });
    }
}