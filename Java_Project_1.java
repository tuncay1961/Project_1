public class Java_Project_1{
   public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String string_day=input.nextLine();
       
        
        while(control(string_day)==0){
            System.out.println("Please enter an appropriate day!");
            string_day=input.nextLine();
        };
        int day=Integer.valueOf(string_day);
        
        //up is for question one--------------------------------------------------------------

        
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
        
        

        

    }

    
}


}

