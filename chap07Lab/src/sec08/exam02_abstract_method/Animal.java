package sec08.exam02_abstract_method;

public abstract class Animal {
	//�߻�Ŭ������ �������
	//�ʼ�
	public String kind;

	//������
	
	//�Ϲݸ޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	//�߻�޼ҵ�
	public abstract void sound();//{}�� ����, �ڵ����� �ڽ�Ŭ������ �����ǵ�, ���������� �ݿ�
}