package edu.rosehulman.bullethell;

import java.util.ArrayList;

import android.graphics.Bitmap;

public class WeakEnemyLeft extends IEnemyShip {

	
	public WeakEnemyLeft(Bitmap bitmap,int width, int height){
		this.setX(1);
		this.setY(1);
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(0,0));
		points.add(new Point(width*3/4,height/2));
		points.add(new Point(width*3/4,height/4));
		points.add(new Point(-100,height/4));
		this.setMove_speed(4);
		this.setPointList(points);
		this.setBitmap(bitmap);
	}
}
