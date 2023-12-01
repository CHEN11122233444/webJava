package study.method.over;

public class Turtle extends PokeMon{
	
	@Override
	public void attack() {
		System.out.println(this.getMyName()+"이(가) 물대포 공격!!");
	}
}
