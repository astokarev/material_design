package study.materialdesign.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.materialdesign.R;

public class Vegetables3 extends Fragment {

    public static Vegetables3 newInstance(Bundle bundle) {
        Vegetables3 currentFragment = new Vegetables3();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vegetables_3, container, false);
    }
}
