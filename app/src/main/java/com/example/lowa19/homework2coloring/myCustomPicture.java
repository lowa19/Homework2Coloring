package com.example.lowa19.homework2coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by lowa19 on 3/28/2017.
 */
public class myCustomPicture extends SurfaceView{

    private Beak beak;
    private Eyes eyes;
    private Retina innerEyes;
    private LeftArm leftArm;
    private RightArm rightArm;
    private PenguinBody body;
    private RightFoot rightFoot;
    private LeftFoot leftFoot;
    private Shapes currentShape;
    private Shapes background;
    public Paint yellow_paintbrush_fill, white_paintbrush_fill, black_paintbrush_fill;;
    private MainActivity myActivity;

    public myCustomPicture(Context context, MainActivity initActivity) {
        super(context);
        setWillNotDraw(false);
        myActivity = initActivity;
    }
    public myCustomPicture(Context context, AttributeSet attributeSet, MainActivity initActivity)
    {
        super(context, attributeSet);
        setWillNotDraw(false);
        myActivity = initActivity;
    }
    public myCustomPicture(Context context, AttributeSet attributeSet, int i, MainActivity initActivity)
    {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        myActivity = initActivity;
    }
    /**
     *  This creates each shape object and draws them on the surface view
     *  with initial colors created in this method as well
     * @param canvas
     */
    @Override
    public void onDraw(Canvas canvas) {
        yellow_paintbrush_fill = new Paint();
        yellow_paintbrush_fill.setColor(Color.YELLOW);
        yellow_paintbrush_fill.setStyle(Paint.Style.FILL);
        black_paintbrush_fill = new Paint();
        black_paintbrush_fill.setColor(Color.BLACK);
        black_paintbrush_fill.setStyle(Paint.Style.FILL);
        white_paintbrush_fill = new Paint();
        white_paintbrush_fill.setColor(Color.WHITE);
        white_paintbrush_fill.setStyle(Paint.Style.FILL);

        body = new PenguinBody("Body", black_paintbrush_fill);
        body.drawShape(canvas);
        eyes = new Eyes("Eyes", white_paintbrush_fill);
        eyes.drawShape(canvas);
        leftArm = new LeftArm("Left Arm", black_paintbrush_fill);
        leftArm.drawShape(canvas);
        rightArm = new RightArm("Right Arm", black_paintbrush_fill);
        rightArm.drawShape(canvas);
        leftFoot = new LeftFoot("Left Foot", yellow_paintbrush_fill);
        leftFoot.drawShape(canvas);
        rightFoot = new RightFoot("Right Foot", yellow_paintbrush_fill);
        rightFoot.drawShape(canvas);
        beak = new Beak("Beak", yellow_paintbrush_fill);
        beak.drawShape(canvas);
        innerEyes = new Retina("Eyes", black_paintbrush_fill); //retinas for aesthetics, never modified
        innerEyes.drawShape(canvas);
        background = new Shapes("No shapes selected",white_paintbrush_fill);
    }
    /**
     *
     * @param x x coordinate from touch event
     * @param y y coordinate from touch event
     * @return corresponding shape to the touch
     */
    public Shapes getShape(int x, int y)
    {
        if(eyeTouch(x,y))
        {
            return this.eyes;
        }
        else if (beakTouch(x,y))
        {
            return this.beak;
        }
        else if (leftArmTouch(x,y))
        {
            return this.leftArm;
        }
        else if(rightArmTouch(x,y))
        {
            return this.rightArm;
        }
        else if(leftFootTouch(x,y))
        {
            return this.leftFoot;
        }
        else if (rightFootTouch(x,y))
        {
            return this.rightFoot;
        }
        else if (bodyTouch(x,y))
        {
            return this.body;
        }
        else //if background click, return 'null' shape
        {
            return this.background;
        }
    }

    /**
     *
     * @param shape sets the current shape
     */
    public void setCurrentShape(Shapes shape)
    {
        this.currentShape = shape;
    }

    /**
     * @return returns the last current shape
     */
    public Shapes getCurrentShape()
    {
            return this.currentShape;
    }

    /**
     *The following methods check if a certain shape is touched given the x and y coordinates
     * Slightly inaccurate because using rectangles to approximate click
     */
    public boolean eyeTouch(int x, int y)
    {
        int yCoor= 475;
        int radius = 50;
        int xLeft = 475;
        int xRight = 975;

        if(x>xLeft-radius && x<xLeft+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else if (x>xRight-radius && x<xRight+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean beakTouch(int x, int y)
    {
        int leftPointX = 600;
        int rightPointX = 850;
        int leftAndRightY = 725;
        int middlePointY = 800;

        if(x>leftPointX && x<rightPointX && y>leftAndRightY && y<middlePointY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean leftArmTouch(int x, int y)
    {
        int xMin = 175;
        int xMax = 371;
        int yMin = 725;
        int yMax = 1079;
        if(x>xMin && x<xMax && y>yMin && y<yMax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean rightArmTouch(int x, int y)
    {
        int xMin = 1079;
        int xMax = 1275;
        int yMin = 725;
        int yMax = 1079;

        if(x>xMin && x<xMax && y>yMin && y<yMax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean leftFootTouch(int x, int y)
    {
        int xMin = 475;
        int xMax = 625;
        int yMin = 1175;
        int yMax = 1325;

        if(x>xMin && x<xMax && y>yMin && y<yMax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean rightFootTouch(int x, int y)
    {
        int xMin = 775;
        int xMax = 975;
        int yMin = 1175;
        int yMax = 1325;

        if(x>xMin && x<xMax && y>yMin && y<yMax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean bodyTouch(int x, int y)
    {
        int yCoor= 725;
        int radius = 500;
        int xCoor = 725;
        if(x>xCoor-radius && x<xCoor+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
