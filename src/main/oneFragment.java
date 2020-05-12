package main;

public class oneFragment {


    public static void multiply(String text1){

    String text = text1+="\"";
            String[] letter = text.split("\"");
            letter[2] = letter[2].replaceAll("[ *]","");
            boolean letter2 = comparison.Number(letter[2]);
            if (letter2) {
                int a = Integer.parseInt(letter[2]); 
                if (a  > 0 & a  <11) {

                        letter[1] = letter[1].repeat(a) ;


                    if (letter[1].length()>39) {
                        System.out.print(letter[1].substring(0,40)+"...");
                    }else{
                        System.out.print(letter[1]);
                    }
                    System.out.print("\n");
                }
                
            }
            else{ 
                    System.out.println("Error!");
                    System.exit(0);
            }
        
    }


}
