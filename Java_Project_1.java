import java.util.*;
public class Special_Code{
   int number=1;
   int [] fibonacciList;
    Special_Code(){

    }
    Special_Code(int last_number){
        number=last_number;

    }
    int findToNumberOfPrime(int number){
        int count=1;
        int [] prime=new int[number];
        if(number!=1){
        for(int i=3;i<=number;i++){
            boolean t=true;
            for(int j=i-1;j>1;j--){
                if(i%j==0){t=false;

                }
                
                
            };
            if(t==true){count++;prime[count--]=i;}
            
            

        };}
        else{count=0;};
        return count;

    }
    //Finding prime numebr at whichever index.
    int findPrime(int number,int indexOfPrimeList){
        int index=1;
        int [] prime=new int[number];
        prime[0]=2;
        if(number!=1){
            for(int i=3;i<=number;i++){
                boolean t=true;
                for(int j=i-1;j>1;j--){
                    if(i%j==0){t=false;
    
                    }//liste yapmak
                    
                    
                };
                if(t==true){prime[index]=i;index++;}
                
                
    
            };};
            return prime[indexOfPrimeList];
    }
   public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    //----------------QUESTİON 1 BELOW-----------------------------------
        System.out.println("1) Please enter your birthday between 1 and 7(example Mon=1, Tue=2..):");
        String string_day=input.nextLine();
       
        
        while(control(string_day)==0){
            System.out.println("Please enter an appropriate day!");
            string_day=input.nextLine();
        };
        int day=Integer.valueOf(string_day);
        
    //-----------------QUESTİON 1 UP---------------------------------------------------------------
//---------------------İNİTİAL LETTER QUESTİON BELOW------------------------
      System.out.println("Enter initial letter of your name, (capital english letters only)");
        String name=input.nextLine();
        //
        while(checkingLetter(name)==0){
            System.out.println("Please enter an appropriate initial letter");
            name=input.nextLine();
        };
      int value_OfName=name.charAt(0);
        System.out.println(name+"-->"+value_OfName);
//------------İNİTİAL LETTER QUESTİON UP------------------------------------------
//-------------------QUESTİON 3 BELOW ----------------------------------------------
int u=69%4;// u 2. sorunu cevabı u'yu değiştirsen iyi olur.
System.out.println("3) How many prime numbers can you count until "+u+"?");

Special_Code prime=new Special_Code(3);
int numberOfPrime_Number=prime.findToNumberOfPrime(u);
String str_userPrime_answer=input.nextLine();

    while(checkingisDigit_Prime(str_userPrime_answer,numberOfPrime_Number)==false){
        System.out.println("It is not correct!");
        str_userPrime_answer=input.nextLine();
       
    

};
 // --------------Question 3 ^^^^UP------------------------- --------

//--------------QUESTİON 5 BELOW--------------------------------------------------------------
int answerOf_Q4=30;

System.out.println("Enter your age(between 1-100):");
String str_age=input.nextLine();
while(checkingAge(str_age)==false){
    System.out.println("It is not correct!");
    str_age=input.nextLine();
};

int age=Integer.parseInt(str_age);
System.out.println("5) What is the result of "+answerOf_Q4+ "* "+age+"?");
int real_answer_Q5=age*answerOf_Q4;
String str_user_answer=input.nextLine();
while(checkingResultOf_Q5(str_user_answer,real_answer_Q5 )==false){
    System.out.println("It is not correct!");
    str_user_answer=input.nextLine();
};

System.out.println("Congratulations! You found the code! The code is "+real_answer_Q5);





// ---------------------QUESTİON 5 UP------------------------------------------------
        
        input.close();
        


    };
    public static int control(String string_day){
        //digit mi değil mi onun true falseu
        boolean result1=true;
        // Checks number is it digit or not
        for(int i=0;i<(string_day.length());i++){
            
            char char0fDay = string_day.charAt(i);
            boolean check=Character.isDigit(char0fDay);
            
            if(check==false){result1=false;break;};
            


        };
        //Value of day whether is in range or not.
        boolean result2=true;
        if(result1!=false){
        int day_as_number=Integer.valueOf(string_day);
        
        if(day_as_number<=7 && day_as_number>=1){
            result2=true;
        }
        else{result2=false;};}
        else{return 0;};
       
        if((result1)==false){return 0;}
        else if(result2==false){return 0;}
        else{return 1;}
        
        

        

    };

    //Checking is input uppercase character or not.
    public static int checkingLetter(String name){
        boolean result1=true;
        boolean result2=true;
        boolean result3=true;
        if(name.length()!=1){
            result1=false;
        }
        else{char first_letter_Ofname=name.charAt(0);
            if(Character.isLetter(first_letter_Ofname)!=true){
                result2=false;

            }
            
            else{
                if((first_letter_Ofname>='A' && first_letter_Ofname<='Z')==false){
                    result3=false;


                }
            }
        };
        if((result1 && result2 && result3)==true){
            return 1;
        }
        else{return 0;}
        
        
        
        

    }
   public static boolean checkingisDigit_Prime(String user_answer,int answer){
        boolean result1=true;
        boolean result2=true;
        boolean result=true;
        for(int i=0;i<(user_answer.length());i++){
            
            char char0fPrime = user_answer.charAt(i);
            boolean check=Character.isDigit(char0fPrime);
            
            if(check==false){result1=false;break;}
            else{result1=true;};
            
            


        };
        if(result1==false){result2=false;}
        else if(result1!=false){
            if(Integer.parseInt(user_answer)==answer){
                result2=true;

            }
            else{result2=false;}

        };
        result=result1&&result2;
        
        return result;
        
    }
   public static boolean checkingAge(String str_age){
        boolean result1=true;
        boolean result2=true;
        boolean result=true;
        for(int i=0;i<str_age.length();i++){
            char charOfAge=str_age.charAt(i);
            boolean check=Character.isDigit(charOfAge);
            if(check==false){result1=false;break;}
            else{result1=true;};

        };
        int age=Integer.parseInt(str_age);
        if(result1==false){result2=false;}
        else if(result!=false){
            if(age>=1 && age<=100){
                result2=true;
            }
            else{result2=false;};
        }
        result=result1&result2;
        return result;
        
        
    }
   public static boolean checkingResultOf_Q5(String user_answer,int real_answer){
        boolean result1=true;
        boolean result2=true;
        boolean result=true;
        for(int i=0;i<user_answer.length();i++){
            char charOfAnswer=user_answer.charAt(i);
            boolean check=Character.isDigit(charOfAnswer);
            if(check==false){result1=false;break;}
            else{result1=true;};
        }
        if(result1==false){result2=false;}
        else if(result1=true){
            if(Integer.parseInt(user_answer)==real_answer){
                result2=true;

            }
            else{result2=false;};

        };
        result=result1&&result2;
        return result;
    }

    
}
