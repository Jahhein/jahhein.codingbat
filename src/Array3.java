
/**
 * Created by jahhein on 6/13/15 at 10:18 PM.
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
public class Array3 {
  /**
   * Consider the leftmost and rightmost appearances of some value in an array. We'll say that
   * the "span" is the number of elements between the two inclusive. A single value has a span
   * of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
   *
   * @param nums
   *
   * @return
   */
  public int maxSpan(int[] nums) {
    if (nums.length>0) {
      int max=1;
      for (int u=0; u<nums.length; u++)
        for (int t=nums.length-1; t>u; t--)
          if (nums[t] == nums[u]) {
            int cnt=(t-u)+1;
            if (cnt>max)
              max=cnt;
            break;
          }
      return max;
    }
    return 0;
  }
  
  /**
   * Return an array that contains exactly the same numbers as the given array, but rearranged
   * so that every 3 is immediately followed by a 4. Do not move the 3's, but every other
   * number may move. The array contains the same number of 3's and 4's, every 3 has a number
   * after it that is not a 3 or 4, and a 3 appears in the array before any 4.
   *
   * @param nums
   *
   * @return
   */
  public int[] fix34(int[] nums) {
    for (int u=0; u<nums.length; u++)
      if (nums[u] == 3) {
        int temp=nums[u+1];
        nums[u+1]=4;
        for (int t=u+2; t<nums.length; t++)
          if (nums[t] == 4)
            nums[t]=temp;
      }
    return nums;
  }
  
  /**
   * (This is a slightly harder version of the fix34 problem.) Return an array that contains
   * exactly the same numbers as the given array, but rearranged so that every 4 is
   * immediately
   * followed by a 5. Do not move the 4's, but every other number may move. The array contains
   * the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In
   * this
   * version, 5's may appear anywhere in the original array.
   *
   * @param nums
   *
   * @return
   */
  public int[] fix45(int[] nums) {
    for (int u=0; u<nums.length; u++) {
      if (nums[u] == 5 && u == 0 || nums[u] == 5 && nums[u-1] != 4) {
        for (int t=0; t<nums.length; t++) {
          if (nums[t] == 4 && nums[t+1] != 5) {
            int temp=nums[t+1];
            nums[t+1]=5;
            nums[u]=temp;
            break;
          }
        }
      }
    }
    return nums;
  }
  
  /**
   * Given a non-empty array, return true if there is a place to split the array so that the
   * sum of the numbers on one side is equal to the sum of the numbers on the other side.
   *
   * @param nums
   *
   * @return
   */
  public boolean canBalance(int[] nums) {
    int result1=0, result2=0, partition=1;
    for (int u=0; u<partition && partition<nums.length; u++,partition++) {
      result1+=nums[u];
      for (int t=u+1; t<nums.length; t++)
        result2+=nums[t];
      if (result1 == result2)
        return true;
      else
        result2=0;
    }
    
    return false;
  }
  
  /**
   * Given two arrays of type int sorted in increasing order, outer and inner, return true if all
   * of the numbers in inner appear in outer. The best solution makes only a single "linear"
   * pass of both arrays, taking advantage of the fact that both arrays are already in sorted
   * order.
   * *
   * what if not sorted? double for loop maybe? what about speeds?
   *
   * @param outer
   * @param inner
   *
   * @return
   */
  public boolean linearIn(int[] outer,int[] inner) {
    int in=0, out=0;
    
    while (in<inner.length && out<outer.length) {
      if (outer[out] == inner[in]) {
        in++;
        out++;
      } else
        out++;
    }
    return in == inner.length;
  }
  
  /**
   * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
   * {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
   *
   * @param n
   *
   * @return
   */
  public int[] squareUp(int n) {
    int inc=0, result[]=new int[n*n];
    
    for (int u=1; u<=n; u++) {
      for (int t=1; t<=n-u; t++)
        result[inc++]=0;
      for (int v=u; v>0; v--)
        result[inc++]=v;
    }
    return result;
  }
  
  /**
   * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
   * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3
   * ... + n, which is known to sum to exactly n*(n + 1)/2.
   *
   * @param n
   *
   * @return
   */
  public int[] seriesUp(int n) {
    int[] result=new int[n*(n+1)/2];
    int t=0, u=1;
    while (u<=n+1) {
      for (int v=1; v<u; v++)
        result[t++]=v;
      u++;
    }
    return result;
  }
  
  /**
   * We'll say that a "mirror" section in an array is a group of contiguous elements such that
   * somewhere in the array, the same group appears in reverse order. For example, the largest
   * mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the
   * size of the largest mirror section found in the given array.
   *
   * @param nums
   *
   * @return
   */
  public int maxMirror(int[] nums) {
    int result=0;
    for (int u=0, cnt=0; u<nums.length; u++)
      for (int t=nums.length-1; t>=0; t--) {
        if (nums[u] == nums[t])
          for (int k=0; k<nums.length-u; k++)
            if (u+k<nums.length && t-k>=0 && nums[u+k] == nums[t-k])
              cnt++;
            else
              break;
        result=(result>cnt) ? result : cnt;
        cnt=0;
      }
    return result;
  }
  
  /**
   * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same
   * value. Return the number of clumps in the given array.
   *
   * @param nums
   *
   * @return
   */
  public int countClumps(int[] nums) {
    int cnt=0;
    for (int u=0; u<nums.length-1; u++)
      if (nums[u] == nums[u+1]) {
        cnt++;
        for (int t=u+1; t<nums.length; t++)
          if (nums[t] == nums[u])
            u++;
          else
            break;
      }
    return cnt;
  }
}

