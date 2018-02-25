package com.example.android.dewizsaqia_1202150265_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class ListMineral extends AppCompatActivity {

    private final LinkedList<String> nTitle= new LinkedList<>();
    private final LinkedList<String> nDesc= new LinkedList<>();
    private final LinkedList<Integer> nPhotos= new LinkedList<>();

    private RecycleMineral madapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mineral);

        data();

       RecyclerView recycle=(RecyclerView)findViewById(R.id.recycle);
       madapter=new RecycleMineral(this, nTitle,nDesc,nPhotos);
       recycle.setAdapter(madapter);
       recycle.setLayoutManager(new LinearLayoutManager(this ));

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            recycle.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            recycle.setLayoutManager(new LinearLayoutManager(this));
        }
    }
    private void data (){
        nTitle.add("Aqua");
        nTitle.add("Cleo");
        nTitle.add("Club");
        nTitle.add("Equil");
        nTitle.add("Evian");
        nTitle.add("Leminerale");
        nTitle.add("Nestle");
        nTitle.add("Pristine");
        nTitle.add("Vit");

        nDesc.add("Ini adalah air minum merk Aqua");
        nDesc.add("Ini adalah air minum merk Cleo");
        nDesc.add("Ini adalah air minum merk Club");
        nDesc.add("Ini adalah air minum merk Equil");
        nDesc.add("Ini adalah air minum merk Evian");
        nDesc.add("Ini adalah air minum merk Leminerale");
        nDesc.add("Ini adalah air minum merk Nestle");
        nDesc.add("Ini adalah air minum merk Pristine");
        nDesc.add("Ini adalah air minum merk Vit");

        nPhotos.add(R.drawable.aqua);
        nPhotos.add(R.drawable.cleo);
        nPhotos.add(R.drawable.club);
        nPhotos.add(R.drawable.equil);
        nPhotos.add(R.drawable.evian);
        nPhotos.add(R.drawable.leminerale);
        nPhotos.add(R.drawable.nestle);
        nPhotos.add(R.drawable.pristine);
        nPhotos.add(R.drawable.vit);



    }

}
