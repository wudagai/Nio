package ��̬;

public class APHero extends Hero{
	@Override
	public void attack() {
	System.out.println("�Ҳ��Ǳ���������");
	}
	
	public static void main(String[] args) {
		APHero apHero = new APHero();
		apHero.attack();
	}
	
	
}
