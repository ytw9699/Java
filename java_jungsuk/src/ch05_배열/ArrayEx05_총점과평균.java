package ch05_�迭;
class ArrayEx05_��������� {
	public static void main(String[] args) {
		
		int sum =0;				// ������ �����ϱ� ���� ����
		float average = 0f;		// ����� �����ϱ� ���� ����
		System.out.println("��� : " + average);

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}

		average = sum / (float)score.length ; // ������� float�� ��� ����.

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}
