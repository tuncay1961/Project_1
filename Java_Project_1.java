import java.util.*;
public class Special_Code{
   int number=1;
    Special_Code(){

    }
    Special_Code(int last_number){
        number=last_number;

    }
    int findToNumberOfPrime(int number){
        int count=1;
        for(int i=3;i<=number;i++){
            boolean t=true;
            for(int j=i-1;j>1;j--){
                if(i%j==0){t=false;

                }
                
                
            };
            if(t==true){count++;}
            

        };
        return count;

    }
   public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("1) Please enter your birthday between 1 and 7(example Mon=1, Tue=2..):");
        String string_day=input.nextLine();
       
        
        while(control(string_day)==0){
            System.out.println("Please enter an appropriate day!");
            string_day=input.nextLine();
        };
        int day=Integer.valueOf(string_day);
        
        //up is for question one--------------------------------------------------------------
      System.out.println("Enter initial letter of your name, (capital english letters only)");
        String name=input.nextLine();
        //
        while(checkingLetter(name)==0){
            System.out.println("Please enter an appropriate initial letter");
            name=input.nextLine();
        };
      int number_OfName=name.charAt(0);
        System.out.println(name+"-->"+number_OfName);
//THİS İS FOR İNİTİAL LETTER QUESTİON
      //Question 3 below -------------------------
int u=27;
System.out.println("3) How many prime numbers can you count until "+u+"?");

Special_Code prime=new Special_Code(3);
int numberOfPrime_Number=prime.findToNumberOfPrime(u);
int userPrime_answer=input.nextInt();
while(userPrime_answer!=numberOfPrime_Number){
    System.out.println("It is not correct!");
    userPrime_answer=input.nextInt();

}
 // --------------Question 3 ^^^^------------------------- 
        
        input.close();


    };
    public static int control(String string_day){
        //digit mi değil mi onun true falseu
        boolean result1=true;
        for(int i=0;i<(string_day.length());i++){
            
            char char0fDay = string_day.charAt(i);
            boolean check=Character.isDigit(char0fDay);
            
            if(check==false){result1=false;break;};
            


        };
        //aralık kontrolü true falseu
        boolean result2=true;
        //eğer false ise direkt return false yapıyor çünkü bu bir kelime
        if(result1!=false){
        int day_as_number=Integer.valueOf(string_day);
        
        //aralıkta mı değil mi onu kontro eder
        if(day_as_number<=7 && day_as_number>=1){
            result2=true;
        }
        else{result2=false;};}
        else{return 0;};
       
        if((result1)==false){return 0;}
        else if(result2==false){return 0;}
        else{return 1;}
        
        

        

    };public static int checkingLetter(String name){
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

    
}




