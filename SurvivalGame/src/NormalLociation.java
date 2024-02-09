public abstract class NormalLociation extends Location{
    public NormalLociation(Player player, String name) {
        super(player);
        this.name = name;
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}
