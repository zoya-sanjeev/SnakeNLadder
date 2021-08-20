package com.bridgelabz.SnakeLadder;

import java.util.Random;

public class SnakeNLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int pos=0, turn =0, option=3;
		
		while(pos!=100) {
			turn = random.nextInt(7);
			if(turn==0)
				continue;
			option=random.nextInt(3);
			
			if(option==LADDER)
				pos=pos+turn>100?pos:pos+turn;
			else if(option==SNAKE)
				pos=pos-turn<0?0:pos-turn;
			else
				pos=pos;
			
			System.out.print(pos+" ");
			
		}
	}

}
