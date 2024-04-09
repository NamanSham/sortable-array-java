import java.util.Scanner;

public class Main {
public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
// Input the number of elements in the array System.out.print("Enter the number of elements: "); int n = scanner.nextInt();
// Input the elements
int[] array = new int[n]; System.out.println("Enter the elements:"); for(inti=0;i<n;i++){
array[i] = scanner.nextInt(); }
