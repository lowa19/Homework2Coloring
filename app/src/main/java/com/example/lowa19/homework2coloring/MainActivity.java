package com.example.lowa19.homework2coloring;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {
    myCustomPicture myPictureLayout; //surface view
    private SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    private TextView redText, greenText, blueText, selectedElement;
    Paint  changedPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references to views on GUI
        myPictureLayout = (myCustomPicture) findViewById(R.id.surfaceView);
        redSeekBar = (SeekBar) findViewById(R.id.rSeekBar);
        redText = (TextView) findViewById(R.id.redText);
        greenSeekBar = (SeekBar) findViewById(R.id.gSeekBar);
        greenText = (TextView) findViewById(R.id.greenText);
        blueSeekBar = (SeekBar) findViewById(R.id.bSeekBar);
        blueText = (TextView) findViewById(R.id.blueText);
        selectedElement = (TextView) findViewById(R.id.currElement);

        //register listeners
        //TouchListener myTouchListener = new TouchListener(this);
        myPictureLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int xcoor = (int) event.getX();
                int ycoor = (int) event.getY();
                myPictureLayout.setCurrentShape(myPictureLayout.getShape(xcoor, ycoor));
                int r, g, b;
                //get the RGB values of the current shape
                r = myPictureLayout.getCurrentShape().getShapeRed();
                g = myPictureLayout.getCurrentShape().getShapeGreen();
                b = myPictureLayout.getCurrentShape().getShapeBlue();
                //set the text views to the name of the selected shape and its RGB values
                selectedElement.setText(myPictureLayout.getCurrentShape().getName()); //display name of body part tapped
                redText.setText(Integer.toString(r));
                greenText.setText(Integer.toString(g));
                blueText.setText(Integer.toString(b));
                //set the seek bars to the right positions
                setRedSeekBar(r);
                setGreenSeekBar(g);
                setBlueSeekBar(b);
                return false;
            }
        });
        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //set the paint to the changed seekbar value
                changedPaint.setColor(Color.rgb(progress, myPictureLayout.getCurrentShape().getShapeGreen(), myPictureLayout.getCurrentShape().getShapeBlue()));
                changedPaint.setStyle(Paint.Style.FILL);
                //sets the shape to the new paint and the textview to new value
                myPictureLayout.getCurrentShape().setShapePaint(changedPaint);
                redText.setText("Red Value = " + progress);
                myPictureLayout.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                changedPaint.setColor(Color.rgb(myPictureLayout.getCurrentShape().getShapeRed(), seekBar.getProgress(), myPictureLayout.getCurrentShape().getShapeBlue()));
                changedPaint.setStyle(Paint.Style.FILL);
                myPictureLayout.getCurrentShape().setShapePaint(changedPaint);
                greenText.setText("Green Value = " + progress);
                myPictureLayout.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                changedPaint.setColor(Color.rgb(myPictureLayout.getCurrentShape().getShapeRed(), myPictureLayout.getCurrentShape().getShapeGreen(), seekBar.getProgress()));
                changedPaint.setStyle(Paint.Style.FILL);
                myPictureLayout.getCurrentShape().setShapePaint(changedPaint);
                blueText.setText("Blue Value = " + progress);
                myPictureLayout.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    //GETTER AND SETTER METHODS
    public void setRedSeekBar(int i) {
        redSeekBar.setProgress(i);
    }

    public void setGreenSeekBar(int i) {
        greenSeekBar.setProgress(i);
    }

    public void setBlueSeekBar(int i) {
        blueSeekBar.setProgress(i);
    }

}