package OssExma09;

public class Main {
	public static double fact(int n) {
	if(n<=1) {
		return n;
	}			
	else {
		return fact(n-1)*n;
	}		
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
		
		double a = 0;
		
		for(int i = 1; i <= 100; i++) {
			a += (fact(4*i)*(1103 + 26390*i)/(Math.pow(fact(i),4)*Math.pow(396,4*i)));
		}
		System.out.println("라마누잔 공식");
		System.out.println("원주율 :" + 1/(a*2/9801));
	}

}
