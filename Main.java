import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 장민서의 정보를 저장해보자( 이름, 나이, 키, 결혼유뮤 )
		MemberVO m1 = new MemberVO("장민서", 31, 186.5, false); // 새로만든 Member의 주소를 객체 m1에게
		MemberVO m2 = new MemberVO("장민서", 31, 186.5, false); // 새로만든 Member의 주소를 객체 m1에게
		MemberVO m3 = new MemberVO("장민서", 31, 186.5, false); // 새로만든 Member의 주소를 객체 m1에게
		MemberVO m4 = new MemberVO("장민서", 31, 186.5, false); // 새로만든 Member의 주소를 객체 m1에게
		System.out.println(m1.toString());
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
	}

}
