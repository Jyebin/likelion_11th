package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {
    public static void main(String[] args){
        System.out.println("=======================");
        System.out.println("회원 등록");
        System.out.println("=======================");

        boolean register = false;
        Scanner sc = new Scanner(System.in);

        while (!register){
            System.out.println("회원가입을 하시겠습니까?\ny:진행    n:취소");
            System.out.print(">> "); //이 뒤에 사용자의 값이 입력됨
            String register_input = sc.nextLine();

            if(register_input.equalsIgnoreCase("y")){ //대문자 입력도 가능
                register = true;
                System.out.println("=======================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("=======================");
            }else if(register_input.equalsIgnoreCase("n")){
                System.out.println("=======================");
                System.out.println("회원가입이 종료됩니다.");
                System.out.println("=======================");
                System.exit(0); //종료 코드. 0이면 정상종료
            }else{
                System.out.println("입력 값을 확인해주세요.");
            }
        }

        ArrayList users = new ArrayList();

        while(true){ //while문이 무조건 실행됨
            HashMap user = new HashMap();

            //ID는 보통 username이라고 통용됨
            System.out.println("ID: ");
            String username = sc.nextLine();

            // PW
            String password ="";
            while(true){
                System.out.print("PW: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String password_confirm = sc.nextLine(); //비밀번호 재확인

                if(password.equals(password_confirm)){
                    break; //같다면 while문을 빠져나와야 함
                }else{
                    System.out.println("=======================");
                    System.out.println("패스워드가 일치하지 않습니다.");
                    System.out.println("패스워드를 다시 입력해주세요.");
                    System.out.println("=======================");
                }
            }
            //이름
            System.out.print("성명: ");
            String name = sc.nextLine();

            //생년월일(6자리)
            String birth_date = ""; //변수는 사용하지 않더라도 빈 값으로 초기화 하는것이 좋음
            while(true){
                System.out.print("생년월일(6자리): ");
                birth_date = sc.nextLine();
                if(birth_date.length() == 6){
                    break;
                }else{
                    System.out.println("=======================");
                    System.out.println("생년월일 자릿수가 올바르지 않습니다.");
                    System.out.println("생년월일을 다시 입력해주세요.");
                    System.out.println("=======================");
                }
            }
            //이메일
            System.out.print("이메일: ");
            String email = sc.nextLine();

            user.put("username",username);
            user.put("password",password);
            user.put("name",name);
            user.put("birth_date",birth_date);
            user.put("email",email);

            users.add(user); //이대로 끝내면 회원가입이 진행됐는지 아닌지 알 수 없음

            System.out.println("=======================");
            System.out.println(user.get("name")+" 님, 가입을 환영합니다.");
            System.out.println("id는 " + user.get("username")+" 입니다.");
            System.out.println("=======================");

            //다른 사람이 회원가입을 하는 경우
            System.out.println("회원가입을 이어서 진행하시겠습니까?\ny:진행    n:취소");
            System.out.print(">> "); //이 뒤에 사용자의 값이 입력됨
            String register_again = sc.nextLine();

            if(register_again.equalsIgnoreCase("y")){
                ;
            }else if(register_again.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }
}
