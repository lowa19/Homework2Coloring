package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class RightArm extends Shapes {
    Path rightArm;

    public RightArm(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        rightArm = new Path();
        rightArm.setFillType(Path.FillType.EVEN_ODD);
        rightArm.moveTo(1225, 725);
        rightArm.lineTo(1079, 1079);
        //rightArm.moveTo(1079, 1079);
        rightArm.lineTo(1275, 1079);
        //rightArm.moveTo(1275, 1079);
        rightArm.lineTo(1225, 725);
        rightArm.close();
        canvas.drawPath(rightArm, getShapePaint());
    }
}
