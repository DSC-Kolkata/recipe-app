package com.example.knightcube.recipeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knightcube.recipeapp.R;
import com.example.knightcube.recipeapp.models.Step;
import com.example.knightcube.recipeapp.ui.StepDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Rajat Kumar Gupta on 27/06/2018.
 */
public class StepsAdapter extends RecyclerView.Adapter<StepsAdapter.StepsViewHolder> {

    private boolean twoPane;
    private List<Step> stepList;
    private Context context;

    public StepsAdapter(List<Step> stepsList, Context context, boolean twoPane) {
        this.stepList = stepsList;
        this.context = context;
        this.twoPane = twoPane;
    }

    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            Step step = (Step) view.getTag();
//            if (twoPane) {
//                Bundle arguments = new Bundle();
//                arguments.putParcelable(StepDetailFragment.ARG_ITEM_ID, step);
//                StepDetailFragment fragment = new StepDetailFragment();
//                fragment.setArguments(arguments);
//                ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.step_detail_container, fragment)
//                        .commit();
//            } else {
//                Intent intent = new Intent(context, StepDetailActivity.class);
//                intent.putExtra(StepDetailFragment.ARG_ITEM_ID, step);
//                context.startActivity(intent);
//            }
        }
    };

    @NonNull
    @Override
    public StepsAdapter.StepsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_steps, parent, false);
        return new StepsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StepsAdapter.StepsViewHolder holder, int position) {
        holder.stepShortDescriptionTxt.setText(stepList.get(position).getShortDescription());
        holder.stepLongDescriptionTxt.setText(stepList.get(position).getDescription());
        holder.itemView.setTag(stepList.get(position));
        if (!stepList.get(position).getThumbnailURL().trim().equals("")) {
            Picasso.get().load(stepList.get(position)
                    .getThumbnailURL())
                    .placeholder(R.drawable.default_cake_bg)
                    .error(R.drawable.default_cake_bg)
                    .into(holder.stepImageView);
        } else{
            Picasso.get()
                    .load(R.drawable.default_cake_bg)
                    .into(holder.stepImageView);
        }

    }

    @Override
    public int getItemCount() {
        return stepList.size();
    }

    public class StepsViewHolder extends RecyclerView.ViewHolder {
        private TextView stepShortDescriptionTxt;
        private TextView stepLongDescriptionTxt;
        private ImageView stepImageView;

        StepsViewHolder(View itemView) {
            super(itemView);
            stepShortDescriptionTxt = itemView.findViewById(R.id.step_short_description);
            stepLongDescriptionTxt = itemView.findViewById(R.id.step_long_description);
            stepImageView = itemView.findViewById(R.id.recipe_video_thumbnail);
            itemView.setOnClickListener(mOnClickListener);
        }
    }
}
