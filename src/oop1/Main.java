package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CustomerManager customerManager;//102
        CustomerManager customerManager2=new CustomerManager();//102
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
	}

}
