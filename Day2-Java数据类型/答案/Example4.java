package demoDay02;

public class Example4 {

	/**
	*���ó����������ͼ��:
	 *
	 *	*  
	 *	** 
	 *	**** 
	 *	****** 
	 *	**** 
	 *	**
	 *	* 
	 */
	public static void main(String[] args) {

		int sum = 5;  //һ��Ĵ�С

		for (int i = 1; i <= sum; i++) {  //����ѭ��
			for (int j = 1; j <= i * 2 - 1; j++) {  //�ǺŸ���ѭ��
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = sum - 1; i > 0; i--) {//����ѭ��
			for (int j = 1; j <= i * 2 - 1; j++) {//�ǺŸ���ѭ��
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
