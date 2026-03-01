class Prime2{
    public static void main(String [] args){
        int num=11;
        boolean isprime=true;
        if(num<=1){
            System.out.print("not prime");
        }
        for(int i=2;i*i<=num;i++){
         if(i%num==0){
            isprime=false;
            break;
         }
        }
            if(isprime){
                System.out.println("it is prime");
            }
            else{
                System.out.println("it is not prime");
            }
        }
    }
