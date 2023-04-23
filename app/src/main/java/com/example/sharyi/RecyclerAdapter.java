package com.example.sharyi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataHolder> {

    Activity activity;
    String[] shryi;
    TextToSpeech t1;



    public RecyclerAdapter(MainActivity Activity, String[] shyari) {

        this.activity = Activity;
        this.shryi = shyari;
    }

    @NonNull
    @Override
    public RecyclerAdapter.DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(activity).inflate(R.layout.shyri,parent,false);

        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.DataHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.textView.setText(shryi[position]);
        t1=new TextToSpeech(activity, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(new Locale("gu","in"));
                }
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                t1.speak(shryi[position], TextToSpeech.QUEUE_FLUSH, null);

            }
        });


    }

    @Override
    public int getItemCount() {
        return shryi.length;
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public DataHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.txt_list);
        }
    }
}
