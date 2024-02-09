import java.util.Scanner;

public class Game {

    private Player player;
    private Location location;
    Scanner scanner = new Scanner(System.in);


    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Nice to meet you " + playerName + "!");

        player = new Player(playerName);
        player.selectWarrior();
        start();
    }

    public void start() {
        while (true){
            System.out.println("-----------------------------");
            System.out.println("Choose your location");
            System.out.println("1- Safe House -> You healed! (No enemy)");
            System.out.println("2- Cave -> Be careful! There might be enemies. (Enemy: Zombie)");
            System.out.println("3- Forest -> Be careful! There might be enemies. (Enemy: Vampire)");
            System.out.println("4- River -> Be careful! There might be enemies. (Enemy: Bear)");
            System.out.println("5- Shop -> You can buy some stuff.");
            System.out.print("Please select your location: ");
            int selectLocation = scanner.nextInt();
            while (selectLocation < 1 || selectLocation > 5) {
                System.out.print("Invalid location id, please try again: ");
                selectLocation = scanner.nextInt();
            }
            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(!location.getLocation()) {
                System.out.println("Game is over!");
                break;
            }


        }

    }
}
