package ch12;

import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args){

        ArrayList arrayList = new ArrayList(3);
        try{
            //arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;
        }catch(IndexOutOfBoundsException ioe){
            ioe.printStackTrace();
            System.out.println("IndexOutOfBoundesException 발생"); //print문을 안쓰는게 보안에는 더 좋음
        }catch(IllegalArgumentException iae){
            System.out.println("IlleagalArgumentException 발생");
        }catch(Exception e) {
            System.out.println("Exception 발생");
        }finally { //무조건 수행되는 소스
            System.out.println("finally");
        }
    }
}
