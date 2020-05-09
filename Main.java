package OssExma09;

public class Main {
	public static void olyer() {
		double num = 0;
		double m = 1;
		for(int i = 0; i <= 10000000; i++) {
			num += 1/(m*m);
			m = m + 1 ;
		}
		System.out.println("오일러 곱셈 공식");
		System.out.println("원주율 :" + Math.sqrt(6 * num));
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
		olyer();
	}

}
