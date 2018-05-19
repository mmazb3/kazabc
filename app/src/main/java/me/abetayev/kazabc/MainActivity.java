package me.abetayev.kazabc;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.container) FrameLayout fragmentContainer;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortedlist_exploration);
        mUnbinder = ButterKnife.bind(this);
        Fragment fragment = SortedListFragment.create();
        getFragmentManager().beginTransaction().add(fragmentContainer.getId(), fragment).commit();
    }

    @Override protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }
}
