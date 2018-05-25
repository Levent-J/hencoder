package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint mPaint = new Paint();
        mPaint.setStrokeWidth(5);

        canvas.translate(200,600);

        Path path = new Path();
        path.moveTo(0,-400);
        path.lineTo(0,0);
        path.lineTo(800,0);


        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        canvas.drawPath(path,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(50,-10,150,0,mPaint);
        canvas.drawRect(200,-200,300,0,mPaint);
        canvas.drawRect(350,-400,450,0,mPaint);
        canvas.drawRect(500,-150,600,0,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(40);
        canvas.drawText("aaa",50,50,mPaint);
        canvas.drawText("bbb",200,50,mPaint);
        canvas.drawText("ccc",350,50,mPaint);
        canvas.drawText("ddd",500,50,mPaint);

    }
}
