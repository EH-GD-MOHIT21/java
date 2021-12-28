
import java.util.Scanner;

public class multiply_two_matrices {
    public static void main(String args[]){
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        double[][] res = new double[3][3];
        double sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Elements for Matrix1: ");
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                m1[i][j] = s.nextDouble();
            }
        }

        System.out.println("Enter Elements for Matrix2: ");
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                m2[i][j] = s.nextDouble();
            }
        }

        System.out.println("Matrix Multiplication is: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    sum += (m1[i][k]*m2[k][j]);
                }
                res[i][j] = sum;
                sum = 0;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}

