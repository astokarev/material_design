package study.materialdesign.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.materialdesign.R;

public class VegetablesFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_vegetables, container, false);
        Vegetables1 fragment1 = Vegetables1.newInstance(null);
        Vegetables2 fragment2 = Vegetables2.newInstance(null);
        Vegetables3 fragment3 = Vegetables3.newInstance(null);


        VegetablesAdapter myAdapter = new VegetablesAdapter(getFragmentManager());
        myAdapter.addFragment(fragment1, "vegetables1");
        myAdapter.addFragment(fragment2, "vegetables2");
        myAdapter.addFragment(fragment3, "vegetables3");


        ViewPager viewPager = fragmentView.findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabLayout = fragmentView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        return fragmentView;
    }


}

