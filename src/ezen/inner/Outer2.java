package ezen.inner;

public class Outer2 {
	static String name = "널";

	public void outerMethod() {
		System.out.println("외부클래스 출력입니다.");
		Inner inner = new Inner();
		inner.innerMethod();
	}

	// 정적 멤버 내부 클래스
	// 외부클래스의 보조적(Helper) 역할의 클래스
	static class Inner {
		int age = 10;

		public void innerMethod() {
			System.out.println("내부클래스 출력입니다.");
			// 외부클래스의 멤버를 접근할 수 있다.
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.outerMethod();

		// 외부에서 내부클래스 사용시
		Outer2.Inner inner = new Outer2.Inner();
		inner.innerMethod();
	}
}
