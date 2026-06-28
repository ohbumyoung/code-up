package repository;

import model.Player;

public class PlayerService {

    private PlayerRepository repo;

    public PlayerService(PlayerRepository repo) {
        this.repo = repo;
    }

    public String add(Player p) {

        if (p == null) return "입력 오류";

        if (repo.find(p.getName()) != null) {
            return "이미 존재하는 선수입니다.";
        }

        repo.save(p);
        return "등록 완료";
    }

    public Player[] getAll() {
        return repo.findAll();
    }

    public String delete(String name) {

        if (repo.find(name) == null) {
            return "존재하지 않는 선수입니다.";
        }

        repo.delete(name);
        return "삭제 완료";
    }

    public String update(String name, Player newPlayer) {

        if (newPlayer == null) {
            return "수정 실패 (입력 오류)";
        }

        if (repo.find(name) == null) {
            return "존재하지 않는 선수입니다.";
        }

        repo.update(name, newPlayer);
        return "수정 완료";
    }
}