package repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import model.DefenderPlayer;
import model.ForwardPlayer;
import model.MidfielderPlayer;
import model.Player;

public class PlayerRepository {

    private Player[] players = new Player[0];
    private final String FILE_PATH = "data/players.txt";

    public void save(Player player) {
        Player[] newArr = Arrays.copyOf(players, players.length + 1);
        newArr[newArr.length - 1] = player;
        players = newArr;
    }

    public Player[] findAll() {
        return players;
    }

    public Player find(String name) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void delete(String name) {
        Player[] temp = new Player[0];

        for (Player p : players) {
            if (!p.getName().equals(name)) {
                Player[] newArr = Arrays.copyOf(temp, temp.length + 1);
                newArr[newArr.length - 1] = p;
                temp = newArr;
            }
        }

        players = temp;
    }

    public void update(String name, Player newPlayer) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getName().equals(name)) {
                players[i] = newPlayer;
                return;
            }
        }
    }

    // 파일 저장
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Player p : players) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("파일 저장 실패");
        }
    }

    // 파일 로드
    public void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String line;
            Player[] temp = new Player[0];

            while ((line = br.readLine()) != null) {

                String[] arr = line.split(",");

                String name = arr[0];
                String position = arr[1];
                String stat = arr[2];
                int backNumber = Integer.parseInt(arr[3]);

                Player p;

                if (position.equals("공격수")) {
                    p = new ForwardPlayer(name, backNumber,
                            Integer.parseInt(stat.replace("골", "")));
                }
                else if (position.equals("미드필더")) {
                    p = new MidfielderPlayer(name, backNumber,
                            Integer.parseInt(stat.replace("어시스트", "")));
                }
                else {
                    p = new DefenderPlayer(name, backNumber,
                            Integer.parseInt(stat.replace("태클", "")));
                }

                Player[] newArr = Arrays.copyOf(temp, temp.length + 1);
                newArr[newArr.length - 1] = p;
                temp = newArr;
            }

            players = temp;

        } catch (Exception e) {
            players = new Player[0];
        }
    }
}