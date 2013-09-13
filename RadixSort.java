package sorting;

import java.util.ArrayDeque;
public class RadixSort
{
   
	public static void main ( String[] args)
   {
    
                    int[] list = {7843, 4568, 8765, 6543, 7865, 4532, 9987, 3241,
					                  6589, 6622, 211, 2564};


      String temp;
      Integer numObj;
      int digit, num;

      ArrayDeque<Integer>[] digitQueues = (ArrayDeque<Integer>[])(new ArrayDeque[10]);
 
      for (int digitVal = 0; digitVal <= 9; digitVal++)
         digitQueues[digitVal] = new ArrayDeque<Integer>();

      // sort the list
      for (int position=0; position <= 3; position++)
      {
         for (int scan=0; scan < list.length; scan++)
         {
            temp = String.valueOf (list[scan]);
            digit = Character.digit (temp.charAt(4-position), 10);
            digitQueues[digit].addLast( (new Integer(list[scan])));
         }

         // gather numbers back into list
         num = 0;
         for (int digitVal = 0; digitVal <= 9; digitVal++)
         {
            while (!(digitQueues[digitVal].isEmpty()))
            {
               numObj = digitQueues[digitVal].poll();
               list[num] = numObj.intValue();
               num++;
            }
         }
      }

      // output the sorted list
      for (int scan=0; scan < list.length; scan++)
         System.out.println (list[scan]);
   }
}


