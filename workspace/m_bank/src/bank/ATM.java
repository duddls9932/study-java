package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면
   public static void main(String[] args) {
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[arrBank.length];
      String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
      Scanner sc = new Scanner(System.in);

      int bankNumber = 0, choice = 0, myBankNumber = 0;
      String account = null, password = null, phone = null, name = null;
      Bank user = null;
      int money = 0, withdrawMoney = 0, temp = 0;
      Random random = new Random();
      int passwordCheck = 0, phoneCheck = 0;

      String accountMessage = "계좌번호: ";
      String nameMessage = "예금주: ";
      String passwordMessage = "비밀번호(4자리): ";
      String phoneMessage = "핸드폰번호(- 제외): ";
      String depositMessage = "입금액: ";
      String withdrawMessage = "출금액: ";
      String errorMessage = "다시 시도해주세요.";
      String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
      
      while(true) {
         System.out.println(message);
         bankNumber = sc.nextInt();
         
         if(bankNumber == 4) {
            break;
         }
         
         bankNumber--;
         
         while(true) {
            System.out.println(menu);
            choice = sc.nextInt();
            
            if(choice == 6) {
               break;
            }
            
            switch(choice) {
            case 1: // 계좌 개설
               
               Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};
               
               while(true) {
                  account = String.valueOf(random.nextInt(900000) + 100000);
                  account = bankNumber + account;
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {
                     break;
                  }
               }
               
               System.out.println(nameMessage);
               name = sc.next();
               
               while(true) {
                  System.out.println(passwordMessage);
                  password = sc.next();
                  passwordCheck = 0;
                  
                  if(password.length() == 4) {
                     for (int i = 0; i < password.length(); i++) {
                        char c = password.charAt(i);
                        if(c >= 48 && c <= 57) {
                           passwordCheck++;
                        }
                     }
                  }
                  
                  if(passwordCheck == 4) {
                     break;
                  }
               }
               
               while(true) {
                  System.out.println(phoneMessage);
                  phone = sc.next();
                  phoneCheck = 0;
                  
                  phone = phone.replaceAll("-", "");
                  
                  if(phone.length() == 11) {
                     for (int i = 0; i < phone.length(); i++) {
                        char c = phone.charAt(i);
                        if(c >= 48 && c <= 57) {
                           phoneCheck++;
                        }
                     }
                     
                     if(phoneCheck == 11) {
                        if(Bank.checkPhone(arrBank, arCount, phone) == null) {
                           break;
                        }
                     }
                  }
               }
               
               user = arBank[bankNumber];
               
               user.setAccount(account);
               user.setName(name);
               user.setPassword(password);
               user.setPhone(phone);
               
               arrBank[bankNumber][arCount[bankNumber]++] = user;
               
               System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
               System.out.println("고객님의 소중한 계좌번호: " + account);
               break;
            case 2: // 입금 하기
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  myBankNumber = user.getAccount().charAt(0) - 48;
                  if(myBankNumber == bankNumber) {
                     System.out.println(depositMessage);
                     money = sc.nextInt();
                     
                     if(money > 0) {
                        user.deposit(money);
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
                     }else {
                        System.out.println(errorMessage);
                     }
                  }else {
                     System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
                  }
                  
//                  현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//                  그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//                  if(bankNumber == 0) {
//                     if(user instanceof Shinhan) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 1) {
//                     if(user instanceof Kookmin) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 2) {
//                     if(user instanceof Kakao) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }
               } else {
                  System.out.println(loginFailMessage);
               }
               break;
            case 3: // 출금 하기
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  System.out.println(withdrawMessage);
                  withdrawMoney = sc.nextInt();
                  
                  temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
                  
                  if(withdrawMoney > 0) {
                     if(temp <= user.getMoney()) {
                        user.withdraw(withdrawMoney);
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
                        
                     }else {
                        System.out.println(errorMessage);
                     }
                     
                  }else {
                     System.out.println(errorMessage);
                  }
               } else {
                  System.out.println(loginFailMessage);
               }
               break;
            case 4: // 잔액 조회
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               if(user != null) {
                  System.out.println("현재 잔액: " + user.showBalance() + "원");
               }
               break;
            case 5: // 계좌번호 찾기
               System.out.println(phoneMessage);
               phone = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.checkPhone(arrBank, arCount, phone);
               if(user != null) {
                  while(true) {
                     account = String.valueOf(random.nextInt(900000) + 100000);
                     account = bankNumber + account;
                     if(Bank.checkAccount(arrBank, arCount, account) == null) {
                        break;
                     }
                  }
                  
                  user.setAccount(account);
                  System.out.println("고객님의 소중한 계좌번호: " + account);
               }else {
                  System.out.println(errorMessage);
                  
               }
               break;
               
               default:
                  System.out.println(errorMessage);
                  break;
            }
            
         }
      }
   }
}















