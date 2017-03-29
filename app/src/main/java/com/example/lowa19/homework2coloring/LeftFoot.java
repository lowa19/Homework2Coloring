package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class LeftFoot extends Shapes {

    public LeftFoot(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawRect(475,1125,675,1325, getShapePaint());
    }

}
