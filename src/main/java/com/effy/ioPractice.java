package com.effy;

//import java.util.Scanner;

public class ioPractice {

//	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Player playerA = new Player("玩家A", 100, 200, 80, 30);

		Player playerB = new Player("玩家B", 150, 200, 40, 50);

		int roundNum = 1;

		while (playerA.isAlive() && playerB.isAlive()) {
			System.out.println("=====遊戲開始=====");
			System.out.println("===第" + roundNum + "回合===");
			if (roundNum % 2 == 1) {
				System.out.println(playerA.whoAttack());
				playerA.playProcess(playerB);
			} else {
				System.out.println(playerB.whoAttack());
				playerB.playProcess(playerA);
			}
			roundNum += 1;
		}
		System.out.println("=====遊戲結束=====");
		if (playerA.isAlive()) {
			System.out.println(playerA.name + "獲勝");
		} else {
			System.out.println(playerB.name + "獲勝");
		}
	}

}
