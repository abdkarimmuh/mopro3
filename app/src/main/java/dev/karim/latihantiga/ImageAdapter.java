package dev.karim.latihantiga;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Karim on 10/11/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] gambar = {
            R.mipmap.andro, R.mipmap.karim, R.mipmap.bike,
            R.mipmap.bike, R.mipmap.karim, R.mipmap.andro
    };

    public ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int position) {
        return gambar[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(gambar[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(160, 160));
        return imageView;
    }
}
