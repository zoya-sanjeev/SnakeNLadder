package com.bridgelabz.SnakeLadder;
import java.util.Random;

public class SnakeNLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=0, roll=0;
		roll=(int)Math.ceil(Math.random()*6);
		
		Random random = new Random();
		int option=random.nextInt(3);
		if(option==NO_PLAY)
			pos=pos;
		else if(option==LADDER)
			pos+=roll;
		else
			pos-=roll;
			
		System.out.println(pos);
	}

}
