
/**
 * Created by jahhein on 6/10/15 at 1:36 PM.
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
public class Recursion1 {
  
  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
   * Compute the result recursively (without loops).
   *
   * @param n
   *
   * @return
   */
  public int factorial(int n) {
    return n<=1 ? 1 : n*factorial(n-1);
  }
  
  /**
   * We have a number of bunnies and each bunny has two big floppy ears. We want to
   * compute the total number of ears across all the bunnies recursively (without loops
   * or
   * multiplication).
   *
   * @param bunnies
   *
   * @return
   */
  public int bunnyEars(int bunnies) {
    return bunnies<=0 ? 0 : 2+bunnyEars(--bunnies);
  }
  
  /**
   * The fibonacci sequence is a famous bit of mathematics, and it happens to have a
   * recursive definition. The first two values in the sequence are 0 and 1 (essentially
   * 2
   * base cases). Each subsequent value is the sum of the previous two values, so the
   * whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive
   * fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the
   * start of the sequence.
   *
   * @param n
   *
   * @return
   */
  public int fibonacci(int n) {
    return n<=1 ? n : fibonacci(n-1)+fibonacci(n-2);
  }
  
  /**
   * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
   * have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
   * they each have a raised foot. Recursively return the number of "ears" in the bunny
   * line 1, 2, ... n (without loops or multiplication).
   *
   * @param bunnies
   *
   * @return
   */
  public int bunnyEars2(int bunnies) {
    if (bunnies == 0)
      return 0;
    return (bunnies%2 == 1 ? 2 : 3)+bunnyEars2(--bunnies);
  }
  
  /**
   * We have triangle made of blocks. The topmost row has 1 blocks, the next row down has
   * 2
   * blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or
   * multiplication) the total number of blocks in such a triangle with the given number
   * of rows.
   *
   * @param rows
   *
   * @return
   */
  public int triangle(int rows) {
    return rows == 0 ? 0 : rows+triangle(rows-1);
  }
  
  /**
   * Given a non-negative int n, return the sum of its digits recursively (no loops).
   * Note
   * that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by
   * 10
   * removes the rightmost digit (126 / 10 is 12).
   *
   * @param n
   *
   * @return
   */
  public int sumDigits(int n) {
    return n == 0 ? 0 : n%10+sumDigits(n/10);
  }
  
  /**
   * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so
   * for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost
   * digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10
   * is 12).
   *
   * @param n
   *
   * @return
   */
  public int count7(int n) {
    if (n == 0)
      return 0;
    else
      return (n%10 == 7 ? 1 : 0)+count7(n/10);
    // if the remainder is 7 add 1, otherwise continue recursion
    // I need go to bed.
  }
  
  /**
   * Given a non-negative int n, compute recursively (no loops) the count of the
   * occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left
   * counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit
   * (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is
   * 12).
   *
   * @param n
   *
   * @return
   */
  public int count8(int n) {
    if (n == 0)
      return 0;
    else if (n>=88 && n%100 == 88)
      return 2+count8(n/10);
    return n%10 == 8 ? 1+count8(n/10) : count8(n/10);
  }
  
  /**
   * Given base and n that are both 1 or more, compute recursively (no loops) the value
   * of
   * base to the n power, so powerN(3, 2) is 9 (3 squared).
   *
   * @param base
   * @param n
   *
   * @return
   */
  public int powerN(int base,int n) {
    return n == 0 ? 1 : base*powerN(base,n-1);
    // is power 0? if so, return 1. otherwise continue recurssion
  }
  
  /**
   * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in
   * the string.
   *
   * @param str
   *
   * @return
   */
  public int countX(String str) {
    return str.length() == 0 ? 0 : // is length 0? is so, just return 0, otherwise..
             str.charAt(0) == 'x' ? 1+countX(str.substring(1)) : countX(str.substring(1));
    // if first character is x, add one. otherwise continue recursion.
  }
  
  /**
   * Given a string, compute recursively (no loops) the number of times lowercase "hi"
   * appears in the string.
   *
   * @param str
   *
   * @return
   */
  public int countHi(String str) {
    return str.length()<=1 ? 0 :
             (str.charAt(0) == 'h' && str.charAt(1) == 'i' ? 1 : 0)+countHi(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively (no loops) a new string where all the lowercase
   * 'x' chars have been changed to 'y' chars.
   *
   * @param str
   *
   * @return
   */
  public String changeXY(String str) {
    if (str.length() == 0)
      return str;
    return (str.charAt(0) == 'x' ? "y" : str.substring(0,1))+changeXY(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively (no loops) a new string where all appearances of
   * "pi" have been replaced by "3.14".
   *
   * @param str
   *
   * @return
   */
  public String changePi(String str) {
    if (str.length()<=1)
      return str;
    return str.substring(0,2).equalsIgnoreCase("pi") ? "3.14"+changePi(str.substring(2)) :
             str.substring(0,1)+changePi(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively a new string where all the 'x' chars have been
   * removed.
   *
   * @param str
   *
   * @return
   */
  public String noX(String str) {
    if (str.length() == 0)
      return str;
    return (str.charAt(0) == 'x' ? "" : str.substring(0,1))+noX(str.substring(1));
  }
  
  /**
   * Given an array of ints, compute recursively if the array contains a 6. We'll use the
   * convention of considering only the part of the array that begins at the given index.
   * In this way, a recursive call can pass index+1 to move down the array. The initial
   * call will pass in index as 0.
   *
   * @param nums
   * @param index
   *
   * @return
   */
  public boolean array6(int[] nums,int index) {
    return index != nums.length && (nums[index] == 6 || array6(nums,++index));
    
    // is index==to the array length? if so, return false. Otherwise..
    // is the element at index equal to 6? if so, return true, otherwise..
    // continue the recursion, increasing the index number.
  }
  
  /**
   * Given an array of ints, compute recursively the number of times that the value 11
   * appears in the array. We'll use the convention of considering only the part of the
   * array that begins at the given index. In this way, a recursive call can pass index+1
   * to move down the array. The initial call will pass in index as 0.
   *
   * @param nums
   * @param index
   *
   * @return
   */
  public int array11(int[] nums,int index) {
    if (index == nums.length)
      return 0;
    return (nums[index] == 11 ? 1 : 0)+array11(nums,++index);
  }
  
  /**
   * Given an array of ints, compute recursively if the array contains somewhere a value
   * followed in the array by that value times 10. We'll use the convention of
   * considering
   * only the part of the array that begins at the given index. In this way, a recursive
   * call can pass index+1 to move down the array. The initial call will pass in index as
   * 0.
   *
   * @param nums
   * @param index
   *
   * @return
   */
  public boolean array220(int[] nums,int index) {
    return index<nums.length-1 && (nums[index]*10 == nums[index+1] || array220(nums,++index));
  }
  
  /**
   * Given a string, compute recursively a new string where all the adjacent chars are
   * now
   * separated by a "*".
   *
   * @param str
   *
   * @return
   */
  public String allStar(String str) {
    if (str.length()<=1)
      return str;
    return str.charAt(0)+"*"+allStar(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively a new string where identical chars that are
   * adjacent in the original string are separated from each other by a "*".
   *
   * @param str
   *
   * @return
   */
  public String pairStar(String str) {
    if (str.length()<=1)
      return str;
    return (str.charAt(0) == str.charAt(1) ? str.substring(0,1)+"*" : str.substring(0,1))+pairStar(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively a new string where all the lowercase 'x' chars
   * have been moved to the end of the string.
   *
   * @param str
   *
   * @return
   */
  public String endX(String str) {
    if (str.length() == 0)
      return str;
    return str.charAt(0) == 'x' ? endX(str.substring(1))+"x" : str.charAt(0)+endX(str.substring(1));
  }
  
  /**
   * We'll say that a "pair" in a string is two instances of a char separated by a char.
   * So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2
   * for A and 1 for x. Recursively compute the number of pairs in the given string.
   *
   * @param str
   *
   * @return
   */
  public int countPairs(String str) {
    if (str.length()<3)
      return 0;
    return (str.charAt(0) == str.charAt(2) ? 1 : 0)+countPairs(str.substring(1));
  }
  
  /**
   * Count recursively the total number of "abc" and "aba" substrings that appear in the
   * given string.
   *
   * @param str
   *
   * @return
   */
  public int countAbc(String str) {
    if (str.length()<3)
      return 0;
    return
      (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba") ? 1 : 0) //add 1
      +countAbc(str.substring(1)); // add recursive counts.
  }
  
  /**
   * Given a string, compute recursively (no loops) the number of "11" substrings in the
   * string. The "11" substrings should not overlap.
   * * TODO note to self:
   * indexOf is -1, 0, or 0+
   * possibly shorten length check because of this. would be -1 if str is empty.
   *
   * @param str
   *
   * @return
   */
  public int count11(String str) {
    if (str.length()<2)
      return 0;
    return str.substring(0,2).equals("11") ?
             1+count11(str.substring(2)) : count11(str.substring(1)); // add one, or don't.
  }
  
  /**
   * Given a string, return recursively a "cleaned" string where adjacent chars that are
   * the same have been reduced to a single char. So "yyzzza" yields "yza".
   *
   * @param str
   *
   * @return
   */
  public String stringClean(String str) {
    if (str.length()<2)
      return str;
    return str.charAt(0) == str.charAt(1) ? "" : str.charAt(0)+stringClean(str.substring(1));
  }
  
  /**
   * Given a string, compute recursively the number of times lowercase "hi" appears in
   * the
   * string, however do not count "hi" that have an 'x' immedately before them.
   * * TODO note to self:
   * indexOf bypasses length check. Faster than recursive checking every element
   * if checked for it initially.
   *
   * @param str
   *
   * @return
   */
  public int countHi2(String str) {
    if (str.length()<2)
      return 0;
    else if (str.charAt(0) == 'x' && str.length()>=3)
      return str.substring(1,3).equals("hi") ? countHi2(str.substring(3)) : countHi2(str.substring(1));
    
    return (str.substring(0,2).equals("hi") ? 1 : 0)+countHi2(str.substring(1));
  }
  
  /**
   * Given a string that contains a single pair of parenthesis, compute recursively a new
   * string made of only of the parenthesis and their contents, so "xyz(abc)123" yields
   * "(abc)".
   *
   * @param str
   *
   * @return
   */
  public String parenBit(String str) {
    if (str.length()<2)
      return str;
    else if (str.charAt(0) == '(')
      return str.charAt(str.length()-1) == ')' ? str : parenBit(str.substring(0,str.length()-1));
    
    return parenBit(str.substring(1));
  }
// this is the answer. redundant recursion method in my opinion.

/*
 if(str.contains("(")&&str.contains(")"))
  return str.substring(str.indexOf("("),str.indexOf(")")+1);
 else
  return str;
*/
  
  /**
   * Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
   * like "(())" or "((()))". Suggestion: check the first and last chars, and then recur
   * on what's inside them.
   *
   * @param str
   *
   * @return
   */
  public boolean nestParen(String str) {
    if (!str.equals("") && !str.equals("()"))
      return (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') && nestParen(str.substring(1,str.length()-1));
    return true;
  }
  
  /**
   * Given a string and a non-empty substring sub, compute recursively the number of
   * times
   * that sub appears in the string, without the sub strings overlapping.
   *
   * @param str
   * @param sub
   *
   * @return
   */
  public int strCount(String str,String sub) {
    return str.length()<sub.length() ? 0 :
             (str.substring(0,sub.length()).equals(sub) ?
                1+strCount(str.substring(sub.length()),sub) : strCount(str.substring(1),sub));
  }
  
  /**
   * Given a string and a non-empty substring sub, compute recursively if at least n
   * copies of sub appear in the string somewhere, possibly with overlapping. N will be
   * non-negative.
   *
   * @param str
   * @param sub
   * @param n
   *
   * @return
   */
  public boolean strCopies(String str,String sub,int n) {
    if (str.length()<sub.length())
      return n<=0;
    return str.substring(0,sub.length()).equals(sub) ?
             strCopies(str.substring(1),sub,--n) : strCopies(str.substring(1),sub,n);
  }
  
  /**
   * Given a string and a non-empty substring sub, compute recursively the largest
   * substring which starts and ends with sub and return its length.
   *
   * @param str
   * @param sub
   *
   * @return
   */
  public int strDist(String str,String sub) {
    if (str.length()<sub.length())
      return 0;
    else if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub))
      return str.length();
    return (str.indexOf(sub) == 0) ? strDist(str.substring(0,str.length()-1),sub) : strDist(str.substring(1),sub);
  }
}


