package com.jainish.solanki.assignment_trial_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImaeView;
    TextView mTitle, mDes;
    ItemClickListener itemClickListener;


    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImaeView = itemView.findViewById(R.id.imageIv);
        this.mTitle = itemView.findViewById(R.id.titleTv);
        this.mDes = itemView.findViewById(R.id.descriptionTv);


    }
}