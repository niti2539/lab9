/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab9;

import java.util.Arrays;

/**
 *
 * @author usci
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sort=new int[]{67,42,55,22,1,33,9,77,18,11};
        mergeSort(sort);
      
    }
  public static void mergeSort(int[] k){
      int[] first=new int[(k.length/2)];
      int[] second=new int[k.length-first.length];
      //divide to two parts
      if(k.length<=1){
          return ;
      }
      
      
      for(int i=0;i<first.length;i++){
          first[i]=k[i];
          
      }
      for(int j=0;j<second.length;j++){
          second[j]=k[first.length+j];
      
      }
     // System.out.print("divide"+Arrays.toString(k)+"_______ ");
       System.out.print(Arrays.toString(first));
        System.out.println("  && "+Arrays.toString(second));
    //recursive 
     
      mergeSort(first);
      mergeSort(second);
    //mix
      merge(first,second,k);
    
      
      
  }
  public  static void merge(int[] first,int[] second,int[] result){
      int lFirst=0;
      int lSecond=0;
      int lResult=0;
     
      //compare until 
      while(lFirst<first.length&&lSecond<second.length){
          if(first[lFirst]<second[lSecond]){
              result[lResult]=first[lFirst];
              lFirst++;
              
          }else{
              result[lResult]=second[lSecond];
              lSecond++;
          }
        
          lResult++;
      }
      boolean test=true;
      while(test){
          test=false;
      if(lFirst<first.length){
          for(int i=0;i<first.length-lFirst;i++){
              result[lResult]=first[lFirst];
              lFirst++;
              lResult++;
              test=true;
              
          }
          
      }
      else if(lSecond<second.length){
                  for(int j=0;j<second.length-lSecond;j++){
              result[lResult]=second[lSecond];
              lSecond++;
              lResult++;
              test=true;
                      
                  }
      }
       
  }
       System.out.print("  merg  :"+Arrays.toString(first));
      System.out.print("    +  "+Arrays.toString(second));
      System.out.println("  =======  "+Arrays.toString(result));
  
   
}}
