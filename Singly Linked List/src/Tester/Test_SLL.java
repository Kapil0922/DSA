package Tester;

import Logic.SLL;

public class Test_SLL {
	public static void main(String[] args) {

		SLL l1=new SLL();
		
		l1.insertend(10);
		l1.insertend(20);
		l1.insertend(30);
		l1.insertend(40);
		l1.insertend(50);
		//l1.display();
		
		l1.insbeg(60);
		l1.insbeg(70);
		l1.insbeg(80);
		//l1.display();
		
		l1.inspos(100, 2);
		l1.inspos(110, 3);
		l1.display();
		
		l1.delpos(3);
		l1.display();
		
}
}
