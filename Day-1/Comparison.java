/*Write a program to check whether the given two numbers are equal or not w/o using comparison operator?*/
public class Comparison
{
public static void main(String args[])
{
    int FirstNumber=30;
    int SecondNumber=30;
    String Answer=(FirstNumber^SecondNumber)==0 ?"the number is equal":"the number is not equal";
    System.out.println(Answer);
}

}
