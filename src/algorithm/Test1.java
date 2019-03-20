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
	//	1-110���� �ڿ����� ���� ���ϴ� �˰����� �����϶�
	public void test101() {
		int sum = 0;
		int num = 1;
		
		while(num<110) {
			sum += num;
			num++;
		}
		System.out.println("test101. 1~110������ �� : " + sum);
	}//end test101
	
	//���δٸ� �ڿ��� 2���� �޾Ƶ鿩 �� ���̿� �����ϴ� �ڿ����� �հ� 
	//3�ǹ���� ������ ���� ���ϴ� �˰����� �����϶�
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
			su1 = rd2; //������ su1
			su2 = rd1; //ū�� su2
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
		System.out.println("test102. ���� �ٸ� �ڿ��� "+rd1+","+rd2+"������ �� : "+sum+",3����� ������ �� : "+sum3);
	}//end test102
	
	//���������� ���Ͽ� 210��° ���ڱ����� ���� ���ϴ� �˰���
	//���������̶� �� �׿� ������ ���� ���ؼ� ���� ���� ����ٴ� ��Ģ�� �ִ�.
	public void test103() {
		int s = r.nextInt(9)+1; //����
		int d = r.nextInt(9)+1;	//����
		
		int sum = s;
		int i = 2;	//�տ� ���װ��� �ְ� �����ϴ� ���, ���� 2��° �׺��� ���ش�.
		while(i<=210) {
			int a = s+(d*(i-1));	//�� ���� ��
			sum += a; i++;
		}
		System.out.println("test103. �������� "+s+"����"+d+"�� ���� ������ 210��° ���ڱ����� ��"+sum);
	}//end test103
	
	//�������� ���Ͽ� 110��° ���ڱ����� ���� ���ϴ� �˰���
	//�������̶� �� �׿� ������ ���� ���ؼ� ���� ���� ����ٴ� ��Ģ�� �ִ�.
	public void test104() {
		int s = r.nextInt(9)+1;
		int rr = r.nextInt(9)+1;
		
		int sum = s;
		int i = 2;
		while(i<=110) {
			int a = s+(rr*(i-1)); //�� ���� ��
			sum+=a; i++;	
		}
		System.out.println("test104. ������ "+s+"����"+rr+"�� ���� ������ 110��° ���ڱ����� ��"+sum);
	}
	
	// �Ǻ���ġ ������ ���Ͽ� 110��° �ױ��� ���ϴ� �˰��� ����
	// �Ǻ���ġ �����̶� �տ� ���ӵ� 2���� ���� ���Ͽ� ���ο� ���� �����ϴ� ����
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
		System.out.println("test105. �Ǻ���ġ 1~110�� �� : " + sum);

	}// end test105()
	
	//������ ���� ���Ͽ� ����ϴ� �˰����� ����
	//�����̶� 1���� N������ ���� ���Ѵ�.
	public void test106() {
		int i = 1;
		long f= 1;
		long sum = 1;
		
		while(i<20) {
			i++;
			f *= i;
			sum += f;
		}
		System.out.println("test106. 1~20 ������ �� : " + sum);
	}
	
	//���� �ڿ��� ���� 1~110 - + ���� ������� �����ϴ� �˰����� �����Ͻÿ�.
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
		System.out.println("test107. 1~110 ���� �ڿ��� ���� ��� : "+sum);
	}
	
	//���� �м� ���� 1~50 n/(n+1)(n+2) -+ ���� ������� ���ѻ�� �˰����� �����Ͻÿ�.
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
		System.out.println("test108. ��� : "+sum);
	}
	
	
	
	//main
	public static void main(String[] args) {
		new Test1();
	}//end main
	
	
}//end class 