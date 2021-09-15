package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		//ó���ؾ��� ���� ���� ���� �ð����̰� ���� ��
		//�ܼ��� ��ȸ�뵵�� ������ ArrayList�� ȿ�����̰�
		//�ڷ��� ���� ���� ���� �ؾ��� ���� LinkedList�� �� ȿ������
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int  i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� :"+(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int  i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("linked �ɸ��ð� :"+(endTime-startTime)+"ns");
	}

}