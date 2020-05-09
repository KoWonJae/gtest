package OssExma09;

public class Main {

	public static void main(String[] args) {
		double m = 1;
		double num = 0;
		for(int i = 1; i <= 100000000 ; i++) {
			num += m/(2*i -1);
			m = -m;			
		}
		System.out.println("라이프니츠 급수");
		System.out.println("원주율 :" + (4 * num));

	}

}
