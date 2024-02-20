class College{
	public College(){
	System.out.println("College Constructor is called");
	
	}

}
class SGGS extends College{

	public SGGS(){
		System.out.println("SGGS Constructor is called");
	}


	public static void main(String []args){
	SGGS sggs=new SGGS();
	
	}

}

class father extends SGGS{
	int balance =123;
	static public String surname;
	static boolean status;

	public father(int balance){
		System.out.println(balance=123456);
		System.out.println(balance);
		
	
	}
	public father(float balance){
		if(balance+0.2==0.5){
		System.out.println(balance=123456);
		}
			System.out.println(balance);
			System.out.println(balance+0.2);
	
	}
	
	
	static public void main(String args[]){
	father son;
	father daughter=new father(0.3f);
	System.out.println(daughter.balance);
	}





}
