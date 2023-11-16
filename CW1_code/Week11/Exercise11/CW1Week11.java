package Week11.Exercise11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CW1Week11 {
    
    // Exercise #11.1
    public static int maxStretch(List<Integer> list) {
		int stretch = 0;
        for (int i = 0; i < list.size(); i++) {
            int firstIndex = 0;
            int lastIndex = 0;
            firstIndex = i;
            for (int j = list.size() - 1; j >= 0; j--) {
                if (list.get(j) == list.get(i)) {
                    lastIndex = j;
                    int newStretch = lastIndex - firstIndex + 1;
                    if (newStretch > stretch) {
                        stretch = newStretch;
                    }
                }
            }
        }
		return  stretch;
		
    }
    
    
    // CW1 #11.1
    public static boolean isPartitionable(List<Integer> list) {
        int listSize = list.size(); //get the list size
        boolean isPartitionable = false;//set isPartitionable as false
        //go through each index of list
        for(int  i = 0; i < listSize; i++){
            int sumLeft = 0;//initialize sumLeft to 0
            //For this iteration calculate sumLeft by doing sum of
            //all elements from 0th to ith index
            for(int j = 0; j <= i ; j++){
                sumLeft += list.get(j);
            }
            int sumRight = 0;//initialize sumRight to 0
            //For this iteration calculate sumRight by doing sum of
            //all elements from (i+1)th element to end of list
            for(int j = i+1; j < listSize; j++){
                sumRight += list.get(j);
            }
            //check if sumLeft is equal to sumRight
            if(sumLeft == sumRight){
                isPartitionable = true;//set isPartitionable to true
                break;//break out of the loop
            }
        }

        return isPartitionable;


    }

    
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(8, 5, 1, 2, 5, 3, 4, 5, 10);
        System.out.println(maxStretch(list1));                // 7

        List<Integer> list2 = Arrays.asList(2, 7, 1, 2, 3, 7);
        System.out.println(maxStretch(list2));                // 5
   
        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_1));          // true

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));          // false
        
        // add your own test case here:
        
        
        
        
        
    }
    
}
