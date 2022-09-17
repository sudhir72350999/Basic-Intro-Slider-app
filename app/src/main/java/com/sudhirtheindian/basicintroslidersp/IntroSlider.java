package com.sudhirtheindian.basicintroslidersp;

import android.content.Context;
import android.os.Bundle;

import androidx.core.content.ContextCompat;

//public class IntroSlider {
//}
public class IntroSlider extends AppIntro {

    // we are calling on create method
    // to generate the view for our java file.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // below line is for adding the new slide to our app.
        // we are creating a new instance and inside that
        // we are adding the title, description, image and
        // background color for our slide.
        // below line is use for creating first slide
        addSlide(AppIntroFragment.newInstance("C++", "C++ Self Paced Course",
                R.drawable.gfgimage, ContextCompat.getColor(getApplicationContext(), R.color.purple_200)));

        // below line is for creating second slide.
        addSlide(AppIntroFragment.newInstance("DSA", "Data Structures and Algorithms", R.drawable.gfgimage,
                ContextCompat.getColor(getApplicationContext(), R.color.purple_200)));

        // below line is use to create third slide.
        addSlide(AppIntroFragment.newInstance("Java", "Java Self Paced Course", R.drawable.gfgimage,
                ContextCompat.getColor(getApplicationContext(), R.color.purple_200)));
    }


}
