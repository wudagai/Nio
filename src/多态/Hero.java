package ��̬;

public class Hero {
	//��������
	public void attack() {
		System.out.println("�ҹ���");
	}
	
	public void attack(String name) {
		System.out.println(name+"��������");
		
	}
	
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.attack();
		hero.attack("����");
	}
}
