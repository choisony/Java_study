import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.정수값 입력하세요: ");
		int first = scanner.nextInt();
		System.out.println("2.정수값 입력하세요: ");
		int second = scanner.nextInt();
		System.out.println("3.정수값 입력하세요: ");
		int third = scanner.nextInt();
		scanner.close();
		
		int temp = (first>second)?first:second;
		int max = (temp>third)?temp:third;
		System.out.println("정수 "+first+" 과 정수 "+second+", 정수 "+third+" 중에서"
				+ " 최대값: "+ max);
	}

}
