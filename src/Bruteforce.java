class Bruteforce{

    //called function
    public static int bruteforce(String text,String tobematched){
        int length = text.length();//length of the text
        int plength = tobematched.length();//length of the pattern;

        //loop condition
        for(int i=0;i<length-plength;i++){
            //initialization of m
            int m=0;
            while((m < plength) && (text.charAt(i+m) == tobematched.charAt(m))){
                m++;
            }
            if(m == plength){
                return i;
            }
        }

        return -1;
    }
}