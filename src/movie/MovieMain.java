package movie;

public class MovieMain {

	public static void main(String[] args) {
		// 클래스 Movie 를 생성자 무비 m1에 객체화
			Movie m1= new Movie("1917", 11000, 10, "인터넷");
			//클래스 Movie 를 생성자 무비 m2에 객체화
			 Movie m2= new Movie("주디",15000,25,"현장");
			 //클래스 Movie 를 생성자 무비 m3에 객체화
			 Movie m3= new Movie("인비저블맨",12500,40,"쿠폰");
			 // 생성자 매개변수에 값을 넣어주고 m1에 있는 메서드명 titlePrint 실행문을 불러옴
			 m1.titlePrint();
			 //생성자 매개변수에 값을 넣어주고 m1에 있는 메서드명 dataPrint 실행문을 불러옴
			 m1.dataPrint();
			//생성자 매개변수에 값을 넣어주고 m2에 있는 메서드명 dataPrint 실행문을 불러옴
			 m2.dataPrint();
			//생성자 매개변수에 값을 넣어주고 m3에 있는 메서드명 dataPrint 실행문을 불러옴
			 m3.dataPrint();

	}

}
