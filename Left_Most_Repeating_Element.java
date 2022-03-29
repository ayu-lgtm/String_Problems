import java.util.Arrays;

public class Left_Most_Repeating_Element {
    public static void main(String args[]){
        String s ="klaaVipulVerma";

        boolean b[]=new boolean[256];
        Arrays.fill(b,false);

        int res=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(b[s.charAt(i)]){
                
                res=i;
            }
            else{
                b[s.charAt(i)]=true;
            }
        }
        System.out.print(res);
    }
}
