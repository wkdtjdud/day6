package test.this2;

public class PrintCircle {

	public static void print(Circle c) {
		System.out.printf("반지름 %dcm인 원의 둘레는 %.2fcm이다.\n", c.getR(), c.getCircum());
		System.out.printf("반지름 %dcm인 원의 둘레는 %.2fcm이다.\n", c.getR(), c.getArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7);
		c.showInfo();
		
		Circle c2 = new Circle(15);
		c2.showInfo();

	}

}
