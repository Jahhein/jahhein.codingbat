
/**
 * Created by jahhein on 6/16/15 at 1:16 AM.
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
public class Warmup2 {

  /* todo What is a string?
      A String is a sequence of characters both letters, numbers, and specials characters
      such as $,()!@#$%^& and many more. Whitespace (spaces) are also part of the string.
      example a String containing the words "The Happy Dog."
      This string has a length of 14. This number includes whitespace.
      The indexes of the string start from 0.
      
     Length:| 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 |
            | T  | h  | e  |    | H  | a  | p  | p  | y  |    | D  | o  | g  | .  |
    Indexes:| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 |
 */
  
  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the
   * original string.
   *
   * @param str
   * @param n
   *
   * @return
   */
  public String stringTimes(String str,int n) {
    return n == 0 ? "" : str+stringTimes(str,n-1);
  }
  
  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the
   * first 3 chars, or whatever is there if the string is less than length 3. Return n copies
   * of the front;
   *
   * @param str
   * @param n
   *
   * @return
   */
  public String frontTimes(String str,int n) {
    if (str.length()<3)
      return n == 0 ? "" : str.substring(0,str.length())+frontTimes(str,n-1);
    else
      return n == 0 ? "" : str.substring(0,3)+frontTimes(str,n-1);
  }
  
  /**
   * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so
   * "xxx" contains 2 "xx".
   *
   * @param str
   *
   * @return
   */
  int countXX(String str) {
    return str.length()<2 ? 0 : (str.charAt(0) == 'x' && str.charAt(1) == 'x' ? 1 : 0)+countXX(str.substring(1));
  }
  
  /**
   * Given a string, return true if the first instance of "x" in the string is immediately
   * followed by another "x".
   *
   * @param str
   *
   * @return
   */
  boolean doubleX(String str) {
    return str.length()>1 && str.contains("xx") && str.indexOf("xx") == str.indexOf("x");
  }// return true if the first x in the string is followed by another x.
  
  /**
   * Given a string, return a new string made of every other char starting with the first, so
   * "Hello" yields "Hlo".
   *
   * @param str
   *
   * @return
   */
  public String stringBits(String str) {
    return str.length()<=1 ? (str.length() == 0 ? ""
                                : ""+str.charAt(0))
             : str.charAt(0)+stringBits(str.substring(2));
  }
  
  public String stringBits2(String str) {
    String result="";
    for (int u=0; u<str.length(); u+=2)
      result+=str.substring(u,u+1);
    return result;
  }
  
  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   *
   * @param str
   *
   * @return
   */
  public String stringSplosion(String str) {
    String result=str.substring(0,1);
    int l=str.length(), cnt=2;
    while (l-->=2)
      result+=str.substring(0,cnt++);
    return result;
  }
  
  /**
   * Given a string, return the count of the number of times that a substring length 2 appears
   * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't
   * count the end substring).
   *
   * @param str
   *
   * @return
   */
  public int last2(String str) {
    int cnt=0;
    for (int u=0; u<str.length()-2; u++)
      if (str.substring(u,u+2).equals(str.substring(str.length()-2)))
        cnt++;
    return cnt;
  }
  
  /**
   * Given an array of ints, return the number of 9's in the array.
   *
   * @param nums
   *
   * @return
   */
  public int arrayCount9(int[] nums) {
    int cnt=0;
    for (int u : nums)
      if (u == 9)
        cnt++;
    
    return cnt;
  }
  
  public int arrayCount9Two(int[] nums) {
    int result=0;
    for (int u=0; u<nums.length; u++)
      if (nums[u] == 9)
        result++;
    return result;
  }
  
  /**
   * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
   * The array length may be less than 4.
   *
   * @param nums
   *
   * @return
   */
  public boolean arrayFront9(int[] nums) {
    for (int u=0; u<4 && u<nums.length; u++)
      if (nums[u] == 9)
        return true;
    return false;
  }
  
  public boolean arrayFront9Two(int[] nums) {
    boolean result=false;
    int l=nums.length;
    
    if (l>=4)
      for (int u=0; u<4; u++)
        if (nums[u] == 9)
          result=true;
    
    if (l<4)
      for (int u=0; (u<l); u++)
        if (nums[u] == 9)
          result=true;
    
    return result;
  }
  
  /**
   * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
   *
   * @param nums
   *
   * @return
   */
  public boolean array123(int[] nums) {
    if (nums.length>=3)
      for (int u=0; u<nums.length-2; u++)
        if (nums[u] == 1 && nums[u+1] == 2 && nums[u+2] == 3)
          return true;
    return false;
  }
  
  /**
   * Given 2 strings, a and b, return the number of the positions where they contain the same
   * length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
   * substrings appear in the same place in both strings.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public int stringMatch(String a,String b) {
    int cnt=0;
    for (int u=0; u<a.length()-1 && u<b.length()-1; u++)
      if (a.substring(u,u+2).equals(b.substring(u,u+2)))
        cnt++;
    return cnt;
  }
  
  /**
   * Given a string, return a version where all the "x" have been removed. Except an "x" at
   * the
   * very start or end should not be removed.
   *
   * @param str
   *
   * @return
   */
  public String stringX(String str) {
    return str.length()<2 ? str :
             (str.charAt(1) == 'x' ? str.substring(0,1) : str.substring(0,2))+stringX(str.substring(2));
  }
  
  public String stringX2(String str) {
    String result="";
    if (str.length()<=2)
      return str;
    
    for (int u=1; u<str.length()-1; u++)
      if (str.charAt(u) != 'x')
        result+=str.charAt(u);
    
    return str.charAt(0)+result+str.charAt(str.length()-1);
  }
  
  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so
   * "kittens" yields "kien".
   *
   * @param str
   *
   * @return
   */
  public String altPairs(String str) {
    String result="";
    for (int u=0; u<str.length(); u+=4) {
      result+=str.charAt(u);
      if (u+1<str.length())
        result+=str.charAt(u+1);
    }
    return result;
  }
  
  /**
   * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
   * are removed, but the "a" can be any char. The "yak" strings will not overlap.
   *
   * @param str
   *
   * @return
   */
  public String stringYak(String str) {
    while (str.contains("yak"))
      str=str.substring(0,str.indexOf("yak"))+str.substring(str.indexOf("yak")+3);
    return str;
  }
  
  /**
   * Given an array of ints, return the number of times that two 6's are next to each other in
   * the array. Also count instances where the second "6" is actually a 7.
   *
   * @param nums
   *
   * @return
   */
  public int array667(int[] nums) {
    int result=0;
    for (int u=0; u<nums.length-1; u++)
      if (nums[u] == 6 && (nums[u+1] == 6 || nums[u+1] == 7))
        result++;
    return result;
  }
  
  /**
   * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in
   * the array. Return true if the array does not contain any triples.
   *
   * @param nums
   *
   * @return
   */
  public boolean noTriples(int[] nums) {
    if (nums.length>=3)
      for (int u=0; u<nums.length-3; u++)
        if (nums[u] == nums[u+1] && nums[u+1] == nums[u+2])
          return false;
    return true;
  }
  
  /**
   * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed
   * by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if
   * the "1" differs by 2 or less from the correct value.
   *
   * @param nums
   *
   * @return
   */
  public boolean has271(int[] nums) {
    for (int u=0; u<nums.length-2; u++)
      if (nums[u] == nums[u+1]-5 && Math.abs(nums[u+2]+1-nums[u])<=2)
        return true;
    return false;
  }
}
