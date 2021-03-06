package com.example.testapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView {

	private SurfaceHolder surfaceHolder;
	private Bitmap bmp;

	public GameView(Context context) {
		super(context);
		surfaceHolder = getHolder();
		surfaceHolder.addCallback(new SurfaceHolder.Callback() {

			public void surfaceDestroyed(SurfaceHolder holder) {

			}

			public void surfaceCreated(SurfaceHolder holder) {
				Canvas theCanvas = surfaceHolder.lockCanvas(null);
				draw(theCanvas);
				surfaceHolder.unlockCanvasAndPost(theCanvas);
			}

			public void surfaceChanged(SurfaceHolder holder, int format,
					int width, int height) {

			}
		});
		bmp = BitmapFactory.decodeResource(getResources(),
				R.drawable.ic_launcher);
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawColor(Color.DKGRAY);
		canvas.drawBitmap(bmp, 25, 66, null);
	}

}
