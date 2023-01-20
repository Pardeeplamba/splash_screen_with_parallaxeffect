package com.project.splashscreen;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class IntroAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public IntroAdapter(Context context) {
        this.context = context;
    }
    int title[]={
            R.string.title1,
            R.string.title2,
            R.string.title3,
            R.string.title4
    };
    int disc[]={
            R.string.disc1,
            R.string.disc2,
            R.string.disc3,
            R.string.disc4
    };
    int images[]={
            R.drawable.splashlogo,
            R.drawable.pizza,
            R.drawable.hamburger,
            R.drawable.frenchfries
    };


    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

            layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View v=layoutInflater.inflate(R.layout.intro_items,container,false);
            ImageView image=v.findViewById(R.id.introimg);
            TextView text=v.findViewById(R.id.introtext);
            TextView textdis=v.findViewById(R.id.introdis);

            image.setImageResource(images[position]);
            text.setText(title[position]);
            textdis.setText(disc[position]);
            container.addView(v);
            return v;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
