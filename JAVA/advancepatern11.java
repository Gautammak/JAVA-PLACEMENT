package com.mycompany.javaplacement;
import java.util.*;

public class advancepatern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
        // //upper half
        // for(int i = 1;i<=n;i++){
        //     //1st part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //    // spaces
        //      int space = 2 * (n-i);
        //      for(int j =1;j<=space;j++){
        //         System.out.print(" ");
        //      }
        //    //  2nd part
        //      for(int j=1;j<=i;j++)
        //      {
        //         System.out.print("*");

        //      }
        //      System.out.println();
        // }
        
        // //lowwer half
        // for(int i = n;i>=1;i--){
        //     //1st part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //    // spaces
        //      int space = 2 * (n-i);
        //      for(int j =1;j<=space;j++){
        //         System.out.print(" ");
        //      }
        //    //  2nd part
        //      for(int j=1;j<=i;j++)
        //      {
        //         System.out.print("*");

        //      }
        //      System.out.println();
        // }
    //solid rhoumbs
    
//     *****
//    ***** 
//   *****  
//  *****   
// ***** 
    // for(int i=1;i<=n;i++){
    //     //
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=5;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

//     * 
//     * *
//    * * *
//   * * * *
//  * * * * *

// for(int i=1;i<=n;i++){
//     //spaces
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     //number -> print row no,row no times
//     for(int j=1;j<=i;j++){
//         System.out.print( " * ");
//     }
//     System.out.println();

// }

// 1 
// 2 2
// 3 3 3
// 4 4 4 4
    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     //number -> print row no,row no times
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+ " ");
    //     }
    //     System.out.println();

    // }


    //plindrome pattern
    
//    1
//    212
//   32123
//  4321234

// for(int i =1; i<=n;i++){
//     //spaces
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     //1 st half number
//     for(int j=i;j>=1;j--){
//         System.out.print(j);
//     }

//     //2nd half number
//     for(int j=2;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

// 1 line 2 time
        

// for(int i =1; i<=n;i++){
//     //spaces
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     //1 st half number
//     for(int j=i;j>=1;j--){
//         System.out.print(j);
//     }

//     //2nd half number
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

//uper half

 for(int i=1;i<=n;i++){
    //spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");

    }

    //stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
 }
 //lower half
 for(int i=n;i>=1;i--){
    //spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");

    }

    //stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();

 }
     }
  
 }
