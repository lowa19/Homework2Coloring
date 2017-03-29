package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class RightFoot extends Shapes {

    public RightFoot(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawRect(775,1125,975,1325, getShapePaint());
    }

}
