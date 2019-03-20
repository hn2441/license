package algorithm;

import java.util.Random;

public class Test1 {
	Random r = new Random();
	
	public Test1() {
		test101();
		test102();
		test103();
		test104();
		test105();
		test106();
		test107();
		test108();
	}
	//	1-110까지 자연수의 합을 구하는 알고리즘을 제시하라
	public void test101() {
		int sum = 0;
		int num = 1;
		
		while(num<110) {
			sum += num;
			num++;
		}
		System.out.println("test101. 1~110사이의 합 : " + sum);
	}//end test101
	
	//서로다른 자연수 2개를 받아들여 그 사이에 존재하는 자연수의 합과 
	//3의배수의 제곱의 합을 구하는 알고리즘을 제시하라
	public void test102() {
		int sum = 0;
		int sum3 = 0;
		
		int rd1 = r.nextInt(99)+1;
		int rd2 = r.nextInt(99)+1;
		while(rd2 == rd1) {
			rd2 = r.nextInt(99)+1;
		}
		
		int su1 = 0; int su2 = 0;
		
		if(rd1>rd2) {
			su1 = rd2; //작은수 su1
			su2 = rd1; //큰수 su2
		}else {
			su1 = rd1;
			su2 = rd2;
		}
		
		for(int i=su1;i<=su2;i++) {
			sum+=i;
			if(i%3==0) {
				sum3+=(i*i);
			}
		}
		System.out.println("test102. 서로 다른 자연수 "+rd1+","+rd2+"사이의 합 : "+sum+",3배수의 제곱의 합 : "+sum3);
	}//end test102
	
	//등차수열에 대하여 210번째 숫자까지의 합을 구하는 알고리즘
	//등차수열이란 각 항에 일정한 수를 더해서 다음 항을 만든다는 규칙이 있다.
	public void test103() {
		int s = r.nextInt(9)+1; //시작
		int d = r.nextInt(9)+1;	//공차
		
		int sum = s;
		int i = 2;	//합에 초항값을 넣고 시작하는 경우, 합은 2번째 항부터 해준다.
		while(i<=210) {
			int a = s+(d*(i-1));	//한 항의 값
			sum += a; i++;
		}
		System.out.println("test103. 등차수열 "+s+"부터"+d+"씩 더한 수열의 210번째 숫자까지의 합"+sum);
	}//end test103
	
	//등비수열에 대하여 110번째 숫자까지의 합을 구하는 알고리즘
	//등비수열이란 각 항에 일정한 수를 곱해서 다음 항을 만든다는 규칙이 있다.
	public void test104() {
		int s = r.nextInt(9)+1;
		int rr = r.nextInt(9)+1;
		
		int sum = s;
		int i = 2;
		while(i<=110) {
			int a = s+(rr*(i-1)); //한 항의 값
			sum+=a; i++;	
		}
		System.out.println("test104. 등비수열 "+s+"부터"+rr+"씩 곱한 수열의 110번째 숫자까지의 합"+sum);
	}
	
	// 피보나치 수열에 대하여 110번째 항까지 구하는 알고리즘 제시
	// 피보나치 수열이란 앞에 연속된 2개의 항을 합하여 새로운 항을 생성하는 수열
	public void test105() {
		long a = 1;
		long b = 1;
		long c = 0;
		long sum = a + b;
		int i = 3;

		while (i <= 110) {
			c = a + b;
			sum += c;
			a = b;
			b = c;
			i++;
		}
		System.out.println("test105. 피보나치 1~110항 합 : " + sum);

	}// end test105()
	
	//누승의 합을 구하여 출력하는 알고리즘을 제시
	//누승이란 1부터 N까지의 곱을 말한다.
	public void test106() {
		int i = 1;
		long f= 1;
		long sum = 1;
		
		while(i<20) {
			i++;
			f *= i;
			sum += f;
		}
		System.out.println("test106. 1~20 누승의 합 : " + sum);
	}
	
	//교행 자연수 수열 1~110 - + 교차 순서대로 연산하는 알고리즘을 제시하시오.
	public void test107() {
		int i=1;
		int sum = 0;
		while(i<101) {
			if(i%2==1) {
				sum+=i;
			}else {
				sum-=i;
			}
			i++;
		}
		System.out.println("test107. 1~110 교행 자연수 수열 결과 : "+sum);
	}
	
	//교행 분수 수열 1~50 n/(n+1)(n+2) -+ 교차 순서대로 연한사는 알고리즘을 제시하시오.
	public void test108() {
		int i=1;
		double f = 0;
		double sum = 0;
		while(i<50) {
			f=(double)i/(i+1)*(i+2);
			if(i%2==1) {
				sum+=f;
			}else {
				sum-=f;
			}
			i++;
		}
		System.out.println("test108. 결과 : "+sum);
	}
	
	
	
	//main
	public static void main(String[] args) {
		new Test1();
	}//end main
	
	
}//end class 