package chap02;

public class Ex02_2 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; byteŸ���� -128~127���� ���Ǳ� ������ ������ ���� �߻�
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		
		//�⺻������ �����Ϸ��� ���� ���ͷ��� int Ÿ������ ������
		//�׷��� intŸ���� �������� �ʰ��� ��� longŸ������ �˷���� ��
		//����� ���� ���ͷ� �ڿ� �빮�� L�� ���̸� ��
		
		//long var7 = 30000000000;
		long var8 = 30000000000L;
	}

}
