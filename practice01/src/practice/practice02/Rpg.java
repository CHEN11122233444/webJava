package practice.practice02;

public class Rpg {
	
	private String job;
	private int level;
	private String weapon;
	private String skill;
	private boolean isManner;
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	public boolean getisManner() {
		return isManner;
	}
	public void setManner(boolean isManner) {
		this.isManner = isManner;
	}
	
	
	
	
	

	public void status() {
		System.out.println(
		"직업은: "+this.getJob()+"\n"+
		"레벨은: "+this.getLevel()+"\n"+
		"무기는: "+this.getWeapon()+"\n"+
		"스킬은: "+this.getSkill()+"\n"+
		"매너: "+this.getisManner()
		);
		
	}


}
