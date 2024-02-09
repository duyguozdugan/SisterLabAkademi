public class ToolStore extends NormalLociation{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Money: "+player.getMoney());
        System.out.println("1- Weapon");
        System.out.println("2- Armor");
        System.out.println("3- Exit");
        System.out.print("Please select an item: ");
        int selectTool= scanner.nextInt();
        int selectItemId;
        switch (selectTool){
            case 1:
             selectItemId =  weaponMenu();
             buyWeapon(selectItemId);
             break;
            case 2:
                selectItemId = armorMenu();
                buyArmor(selectItemId);
                break;
        }
        return true;
    }

    public int weaponMenu(){
        System.out.println("1- Pistol (Damage: 2 - Money: 25)");
        System.out.println("2- Sword (Damage: 3 - Money: 35)");
        System.out.println("3- Gun (Damage: 7 - Money: 45)");
        System.out.println("4- Exit");
        System.out.print("Please select a weapon: ");
        return scanner.nextInt();
    }

    public void buyWeapon(int weaponId){
        int damage =0;
        int price=0;
        String weaponName = null;
        switch (weaponId){
            case 1:
                damage = 2;
                weaponName = "Pistol";
                price = 25;
                break;
            case 2:
                damage = 3;
                weaponName = "Sword";
                price = 35;
                break;
            case 3:
                damage = 7;
                weaponName = "Gun";
                price = 45;
                break;
            case 4:
                System.out.println("You left the store");
                break;
            default:
                System.out.println("Invalid weapon id");
                break;
        }
         if(price>0){
             if (player.getMoney()>price){
                 player.getInventory().setWeaponDamage(damage);
                 player.getInventory().setWeaponName(weaponName);
                 player.setMoney(player.getMoney()-price);
                 System.out.println("You bought a weapon. Previous damage: "+player.getDamage()+
                         " New damage: "+player.totalDamage());
                 System.out.println("Your money: "+player.getMoney());
             }else {
                 System.out.println("You don't have enough money");
             }

         }

    }

    public int armorMenu(){
        System.out.println("1- Light  (Block:1 - Money: 15)");
        System.out.println("2- Medium (Block: 3 - Money: 25)");
        System.out.println("3- Heavy (Block: 5 - Money: 40)");
        System.out.println("4- Exit");
        System.out.print("Please select a armor: ");
        return scanner.nextInt();
    }
    public void buyArmor(int armorId ){
        int block =0;
        int price=0;
        String armorName = null;
        switch (armorId){
            case 1:
                block = 1;
                armorName = "Light";
                price = 15;
                break;
            case 2:
                block = 3;
                armorName = "Medium";
                price = 25;
                break;
            case 3:
                block = 5;
                armorName = "Heavy";
                price = 40;
                break;
            case 4:
                System.out.println("You left the store");
                break;
            default:
                System.out.println("Invalid armor id");
                break;
        }
        if(price>0){
            if (player.getMoney()>=price){
                player.getInventory().setArmorBlock(block);
                player.getInventory().setArmorName(armorName);
                player.setMoney(player.getMoney()-price);
                System.out.println("You bought a armor. Blocking: "+ player.getInventory().getArmorBlock());
                System.out.println("Your money: "+player.getMoney());
            }else {
                System.out.println("You don't have enough money");
            }

        }

    }

}
