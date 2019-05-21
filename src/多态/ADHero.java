package 多态;

public class ADHero extends Hero{

	@Override
	public void attack() {
	System.out.println("我才是被打");
	}
	
	public void buyAD() {
		System.out.println("买AD装备");
	}
	
	public static void main(String[] args) {
	/*
	 * 向上塑性 ： 一定会引发对象的多态
	 */
	//父类引用指向子类对象（实例）
	Hero hero=new ADHero();
	hero.attack();
	hero.attack("李四");
	/*
	 * 向下塑性：把父类引用转为子类
	 */
	((ADHero) hero).buyAD();
	
	}
}
