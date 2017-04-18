//MUHAMMED ŞARA 150201123   BİLGİSAYAR MÜHENDİSLİĞİ 2.SINIF
package mission.impossible.pkg1;

import java.util.Scanner;


public class MissionImpossible1 {


    public static void main(String[] args) {
    
        int satir=0,sutun=0;
               
        
  /*int[][] matris1 = new int[][]{
                    {0,0,0,0,0},
                    {0,1,0,0,0},
                    {0,0,1,1,1},
                    {0,0,0,0,0},
                    {0,0,0,0,0}
                };

   int[][] matris2 = new int[][]{
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,1,1,1,0},
                    {0,0,0,0,1}
                };*/
   
   int mat1_satir=0,mat1_sutun=0,mat2_satir=0,mat2_sutun=0;
        Scanner sc = new Scanner(System.in);
        
          System.out.print("1. Matrisin satırını giriniz: ");
          mat1_satir=sc.nextInt();
          
          System.out.print("1. Matrisin sutununu giriniz: ");
          mat1_sutun=sc.nextInt();
          
          int[][] matris1 = new int[mat1_satir][mat1_sutun];
          
         System.out.print("\n1.Matrisin Değerlerini Giriniz: \n\n");
        
         int i,j;
      for(i=0;i<mat1_satir;i++){
        for(j=0;j<mat1_sutun;j++){
             System.out.print("1. Matrisin "+"["+i+"]"+"["+j+"] : ");
            matris1[i][j]=sc.nextInt();
        }
      }
      
          System.out.print("2. Matrisin satırını giriniz: ");
          mat2_satir=sc.nextInt();
          
          System.out.print("2. Matrisin sutununu giriniz: ");
          mat2_sutun=sc.nextInt();
          int[][] matris2 = new int[mat2_satir][mat2_sutun];
        System.out.print("\n2.Matrisin Değerlerini Giriniz: \n\n");
   
           for(int k=0;k<mat2_satir;k++){
             for(int l=0;l<mat2_sutun;l++){
                  System.out.print("2. Matrisin "+"["+k+"]"+"["+l+"] : ");
                 matris2[k][l]=sc.nextInt();
             }
           }
      
        int[][] yenimatris;

         System.out.print("1.matris \n");
        
      for(i=0;i<mat1_satir;i++){
        for(j=0;j<mat1_sutun;j++){
            System.out.print(" "+matris1[i][j]);
        }
          System.out.print("\n");
      }
      System.out.println("\n2.matris ");
      for(i=0;i<mat2_satir;i++){
        for(j=0;j<mat2_sutun;j++){
            System.out.print(" "+matris2[i][j]);
        }
          System.out.print("\n");
      }
      
      int bir_say1=0,top_bir1=0,bir_say2=0,top_bir2=0, satir1 = 0,sutun1 = 0,satir2 = 0,sutun2 = 0;
      
      for(i=0; i<mat1_satir; i++){

        for(j=0; j<mat1_sutun; j++){

            if(matris1[i][j]==1){
                bir_say1++;

            }
            if(bir_say1>top_bir1){
                 top_bir1=bir_say1;
                 satir1=i;
              }
        }
        bir_say2=0;

      }
          for(i=0; i<mat2_satir; i++){

        for(j=0; j<mat2_sutun; j++){
            
               if(matris2[i][j]==1)
                bir_say2++;

            if(bir_say2>top_bir2){
                 top_bir2=bir_say2;
                 satir2=i; 
              }

        }
        bir_say2=0;

      }
      
            i=0; j=0;
      for(i=0; i<mat1_satir; i++){
        for(j=0; j<mat1_sutun; j++){
            if(matris1[satir1][j]==1){
                 sutun1=j;
                 break;
                 }
        }
      }
          for(i=0; i<mat2_satir; i++){
        for(j=0; j<mat2_sutun; j++){
            if(matris2[satir2][j]==1){
                 sutun2=j;
                 break;
                 }
        }
      }             
  
      int referans_satir,referans_sutun;
     if(satir1>satir2)
            referans_satir=satir1;
     else
         referans_satir=satir2;

     if(sutun1>sutun2)
            referans_sutun=sutun1;
     else
         referans_sutun=sutun2;            
        if(satir1>satir2)
            satir=satir1+mat1_satir-satir2;
     else
            satir=satir2+mat1_sutun-satir1;

    if(sutun1>sutun2)
            sutun=sutun1+mat2_satir-sutun2;
    else
         sutun=sutun2+mat2_sutun-sutun;

        int x1,x2,y1,y2;

        x1=referans_satir-satir1;
        x2=referans_satir-satir2;
        y1=referans_sutun-sutun1;
        y2=referans_sutun-sutun2;  
        yenimatris = new int[satir][sutun];

       for(i=0;i<mat1_satir;i++){
        for(j=0;j<mat1_sutun;j++){

        if(matris1[i][j]==1){          
            int topx=i+x1;
            int topy = j+y1;
            yenimatris[topx][topy]=1;
            yenimatris[topx][topy]=1;
           
        }

        }
                  System.out.println("");
      }
       
        for(i=0;i<mat2_satir;i++){
        for(j=0;j<mat2_sutun;j++){

         if(matris2[i][j]==1){
                int topx=i+x2;
            int topy=j+y2;         
            yenimatris[topx][topy]=1;
            yenimatris[topx][topy]=1;
        }
        }
      }
        System.out.println("\n\n--------Oluşan Matris--------");
        for(i=0;i<satir;i++){
                for(j=0;j<sutun;j++){
                    System.out.print(" " +yenimatris[i][j]);
                }
               System.out.println("");
              }
    }
    
}