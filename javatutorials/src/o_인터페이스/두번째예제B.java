package o_�������̽�;
interface I1{
    public void x();
}
interface I2{
    public void z();
}
class �ι�°����B implements I1, I2{
  //�ϳ��� Ŭ������ �������� �������̽��� ���� �� �� �ִ�. 
  public void x(){}//Ŭ���� B�� �޼ҵ� x�� z�� �ϳ��� �������� ������ ������ �߻��Ѵ�.
  public void z(){}//�����ü�� �� Ŭ������ ������ ������ �������̽��� ������ ��������! 
}