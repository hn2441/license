package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
	Random rd = new Random();
	
	public Test2() {
		test201();
		test202();
		test203();
		test204();
		test205();
		test206();
		test207();
		test208();
		test209();
	}
	//80점 이상인 학생의 수
	public void test201() {
		int[] jumsu = new int[100];
		int count = 0;
		for(int i=0; i<jumsu.length;i++) {
			jumsu[i] = rd.nextInt(50)+rd.nextInt(50);
			if(jumsu[i]>=80) {
				count++;
			}
		}
		System.out.println("test201. 80점 이상인 학생 : "+count+"명");
			
	}
	
	//영어100점인 학생중 수학 1등인 학생의 수학점수는?
	public void test202() {
		int[] eng = new int[200];
		int[] math = new int[200];
		int bestI = 0;
		for(int i=0; i<eng.length;i++) {
			int r = rd.nextInt(5);
			math[i] = rd.nextInt(50) + rd.nextInt(50);
			if(r==0) {
				eng[i]=100;
				if(math[i]>math[bestI]) {
					bestI=i;
				}
			}else {
				eng[i] = rd.nextInt(35)+rd.nextInt(35)+rd.nextInt(30);
			}
		}
		System.out.println("test202. 영어100중 가장 높은 수학점수를 가진 학생의 수학점수 : "+math[bestI]);
	}
	
	//한달동안 사용하는 총 통화시간을 토대로 일일 평균 통화시간을 구하는 알고리즘을 제시
	//한달은 30일, 매일(i)의 통화시간은 변수 T(i)에 저장된다.
	//일일 통화시간이 200초 이하면 무료서비스, 통화시간에서 제외, 평균 통화시간 산정하는 과정에서도 제외
	public void test203() {
		int[] t = new int[30];
		int avg = 0;
		int day = 0;
		for(int i=0;i<t.length;i++) {
			t[i]=rd.nextInt(200)+rd.nextInt(200)+rd.nextInt(200);
			if(t[i]>200) {
				avg+=t[i];
				day++;
			}
		}
		System.out.println("test203. 일일 평균 통화시간 : "+ String.format("%,.1f", (double)avg/day));
	}
	
	//1~100사이에서 가장 큰 소수를 구하는 알고리즘을 제시
	public void test204() {
		int i=2;	//1~100따라가는 변수
		int j=0;	//1~100따라가면서 해당 수를 나눠주는 변수
		int p=0;	//최대 소수를 담아주는 변수
		while(i<=100){	//1~100돌아가는 중
			int count=0;//나눠진 횟수 카운트 초기화
			j=i;	//j에 i 넣어주기
			while(j>1) {	//j는 2까지만 
				if(i%j==0) { //i/j나머지가 없는경우
					count++; //횟수 카운트 +1
				}//end if
				j--;		//j점점 작아지게
			}//end inner while()
			if(count==1) { //i가 한번만 나눠떨어진경우
				p=i;	//소수를 담아주기
			}
			i++;
		}//end outer while()
		System.out.println("test204. 1~100사이에서 가장 큰 소수 : "+p);
	}
	
	//소인수분해
	public void test205() {
		int n = 132; //기준 수
		List<Integer> list = new ArrayList<Integer>();
		while(n<2) {
			int i=2;//i값 초기화
			if(n%i==0) { //i로 나누어떨어지는 경우
				list.add(n/i);
				n=n/i;
			}//end if
			while(true) {
				i++;
				double tmp = Math.sqrt(i);
				int M = (int)tmp;
				for(int j=2;j<=M;j++) {
					int R = i%j;
					if(j==M) {
						break;
					}
				}
				
			}
			
		}
	}
	
	public void test206() {
		
	}
	
	public void test207() {
		
	}
	
	public void test208() {
		
	}
	
	public void test209() {
		
	}

	public static void main(String[] args) {
		new Test2();
	}

}
