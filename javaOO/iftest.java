import java.util.*;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(6) + (1);
		int b = r.nextInt(6) + (1);
		System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�. ���� ���ڴ� " + b + ", ���� �ֻ����� �����ϴ�. ���� ���ڴ� :" + a);
		if (a > b)
			System.out.println("����!!! ���� �����ϴ�.");
		else if (a == b)
			System.out.println("�����ϴ�.");
		else
			System.out.println("�̷�, ���� ��� �Ҿ����ϴ�.");

		Scanner input = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3)�� �����ϼ���.");
		int s = input.nextInt();
		int m = r.nextInt(3) + (1);

		if (s == 1 && m == 3) {
			System.out.println("��ǻ�ʹ� ��, ����� ������ �½��ϴ�.");
			System.out.println("����� �̰���ϴ�.");
		} else if (s == 2 && m == 1) {
			System.out.println("��ǻ�ʹ� ����, ����� ������ �½��ϴ�.");
			System.out.println("����� �̰���ϴ�.");
		} else if (s == 3 && m == 2) {
			System.out.println("��ǻ�ʹ� ����, ����� ���� �½��ϴ�.");
			System.out.println("����� �̰���ϴ�.");
		} else if (s == 1 && m == 1) {
			System.out.println("��ǻ�ʹ� ����, ����� ������ �½��ϴ�.");
			System.out.println("�����ϴ�.");
		} else if (s == 2 && m == 2) {
			System.out.println("��ǻ�ʹ� ����, ����� ������ �½��ϴ�.");
			System.out.println("�����ϴ�.");
		} else if (s == 3 && m == 3) {
			System.out.println("��ǻ�ʹ� ��, ����� ���� �½��ϴ�.");
			System.out.println("�����ϴ�.");
		} else if (s == 1 && m == 2) {
			System.out.println("��ǻ�ʹ� ����, ����� ������ �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (s == 2 && m == 3) {
			System.out.println("��ǻ�ʹ� ��, ����� ������ �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else {
			System.out.println("��ǻ�ʹ� ����, ����� ���� �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		
		//if(s == 1) System.out.printlin("����") else if(s == 2) 
		}
	}

}
