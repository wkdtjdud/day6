package test.this2;

public class PrintCircle {

	public static void print(Circle c) {
		System.out.printf("������ %dcm�� ���� �ѷ��� %.2fcm�̴�.\n", c.getR(), c.getCircum());
		System.out.printf("������ %dcm�� ���� �ѷ��� %.2fcm�̴�.\n", c.getR(), c.getArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7);
		c.showInfo();
		
		Circle c2 = new Circle(15);
		c2.showInfo();

	}

}
