class cv_2_B{
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int k=Integer.parseInt(args[1]);
        int sum=0;
        for(int i=0;i<=k;i+=2){
            int c=fac(n)/(fac(i)*fac(n-i));
            sum=sum+c;
        }
        System.out.println(sum);
    }
    private static int fac(int n){
        int f=1;
        while(n>1){
            f=f*n;
            n--;
        }
        return f;
    }
}
    