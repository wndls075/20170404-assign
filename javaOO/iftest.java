import java.util.*;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(6) + (1);
		int b = r.nextInt(6) + (1);
		System.out.println("컴퓨터가 주사위를 던집니다. 나온 숫자는 " + b + ", 내가 주사위를 던집니다. 나온 숫자는 :" + a);
		if (a > b)
			System.out.println("빙고!!! 돈을 땄습니다.");
		else if (a == b)
			System.out.println("비겼습니다.");
		else
			System.out.println("이런, 돈을 모두 잃었습니다.");

		Scanner input = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3)을 선택하세요.");
		int s = input.nextInt();
		int m = r.nextInt(3) + (1);

		if (s == 1 && m == 3) {
			System.out.println("컴퓨터는 보, 당신은 가위를 냈습니다.");
			System.out.println("당신이 이겼습니다.");
		} else if (s == 2 && m == 1) {
			System.out.println("컴퓨터는 가위, 당신은 바위를 냈습니다.");
			System.out.println("당신이 이겼습니다.");
		} else if (s == 3 && m == 2) {
			System.out.println("컴퓨터는 바위, 당신은 보를 냈습니다.");
			System.out.println("당신이 이겼습니다.");
		} else if (s == 1 && m == 1) {
			System.out.println("컴퓨터는 가위, 당신은 가위를 냈습니다.");
			System.out.println("비겼습니다.");
		} else if (s == 2 && m == 2) {
			System.out.println("컴퓨터는 바위, 당신은 바위를 냈습니다.");
			System.out.println("비겼습니다.");
		} else if (s == 3 && m == 3) {
			System.out.println("컴퓨터는 보, 당신은 보를 냈습니다.");
			System.out.println("비겼습니다.");
		} else if (s == 1 && m == 2) {
			System.out.println("컴퓨터는 바위, 당신은 가위를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (s == 2 && m == 3) {
			System.out.println("컴퓨터는 보, 당신은 바위를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		} else {
			System.out.println("컴퓨터는 가위, 당신은 보를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		
		//if(s == 1) System.out.printlin("가위") else if(s == 2) 
		}
	}

}
