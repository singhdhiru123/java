class PalindromeStringExample{ 

  public static void main(String args[]){  
    String r;
    String example = "civic";
    r=example;
    int flag=0,n=r.length();    
    for(int i=0;i<n;i++){
      if(r.charAt(i) == r.charAt(n-1-i)){
        flag=0;
      }else{
        flag=1;
        break;
      }
    }   
    if(flag==0)    
      System.out.println("palindrome");    
    else    
      System.out.println("not palindrome");    
  }  
} 
