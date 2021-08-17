package study.materialdesign.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.materialdesign.R;

public class Vegetables1 extends Fragment {

    public static Vegetables1 newInstance(Bundle bundle) {
        Vegetables1 currentFragment = new Vegetables1();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vegetables_1, container, false);
    }
}
