package dev.karim.latihantiga;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by Karim on 10/11/2017.
 */

public class GridActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grid);
        GridView gv = (GridView) findViewById(R.id.gridview1);
        gv.setAdapter(new ImageAdapter(this));
    }
}
