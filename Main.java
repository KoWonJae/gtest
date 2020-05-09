package OssExma09;

public class Main {
	public static void john() {
		double f = 1;
		double num = 1;
		double num2 = 2;
		double num3 = 2;
		double num4 = 3;
		for(int i = 0; i <= 10000000; i++) {
			if(i%2 == 0) {
				f = f*(num/num2);
				num = num +2;
				num2 = num2 + 2;
			} else {
				f = f*(num4/num3);
				num3 = num3 +2;
				num4 = num4 + 2;
			}
			
		}
		System.out.println("월리스 곱셈 공식");
		System.out.println("원주율 :" + (2/f));
	}
	
	public static void main(String[] args) {
		double m = 1;
		double num = 0;
		for(int i = 1; i <= 100000000 ; i++) {
			num += m/(2*i -1);
			m = -m;			
		}
		System.out.println("라이프니츠 급수");
		System.out.println("원주율 :" + (4 * num));
		john();
	}

}
