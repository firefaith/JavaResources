package demoDay03;

import java.util.Random;

public class Example4 {

	/**
	 * @author 
	 * 
	 * 40���ɼ����մӸߵ��͵�˳���������
	 */
	public static void main(String[] args) {

		int number = 40;
		int[] stu = new int[number];
		int num;
		Random r = new Random(); // ��������� 
		for (int i = 0; i < number; i++) {
			stu[i] = r.nextInt(100);
		}

		for (int i = 0; i < stu.length; i++) {   //��������

			for (int j = 0; j < stu.length; j++) {

				if (stu[i] < stu[j]) {  //һ�����Ƚ����������stuС�ľ͵���
					num = stu[i];
					stu[i] = stu[j];
					stu[j] = num;
				}
			}
		}
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i]+"\t");
		}
	}

}
