import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int subjects = 0;
        double total =0;

        System.out.println("Enter the number of subjects");
        subjects = sc.nextInt();
        for(int i=0;i<subjects;i++){
            System.out.println("Enter mark:");
            int mark= sc.nextInt();
            total = total+mark;
            
            }
            double average = total/subjects;
            String grade ="";

            if(average >= 90){
                grade = "A";

            }
            else if(average >= 80)
                {
                    grade = "B";

                }
                else if(average >= 70)
                {
                   grade ="C";
                }
                else if(average >= 60)
                {
                   grade ="D";
                }
                else if(average >= 50)
                {
                    grade ="E";
                }else
                    {
                        grade="F";
                    }
                    
                    System.out.println("Total Marks: " + total);
                    System.out.println("Average: " + average);
                    System.out.println("Grade: " + grade);
                }
            }
