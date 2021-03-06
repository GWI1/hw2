/*Java 1 Homework 2
*@author Ksenia
* @version date 19/01/22
*
*/
public class HW2 {
    public static void main(String[] args) {
        System.out.println(sum10to20 (3, 10));
        isPositiveOrNegative(-54);
        System.out.println(isNegativeOrNot(-10));
        printWordNTimes("Many words", 5);
        System.out.println(isLeapYear(2022));
    }
   static boolean sum10to20(int a, int b) {
        return ((a+b)>=10)&&((a+b)<=20);
    }
    static void isPositiveOrNegative(int x) {
        if (x>=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    static boolean isNegativeOrNot(int a) {
        return a<0;
    }
    public static void printWordNTimes(String S, int t) {
        int i=0;
        for (i=0; i<t; i++) {
            System.out.println(S);
        }
    }
    static boolean isLeapYear(int year) {

        if (year % 4==0) {
            return true;
        } else if (year %100==0) {
            return false;
        }else {return false;
        }
    }
}
