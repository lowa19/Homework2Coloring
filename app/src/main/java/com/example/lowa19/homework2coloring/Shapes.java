package com.example.lowa19.homework2coloring;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by lowa19 on 3/28/2017.
 */
public class Shapes {
    private Paint shapePaint;
    private String shapeName;
    public Shapes(String initName, Paint initPaint)
    {
        this.shapeName = initName;
        this.shapePaint = initPaint;
    }
    public String getName()
    {
        return this.shapeName;
    }

    public Paint getShapePaint() {return this.shapePaint;}

    public void setShapePaint(Paint paint)
    {
        this.shapePaint = paint;
    }

    public int getShapeRed()
    {
        return Color.red(shapePaint.getColor());
    }
    public int getShapeGreen()
    {
        return Color.green(shapePaint.getColor());
    }
    public int getShapeBlue()
    {
        return Color.blue(shapePaint.getColor());
    }

    public void drawShape(Canvas canvas)
    {
    }
}