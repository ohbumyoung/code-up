package controller;

import java.util.Scanner;

import model.Player;
import repository.PlayerService;
import view.PlayerView;

public class PlayerController {
Scanner sc = new Scanner(System.in);
    private PlayerService service;
    private PlayerView view;

    public PlayerController(PlayerService service, PlayerView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {

        while (true) {

            try {
                int m = view.menu();

                switch (m) {

                    case 1:
                        Player p1 = view.inputPlayer();
                        if (p1 != null) {
                            view.msg(service.add(p1));
                        } else {
                            view.msg("입력 오류");
                        }
                        break;

                    case 2:
                        view.print(service.getAll());
                        break;

                    case 3:
                        String del = view.inputName();
                        view.msg(service.delete(del.trim()));
                        break;

                    case 4:
                        String target = view.inputName();
                        Player newP = view.inputUpdatePlayer();

                        if (newP == null) {
                            view.msg("수정 실패 (입력 오류)");
                            break;
                        }

                        view.msg(service.update(target.trim(), newP));
                        break;

                    case 0:
                        return;

                    default:
                        view.msg("잘못된 입력");
                }

            } catch (Exception e) {
                view.msg("입력 오류 발생");
                sc.nextLine(); // 버퍼 초기화 효과
            }
        }
    }
}