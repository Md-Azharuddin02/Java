// package All_Pattern_Questions;
// import java.util.Scanner;

// public class All_Questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the numebers of rows you want to print : ");
//         int rows=sc.nextInt();

// -----------------------------------1. Right Triangle Star Pattern--------------------------------
//  *
//  *  *
//  *  *  *
//  *  *  *  *
//  *  *  *  *  *  

        // for(int i=0;i<rows;i++){
        //     for(int j=0; j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println("");
        // }

// ------------------------------------------2. Downward Triangle Star Pattern-----------------------------------
// * * * * *
// * * * *
// * * *
// * *
// *
//             // for(int i=rows;i>0;i--){
            //     for(int j=0;j<i;j++){
            //         System.out.print("*"+" ");
            //     }
            //     System.out.println();
            // }
 // ------------------------------------------3.Triangle Star Pattern-----------------------------------
//                

//           *
//         * *
//       * * *
//     * * * *
//   * * * * *

// for(int i=rows;i>0;i--){
    //     for(int j=0;j<i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=rows;k>i-1;k--){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            
            // ---------------------------------------3. Pyramid Program----------------------------------      
    //          *
    //         ***
    //        *****
    //       *******
    //      *********
    //     ***********
    //    *************
    //   ***************
    //  *****************
    // *******************

            // first way to create pyramid 
            // for(int i= rows; i>0; i--){
            //     for(int j=0; j<i; j++){
            //         System.out.print(" ");
            //     }
                // for(int k=i;k<=rows; k++){
                //     System.out.print("*"+" ");
                // }
                // System.out.println();
            // }


            // secound way to create Pyramid 
            // for(int i=rows;i>0; i--){
            //     for(int j=0;j<=i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int k=i; k<=rows;k++){
            //         System.out.print("*");
            //     }
            //     for(int l=i+1;l<=rows;l++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

// -------------------------------------4. Diamond Shape Pattern---------------------------------------
//         *
//        ***
//       *****
//      *******
//     *********
//    ***********
//   *************
//  ***************
//   *************
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *


    //    for(int i=rows; i>0; i--){
    //     for(int j=0; j<i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=i;k<=rows;k++){
    //         System.out.print("*");
    //     }
    //     for(int l=i+1;l<=rows; l++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }
    //    for(int x=1; x<rows; x++){
    //     for(int y=0; y<=x; y++){
    //         System.out.print(" ");
    //     }
    //     for(int z=x; z<rows; z++){
    //         System.out.print("*");
    //     }
    //     for(int a=x; a<rows-1; a++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }
// ------------------------------------------------Sandglass Star Pattern-------------------------------------


//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

        // for(int i=0; i<rows; i++){
        //     for(int j=0;j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=rows; k>i;k--){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0; i<rows; i++){
        //     for(int j=rows; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*"+" ");

        //     }
        //     System.out.println();
        // }
// -------------------------------------------Triangle Star pattern-------------------------