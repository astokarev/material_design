package study.materialdesign.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import study.materialdesign.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickButton(View view) {
        EditText editText = findViewById(R.id.edit_text);
        Intent intent = new Intent(this, SecondActivity.class);
        if (editText.getText().toString().equals("")) {
            Snackbar.make(view, "Write text in edittext!", Snackbar.LENGTH_LONG)
                    .setAction("Cancel", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d(TAG, "onClick: ");
                        }
                    }).show();
        } else {
            startActivity(intent);
        }
    }

    public void onClickButtonClosed(View view) {
        finish();
    }
}
