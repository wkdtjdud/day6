package test.this3;

public class ThisTest {

		public ThisTest() {
			System.out.println("ThisTest() �����ڰ� ȣ���");
		}
		public ThisTest(int n) {
			System.out.println("Public ThisTest(int n) �����ڰ� ȣ���: "+n);
		}
		public static void main(String args[]) {
			ThisTest tt = new ThisTest();
		}
}
