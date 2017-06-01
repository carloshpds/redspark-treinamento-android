package io.redspark.gestta.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by marcuscosta on 01/06/17.
 */

public class GestaTextView extends android.support.v7.widget.AppCompatTextView {

    public GestaTextView(Context context) {
        super(context);

        initialize(context);
    }

    public GestaTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initialize(context);
    }

    public GestaTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initialize(context);
    }

//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//    public GestaTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//
//        initialize(context);
//    }

    private void initialize(Context context) {
        if(!isInEditMode()) {
            String typefacePath = "fonts/Roboto-Regular.ttf";
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), typefacePath);

            if(typeface != null) {
                setTypeface(typeface);
            }
        }
    }
}
