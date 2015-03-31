package com.cyo.ex3_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by USER on 2015/3/30.
 */
public class RectBar extends View {
    private Paint paint = new Paint();
    private String shape = "";

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public RectBar(Context context) {
        super(context);
    }

    public RectBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int ViewHight = getHeight();
        int ViewWidth = getWidth();
        if (shape.equals("Round"))
//            傳入的setShape為Round則畫圓
            canvas.drawCircle(ViewWidth / 4, ViewHight / 4, 155f, paint);
        else if (shape.equals("Square"))
//            傳入的setShape為Square則畫方
            canvas.drawRect(ViewWidth / 8, ViewHight / 8, ViewWidth / 2, ViewWidth / 2, paint);


    }
}


