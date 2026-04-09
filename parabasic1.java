public class parabasic1 {
    
    void sum(int a,int b)
    {
        System.out.println(a+b);
        
    }
     void sub(int c,int d)
     {
        System.out.println(c-d);
     }
    void mul(int c,int d)
     {
        System.out.println(c*d);
     }
     void div(int c,int d)
     {
        System.out.println(c/d);
     }
    public static void main(String[] args) {
        parabasic1 obj = new parabasic1();
        obj.sum(10,20);
        obj.sub(24,11);
        obj.mul(29,11);
        obj.div(11,10);
    }
}
