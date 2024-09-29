class ifelse{
    public static void main(String[] args) {
        int a=5,b=6;
        if(a==5)
        {
            System.out.println("a is : "+a);
            if(b==6)
            {
                System.out.println("b is :"+b);
            }
            else
            {
                System.out.println("b is not 6");
            }
        }
        else if(a==4)
        {
            System.out.println("a is "+ a);//change.
        }
        else
        {
            System.out.println("a is not 5");
        }
    }
}