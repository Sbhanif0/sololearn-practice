
 // import java.util.*; is never use that cause it's coming in the comment
public class ArrayPractice_8_February_2023 {
    
// 8 February 2023

        /*
        1. Array ============== ( Array is a Collection of Same Type of Variables );
        2. Summing Elements in= Array ( Sum Values in Array );
        3. Enhanced for loop == ( for each loop );
        4. Multidimensional === Array ( [Row Index], [Column Index] );
        5. Reverse String ===== ( Reversing Character or String );
        6. Modulo Quiz ======== ( Improve Learning );
        */

     public static void main(String[] args) {
 
         //The code Declares An Array of 5 integer 
         // In Java starting counting from zero(0) of an array
 
         // Create an Array
         String[ ] fst = {"abu","Sb HaniF :", "khan", "saheb"};
         System.out.println(fst[1]);
 
 
         // Quiz ( Fix Calender )
         String days[ ] = {"weeks", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
         for (int dnum = 0; dnum <= 7; dnum++){
             System.out.println(dnum+" "+days[dnum]);
         }
         System.out.println("Array Lengths: "+ days.length);
         
 
         System.out.println();
         // Create Array Object and Find Array Lengths
         int[] first= new int [5]; // 5 is 0-4
         System.out.println("Array Length Property Result = "+first.length); // length property
 
 
         // Array Declaration and initialization
         int[] scn = {9, 5, 4, 3, 2};
         System.out.println("Get Array values "+scn[2]);
 
 
         System.out.println();
         // Summing Elements in array
         System.out.println("Summing Elements In Array :");
 
         int[ ] hah = {30,40,10,20};
         int summing = 0;
         for(int i = 0; i<hah.length; i++){
             summing += hah[i];
         System.out.println(i+" Array Value "+summing); // Inside Print of Array
 
         } System.out.println("Summing Result = "+summing); // Outside Print of Array
 
 
         // Creating a Simple Array Object And Set This Length [7]
         int[ ] myApp = new int[7]; // new Keyword to create object
         myApp[0] = 20;
         myApp[1] = 30;
         myApp[2] = 50;
         myApp[3] = 10;
         myApp[4] = 60;
         System.out.println("Storing Value in Array "+myApp[4] + "\n"); //Change myApp[Number] To View Different Output.
 
 
          // Summing Multipliers (Simple intput = 5 4 9 16 2 7, Output = 20);
     /*  Scanner usr = new Scanner(System.in);
         int arrSize = usr.nextInt();
         int[] arrItem = new int[arrSize];
         for (int im = 0; im < arrSize; im++){
             arrItem[im] = usr.nextInt();
         }
         int sm = 0;
         for (int b = 0; b < arrSize; b++){
             if (arrItem[b]%4==0){
                 sm += arrItem[b];
             }
         }
          System.out.println(sm);
     */
 
 
         // for each loop  ( Enhanced For loop )             8-2-2023
         int [] primes = {2,3,5,7};
         for(int i : primes){
             System.out.println("For each loop :"+ i + "\n");
         }
 
     /* // Square Multiplie
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt(); // Array Length
        int[] sides =  new int[length]; // Array Object
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt(); // Arrays Value
             System.out.print(sides[i]*sides[i]); // Multiplie Array
         }  */
 
 
         // Multidimension Array
         int[][] hello = {{10,20,30,}, {40,50,60}};
         int hi = hello[0][1]; // First Row Index Second Column Index
         System.out.println("Multidimensional Array "+hi);
 
 
         System.out.println();
         // Modulo Quiz
          int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        //output the numbers
        for(int i=0; i < 3; i++){
            
              if(i==0){
                  System.out.print("First Matrix : ");
              }
              
              if(i==1){
                  System.out.print("Scond Matrix : ");
                  
              }
              
              if(i==2){
                  System.out.print("Third Matrix : ");
              }
            for(int j= 0; j < 3;j++){
                System.out.print(matrix[i][j]);
            }  System.out.println(" Result");
         }
     
 
         // Array Sum Array
         int arr[ ] = new int[12];
         for (int i = 0; i < 11; i++) {
         arr[i] = i;
         } 
         int res = arr[2] + arr[10]; //12 ==========
         System.out.println("Array Plus Array : "+res);
 
 
         // if Condition with for loop
         int result = 0;
         for (int i = 0; i < 5; i++) {
         if (i == 3) {    // Important if Condition
             result += 10;
         } else {
             result += i;
         }	
         }
             System.out.println("Important if : "+result);
             System.out.println();
 
 
         // Reverse String 
         String name = "abU haniF"; //Finah Uba
             System.out.print("Abu Hanif : ");
 
         for(int i = (name.length()-1); i >= 0; i--){
             System.out.print(name.charAt(i));            
         }
 
 
         System.out.println(); 
         // Reverse String
         String text = "BangladesH"; //hsedalgnaB
         char[] ar = text.toCharArray();
             System.out.print("Bangladesh: ");
         
         for(int i=ar.length-1;i>=0;i--){
             System.out.print(ar[i]);
             }                                // ৮ ফেব্রুয়ারি ২০২৩
 
 
             
 
 
         /********************************  
                 ===Research===
 
 
 
         ********************************/
 
 
    }
 }    
