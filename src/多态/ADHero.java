package ��̬;

public class ADHero extends Hero{

	@Override
	public void attack() {
	System.out.println("�Ҳ��Ǳ���");
	}
	
	public void buyAD() {
		System.out.println("��ADװ��");
	}
	
	public static void main(String[] args) {
	/*
	 * �������� �� һ������������Ķ�̬
	 */
	//��������ָ���������ʵ����
	Hero hero=new ADHero();
	hero.attack();
	hero.attack("����");
	/*
	 * �������ԣ��Ѹ�������תΪ����
	 */
	((ADHero) hero).buyAD();
	
	}
}
