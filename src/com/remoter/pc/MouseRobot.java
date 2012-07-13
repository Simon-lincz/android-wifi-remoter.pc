package com.remoter.pc;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseRobot extends Robot{
	
	public MouseRobot() throws AWTException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public  void mouseMove(float x_delta, float y_delta) {
		// TODO Auto-generated method stub
		Point p = MouseInfo.getPointerInfo().getLocation();
		float time = 1;
		for(int i = 1; i <= time;i++){
		   this.mouseMove(p.x+(int)(x_delta),p.y+(int)(y_delta));
		   this.delay(1);   // only by this method, can the mouse move frequently
		}
	}
		
	public void mouseleftclick(){
		 this.setAutoDelay(0);
		 mousePress(InputEvent.BUTTON1_MASK);
		 mouseRelease(InputEvent.BUTTON1_MASK);
	}
		
	public void mousewheelclick(){
		 this.setAutoDelay(0);
		 mousePress(InputEvent.BUTTON2_MASK);
		 mouseRelease(InputEvent.BUTTON2_MASK);
	}
		
	public void mouserightclick(){
		 this.setAutoDelay(0);
		 mousePress(InputEvent.BUTTON3_MASK);
		 mouseRelease(InputEvent.BUTTON3_MASK);
	}
		
	@Override
	public synchronized void mouseWheel(int arg0) {
		// TODO Auto-generated method stub
		super.mouseWheel(arg0);
	}
 }