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
	//80�� �̻��� �л��� ��
	public void test201() {
		int[] jumsu = new int[100];
		int count = 0;
		for(int i=0; i<jumsu.length;i++) {
			jumsu[i] = rd.nextInt(50)+rd.nextInt(50);
			if(jumsu[i]>=80) {
				count++;
			}
		}
		System.out.println("test201. 80�� �̻��� �л� : "+count+"��");
			
	}
	
	//����100���� �л��� ���� 1���� �л��� ����������?
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
		System.out.println("test202. ����100�� ���� ���� ���������� ���� �л��� �������� : "+math[bestI]);
	}
	
	//�Ѵ޵��� ����ϴ� �� ��ȭ�ð��� ���� ���� ��� ��ȭ�ð��� ���ϴ� �˰����� ����
	//�Ѵ��� 30��, ����(i)�� ��ȭ�ð��� ���� T(i)�� ����ȴ�.
	//���� ��ȭ�ð��� 200�� ���ϸ� ���Ἥ��, ��ȭ�ð����� ����, ��� ��ȭ�ð� �����ϴ� ���������� ����
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
		System.out.println("test203. ���� ��� ��ȭ�ð� : "+ String.format("%,.1f", (double)avg/day));
	}
	
	//1~100���̿��� ���� ū �Ҽ��� ���ϴ� �˰����� ����
	public void test204() {
		int i=2;	//1~100���󰡴� ����
		int j=0;	//1~100���󰡸鼭 �ش� ���� �����ִ� ����
		int p=0;	//�ִ� �Ҽ��� ����ִ� ����
		while(i<=100){	//1~100���ư��� ��
			int count=0;//������ Ƚ�� ī��Ʈ �ʱ�ȭ
			j=i;	//j�� i �־��ֱ�
			while(j>1) {	//j�� 2������ 
				if(i%j==0) { //i/j�������� ���°��
					count++; //Ƚ�� ī��Ʈ +1
				}//end if
				j--;		//j���� �۾�����
			}//end inner while()
			if(count==1) { //i�� �ѹ��� �������������
				p=i;	//�Ҽ��� ����ֱ�
			}
			i++;
		}//end outer while()
		System.out.println("test204. 1~100���̿��� ���� ū �Ҽ� : "+p);
	}
	
	//���μ�����
	public void test205() {
		int n = 132; //���� ��
		List<Integer> list = new ArrayList<Integer>();
		while(n<2) {
			int i=2;//i�� �ʱ�ȭ
			if(n%i==0) { //i�� ����������� ���
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
