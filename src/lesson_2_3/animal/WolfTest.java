public class WolfTest{
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender (true);
        wolf.setName ("Spike");
        wolf.setWeight (35.4);
        wolf.setAge (9);
        wolf.setColor ("white");

        System.out.println(wolf.isGender() + ", " 
        	+ wolf.getName() + ", " + wolf.getWeight() +
                ", " + wolf.getAge() + ", " 
                + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
	}
}