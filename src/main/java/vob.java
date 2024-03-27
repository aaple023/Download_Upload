public class vob {

    public static void main(String args[]){
        String str="Welcome";
      int count=0;
        String g="";
        String k="";
        for (int i=0;i<str.length();i++){
           if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               g="pass";
               count++;

           }

           else {
               k = "fail";
               count++;
           }



        }
        System.out.println(count);
        //System.out.println(k+" "+count);



    }
}
