
public class test13 {

	public static void main(String[] args) {
		String mesg= "     홍길동/이순신/유관순     ";
		System.out.println("문자열 길이(공백포함): "+mesg.length());
		System.out.println("공백제거: "+mesg.trim());
		mesg = mesg.trim();
		System.out.println("부분열: "+mesg.substring(0, 7));
		System.out.println("홍길동 출력 : "+mesg.substring(0, 3));
		System.out.println("유관순 출력 : "+mesg.substring(8, 11));

	}

}
