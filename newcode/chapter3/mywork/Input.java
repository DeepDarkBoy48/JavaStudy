import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ�� 
public class Input { 

	//��дһ��main����
	public static void main(String[] args) {
		//��ʾ�����û�������
		//����
		//Scanner�� ��ʾ ���ı�ɨ��������java.util ��
		//1. ����/���� Scanner�����ڵİ�
		//2. ���� Scanner ���� , new ����һ������,���
		//   myScanner ���� Scanner��Ķ���
		Scanner myScanner = new Scanner(System.in);
		//3. �����û������ˣ� ʹ�� ��صķ���
		System.out.println("����������");

		//������ִ�е� next ����ʱ����ȴ��û�����~~~
		String name=myScanner.next();
		System.out.println(name);
	}
}