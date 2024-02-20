class primeNumber{
	public static void main(String[] args)
	{
		int i,j;
		int counter = 0;
		int c=0,k=0;
 
		int a[] = new int[100];
 		primeNumber.generateRandomNumber(a);
 		
		for(i=0;i<a.length;i++){
	           counter=0;
            		for(j=2;j<a[i];j++){
	                 	if(a[i]%j==0){
	                       		counter=1;
	                       		break;
	                 	}
	           	}
	           if(counter==1){
	          c++;
                   }		  
		  else{
		  k++;
		  }		  
		}
		System.out.printf("Total Prime Number In Array is %d\n",k);
		System.out.printf("Total NOT Prime Number In Array is %d\n",c);

    }
    public static void generateRandomNumber(int []a)
    {
    	long number =0l;
    	for(int i=0;i<a.length;i++)
    	{
    		number = System.nanoTime();
    		
    		if(number%9999999 < 10000000)
    		{
    			
    				number += System.nanoTime();
    			
    		}
    		a[i] = (int)Math.abs(number%(int)9999999);
    		
    		number += System.nanoTime();	
      }
}

}
