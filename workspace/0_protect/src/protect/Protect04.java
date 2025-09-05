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
class Game {
	String playername;
	int damage;
	int hp;
	public Game(String playername, int damage, int hp) {
		
		this.playername = playername;
		this.damage = damage;
		this.hp = hp;
	}
	int attack(String monname, int monHp, int monDamage) {
		monHp = monHp - damage;
		hp = hp - monDamage;
		System.out.println("공격 성공! 내 체력: " + hp + monname + " 체력: " + monHp);

	
		if (monHp <= 0) {
			System.out.println(monname + "가 쓰러졌습니다!");
		}
		if (hp <= 0) {
			System.out.println(playername + "가 쓰러졌습니다!");
		}
		return monHp; 
	}
}

public class Protect04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice=0;
		Game minsu=new Game("민수",10,100);
		String monName="몬몬이";
		int monDamage=5;
		int monHp=70;
		String actionMessge = "1.공격\n2.도망가기";
		System.out.println(actionMessge);
		while (monHp > 0) {
			System.out.print("선택 >>> ");
			choice=sc.nextInt();
			if (choice==1) {
				System.out.println("공격!");
				monHp=minsu.attack(monName, monHp, monDamage);
			}
			if(choice==2) {
				System.out.println("도망쳤습니다!");
				
			}
		}
			
			
		}
		

	}


