package q_3���ܸ����5;

import java.io.IOException;

public class a{
    void throwArithmeticException(){
        throw new ArithmeticException();//�̰Ŵ� �������̾ȶߴµ�..
        //�ֳĸ� �θ��߿� RuntimeException�� �־� ��üũƮ �̼����̶� ���� 
    }  //trycatch�� throws�� ����ؼ� ���ܸ� ó�� ���ص���
    void throwIOException(){
      //  throw new IOException();//������ �̰Ŵ¶��..���ϱ� 
    //	����ó���� �����ϱ⶧��
    }//�� IOException�� �θ��߿� RuntimeException�� ������ checked�̼����̶���
    //checked�� �ݵ��  trycatch�� throws�� ����ؼ� ���ܸ� ó���ؾ���,�ƴϸ� �������ϴ���

}
class bb{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();//���ܹ߻���Ű��
        } catch (IOException e) {//���
            e.printStackTrace();
        }
    } 
    void throwIOException2() throws IOException{//1.�̸� �����ʰ� ������
        throw new IOException();//2.���ܹ߻���Ű��
    }
}
