package study.materialdesign.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import study.materialdesign.R;

public class NatureFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_nature, container, false);
        initRecyclerView(fragmentView);
        return fragmentView;
    }

    public void initRecyclerView(View fragmentView) {
        RecyclerView recyclerView = fragmentView.findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Data data = new Data();
        NatureAdapter mAdapter = new NatureAdapter(getContext(), data.getNatureList());
        recyclerView.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getContext()), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
    }
}
