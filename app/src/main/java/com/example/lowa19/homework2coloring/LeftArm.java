package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class LeftArm extends Shapes {
    Path leftArm;

    public LeftArm(String initName, Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        leftArm = new Path();
        leftArm.setFillType(Path.FillType.EVEN_ODD);
        leftArm.moveTo(225, 725);
        leftArm.lineTo(371, 1079);
       // leftArm.moveTo(371, 1079);
        leftArm.lineTo(175, 1079);
      //  leftArm.moveTo(175, 1079);
        leftArm.lineTo(225, 725);
        leftArm.close();
        canvas.drawPath(leftArm, getShapePaint());
    }
}
