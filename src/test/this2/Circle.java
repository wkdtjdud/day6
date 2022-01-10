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
	//반지름이 r인 원의 둘레 계산 메소드
	public void calcCircum() {
		Circum = 2*Math.PI*r;
	}
	//반지름이 r인 원의 면적 계산하는 메소드
	public void calcArea() {
		area = Math.PI*Math.pow(r,  2);
	}
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);
	}
	
}
