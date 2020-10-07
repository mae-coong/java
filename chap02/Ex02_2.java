package chap02;

public class Ex02_2 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; byte타입은 -128~127까지 허용되기 때문에 컴파일 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		
		//기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주함
		//그래서 int타입의 허용범위를 초과할 경우 long타입임을 알려줘야 함
		//방법은 정수 리터럴 뒤에 대문자 L을 붙이면 됨
		
		//long var7 = 30000000000;
		long var8 = 30000000000L;
	}

}
