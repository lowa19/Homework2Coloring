package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by kaleolow on 3/28/17.
 */

public class Retina extends Shapes {
    public Retina(String initName, Paint initPaint) {
        super(initName, initPaint);
    }
    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawCircle(1005,475,20, getShapePaint()); //left eye
        canvas.drawCircle(505,475,20, getShapePaint()); //right eye
    }
}
