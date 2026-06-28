package main;

import controller.PlayerController;
import repository.PlayerRepository;
import repository.PlayerService;
import view.PlayerView;

public class Main {

    public static void main(String[] args) {

        PlayerRepository repo = new PlayerRepository();
        repo.loadFromFile();

        PlayerService service = new PlayerService(repo);
        PlayerView view = new PlayerView();

        PlayerController controller =
                new PlayerController(service, view);

        controller.run();

        repo.saveToFile();
    }
}