public class uniquenum {
    public static void main(String[] args) {
        int num1=1213;
        int num2=num1;
        int count =1;
        while(num1>0){
            int d1=num1%10;
            while(num2>0){
               int d2=num2%10;
               if(d1==d2)
                count++;
              num2=num2/10;
            }
           num1=num1/10;
        }
         
        if(count==1){
            System.out.println("unique");
        }
        else{
            System.out.println("not unique");
        }
    }
}
