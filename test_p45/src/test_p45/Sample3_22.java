package test_p45;

public class Sample3_22 {
	public static void main(String[] args) {
		System.out.println("�ŧicar1");
		Car car1=new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("�ŧicar2");
		Car car2;
		
		System.out.println("�Ncar1���w��car2");
		car2=car1;
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.setCar(2345,30.5);
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
	}
}
class Car{
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}