/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.indices;
import java.util.Scanner;
/**
 *
 * @author mahmo
 */
public class FindIndices {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
System.out.println("                          welcome\n this program find out if the sum of two numbers in the array = the target ");
System.out.println(" enter the size of array");
 int [] array = new int [input.nextInt()];
System.out.println("now fill the array ");
fillarray(array);
System.out.println(" enter the target ! "); 
int target = input.nextInt();
search(array,target);
System.out.println("    ** thank you ** ");
    } 
    
  public static void fillarray (int[] ar ){
  for (int i = 0 ;i<ar.length;i++){
  System.out.println("enter element no " + (i+1) );
  ar[i]= input.nextInt();
                                }
                                             }   
  public static void  search (int[]ar,int x){
  int y = 1 ;   
  for (int i = 0 ;i<ar.length;i++ ){
  for (int j=i+1;j<ar.length;j++){
  if ((ar[i]!=ar[j])&&((ar[i]+ar[j])==x)) {
  System.out.println(" the numbers are " + ar[i]+ " and " + ar[j]);
  System.out.println(" their indices are " + i + " and " + j ); 
   y = 0 ; 
                                          } 
                                 }
                                   } 
  if (y==1){
  System.out.println(" their are no elements That They Add Up To yor target ");
 }
                                             }
}
