package test.this2;

public class Circle {
	private int r;
	private double Circum, area;
	
	public Circle(int r) {
		this.area = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return Circum;
	}

	public double getArea() {
		return area;
	}
	//�������� r�� ���� �ѷ� ��� �޼ҵ�
	public void calcCircum() {
		Circum = 2*Math.PI*r;
	}
	//�������� r�� ���� ���� ����ϴ� �޼ҵ�
	public void calcArea() {
		area = Math.PI*Math.pow(r,  2);
	}
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);
	}
	
}
