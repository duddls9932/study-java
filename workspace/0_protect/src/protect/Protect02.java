package protect;

import java.util.Scanner;

//public class Protect02 {
	 
//	요구사항:
//
//	은행 계좌는 이름, 잔액(balance)을 가진다.
//
//	입금(deposit), 출금(withdraw) 메서드를 만든다.
//
//	출금 시 잔액이 부족하면 출금 실패 메시지를 출력한다.
//
//	✨ 목표:
//	클래스 상태 변경
//
//	조건문 사용
//
//	메서드 리턴 또는 출력 활용

	class BankAccount{
		String name;
		int balance;
		
		
		public BankAccount(String name, int balance) {
			
			this.name = name;
			this.balance = balance;
		}
		
		
		void deposit(int depositAmount){
			balance=balance+depositAmount;
			System.out.println("현재잔고는"+balance);
			
		}
		void withdraw(int withdarwAmount) {
			if (balance >= withdarwAmount) {
		        balance -= withdarwAmount;
		        System.out.println("출금완료! 잔액은 " + balance + "원입니다.");
		    } else {
		        System.out.println("잔액이 부족합니다. 출금할 수 없습니다.");
		    }
		}
		void checkBalance() {
			 System.out.println("현재 잔고는" +balance);
		}
		}
		
	
	public class Protect02 {

	public static void main(String[] args) {
//		Protect02 BankAccount= new BankAccount()
		Scanner scanner = new Scanner(System.in);
		BankAccount minsu=new BankAccount("민수",50000);
		BankAccount youngin=new BankAccount("영인",2200);
		int depositAmount=0;
		int withdarwAmount=0;
		int choice=0;
		
		String menu = "1.입금\n2.출금\n3.잔고확인";
		String depositMessage = "입금액을 입력해주세요";
		String depositMessage1 = depositAmount+"원 입금되었습니다";
		String withdarwMessage="출금액을 입력해주세요";
		int muhan=9;
		while (muhan<10) {
		System.out.println(menu);
		choice=scanner.nextInt();
		 // 그렇다면 메인에서 입력받아 메소드로 갈 실행문은 전부 스캐너를 사용해야하는가 ?
	    if (choice==1) {
			System.out.println(depositMessage);
			depositAmount=scanner.nextInt();
		youngin.deposit(depositAmount);}
//			System.out.println(depositMessage1);
	    else if (choice==2)
			{System.out.println(withdarwMessage);
			withdarwAmount=scanner.nextInt();
		youngin.withdraw(withdarwAmount);}
	    else 
	    {
	    	youngin.checkBalance();
	    }
	      muhan--;
		}
		

	}

}
