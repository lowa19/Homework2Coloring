package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by kaleolow on 3/25/17.
 */

public class Eyes extends Shapes {
    private final int yCoor= 475;
    private final int radius = 50;
    private final int xLeft = 475;
    private final int xRight = 975;

    public Eyes(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawCircle(xLeft, yCoor, radius, getShapePaint()); //left eye
        canvas.drawCircle(xRight, yCoor, radius, getShapePaint()); //right eye
    }
}
