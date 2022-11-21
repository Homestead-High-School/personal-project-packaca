
import java.io.File;
/*import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  
*/
import java.util.Scanner;

import java.io.IOException;

public class Mathods {
  Scanner in = new Scanner(System.in);
  private int temp;
  public Mathods(){
    temp = 0;
  }
  // Returns the digit of pi that they request up to 50
  public int piNum(int n){
   if(n>50){throw new IndexOutOfBoundsException();}
    double a = Math.PI;
    if(n==1){
      return 3;
    }
    for(int i = 1; i<n; i++){
      a= a*10;
      a= a%10;
      System.out.println(a);
    }
    return (((int)a)%10);
  }

  public int eNum(int n){
   if(n>50){throw new IndexOutOfBoundsException();}
    double a = Math.E;
    System.out.println(a);
    for(int i = 1; i<n; i++){
      a= a*10;
      a= a%10;
      System.out.println(a);
    }
    return (((int)a)%10);
  }

  public int fib(int n){
    if(n <= 1){return n;}
    return fib(n-1)+fib(n-2);
  }

  public int floorPrice(int x, int y){
    System.out.println("How much is the floor");
    int p = in.nextInt();
    return x*y*p;
  }

  public String changeNeeded(double total, double paid){
    int dif = (int)((paid-total)*100);
    if(dif<0){return "Not Enough Money";}
    String ret = "They need "+dif+" cents you ";
    if(dif==0){return "Owe Nothing";}
      if(dif>=100){
        int dolla = (int)(dif/100);
        ret+="split into "+dolla+" dollars ";
      dif=dif-(dolla*100);
      }
      if(dif>=25){
        int amt = (int)(dif/25);
        ret+= "must need "+amt+" quarters ";
        dif = dif-(amt*25);
      }
      if(dif>=10){
        int amt = (int)(dif/10);
        ret+= "must need "+amt+" dimes ";
        dif=dif-(amt*10);
      }
      if(dif>=05){
        int amt = (int)(dif/05);
        ret+= "must need "+amt+" nickles ";
        dif=dif-(amt*5);
      }
      if(dif>=01){
        int amt = (int)(dif/01);
        ret+= "and must need "+amt+" pennies!";
        dif=dif-(amt*01);
      }

    return ret;
  }

  public void Calc(){
      System.out.println("What function do you want? (sin/cos/tan/asin/acos/atan/times/divide/add/minus/sqrt/cbrt/power)");
      String g = in.nextLine();
      if(g.equals("sin")){
         System.out.println("Enter first number: ");
           int a = in.nextInt();
          System.out.println("Sin of "+a+" is "+Math.sin(a));
       }
      else if(g.equals("cos")){
           System.out.println("Enter number: ");
           int a = in.nextInt();  
        System.out.println(Math.cos(a));
       }
      else if(g.equals("tan")){
                 System.out.println("Enter number: ");
           int a = in.nextInt(); 
        System.out.println(Math.tan(a));
       }
      else if(g.equals("asin")){
                  System.out.println("Enter number: ");
           int a = in.nextInt();
      System.out.println(Math.asin(a)); 
      }
      else if(g.equals("acos")){
                  System.out.println("Enter number: ");
           int a = in.nextInt();
        System.out.println(Math.acos(a));
       }
      else if(g.equals("atan")){
                  System.out.println("Enter number: ");
           int a = in.nextInt();
        System.out.println(Math.atan(a));
       }
      else if(g.equals("times")){
                     System.out.println("Enter number: ");
           int a = in.nextInt();      
                System.out.println("Enter Second number: ");
          int b = in.nextInt();
        System.out.println(a+" multiplies by "+b+" equals: "+(a*b));
       }
      else if(g.equals("divide")){
                          System.out.println("Enter number to be divided number: ");
           int a = in.nextInt(); 
        System.out.println("Enter divisor: ");
          int b = in.nextInt();
        System.out.println(a/b);
       }
      else if(g.equals("add")){
                           System.out.println("Enter first number: ");
           int a = in.nextInt();
                System.out.println("Enter Second number: ");
          int b = in.nextInt();
        System.out.println((a+b));
       }
      else if(g.equals("minus")){
                           System.out.println("Enter first number: ");
           int a = in.nextInt();
                System.out.println("Enter Second number: ");
          int b = in.nextInt();
        System.out.println(a-b);
       }
       else if(g.equals("sqrt")){
                           System.out.println("Enter number: ");
           int a = in.nextInt();
         System.out.println(Math.sqrt(a));
       }
       else if(g.equals("cbrt")){
                           System.out.println("Enter number: ");
           int a = in.nextInt();
         System.out.println(Math.cbrt(a));
       }
       else if(g.equals("power")){
                           System.out.println("Enter first number: ");
           int a = in.nextInt();     
         System.out.println("Enter to what power: ");
          int b = in.nextInt();
         System.out.println(Math.pow(a,b));
       }
      System.out.println("Do you want to use the calculator again (y/n)");
        in.nextLine();
    String gg = in.nextLine();
      if(gg.equals("y")){
        Calc();
      }
    else{return;}
      }

  public void alarmClock(int seconds){
     System.out.println("Timer is started");
      try {
  Thread.sleep(seconds*1000);

      }
  catch(Exception e) {
  //  Block of code to handle errors
  }
  StdAudio.play("iphone_alarm.wav");
  System.out.println("Timer over");
}

  public boolean cardValidator(String comp, int num){
    if(comp.toLowerCase().equals("mastercard")){
      if(num/100 >=51 && num/100 <=55){
        System.out.println("It is correct");
        return true;
      }
    }
    if(comp.toLowerCase().equals("visa")){
      if(num/1000 == 4){
        System.out.println("It is correct");
        return true;}
    }
    if(comp.toLowerCase().equals("american express")){
      if(num/100 >=34 && num/100 <=37){System.out.println("It is correct");
      return true;}
    }
    if(comp.toLowerCase().equals("discover")){
      if(num == 6011 || num >=6221 && num<= 6229 || num/10>=644 && num/10 <=649 || num/100 == 65){System.out.println("It is correct");
      return true;}
    }
    return false;
  }

  public String coinFlip(){
    if(Math.random()*2>=1){return "Heads";}
    else{return "Tails";}
  }

}

