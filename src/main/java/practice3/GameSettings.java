package practice3;

public class GameSettings {
    /*
    static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор,
 статический метод setMaxPlayers(int), метод addPlayer() — добавляет 1 игрока,
  если не превышен maxPlayers, метод printGameStatus() — выводит название,
  текущее и максимальное количество игроков. В main: создайте 2 игры,
  измените maxPlayers, добавьте игроков и выведите статус.
     */

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }

    static void setMaxPlayers(int max) {
        maxPlayers = max;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
            System.out.println("Игрок добавлен в игру: " + this.gameName + "\n");
        } else {
            System.out.println("Превышен лимит игроков в игре: " + gameName + "\n");
        }
    }

    void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + "\n" +
                "Текущее количество игроков: " + this.currentPlayers + "\n" +
                "Максимально количество игроков: " + maxPlayers + "\n");
    }

    static void main() {
        GameSettings game1 = new GameSettings("Игра1");
        GameSettings game2 = new GameSettings("Игра2");
        GameSettings.setMaxPlayers(3);
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
