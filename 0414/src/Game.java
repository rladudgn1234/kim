import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1: 가위 2 :바위  3:보]");
		
		int user = sc.nextInt();
		int com = (int) (Math.random() *3+1-1)+1;

	}
}
