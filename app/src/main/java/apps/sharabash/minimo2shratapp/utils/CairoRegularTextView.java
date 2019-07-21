package apps.sharabash.minimo2shratapp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class CairoRegularTextView extends AppCompatTextView {


    public CairoRegularTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CairoRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CairoRegularTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Cairo-Regular.ttf");
        setTypeface(tf);

    }

}
