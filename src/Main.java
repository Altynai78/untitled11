public class Main {
    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setZdorovie(80);
        boss.setUron(70);
        boss.weapon.setWeaponType(WeaponType.MACHINE_GUN);
        boss.weapon.setWeaponName("Gun");
        System.out.println("здоровья босса"+boss.getZdorovie()+ "урон босса"+boss.getUron()+"тип оружия"+boss.weapon.getWeaponType()+
                "названия оружия "+boss.weapon.getWeaponName());

    }
}