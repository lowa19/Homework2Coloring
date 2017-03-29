package com.example.lowa19.homework2coloring;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class Beak extends Shapes {

    Path nose;

    public Beak(String initName , Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        nose = new Path();
        nose.setFillType(Path.FillType.EVEN_ODD);
        nose.moveTo(600, 725);
        nose.lineTo(850, 725);
        //nose.moveTo(850, 725);
        nose.lineTo(725, 850);
        //nose.moveTo(725, 850);
        nose.lineTo(600, 725);
        nose.close();
        canvas.drawPath(nose, this.getShapePaint());
    }
}
