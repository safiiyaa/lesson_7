public class Magic extends Hero{


    public Magic(int health, int damage) {
        super(health, damage, "Magic power");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность Magic damage ");
    }
}
