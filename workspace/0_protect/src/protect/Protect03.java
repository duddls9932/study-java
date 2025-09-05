package protect;

import java.util.Scanner;

//플레이어와 몬스터 클래스가 있다.

//각각은 이름, 체력, 공격력을 가진다.
//
//attack() 메서드로 서로 공격할 수 있다.
//
//공격 시 상대방의 체력이 감소한다.
//
//체력이 0 이하가 되면 "○○이(가) 쓰러졌습니다!" 출력.
//
//사용자에게 선택지를 줘서 몬스터와 싸울지 도망갈지 고르게 한다.
class Game1 {
	String playername;
	int damage;
	int hp;

	String monname;
	int mondamage;
	int monhp;

	public Game1(int monhp, int mondamage, String monname) {
		
		this.monname = monname;
		this.mondamage = mondamage;
		this.monhp = monhp;
	}

	public Game1(String playername, int damage, int hp) {
	
		this.playername = playername;
		this.damage = damage;
		this.hp = hp;

	}

	void attack(int action) {
		for (int i = 0; i < 5; i++)

		{
			monhp = monhp - damage;
			hp = hp - mondamage;
			System.out.println("공격성공! 내체력:" + hp + "몬스터 체력:" + monhp);

		}

	}

}

public class Protect03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Game minsu = new Game1("민수", 10, 80);
//		Game Monmon = new Game1(30, 3, "몬몬");
//		int choice = 0;
//		int i = 30;
//		String actionMessge = "1.공격\n2.도망가기";
//		System.out.println(actionMessge);
//		while (i > 0) {
//			choice = scanner.nextInt();
//			if (choice == 1) {
//				minsu.attack(choice);
//				출력을해도 위에메소드가 실행이 되지않네요.
//				Game minsu = new Game("민수",10,80);
//				Game Monmon= new Game(30,3,"몬몬");
//				선언부분이 잘못된거같은데 몬스터와 민수가 1개의문자열 2개의 정수를 받아야해서 
//				순서를 다르게해서 선언했는데 각각 몬스터랑 플레인걸 인지를못해서 출력을못한걸까요?

			}

//		}

	}

//}
