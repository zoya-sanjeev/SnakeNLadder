package com.bridgelabz.SnakeLadder;

import java.util.Random;

public class SnakeNLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int pos=0, turn =0;
		
		while(pos!=100) {
			turn = random.nextInt(7);
			
			if(turn==0)
				continue;
			
			pos=pos+turn>100?pos:pos+turn;
			
			System.out.print(pos+" ");
			
		}
	}

}
