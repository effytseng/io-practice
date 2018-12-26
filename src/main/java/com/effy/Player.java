package com.effy;

public class Player {

	public static final int magicNum = 10;
	public String name;
	public int hp;
	public int sp;
	public int attack;
	public int defense;
	public int bonus = 0;

	public Player(String nam, int hp, int sp, int attack, int defense) {
		name = nam;
		this.hp = hp;
		this.sp = sp;
		this.attack = attack;
		this.defense = defense;
	}

	public String whoAttack() {
		return name + "發動攻擊";
	}

	public void playProcess(Player other) { // 原來可以這樣帶進去
		if (sp < magicNum) {
			System.out.println(name + "沒魔了");
			return;
		}
		sp -= magicNum;
		other.hp -= (attack - other.defense);
		System.out.println(other.name + "生命:" + other.hp + name + "魔力:" + sp);
	}

	public boolean isAlive() {
		return hp > 0;
	}
}
