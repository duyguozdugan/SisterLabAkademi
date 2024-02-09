public class SafeHouse extends NormalLociation{
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Welcome to the Safe House!");
        player.setHealth(player.getRealHealth());
        System.out.println("Your health is full now");
        return true;
    }
}
