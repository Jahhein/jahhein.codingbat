
/**
 * Created by jahhein on 6/16/15 at 10:44 AM.
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
public class String2 {
  
  /**
   * Given a string, return a string where for every char in the original, there are two
   * chars.
   *
   * @param str
   *
   * @return
   */
  public String doubleChar(String str) {
    String result="";
    int l=str.length();
    for (int u=0; u<l; u++) {
      for (int t=0; t<2; t++) {
        result+=str.charAt(u);
      }
    }
    return result;
  }
  
  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   *
   * @param str
   *
   * @return
   */
  public int countHi(String str) {
    int result=0, l=str.length()-1;
    for (int u=0; u<l; u++) {
      if (str.charAt(u) == 'h' && str.charAt(u+1) == 'i') {
        result++;
      }
    }
    return result;
  }
  
  /**
   * Return true if the string "cat" and "dog" appear the same number of times in the given
   * string.
   *
   * @param str
   *
   * @return
   */
  public boolean catDog(String str) {
    int cnt=0;
    while (str.length()>0) {
      if (str.indexOf("cat") == 0) {
        str=str.substring(3,str.length());
        cnt++;
      } else if (str.indexOf("dog") == 0) {
        str=str.substring(3,str.length());
        cnt--;
      } else
        str=str.substring(1);
    }
    return cnt == 0;
  }
  
  /**
   * Return the number of times that the string "code" appears anywhere in the given string, except we'll
   * accept any letter for the 'd', so "cope" and "cooe" count.
   *
   * @param str
   *
   * @return
   */
  public int countCode(String str) {
    if (str.length()>=4)
      if (str.charAt(0) == 'c' && str.charAt(1) == 'o' && str.charAt(3) == 'e')
        return 1+countCode(str.substring(3));
    
    return str.length() == 0 ? 0 : countCode(str.substring(1));
  }
  
  /**
   * todo not complete
   * Given two strings, return true if either of the strings appears at the very end of the other string,
   * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
   * Note: str.toLowerCase() returns the lowercase version of a string.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean endOther(String a,String b) {
    return a.length() == 0 ||
           b.length() == 0 ||
           a.toLowerCase().lastIndexOf(b.toLowerCase())+b.length() == a.length()-1;
  }
  
  /**
   * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded
   * by a period (.). So "xxyz" counts but "x.xyz" does not.
   *
   * @param str
   */
  public boolean xyzThere(String str) {
    if (!str.contains("xyz"))
      return false;
    else if (str.charAt(0) == '.' && (str.indexOf("xyz") == 1) && str.lastIndexOf("xyz") == 1)
      return false;
    else if (str.indexOf("xyz") == 0)
      return true;
    return xyzThere(str.substring(1));
  }
}
