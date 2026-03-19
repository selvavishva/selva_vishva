public class retubasic {
     int Rice(int money)
     {
        int Rice_price = 200;
        int rema =200-100;                   
        return rema;                       //if U want return method avoid void method
     }
     public static void main(String[] args) {
        retubasic obj = new retubasic();
        int remain = obj.Rice(200);  //Money is variable store the value 200   //int remain used for return method is an integer we use string so the remain in this line
    System.out.println(remain); 
    }
}
