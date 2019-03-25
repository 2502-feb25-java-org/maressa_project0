class _CodingChallenge2_Week4{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int in = sc.nextLine();
        System.out.println(hexConverter(in));
    }

    public Sting hexConverter(int num)
    {
        //For storing remainder
        int rem;

        //For storing result
        String str2="";

        //Digits in hexadecimal number system
        char hex[]={'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(num>0){
            rem=num%16;
            str2=hex[rem]+str2;
            num=num/16;
        }
        
        return str2;
    }
}