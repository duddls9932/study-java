package protect;

import java.util.Scanner;

//Account 클래스: 계좌번호(accountNumber), 예금주(owner), 잔액(balance) 가지고 있음
//
//deposit(int amount) 메서드: 입금 기능 (잔액 증가)
//
//withdraw(int amount) 메서드: 출금 기능 (잔액 감소, 출금 금액이 잔액보다 크면 “잔액 부족” 메시지 출력)
//
//잔액 조회 기능 제공 (getBalance())
//
//메인에서 사용자에게 입금, 출금, 잔액 조회, 종료 메뉴를 선택하게 함
//
//사용자가 선택한 동작에 따라 해당 기능 수행

class Account {
	int accountnumber;
	String owner;
	int balance;

	public Account(int accountnumber, String owner, int balance) {

		this.accountnumber = accountnumber;
		this.owner = owner;
		this.balance = balance;
	}

	int deposit(int amount) {
		balance = balance + amount;
		System.out.println("입금성공! 남은잔액은 " + balance + "입니다!!");
		return balance;
	}

	int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액 부족 !");
			return balance;  // 모든경우에 리턴이있어야한다 ?
		} else {
			balance-=amount;
			System.out.println("출금성공!남은잔액은"+balance+"입니다");
			return balance;
		}
	}
}

public class Protect05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int amount=0;
		String choiceMessege="1.입금\n2.출금\n3.종료하기";
		Account minsu = new Account (30211310,"민수",350000); 
		
		while (true) {
			System.out.println(choiceMessege);
			System.out.println("선택>>>");
			choice=sc.nextInt();
			if (choice==1) {
				System.out.println("입금할금액을 입력해주세요");
				amount=sc.nextInt();
				minsu.deposit(amount);
			}
			else if(choice==2) {
				System.out.println("출금할 금액을 입력해주세요");
				amount=sc.nextInt();
				minsu.withdraw(amount);
			}
			else if(choice==3) {
				System.out.println("어플을 종료합니다");
				
				
			}
		}


	}

}
