package main;

import java.util.Scanner;


public class Main {

    private static char operation;
    public static void main(String[] args) {



            while(true){
                System.out.println("Vvedite znachenia cherez probel:");
                Scanner text = new Scanner(System.in);
                String text1 = text.nextLine()+"\"";
                String[] Array = text1.split("\"");

                for (String s : Array) {
                    if (s.length() > 12) {
                        System.out.println("Error: значение не должно быть 10 знаков");
                        System.exit(0);
                    }
                }

                String[] ArrayOp = Array[2].split("[+-/*]");

                operation = Array[2].charAt(ArrayOp[0].length());
                if ( Array.length == 4) {
                    boolean number1 = comparison.Number(Array[1]);
                    boolean number2 = comparison.Number(Array[3]);
                    if(operation == '+') {
                        if(((number1 & !number2)|(!number1 & number2))){
                            System.out.println("Ошибка!");
                            System.exit(0);
                            break;
                        }
                        else{
                            String str = Array[1].concat(Array[3]);
                            System.out.println("\""+str+"\"");
                        }
                    }
                    else if(operation == '-'){

                        StringBuffer c = new StringBuffer(Array[1]);
                        StringBuffer d = new StringBuffer(Array[3]);


                        if (Array[1].contains(d)){


                         c.delete (c.length() - d.length(), c.length());


                                System.out.println(c);}

                         else if  (c.length() != d.length()) {
                            StringBuffer a = new StringBuffer(Array[1]);
                            System.out.println(a);
                        }


                    }
                    else{
                        System.out.println("Ошибка!");
                        System.exit(0);
                    }
                }
                else if(operation == '*'){
                    oneFragment.multiply (text1);
                }
                else if(operation == '/'){
                    twoFragment.mutiplication(text1);
                }
            }
        }

    }

