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
                    if (s.length() > 11) {
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
                        String a = Array[3];
                        String b = Array[1].replace(a, "");
                        System.out.println(b);
                    }
                    else{
                        System.out.println("Ошибка!");
                        System.exit(0);
                    }
                }
                else if(operation == '*'){
                    oneFragment.oneFragment (text1);
                }
                else if(operation == '/'){
                    twoFragment.mutiplication(text1);
                }
            }
        }

    }

