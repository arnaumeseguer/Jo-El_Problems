public class exempleFOR {
    public static void main(String[] args) {

        String text= "poso un text fix";

        int index = 0;
        while(index < text.length()){

            System.out.println(text.charAt(index));

            index++;
        }

        for(index = 0;index < text.length() ; index++){

            System.out.println(text.charAt(index));

            //un for chunguito
            for(int j=0, k=1; j<56 && k%234 !=0 ; j++, k=k-4) {
                System.out.println(j*k);
            }






    }
}}
