package workshop04;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Kim",100,90,95,89);
		Student s2 = new Student("Lee",60,70,99,98);
		Student s3 = new Student("Park",68,86,60,40);

		double s1_avg = s1.getAvg();
		double s2_avg = s2.getAvg();
		double s3_avg = s3.getAvg();
	
		
		System.out.println("Kim 평균: "+s1_avg+ " 학점: "+s1.getGrade(s1_avg)+"학점");
		System.out.println("Lee 평균: "+s2_avg+ " 학점: "+s2.getGrade(s2_avg)+"학점");
		System.out.println("Park 평균: "+s3_avg+ " 학점: "+s3.getGrade(s3_avg)+"학점");
		
	}

}
