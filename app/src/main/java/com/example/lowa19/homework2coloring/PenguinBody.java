package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by lowa19 on 3/25/2017.
 */
public class PenguinBody extends Shapes {
    private final int circleXY = 725;
    private final int circleRad = 500;


    public PenguinBody(String initName, Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawCircle(circleXY, circleXY, circleRad, getShapePaint());
    }
}
