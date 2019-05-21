package 多态;

public class APHero extends Hero{
	@Override
	public void attack() {
	System.out.println("我才是被打，你别打我");
	}
	
	public static void main(String[] args) {
		APHero apHero = new APHero();
		apHero.attack();
	}
	
	
}
