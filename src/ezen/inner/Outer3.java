package ezen.inner;

public class Outer3 {
	String name;
	
	public void doTask() {
		
		int x = 10;
		
		System.out.println("doTask() 메소드 실행");
		
		// 지역 내부 클래스
		class Helper{
			public void someDo() {
				System.out.println("someDo() 메소드 실행");
				name = "ㅎㅎ";
				System.out.println(x);
			}
		}
		
		Helper helper = new Helper();
		helper.someDo();
	}
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		outer3.doTask();
	}
}
