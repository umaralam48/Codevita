import java.util.*;
import java.io.*;
public class cv_2_A{
       
    private static boolean validate(String[] s){
     
      if(s.length==2)
          return true;
      else
          return false;
        
    }
    public static void main(String[] args)throws IOException
    {
       BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(r.readLine()),p1=0,p2=0,p,c=1; String nam="",nam2="";    
      
        for(int i=1;i<=n;i+=2){
            
         String ip=r.readLine();
            String[] in=ip.split(" ");
        nam=in[0];
        if(validate(in)){
            String[] set=in[1].split(",");
            int ans=lcm(set);
            System.out.println(in[0]+"\' question is"+in[1]);
            in=r.readLine().split(" ");
            nam2=in[1];
            if(in[2]=="PASS"){
                System.out.println("Question is PASSED\nAnswer is:"+ans);
                p=0;
            }                
          
            else{
            int answer=Integer.parseInt(in[2]);
            if(answer==ans){
                System.out.println("Correct Answer");
                p=10;                
            }
            else{
                 System.out.println("Wrong Answer");
                p=0; 
            }
            }
            System.out.println(in[1]+":"+p+"points");
            if(c==1){
                p2=p2+p;
                c=2;
            }
            else{
                p1=p1+10;
                c=1;
            } 
        }
              
        else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
        if(c==1){
            String temp=nam;
            nam=nam2;
           nam2=temp;
        }
        System.out.println("Total Points:\n"+nam+":"+p1+"points\n"+nam2+":"+p2+"points");
        if(p1>p2)
        System.out.println("Game result: "+nam+" is winner");
        else if(p1==p2)
            System.out.println("Game result: Draw");
        else
            System.out.println("Game result: "+nam2+" is winner");
            
        
    }
                               
        
    
     public static int lcm(String[] s){
        int l=s.length;
        int result=Integer.parseInt(s[0]);
        for(int i=1;i<l;i++){
            int b=Integer.parseInt(s[i]);
            result=result*b/gcd(result,b);
        }
            return result;
    }
    private static int gcd(int a,int b){
        if(b>a){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
        
        
        
            
        
        
        
        
        
        
        
    