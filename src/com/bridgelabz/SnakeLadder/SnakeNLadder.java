package com.bridgelabz.SnakeLadder;


public class SnakeNLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	

	public static void main(String[] args) {
		int[] pos =new int[2];
		int[] NoOfRolls =new int[2];
		int roll=0, option=0, turn=0;
		while(!(pos[0]!=100 || pos[1]!=100)) {
			roll=(int)Math.floor(Math.random()*6)+1;
			NoOfRolls[turn]++;
			option=(int)Math.floor(Math.random()*3);
			
		if(option==NO_PLAY)
			turn=turn==1?0:1;
		else if(option==LADDER) {
			pos[turn]=pos[turn]+roll>100?pos[turn]:pos[turn]+roll;
			turn=turn==1?1:0;
		}
		else {
			pos[turn]=pos[turn]-roll<0?0:pos[turn]-roll;
			turn=turn==1?0:1;
		}
			
		
		}
		System.out.println("Winner of the game is Player="+(pos[0]==100?1:2));
	}

}
