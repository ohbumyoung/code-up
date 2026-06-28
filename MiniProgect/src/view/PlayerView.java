package view;

import model.*;
import java.util.Scanner;

public class PlayerView {

    private Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("\n===== 선수 관리 =====");
        System.out.println("1. 등록");
        System.out.println("2. 조회");
        System.out.println("3. 삭제");
        System.out.println("4. 수정");
        System.out.println("0. 종료");
        return sc.nextInt();
    }

    private int selectPosition() {
        System.out.println("\n포지션 선택");
        System.out.println("1. 공격수");
        System.out.println("2. 미드필더");
        System.out.println("3. 수비수");
        return sc.nextInt();
    }

    // 등록
    public Player inputPlayer() {
        return createPlayer();
    }

    // 수정 (⭐ 핵심: null 최소화 구조)
    public Player inputUpdatePlayer() {
        return createPlayer();
    }

    // 공통 생성 로직
    private Player createPlayer() {

        int type = selectPosition();

        System.out.print("이름:");
        String name = sc.next();

        System.out.print("등번호:");
        int num = sc.nextInt();

        switch (type) {

            case 1:
                System.out.print("골:");
                return new ForwardPlayer(name, num, sc.nextInt());

            case 2:
                System.out.print("어시스트:");
                return new MidfielderPlayer(name, num, sc.nextInt());

            case 3:
                System.out.print("태클:");
                return new DefenderPlayer(name, num, sc.nextInt());

            default:
                System.out.println("잘못된 입력");
                return null;
        }
    }

    public String inputName() {
        System.out.print("이름:");
        return sc.next();
    }

    public void print(Player[] players) {
        System.out.println("\n=== 선수 목록 ===");

        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void msg(String m) {
        System.out.println("[알림] " + m);
    }
}