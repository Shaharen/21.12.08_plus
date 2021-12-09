
public class MemberVO {// VO = value object
	// Class �� �ڷ����̴� ( ���۷��� �� )
	// class�� ������ ũ�� 2������ ���ǵȴ�
	// �ʵ� : �����͸� ������ �� �ִ� ����
	private String name;
	private int age;
	private double height;
	private boolean marriage;
	// private : �ܺ� ���� ����

	// * �⺻������ -> ��ü�� �����
//	public Member() {
//		
//	}
	// 1. ����Ÿ���� ����
	// 2. Class�� �̸��� ����
	// 3. ��ü ������ ������ ȣ���ؾ��Ѵ�

	// * ����� ���� ������
	public MemberVO(String name, int age, double height, boolean marriage) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}
	// �޼ҵ� : ����� �����ϴ� �༮
	// ������ ��ȣ�� ���� ��� ( ��ó���� ���� )

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

	public boolean isMarriage() { // boolean �������δ� is�ξ�
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
