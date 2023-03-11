
/**
 * Created by jahhein on 6/12/15 at 7:17 AM.
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
public class Logic2 {
  /**
   * We want to make a row of bricks that is goal inches long. We have a number of small
   * bricks
   * (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the
   * goal by choosing from the given bricks. This is a little harder than it looks and can be
   * done without any loops.
   *
   * @param small
   * @param big
   * @param goal
   *
   * @return
   */
  public boolean makeBricks(int small,int big,int goal) {
    return goal-big*5<=small && goal%5<=small;
  }
  
  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values is the same as
   * another of the values, it does not count towards the sum.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public int loneSum(int a,int b,int c) {
    if (a == b || a == c)
      return a == b ? (a == c ? 0 : c) : b;
    if (b == c)
      return a;
    return a+b+c;
  }
  
  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it
   * does not count towards the sum and values to its right do not count. So for example, if b
   * is 13, then both b and c do not count.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public int luckySum(int a,int b,int c) {
    if (a == 13)
      return 0;
    else if (b == 13)
      return a;
    else if (c == 13)
      return a+b;
    return a+b+c;
  }
  
  /**
   * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in
   * the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count
   * as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int
   * value and returns that value fixed for the teen rule. In this way, you avoid repeating
   * the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent
   * level as the main noTeenSum().
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public int noTeenSum(int a,int b,int c) {
    return fixTeen(a)+fixTeen(b)+fixTeen(c);
  }
  
  /**
   * noTeenSum() helper method
   *
   * @param n
   *
   * @return
   */
  public int fixTeen(int n) {
    return (n>=13 && n<=19 && n != 15 && n != 16) ? 0 : n;
  }
  
  /**
   * noTeenSum() helper method
   *
   * @param n
   *
   * @return
   */
  public int fixTeen2(int n) {
    if (n>=13 && n<=19 && n != 15 && n != 16)
      return 0;
    return n;
  }
  
  /**
   * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost
   * digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous
   * multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3
   * ints, a b c, return the sum of their rounded values. To avoid code repetition, write a
   * separate helper "public int round10(int num) {" and call it 3 times. Write the helper
   * entirely below and at the same indent level as roundSum().
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public int roundSum(int a,int b,int c) {
    return round10(a)+round10(b)+round10(c);
  }
  
  /**
   * roundSum() helper method
   *
   * @param num
   *
   * @return
   */
  public int round10(int num) {
    return num%10<5 ? num/10*10 : num/10*10+10;
  }
  
  /**
   * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at
   * most 1), while the other is "far", differing from both other values by 2 or more. Note:
   * Math.abs(num) computes the absolute value of a number.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public boolean closeFar(int a,int b,int c) {
    return Math.abs(b-c)>=2 && (Math.abs(a-b)<=1 && Math.abs(a-c)>=2 || Math.abs(a-c)<=1 && Math.abs(a-b)>=2);
  }
  
  /**
   * Given 2 int values greater than 0, return whichever value is nearest to 21 without going
   * over. Return 0 if they both go over.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public int blackjack(int a,int b) {
    int result=0;
    if (a<=21 && b<=21)
      if (21-a>21-b)
        result=b;
      else
        result=a;
    
    if (a<=21 && b>21)
      result=a;
    if (a>21 && b<=21)
      result=b;
    
    return result;
  }
  
  /**
   * Given three ints, a b c, one of them is small, one is medium and one is large. Return
   * true if the three values are evenly spaced, so the difference between small and medium is the
   * same as the difference between medium and large.
   *
   * @param a
   * @param b
   * @param c
   *
   * @return
   */
  public boolean evenlySpaced(int a,int b,int c) {
    int min=Math.min(Math.min(a,b),c), mid=Math.max(Math.min(a,b),c);
    int mid2=Math.min(Math.max(a,b),c), max=Math.max(Math.max(a,b),c);
    return Math.abs(mid-min) == Math.abs(mid-max) || Math.abs(mid2-min) == Math.abs(mid2-max);
  }
  
  /**
   * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and
   * big bars (5 kilos each). Return the number of small bars to use, assuming we always use
   * big bars before small bars. Return -1 if it can't be done.
   *
   * @param small
   * @param big
   * @param goal
   *
   * @return
   */
  public int makeChocolate(int small,int big,int goal) {
    if (big>goal/5)
      return goal<=5*(goal/5)+small ? goal-5*(goal/5) : -1;
    return goal<=5*big+small ? goal-5*big : -1;
  }
}

