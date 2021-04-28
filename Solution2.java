package logical;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class BankValidationException extends Exception {
  
    public String toString(){ 
        return ("BankValidationException") ;
       }
  
}

abstract class Account {
   int tenure;
   float principal;
   float rateOfInterest;
   
   public void setInterest(int age,String gender) {
       if(gender.equalsIgnoreCase("male"))
          {
          if(age>60)
             rateOfInterest=9.8f;
          if(age>=60)
              rateOfInterest=10.5f;
              }
        if(gender.equalsIgnoreCase("female"))
           {
          if(age>58)
             rateOfInterest=10.2f;
          if(age>=58)
              rateOfInterest=10.8f;
            }
           
   }
           public float getrateOfInterest(){
               return this.rateOfInterest;
           }
           
   public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest) {
       return (totalPrincipleDeposited+maturityInterest);
   }
   public abstract float calculateInterest();
   public abstract float calculateAmountDeposited();
}

class RDAccount extends Account {
    public RDAccount(int tenure,float principal) {
        this.tenure=tenure;
        this.principal=principal;
    }
   public float calculateAmountDeposited() {
       
      return (principal*tenure*12);
   }
   public float calculateInterest() {
       float r=1+((rateOfInterest/100)/4);   //r
       float months=tenure*12;
       float interestPaid=0; 
       float nt=0;
       int n=4;
       for(float i=months;i>0;i--)
       {
    	   nt=n*(months/tenure);
    	   interestPaid+= principal * (Math.pow(r,nt));
    	   months--;
       }
	   return interestPaid;
   }
   
}

class BankService {
    public boolean validateData(float principal,int tenure,int age,String gender) {
        try {
        if(principal>=500)
            if(tenure==5 || tenure==10)
                if(gender.equalsIgnoreCase("male")|| gender.equalsIgnoreCase("female"))
                    if(age>=1 && age<=100)
                      return true;
        throw new BankValidationException();
        }catch(BankValidationException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    public void calculate(float principal,int tenure,int age,String gender)
    {
        if(validateData(principal,tenure,age,gender))
        {
            RDAccount obj=new RDAccount(tenure,principal);
            obj.setInterest(age,gender);
            float res=obj.calculateInterest();
           float dep= obj.calculateAmountDeposited();
           float result=obj.calculateMaturityAmount(dep, res);
           System.out.print(result);
            
        }
           

    }
}

public class Solution2 {

    public static void main(String[] args) {
        /* Do NOT Alter Main() */
          Scanner in = new Scanner(System.in);
      
          int tenure = in.nextInt();
        float principal = in.nextFloat();
        int age = in.nextInt();
        String gender = in.next();
      
        BankService b = new BankService();
        b.calculate(principal, tenure, age, gender);
    }
}