
public class test14 {

	public static void main(String[] args) {
		String mesg = "100/200";
		
		String first = mesg.substring(0,3);
		String second = mesg.substring(4,7);
		int firstNum = Integer.parseInt(first);
		int secondNum = Integer.parseInt(second);
		System.out.println("정수값 합계: "+ (firstNum+secondNum));
		System.out.println("정수값 평균: "+ (firstNum+secondNum)/2);
	}

}
