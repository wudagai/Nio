package 多态;

public class Hero {
	//攻击方法
	public void attack() {
		System.out.println("我攻击");
	}
	
	public void attack(String name) {
		System.out.println(name+"攻击了我");
		
	}
	
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.attack();
		hero.attack("张三");
	}
}
