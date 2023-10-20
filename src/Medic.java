public class Medic extends  Hero{
    private int healPoints;



    public Medic(int health, int damage) {
        super(health, damage, "Heal");
        this.healPoints = 50;
    }


    public void increaseExperience() {
        this.healPoints += this.healPoints * 0.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
        increaseExperience();
        System.out.println("Опыт лечения увеличен до: " + healPoints);
  }

}
