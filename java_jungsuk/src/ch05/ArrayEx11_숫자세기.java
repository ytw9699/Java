package ch05;
class ArrayEx11_���ڼ��� {
	public static void main(String[] args) {
		
		int[] numArr  = new int[10];
		int[] counter = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
			numArr[i] = (int)(Math.random() * 10); // 0~9�� ������ ���� �迭�� ����
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i=0; i < numArr.length ; i++ ) {
			counter[numArr[i]]++;//ī���͹迭�� �����(0�����ʱ�ȭ�Ǿ��ִ°�)
			//���� Ƚ���� 1�� ���������ִ°�
		}

		for (int i=0; i < numArr.length ; i++ ) {
			System.out.println( i +"�� ���� :"+ counter[i]);
		}
	} // main�� ��
}
