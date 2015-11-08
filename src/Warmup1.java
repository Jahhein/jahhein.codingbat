
/**
 * Created by jahhein on 6/11/15 at 8:13 AM.
 * Project: codingbat.
 * *
 * Copyright © 2015-2016. Jacob Alan Hein. All Rights Reserved. Access to this file is strictly confidential.
 * This source code may not be copied and/or distributed without the express permission of Jacob Alan Hein.
 * *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * *
 * Contact: Jah.hein.personal@gmail.com (OR) Heinja2@miamioh.edu
 *
 * @author Jacob Hein
 */
@SuppressWarnings("ALL")
public class Warmup1 {
  
  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if
   * we
   * are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if
   * we
   * sleep in.
   *
   * @param weekday
   * @param vacation
   *
   * @return
   */
  public boolean sleepIn(boolean weekday,boolean vacation) {
    return (vacation || (!weekday));
  }
  
  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is
   * smiling. We are in trouble if they are both smiling or if neither of them is smiling.
   * Return true if we are in trouble.
   *
   * @param aSmile
   * @param bSmile
   *
   * @return
   */
  public boolean monkeyTrouble(boolean aSmile,boolean bSmile) {
    return aSmile && bSmile || (!bSmile && !aSmile);
  }
  
  /**
   * Given two int values, return their sum. Unless the two values are the same, then return
   * double their sum.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public int sumDouble(int a,int b) {
    return a == b ? (a+b)*2 : a+b;
  }
  
  /**
   * Given an int n, return the absolute difference between n and 21, except return double the
   * absolute difference if n is over 21.
   *
   * @param n
   *
   * @return
   */
  public int diff21(int n) {
    return n>21 ? Math.abs(21-n)*2 : Math.abs(21-n);
  }
  
  /**
   * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
   * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
   * Return true if we are in trouble.
   *
   * @param talking
   * @param hour
   *
   * @return
   */
  public boolean parrotTrouble(boolean talking,int hour) {
    return talking && (hour<7 || hour>20);
  }
  
  /**
   * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean makes10(int a,int b) {
    return a == 10 || b == 10 || a+b == 10;
  }
  
  /**
   * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
   * computes
   * the absolute value of a number.
   *
   * @param n
   *
   * @return
   */
  public boolean nearHundred(int n) {
    return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
  }
  
  /**
   * Given 2 int values, return true if one is negative and one is positive. Except if the
   * parameter "negative" is true, then return true only if both are negative.
   *
   * @param a
   * @param b
   * @param negative
   *
   * @return
   */
  public boolean posNeg(int a,int b,boolean negative) {
    return negative ? a<0 && b<0 : (a<0 && b>0) || (b<0 && a>0);
  }
  
  /**
   * Given a string, return a new string where "not " has been added to the front. However, if
   * the string already begins with "not", return the string unchanged. Note: use .equals() to
   * compare 2 strings.
   *
   * @param str
   *
   * @return
   */
  public String notString(String str) {
    return str.indexOf("not") == 0 ? str : "not "+str;
  }
  
  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has
   * been removed. The value of n will be a valid index of a char in the original string (i.e.
   * n
   * will be in the range 0..str.length()-1 inclusive).
   *
   * @param str
   * @param n
   *
   * @return
   */
  public String missingChar(String str,int n) {
    return str.substring(0,n)+str.substring(n+1);
  }
  
  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   *
   * @param str
   *
   * @return
   */
  public String frontBack(String str) {
    return str.length()>1 ? str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0) : str;
  }
  
  /**
   * Given a string, we'll say that the front is the first 3 chars of the string. If the
   * string
   * length is less than 3, the front is whatever is there. Return a new string which is 3
   * copies of the front.
   *
   * @param str
   *
   * @return
   */
  public String front3(String str) {
    return str.length()<=3 ?
             str+str+str : str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
  }
  
  /**
   * Given a string, take the last char and return a new string with the last char added at
   * the
   * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
   *
   * @param str
   *
   * @return
   */
  public String backAround(String str) {
    return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
  }
  
  /**
   * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use
   * the
   * % "mod" operator
   *
   * @param n
   *
   * @return
   */
  public boolean or35(int n) {
    return n%3 == 0 || n%5 == 0;
  }
  
  /**
   * Given a string, take the first 2 chars and return the string with the 2 chars added at
   * both
   * the front and back, so "kitten" yields"kikittenki". If the string length is less than 2,
   * use whatever chars are there.
   *
   * @param str
   *
   * @return
   */
  public String front22(String str) {
    return str.length()<2 ?
             str+str+str : str.substring(0,2)+str+str.substring(0,2);
  }
  
  /**
   * Given a string, return true if the string starts with "hi" and false otherwise.
   *
   * @param str
   *
   * @return
   */
  public boolean startHi(String str) {
    return str.indexOf("hi") == 0;
  }
  
  /**
   * Given two temperatures, return true if one is less than 0 and the other is greater than
   * 100.
   *
   * @param temp1
   * @param temp2
   *
   * @return
   */
  public boolean icyHot(int temp1,int temp2) {
    return temp1<0 && temp2>100 || temp1>100 && temp2<0;
  }
  
  /**
   * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean in1020(int a,int b) {
    return a>=10 && a<=20 || b>=10 && b<=20;
  }
  
  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int
   * values, return true if 1 or more of them are teen.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public boolean hasTeen(int a,int b,int c) {
    return a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19;
  }
  
  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int
   * values, return true if one or the other is teen, but not both.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean loneTeen(int a,int b) {
    return !(b>=13 && b<=19) && (a>=13 && a<=19) || !(a>=13 && a<=19) && (b>=13 && b<=19);
  }
  
  /**
   * Given a string, if the string "del" appears starting at index 1, return a string where
   * that
   * "del" has been deleted. Otherwise, return the string unchanged.
   *
   * @param str
   *
   * @return
   */
  public String delDel(String str) {
    return str.indexOf("del") == 1 ? str.charAt(0)+str.substring(4) : str;
  }
  
  /**
   * Return true if the given string begins with "mix", except the 'm' can be anything, so
   * "pix", "9ix" .. all count.
   *
   * @param str
   *
   * @return
   */
  public boolean mixStart(String str) {
    return str.indexOf("ix") == 1;
  }
  
  /**
   * Given a string, return a string made of the first 2 chars (if present), however include
   * first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
   * yields "oz".
   *
   * @param str
   *
   * @return
   */
  public String startOz(String str) {
    if (str.length() == 0)
      return "";
    else if (str.length() == 1 && str.charAt(0) == 'o')
      return "o";
    else if (str.charAt(0) == 'o' && str.charAt(1) == 'z')
      return "oz";
    else if (str.charAt(0) == 'o')
      return "o";
    else
      return (str.charAt(1) == 'z') ? "z" : "";
  }
  
  /**
   * Given three int values, a b c, return the largest.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public int intMax(int a,int b,int c) {
    if (a == b && b == c)
      return a;
    else if (a>b && a>c)
      return a;
    else if (b>a && b>c)
      return b;
    else
      return c;
  }
  
  /**
   * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the
   * event of a tie. Note that Math.abs(n) returns the absolute value of a number.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public int close10(int a,int b) {
    int result=0;
    int x=Math.abs(10-a);
    int y=Math.abs(10-b);
    if (x<y) {
      result=a;
    } else if (y<x) {
      result=b;
    }
    
    return result;
  }
  
  /**
   * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they
   * are both in the range 40..50 inclusive.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean in3050(int a,int b) {
    boolean result=false;
    if ((a>=30 && a<=40) && (b>=30 && b<=40)) {
      result=true;
    }
    if ((a>=40 && a<=50) && (b>=40 && b<=50)) {
      result=true;
    }
    
    return result;
  }
  
  /**
   * Given 2 positive int values, return the larger value that is in the range 10..20
   * inclusive, or return 0 if neither is in that range.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public int max1020(int a,int b) {
    int result=0;
    if ((a>=10 && a<=20) && (b>=10 && b<=20)) {
      result=a;
      if (a<b) {
        result=b;
      }
    } else if (a>=10 && a<=20)
      result=a;
    else if (b>=10 && b<=20)
      result=b;
    
    return result;
  }
  
  /**
   * Return true if the given string contains between 1 and 3 'e' chars.
   *
   * @param str
   *
   * @return
   */
  public boolean stringE(String str) {
    boolean result=false;
    int cnt=0;
    for (int u=0; (u<str.length()); u++) {
      if (str.charAt(u) == 'e') {
        cnt++;
      }
    }
    if (cnt>=1 && cnt<=3) {
      result=true;
    }
    return result;
  }
  
  /**
   * Given two non-negative int values, return true if they have the same last digit, such as
   * with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean lastDigit(int a,int b) {
    boolean result=false;
    
    while (a>=10) {
      a=a%10;
    }
    while (b>=10) {
      b=b%10;
    }
    if (b == a) {
      result=true;
    }
    return result;
  }
  
  /**
   * Given a string, return a new string where the last 3 chars are now in upper case. If the
   * string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
   * returns the uppercase version of a string.
   *
   * @param str
   *
   * @return
   */
  public String endUp(String str) {
    String result=str.toUpperCase();
    int l=str.length();
    if (l>3) {
      result=str.substring(l-3,l);
      result=str.substring(0,l-3)+result.toUpperCase();
    }
    
    return result;
  }
  
  /**
   * Given a non-empty string and an int N, return the string made starting with char 0, and
   * then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1
   * or more.
   *
   * @param str
   * @param n
   *
   * @return
   */
  public String everyNth(String str,int n) {
    String result=str.substring(0,1);
    int l=str.length();
    while (l>n) {
      result+=str.substring(n,n+1);
      str=str.substring(n,l);
      l=str.length();
    }
    return result;
  }
}

