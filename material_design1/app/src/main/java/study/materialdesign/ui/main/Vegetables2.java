package study.materialdesign.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.materialdesign.R;

public class Vegetables2 extends Fragment {

    public static Vegetables2 newInstance(Bundle bundle) {
        Vegetables2 currentFragment = new Vegetables2();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vegetables_2, container, false);
    }
}
