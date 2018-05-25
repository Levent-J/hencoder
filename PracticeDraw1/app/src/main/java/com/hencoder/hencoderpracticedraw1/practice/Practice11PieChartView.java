package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint mPaint = new Paint();

        canvas.translate(getWidth()/2,getHeight()/2);
        RectF rectF = new RectF(-400,-400,400,400);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF,0,20,true,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawArc(rectF,20,20,true,mPaint);

        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF,40,45,true,mPaint);

        mPaint.setColor(Color.parseColor("#10c659"));
        canvas.drawArc(rectF,85,125,true,mPaint);

        mPaint.setColor(Color.parseColor("#ea7425"));
        canvas.drawArc(rectF,210,100,true,mPaint);

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(rectF,310,50,true,mPaint);
    }
}
