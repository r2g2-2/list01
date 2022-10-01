import java.util.*;
public class Main {

    //פעולה  שמקבלת רשימה של שלמים ומספר x.   הפעולה תחזיר אמת אם x נמצא ברשימה, אחרת תחזיר שקר
    static  boolean isFound(Node<Integer> lt, int x)
   {
    int y;
    Node <Integer> pos=lt;
    while (pos!=null)
    {
        y= pos.getvalue();
        if (y == x)
        {
            return true;
        }
        pos=pos.getNext();
    }
    return false;
   }
    //כתוב פעולה שמקבלת 2 רשימות מספרים ומחזירה אמת אם הן זהות
   static boolean similerList(Node<Integer> lt1, Node<Integer> lt2)
   {
       Node <Integer> pos1=lt1;
       Node <Integer> pos2=lt2;
       while (pos1!=null&&pos2!=null)
       {
           if (pos1.getvalue() != pos2.getvalue())
           {
               return false;
           }
           pos1 = pos1.getNext();
           pos2 = pos2.getNext();
       }
       if (pos1 != null || pos2 != null)
       {
           return false;
       }
       else
       {
            return true;
       }
   }

   //פעולה שמקבלת שתי רשימות ( 1L  ו- 2L ) שמכילות  מספרים טבעיים  ומחזירה את המספר שמופיע ברשימה 1L  ומספר מופעיו ברשימה 2L הוא מקסימאלי. אם אין כזה יוחזר 1-
    static int numOfAppears (Node<Integer> L1, Node<Integer> L2)
    {
        Node <Integer> pos=L1;
        int num=maxNumOfAppears(L2);
        while (pos.getvalue() != null)
        {
            if (pos.getvalue()==num)
            {
                return num;
            }

        }
        return - 1;
    }

    //פעולה שמחזירה את המספר שמופיע הכי הרבה פעמים ברשימה
    static int maxNumOfAppears(Node<Integer> L1)
    {
        Node <Integer> pos=L1;
        int num=pos.getvalue(),count1=0,count2=0,max;
        pos = pos.getNext();
        max=num;
        while (pos.getvalue() != null)
        {
            while (pos.getvalue() != null)
            {
                if (pos.getvalue() == num) {
                    count1++;
                }
                pos = pos.getNext();
            }
            if (count1 >= count2)
            {
                count2=count1;
                count1=0;
                max=num;
            }
            pos=L1;
            while (pos.getvalue() == num && pos.getvalue() != null)
            {
                pos.getNext();
            }
        }
        return max;
    }















    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}