import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4;
        int rollNo[] = new int[n];
        String studName[] = new String[n];
        int marks[][] = new int[n][3];
        int total[] = new int[n];
        float avg[] = new float[n];
        String result[] = new String[n];
        String grade[] = new String[n];

        //Entering the data
        for (int i = 0; i <= n - 1; i++)
        {
            int sum = 0;
            System.out.print("Enter the Student Roll Number: ");
            rollNo[i] = input.nextInt();
            System.out.print("Enter the Student Name: ");
            studName[i] = input.next();
            System.out.println();
            System.out.print("Enter the Three Marks: ");
            for (int j = 0; j <= n - 2; j++)
            {
                marks[i][j] = input.nextInt();
                sum += marks[i][j];
            }
            total[i] = sum;
            System.out.println("The Total is : " + total[i]);
            avg[i] = (float) sum / (n - 1);
            avg[i] = (float) Math.floor(avg[i]);

            //Calculating result
            for (int k = 0; k <= n - 2; k++)
            {
                if (marks[i][k] > 50)
                {
                    result[i] = "P";
                }
                else
                {
                    result[i] = "F";
                }
            }

            //Calculating grade
            for (int l = 0; l <= n - 1; l++)
            {
                if (avg[l] >= 70 && avg[l] <= 100)
                {
                    grade[l] = "A";
                }
                else if (avg[l] >= 50 && avg[l] <= 69)
                {
                    grade[l] = "B";
                }
                else if (avg[l] < 50)
                {
                    grade[l] = "C";
                }
            }

        }

        //Outputting results
        System.out.println("*******************************************************");
        System.out.println("                      STUDENT MARKLIST");
        System.out.println("*******************************************************");
        System.out.println("ROLL    NAME   MARK1 MARK2 MARK3 TOTAL RESULT Average GRADE");
        System.out.println(rollNo[0] + "     " + studName[0] + "   " + marks[0][0] + "    " + marks[0][1] + "    " + marks[0][2] + "    " + total[0] + "    " + result[0] + "    " + avg[0] + "    " + grade[0]);
        System.out.println(rollNo[1] + "     " + studName[1] + "   " + marks[1][0] + "    " + marks[1][1] + "    " + marks[1][2] + "    " + total[1] + "    " + result[1] + "    " + avg[1] + "    " + grade[1]);
        System.out.println(rollNo[2] + "     " + studName[2] + "   " + marks[2][0] + "    " + marks[2][1] + "    " + marks[2][2] + "    " + total[2] + "    " + result[2] + "    " + avg[2] + "    " + grade[2]);
        System.out.println(rollNo[3] + "     " + studName[3] + "    " + marks[3][0] + "    " + marks[3][1] + "    " + marks[3][2] + "    " + total[3] + "    " + result[3] + "    " + avg[3] + "    " + grade[3]);
    }
}