package com.example.android.dewizsaqia_1202150265_modul3;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by ASUS on 2/24/2018.
 */

public class RecycleMineral extends RecyclerView.Adapter<RecycleMineral.MineralHolder> {

    private final LinkedList<String> title;
    private final LinkedList<String> descrip;
    private final LinkedList<Integer> photo;

    private LayoutInflater inflate;


    public RecycleMineral(Context context, LinkedList<String> nTitle, LinkedList<String> nDesc, LinkedList<Integer> nPhotos) {
        inflate=LayoutInflater.from(context);
        this.title=nTitle;
        this.descrip=nDesc;
        this.photo=nPhotos;
    }

    @Override
    public MineralHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listView=inflate.inflate(R.layout.mineral,parent,false);
        return new MineralHolder(listView,this);
    }

    @Override
    public void onBindViewHolder(MineralHolder ViewHolder , int position) {
        String CurrentTitle=title.get(position);
        String CureentDesc=descrip.get(position);
        Integer CurrentPhoto=photo.get(position);

        ViewHolder.Title.setText(CurrentTitle);
        ViewHolder.Desc.setText(CureentDesc);
        ViewHolder.image.setImageResource(CurrentPhoto);


    }

    @Override
    public int getItemCount() {
        return photo.size();
    }

    public class MineralHolder extends RecyclerView.ViewHolder {

        private final TextView Title;
        private final TextView Desc;
        private final ImageView image;

        final RecycleMineral madapter;
        public MineralHolder(final View itemView, RecycleMineral madapter1) {
            super(itemView);
            Title=(TextView)itemView.findViewById(R.id.Title);
            Desc=(TextView)itemView.findViewById(R.id.descrip);
            image=(ImageView)itemView.findViewById(R.id.photo);

            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();

                    String titles= title.get(position);
                    String desc = descrip.get(position);
                    Integer photos = photo.get(position);

                    Intent intent= new Intent(itemView.getContext(),DetailDrink.class);
                    intent.putExtra("title",titles);
                    intent.putExtra("desc",desc);
                    intent.putExtra("photo",photos);

                    itemView.getContext().startActivity(intent);

                }
            });
            this.madapter=madapter1;

        }
    }
}
