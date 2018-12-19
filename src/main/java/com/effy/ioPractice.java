package com.effy;

import java.util.Scanner;

public class ioPractice {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Player playerA = new Player();
		playerA.name = "玩家A";
		playerA.hp = 100;
		playerA.sp = 200;
		playerA.attack = 80;
		playerA.defense = 30;

		Player playerB = new Player();
		playerB.name = "玩家B";
		playerB.hp = 150;
		playerB.sp = 200;
		playerB.attack = 40;
		playerB.defense = 50;

		int roundNum = 1;

		while (playerA.hp > 0 && playerB.hp > 0) {
			System.out.println("=====遊戲開始=====");
			System.out.println("===第" + roundNum + "回合===");
			if (roundNum % 2 == 1) {
				if (playerA.sp < 10) {
					System.out.println("a沒魔了");
					roundNum += 1;
					continue;
				}
				System.out.println("a發動攻擊");
				playerA.sp -= 10;
				playerB.hp -= (playerA.attack - playerB.defense);
				System.out.println("B生命:" + playerB.hp + "A魔力:" + playerA.sp);
			} else {
				if (playerB.sp < 10) {
					System.out.println("b沒魔了");
					roundNum += 1;
					continue;
				}
				System.out.println("B發動攻擊");
				playerB.sp -= 10;
				playerA.hp -= (playerB.attack - playerA.defense);
				System.out.println("A生命:" + playerA.hp + "B魔力:" + playerB.sp);
			}
			roundNum += 1;
		}
		System.out.println("=====遊戲結束=====");
		if (playerA.hp > 0) {
			System.out.println(playerA.name + "獲勝");
		} else {
			System.out.println(playerB.name + "獲勝");
		}
	}

}
