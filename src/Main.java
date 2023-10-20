public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(240, 30),
                new Medic(200, 15),
                new Warrior(310, 45)
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }


    }
}