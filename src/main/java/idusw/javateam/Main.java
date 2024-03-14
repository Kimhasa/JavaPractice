package idusw.javateam;


public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        // java.io.PrintStream 클래스형 out 참조 변수의 printf 메소드 호출

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }

        Menu menu = new Menu(); // Menu 클래스로 부터 객체를 생성하고, menu라는 참조변수에 배정
        menu.showMenu(); // menu 참조변수가 참조하는 객체의 showMenu 메소드를 호출
    }
}