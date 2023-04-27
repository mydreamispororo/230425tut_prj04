package member;

import member.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		
		Register[] person = new Register[5];
		
		person[0] = new Register();
		person[1] = new Register();
		person[2] = new Register();
		person[3] = new Register();
		person[4] = new Register();
		
		person[0].setUserid("abcde");
		person[0].setPasswd("1234");
		person[0].setUsername("홍길동");
		person[0].setBirth(230425);
		person[0].setGender("여");
		person[0].setEmail("hong@naver.com");
		person[0].setTel("010-1234-5678");
		
		person[1].setUserid("abcde");
		person[1].setPasswd("1234");
		person[1].setUsername("홍길동");
		person[1].setBirth(230425);
		person[1].setGender("여");
		person[1].setEmail("hong@naver.com");
		person[1].setTel("010-1234-5678");
		
		person[2].setUserid("abcde");
		person[2].setPasswd("1234");
		person[2].setUsername("홍길동");
		person[2].setBirth(230425);
		person[2].setGender("여");
		person[2].setEmail("hong@naver.com");
		person[2].setTel("010-1234-5678");
		
		person[3].setUserid("abcde");
		person[3].setPasswd("1234");
		person[3].setUsername("홍길동");
		person[3].setBirth(230425);
		person[3].setGender("여");
		person[3].setEmail("hong@naver.com");
		person[3].setTel("010-1234-5678");
		
		person[4].setUserid("abcde");
		person[4].setPasswd("1234");
		person[4].setUsername("홍길동");
		person[4].setBirth(230425);
		person[4].setGender("여");
		person[4].setEmail("hong@naver.com");
		person[4].setTel("010-1234-5678");
				
//		for(Register p : person) {
//			System.out.println(p.disp());
//		}
		
		for(int i = 0; i < person.length; i++) {
			System.out.println("<------------>");
			System.out.println(person[i].disp());
		}
		
		
		

	}

}
