public class Palindrome {
    public static void main(String args[]){
        String s="babab";


        //1st method
        
        /*int low=0,high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                System.out.print("Not Palindrome");
                return;
            }
            low++;
            high--;
        }*/


        //second method
        StringBuffer st=new StringBuffer(s);
        st=st.reverse();
        String k = new String(st);
        if(k.equals(s)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }

    }
}
