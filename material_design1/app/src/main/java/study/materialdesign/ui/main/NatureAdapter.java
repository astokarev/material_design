package study.materialdesign.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import study.materialdesign.R;

class NatureAdapter extends RecyclerView.Adapter<NatureAdapter.MyViewHolder> {
    private Context context;
    private List<String> list;


    NatureAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public NatureAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new NatureAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NatureAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;


        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        void bind(int position) {
            textView.setText(list.get(position));
            switch (position % 4) {
                case 0:
                    imageView.setImageResource(R.drawable.nature_1);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.nature_2);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.nature_3);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.nature_4);
                    break;
            }
        }
    }
}
