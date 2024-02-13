class father{
	int balance=0;
	static String surname;
	static boolean status;
	
	public static void main(String []args){
		father son=new father();
		System.out.println(son.fun(10,20,30));
	
	
	}
	
		public int fun(int...a){
		
			return a[2];
		
		}
		
}
