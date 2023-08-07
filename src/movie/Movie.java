package movie;

/*
1. 프로젝트명 : 영화 예매 하기(MovieTicketProject)

패키지명 : movie

2. 클래스명 : MovieMain.java -- main( )가 있는 경우(Movie.java--라이브러리클래스)

3. 생성자 초기값 넣기로 자료를 넣어 주세요.

  입력자료 : 영화명, 금액, 나이, 구매방법(현장, 인터넷, 쿠폰)

실구매금액조건 => switch~ case

1) 나이가 20미만이면 25% 할인, 나이가 20~30이면 20%할인, 30이상이면 15%할인

2) 현장구매인 경우 0%할인, 인터넷 구매인 경우 추가 5%할인, 쿠폰구매인 경우 10%할인

 예) 1째줄은 11000 * 70% = 7700

 2째줄은 15000 * (100%-20%) = 12000

 3째줄은 12500 * (100%-(15%+10%)) = 9375

4. 입력자료 => Scanner 클래스를 main에 지정한다. => MovieMain.java

1째 레코드(줄) => 1917 11000 10 인터넷

2째 레코드(줄)==> 주디 1500025 현장

3째 레코드(줄)==> 인비저블맨 12500 40 쿠폰
*/
public class Movie {
	// 메서드 titlePrint를 불렀을때 영화명 금액 나이 실구매가격을 나오게 만든다.
	void titlePrint() {
		System.out.println("영화명\t\t금액\t\t나이\t\t실구매가격\n");}
	//필드 지정 전역변수
	String movieName;//영화명
	//필드 지정
	int price;//금액
	//필드 지정
	int age;//나이
	//필드 지정
	int money;//실구매금액
	//필드 지정
	double rate;//할인율
	//필드 지정
	String way;//구매방법
	

	//생성자생성 위에 필드에 값이 없기 떄문에 데이터타입 메서드 생성

	 Movie(String movieName, int price, int age, String way ) {

	//매개변수로 값을 받아서 멤버변수에 넣기
    // 필드에 있는 무비네임 = 생성자에 있는 무비네임을 넣어주기 위해서 this사용 
	this.movieName = movieName;

	this.price = price;

	this.age = age;

	this.way = way;
	
	}
	
	//메소드 1. 할인율 ->void rateCal()
	
	//2. 실구매금액 ->void moneyCal()
	
	//3. 제목인쇄하기 ->void titlePrint()
	
	//4. 내용 출력하기 ->void dataPrint()
	
	// 메서드명이 dataPrint 메서드를 만들어주고 rateCal을 호출하고 moneyCal을 호출하고 밑에 출력문이 나오게 만들기
	void dataPrint() {
		
	rateCal();
	moneyCal();
		
	System.out.println(movieName+"\t\t"+price+"\t\t"+age+"\t\t"+money+"\n");	
	}
	
	
	// 메서드명 moneyCal(실구매가격) 메서드  생성
	void moneyCal() {// 강제변환시켜주기 돈은 실수타입이 없으니깐 정수타입인 int로 강제변환 해줬다
		money=(int)(price-(price*rate));	
	}
	
	// 메서드명 rateCal(할인율) 메서드 생성
	void rateCal() {
		
	switch(way){ 
	// 구매방법이 인터넷이고 나이가 20미만일때 rate	 0.3
	case ("인터넷"):
	
	if(age<20)
	rate= (0.3);
		// if 문에서 틀렸다면 내려온다  나이가 20이상이고 30미만일때 rate 0.25		
    else if(age>= 20 && age<30)
	rate= (0.25);
				
	// 그것도 아니면 할인율은 0.2			
    else
	rate=(0.2);
	// break문을 안쓰면 쭊 반환값이 case 현장 if문까지 내려감
	break;
	// 방법이 "현장 이였을떄
	case "현장":
		//나이가 20미만 일때 할인율 0.25	
		if(age<20)
		rate= 0.25;
			// 아니면 나이가 20이상 이고 30미만 일때	 rate 0.20
		else if(age>=20&& age<30)
		rate = 0.20;
			//그것도 아니면 또 내려와서 rate가 0.15
		else
		rate = 0.15;
		// break 안쓰면 값이 내려옴
		break;
	// way가 쿠폰일때
			case "쿠폰":
				//나이가 20미만 일떄 rate 0.35
				if(age<20)
				rate= (0.35);
				// 나이가 20이상 이고 30미만 일때 rate 0.3
				else if(age>=20 && age<30)
				rate= (0.20+0.10);
				//그것도 아니면 값이 내려와서 rate 0.35
				else
				rate= (0.25);
				
						
		}
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	

