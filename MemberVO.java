
public class MemberVO {// VO = value object
	// Class 는 자료형이다 ( 레퍼런스 형 )
	// class의 구조는 크게 2가지로 정의된다
	// 필드 : 데이터를 저장할 수 있는 변수
	private String name;
	private int age;
	private double height;
	private boolean marriage;
	// private : 외부 접근 금지

	// * 기본생성자 -> 객체를 만든다
//	public Member() {
//		
//	}
	// 1. 리턴타입이 없다
	// 2. Class와 이름이 같다
	// 3. 객체 생성시 무조건 호출해야한다

	// * 사용자 정의 생성자
	public MemberVO(String name, int age, double height, boolean marriage) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}
	// 메소드 : 기능을 실행하는 녀석
	// 데이터 보호를 위해 사용 ( 전처리가 가능 )

	// ALT SHIFT S -> GETTER AND SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isMarriage() { // boolean 리턴으로는 is로씀
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", marriage=" + marriage + "]";
	}

}
