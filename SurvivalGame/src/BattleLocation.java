import com.sun.security.jgss.GSSUtil;

public abstract class BattleLocation extends Location{

    protected Obstacle obstacle;
    protected String award;

    public BattleLocation(Player player, String name, Obstacle obstacle,String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.obstacleCount();
        System.out.println("Now, you are in: " + this.name + "!");
        System.out.println("Be careful! "+ obsCount + obstacle.getName() + " is here!");
        System.out.print("<S> Strike or <R> Run!");
        String selectCase = scanner.nextLine();
        selectCase=selectCase.toUpperCase();
        if (selectCase.equals("S")) {
           if(combat(obsCount)){
               System.out.println("Congratulations! You won the battle!");
               if(this.award.equals("Food") && player.getInventory().isFood() == false){
                   System.out.println(this.award + "you win.");
                   player.getInventory().setFood(true);
               }
               else if(this.award.equals("Water") && player.getInventory().isWater()==false){
                   System.out.println(this.award + "you win.");
                   player.getInventory().setWater(true);
               }
               else if(this.award.equals("Firewood") && player.getInventory().isFirewood()==false){
                   System.out.println(this.award + "you win.");
                     player.getInventory().setFirewood(true);
               }
               return true;
           }
           else{
               System.out.println("You died!");
               return false;
           }
        }
        return true;
    }

    public boolean combat(int obsConut){
        for (int i = 0; i < obsConut; i++) {
            int defObsHealth = obstacle.getHealth();
            playerStats();
            obstacleStats();
            while(player.getHealth()> 0 && obstacle.getHealth()>0){
                System.out.print("<H> Hit or <R> Run!");
                String selectCase = scanner.nextLine();
                selectCase=selectCase.toUpperCase();
                if (selectCase.equals("H")) {
                    System.out.println("You hit the enemy" );
                    obstacle.setHealth(obstacle.getHealth()-player.totalDamage());
                    afterHit();
                    if(obstacle.getHealth()>=0){
                        System.out.println();
                        System.out.println("Enemy hit you" );
                        player.setHealth(player.getHealth()-(obstacle.getDamage()-player.getInventory().getArmorBlock()));
                        afterHit();
                    }
                }
                else{
                    break;
                }
            }
            if(obstacle.getHealth()< player.getHealth()){
                System.out.println("You won the enemy!");
                player.setMoney(player.getMoney()+obstacle.getAward());
                System.out.println("Total Money: " + player.getMoney());
                obstacle.setHealth(defObsHealth);
            }
            else{
                return false;
            }

            System.out.println("----------------------------");

        }
      return true;
    }
    public void playerStats(){
        System.out.println("Player Health: " + player.getHealth() + "\n" +
                        " - Player Damage: " + player.totalDamage()+ "\n" +
                        " - Player Money: " + player.getMoney());

        if (player.getInventory().getWeaponDamage() >0 ) {
            System.out.println("Weapon: " + player.getInventory().getWeaponName());
        }
        if(player.getInventory().getArmorBlock() >0 ) {
            System.out.println("Armor: " + player.getInventory().getArmorName());
        }
    }

    public void obstacleStats(){
        System.out.println("Obstacle Health: " + obstacle.getHealth() + "\n"+
                " - Obstacle Damage: " + obstacle.getDamage() + "\n"+
                " - Obstacle Award: " + obstacle.getAward());
    }

    public void afterHit(){
        System.out.println("Player Health: " + player.getHealth() + "\n" +
                "Obstacle Health: " + obstacle.getHealth());
        System.out.println();
    }
}
