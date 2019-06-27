package ch05_배열;
class ArrayEx16_커맨드라인으로입력값 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);

		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
