import java .util.Scanner;
public class GradeCalculator{ 
public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    int Tamil, English, Maths, Science, Social;
    int total;
    double average;

    System.out.println("enter Tamil mark");
    Tamil = scan.nextInt();
    System.out.println("enter English mark");
    English = scan.nextInt();
    System.out.println("enter Maths mark");
    Maths = scan.nextInt();
    System.out.println("enter Science mark");
    Science = scan.nextInt();
    System.out.println("enter Social mark");
    Social =scan.nextInt();

    total = Tamil+English+Maths+Science+Social;
    average = total/5.0;

    System.out.println("total mark=" + total);
    System.out.println("average=" + average);

    if(average>=90)
    {
        System.out.println("grade A");
    }
    else if(average>=75){
        System.out.println("grade B");
    }
    else if(average>=60){
        System.out.println("grade C");
    
    }
    else{
        System.out.println("grade fail");
    }
}
}

