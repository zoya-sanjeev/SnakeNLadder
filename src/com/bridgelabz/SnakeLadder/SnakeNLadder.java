package com.bridgelabz.SnakeLadder;


public class SnakeNLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=0, roll=0, option=0;
		while(pos!=100) {
			roll=(int)Math.floor(Math.random()*6)+1;
			option=(int)Math.floor(Math.random()*3);
			
		if(option==NO_PLAY)
			;
		else if(option==LADDER)
			pos=pos+roll>100?pos:pos+roll;
		else
			pos=pos-roll<0?0:pos-roll;
			
		System.out.println(pos);
		}
	}

}
