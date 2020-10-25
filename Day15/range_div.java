class Range{ 
      
    static void result(int N,int M) 
    {      
         
        for (int num = N; num < M; num++) 
        {      
            
            if (num % 3 == 0 ) 
                System.out.print(num + " "); 
        } 
    } 
   
    public static void main(String []args) 
    { 
        
        int N = 10;
        int M = 100;
           
        // Calling function 
        result(N,M); 
    } 
} 
