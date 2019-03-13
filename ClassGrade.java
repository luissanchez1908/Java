// This is a program that calculate students grades 
// author: Esterlin Moronta Diaz 
import java.util.*;
public class ClassGrade 
{ 
    // main method
    public static void main(String[] args) 
    { 
    // declare variables here
    double percent, average, total;
    int students, possible, i;
    String grade;
    String dashes = "-";
    percent=0;
   grade=("char");
    total=0;
   students=1;
   
    Scanner input = new Scanner(System.in);
    //format the heating for the columns
    String formathd = "      Student Points    PERCENT     GRADE ";

// Ask and get from user how many student are in classrrom
System.out.print("Please Enter the Number of Students: ");
students = input.nextInt();
int[] points = new int [students];
//Ask and get user for the total possible points
System.out.print("Please Enter the Total Possible Points: ");
possible= input.nextInt();
//Ask and get each students points
System.out.println("Please Enter Each Students Points");
 
for(i=0; i<students; i++) 
{
System.out.print("Points for Students " +i+ " ");
points[i] = input.nextInt();


while(points[i] >possible)
{
 //Tell user sorry and try again
System.out.println("Sorry the number is over the total possible, try again");
System.out.print("Points for Students " +i+ " ");
points[i] = input.nextInt();
//percent= (double)points[i] / possible * 100;
}
}
System.out.println("                    CLASS GRADES");
System.out.print("Class Size "+students+" ");
System.out.println(formathd);
System.out.println("--------------    ---------------   --------    -------");
for(i=0; i<students; i++) 
{
percent= (double)points[i] / possible * 100;
total=total+percent;
if(percent>=90.0)
{ 
grade= "A";
}
else if(percent>=80.0)
{
grade= "B";
}
else if(percent>=70.0)
{
grade= "C";
}
else if(percent>=60.0)
{
grade= "D";
}
else
{
grade= "F";
}

String formats= "                       %10s";
String formatd= "       %10d";
String formatf= "      %10.2f";
System.out.print("students " +i+ " ");
System.out.printf(formatd, points [i]);
System.out.printf(formatf, percent);
System.out.printf("        "+grade+ "\n"); 
}

System.out.println("--------------    ---------------   --------    -------");


//Calculate the average of the class
average= total/students;
if(average>=90.0)
{ 
grade= "A";
}
else if(average>=80.0)
{
grade= "B";
}
else if(average>=70.0)
{
grade= "C";
}
else if(average>=60.0)
{
grade= "D";
}
else
{
grade= "F";
}

System.out.print("Class Average");
String formatf= "                     %10.2f";
System.out.printf(formatf, average);
System.out.printf("        "+grade+"\n");  

double lowest = points[0];
double highest = points[0];
for(i=0; i<students; i++) {
if (points[i] > highest) highest=points[i];
if (points[i] > lowest) lowest=points[i];

else if(points[i]>=90.0)
{ 
grade= "A";
}
else if(points[i]>=80.0)
{
grade= "B";
}
else if(points[i]>=70.0)
{
grade= "C";
}
else if(points[i]>=60.0)
{
grade= "D";
}
else
{
grade= "F";
}


}
System.out.print("Highest Percent");
String formatw= "               %10.2f";
System.out.printf(formatf, highest);
System.out.printf("        "+grade+"\n");  

System.out.print("Lowest Percent");
String formatx= "               %10.2f";
System.out.printf(formatf, lowest);
System.out.printf("        "+grade+"\n");  

  }
}
