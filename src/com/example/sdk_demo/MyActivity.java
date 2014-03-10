package com.example.sdk_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import com.onyx.android.sdk.ui.dialog.DialogReaderMenu;

public class MyActivity extends Activity {

    private DialogReaderMenu mReaderMenu = null;
    private GestureDetector gestureDetector;
    SurfaceView surfaceView;
    SurfaceHolder holder;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        gestureDetector = new GestureDetector(this, new MyOnGestureListener());
        surfaceView = (SurfaceView) this.findViewById(R.id.surfaceView);
        surfaceView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });
    }

    class MyOnGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            if (mReaderMenu == null) {
                mReaderMenu = new DialogReaderMenu(MyActivity.this, new EInkReaderMenuHandler(MyActivity.this));
            }
            mReaderMenu.show();
            return false;
        }
    }
}
