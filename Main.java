import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ��μ��� ������ �����غ���( �̸�, ����, Ű, ��ȥ���� )
		MemberVO m1 = new MemberVO("��μ�", 31, 186.5, false); // ���θ��� Member�� �ּҸ� ��ü m1����
		MemberVO m2 = new MemberVO("��μ�", 31, 186.5, false); // ���θ��� Member�� �ּҸ� ��ü m1����
		MemberVO m3 = new MemberVO("��μ�", 31, 186.5, false); // ���θ��� Member�� �ּҸ� ��ü m1����
		MemberVO m4 = new MemberVO("��μ�", 31, 186.5, false); // ���θ��� Member�� �ּҸ� ��ü m1����
		System.out.println(m1.toString());
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
	}

}
