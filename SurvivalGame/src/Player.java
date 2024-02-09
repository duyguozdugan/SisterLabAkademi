import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int realHealth;
    private int money;
    private String playerName;
    private String warriorName;
    private Inventory inventory;
    Scanner scanner = new Scanner(System.in);

    public void selectWarrior(){
        switch (warriorMenu()){

            case 1:
                initWarrior("Samurai", 5, 21, 15);
                break;
            case 2:
                initWarrior("Archer", 7, 18, 20);
                break;
            case 3:
                initWarrior("Knight", 8, 24, 5);
                break;
            default:
                setWarriorName("Samurai");
                setDamage(5);
                setHealth(21);
                setMoney(15);
                break;
        }

        System.out.println("You have selected " + getWarriorName() + " as your warrior");

    }
    public int warriorMenu(){
        System.out.println("Here are the warriors you can choose");
        System.out.println("1- <S>amurai  (Damage:5 - Health:21 - Money:15)");
        System.out.println("2- <A>rcher   (Damage:7 - Health:18 - Money:20)");
        System.out.println("3- <K>night   (Damage:8 - Health:24 - Money:5)");
        System.out.print("Please select a warrior: ");
        int warriorId= scanner.nextInt();
        while (warriorId<1 || warriorId>3){
            System.out.print("Invalid warrior id, please try again");
            warriorId= scanner.nextInt();
        }
        return warriorId;
    }

    public void initWarrior(String warriorName, int damage, int health, int money){
        setWarriorName(warriorName);
        setDamage(damage);
        setHealth(health);
        setRealHealth(health);
        setMoney(money);
    }

    public int totalDamage(){
        return this.getDamage() + this.getInventory().getWeaponDamage();
    }

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRealHealth() {
        return realHealth;
    }

    public void setRealHealth(int realHealth) {
        this.realHealth = realHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getWarriorName() {
        return warriorName;
    }

    public void setWarriorName(String warriorName) {
        this.warriorName = warriorName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
