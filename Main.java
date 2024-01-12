import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    System.out.print("How many day's temperature : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Day" + (i + 1) + "'s high temp : ");
      int temp = sc.nextInt();
      sum += temp;
    }

    double avg = sum / n;
    System.out.println();
    System.out.println("Average temperature is " + avg);
  }
}