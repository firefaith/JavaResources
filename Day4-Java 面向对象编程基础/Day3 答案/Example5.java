package demoDay03;

public class Example5 {

	/**
	 * @author 
	 * 
	 * ��д���򣬽�һ�������е�Ԫ�ص��Ź���������ԭ����Ϊ1��2��3��4��5��
	 *  ���ź������е�ֵΪ5��4��3��2��1��
	 */
	public static void main(String[] args) {
		
		int []num = new int [10];
		int num1;
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		for (int i = 1; i <= num.length/2; i++) {
			 num1 = num[i-1];
			num[i-1] = num[num.length-i];
			num[num.length-i] = num1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
