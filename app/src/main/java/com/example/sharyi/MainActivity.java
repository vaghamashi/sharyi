package com.example.sharyi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] shyari = new String[]{"દિલની જીદ છે તું જ નહિતર,આ આંખોએ તો ઘણા લોકોને જોયા છે."
     ,"આટલું Attitude ન બતાવો, પગલી મારા ફોનની બેટરી પણ તમારા કરતા વધુ હોટ છે..!!",
            "હું સારો છું તો સારો જ રહેવા દોજો તે ખરાબ થઈ જઇશ, તો સહન કરવાની ક્ષમતા ઓકાત નથી તારામાં..!!",
            "સુંદર હોવું જરૂરી નથી કોઈ માટે જરૂરી હોવું સુંદર છે",
    "વાંઘો નહી તારી વફા નહી મળી મને દુઆ કરૂ કે કોઇ બેવફા ન મળે તને",
    "ખૂબ દૂર સુધી જવું પડે, ફક્ત એ જાણવા માટે કે આપણી નજીક કોણ છે",
    "ભરોસો અને આશીર્વાદ કયારેય દેખાતા નથી પણ તે અસંભવ ને સંભવ બનાવી દે છે..!","સમજાતું નથી જિંદગી છે કે જલેબી,\n" +
            "મીઠી તો લાગે છે પણ ગૂંચવાડા બહુ છે "};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyler);


        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        RecyclerAdapter adapter = new RecyclerAdapter(MainActivity.this,shyari);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);





    }
}