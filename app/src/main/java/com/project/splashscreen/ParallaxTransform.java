package com.project.splashscreen;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

public class ParallaxTransform implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        if (position>=-1 && position<=1)
        {
            page.findViewById(R.id.introimg).setTranslationX(-position * page.getWidth()/4);
            page.findViewById(R.id.introtext).setTranslationX(-position * page.getWidth()/6);
            page.findViewById(R.id.introdis).setTranslationX(-position * page.getWidth()/20);

//            page.setAlpha(1);

        }
        else
            page.setAlpha(1);
    }
}
