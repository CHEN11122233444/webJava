package practice.practice02;

public class Warrior {

	public static void main(String[] args) {
			
		Rpg j1 = new Rpg();
		
		j1.setJob("warrior");
		j1.setLevel(10);
		j1.setWeapon("sword");
		j1.setSkill("Power Strike");
		j1.setManner(true);
		
		j1.status();
		
	}

}
