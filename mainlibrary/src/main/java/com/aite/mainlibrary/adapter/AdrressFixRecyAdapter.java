package com.aite.mainlibrary.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aite.mainlibrary.R;
import com.aite.mainlibrary.R2;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdrressFixRecyAdapter extends RecyclerView.Adapter<AdrressFixRecyAdapter.ViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    private int[] imgs;
    private String[] names;

    public AdrressFixRecyAdapter(Context context, int[] imgs, String[] names) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.imgs = imgs;
        this.names = names;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_sosuser_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.tv_bankname.setText(banknames.get(position));
//        holder.tv_banknumber.setText(banknumbers.get(position));
//        holder.swipeMenuLayout

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static
    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R2.id.tv_namephone)
        TextView tvNamephone;
        @BindView(R2.id.tv_address)
        TextView tvAddress;
        @BindView(R2.id.tv_edit)
        TextView tvEdit;
        @BindView(R2.id.tv_delete)
        TextView tvDelete;
        @BindView(R2.id.swipeMenuLayout)
        SwipeMenuLayout swipeMenuLayout;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }

}