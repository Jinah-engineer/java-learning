package p11.lecture.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	// 매개값이 Member 타입인지 확인
			Member member = (Member) obj;	 // Member 타입으로 강제 타입 변환하고 id 필드값이 동일한 지 검사한 후, 동일하다면 true 리턴
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false; // 매개값이 Member타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
}
