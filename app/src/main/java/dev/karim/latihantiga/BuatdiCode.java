package dev.karim.latihantiga;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Karim on 10/6/2017.
 */

public class BuatdiCode extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout rl = new RelativeLayout(this);
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams tvParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        tvParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        tv.setText("Bismillah\nAssalamua\'alaykum");
        rl.addView(tv, tvParams);
        setContentView(rl);
    }
}
