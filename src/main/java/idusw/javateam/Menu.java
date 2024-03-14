package idusw.javateam;

public class Menu {
    private int level = 3;
    // instance variable or member field : 초기화를 안하는 경우 기본값 배정(assignment)

    public void showMenu(){
        System.out.println("current level : " + level);
        System.out.println("1. read ");
        System.out.println("2. create ");
        System.out.println("3. update ");
        System.out.println("4. delete ");
    }
}
