
/**
 * Created by jahhein on 6/10/15 at 1:35 PM.
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

public class Recursion2 {
  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such
   * that the group sums to the given target? This is a classic backtracking recursion
   * problem. Once you understand the recursive backtracking strategy in this problem,
   * you
   * can use the same pattern for many problems to search a space of choices. Rather than
   * looking at the whole array, our convention is to consider the part of the array
   * starting at index start and continuing to the end of the array. The caller can
   * specify the whole array simply by passing start as 0. No loops are needed -- the
   * recursive calls progress down the array.
   *
   * @param start
   * @param nums
   * @param target
   *
   * @return
   */
  public boolean groupSum(int start,int[] nums,int target) {
    return start>=nums.length ? target == 0 :
             groupSum(start+1,nums,target-nums[start]) || groupSum(start+1,nums,target);
  }
  
  /**
   * Given an array of ints, is it possible to choose a group of some of the ints,
   * beginning at the start index, such that the group sums to the given target? However,
   * with the additional constraint that all 6's must be chosen. (No loops needed.)
   *
   * @param start
   * @param nums
   * @param target
   *
   * @return
   */
  public boolean groupSum6(int start,int[] nums,int target) {
    if (start>=nums.length)
      return target == 0;
    else
      return nums[start] == 6 ?
               groupSum6(start+1,nums,target-nums[start]) :
               groupSum6(start+1,nums,target-nums[start]) || groupSum6(start+1,nums,target);
  }
  
  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such
   * that the group sums to the given target with this additional constraint: If a value
   * in the array is chosen to be in the group, the value immediately following it in the
   * array must not be chosen. (No loops needed.)
   *
   * @param start
   * @param nums
   * @param target
   *
   * @return
   */
  public boolean groupNoAdj(int start,int[] nums,int target) {
    return start>=nums.length ? target == 0 :
             groupNoAdj(start+2,nums,target-nums[start]) || groupNoAdj(start+1,nums,target);
  }
  
  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such
   * that the group sums to the given target with these additional constraints: all
   * multiples of 5 in the array must be included in the group. If the value immediately
   * following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
   *
   * @param start
   * @param nums
   * @param target
   *
   * @return
   */
  public boolean groupSum5(int start,int[] nums,int target) {
    if (start>=nums.length)
      return target == 0;
    else if (nums[start]%5 == 0)
      return start<nums.length-1 && nums[start+1] == 1 ?
               groupSum5(start+2,nums,target-nums[start]) : groupSum5(start+1,nums,target-nums[start]);
    else
      return groupSum5(start+1,nums,target-nums[start]) || groupSum5(start+1,nums,target);
  }
  
  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such
   * that the group sums to the given target, with this additional constraint: if there
   * are numbers in the array that are adjacent and the identical value, they must either
   * all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5,
   * 2}, either all three 2's in the middle must be chosen or not, all as a group. (one
   * loop can be used to find the extent of the identical values).
   *
   * @param start
   * @param nums
   * @param target
   *
   * @return
   */
  public boolean groupSumClump(int start,int[] nums,int target) {
    if (start == nums.length)
      return target == 0;
    
    int result=nums[start];
    int cnt=1;
    for (int u=start+1; (u<nums.length); u++)
      if (nums[u] == nums[start]) {
        result+=nums[u];
        cnt++;
      }
    return groupSumClump(start+cnt,nums,target-result) || groupSumClump(start+cnt,nums,target);
  }
  
  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that
   * the sums of the two groups are the same. Every int must be in one group or the
   * other.
   * Write a recursive helper method that takes whatever arguments you like, and make the
   * initial call to your recursive helper from splitArray(). (No loops needed.)
   *
   * @param nums
   *
   * @return
   */
  public boolean splitArray(int[] nums) {
    return helper1(0,nums,0,0);
  }
  
  public boolean helper1(int startIndex,int[] xRay,int firstResult,int secResult) {
    return startIndex>=xRay.length ? firstResult == secResult : // if not, return...
             helper1(startIndex+1,xRay,firstResult+xRay[startIndex],secResult) || //or
             helper1(startIndex+1,xRay,firstResult,secResult+xRay[startIndex]);
  }
  
  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that
   * the sum of one group is a multiple of 10, and the sum of the other group is odd.
   * Every int must be in one group or the other. Write a recursive helper method that
   * takes whatever arguments you like, and make the initial call to your recursive
   * helper
   * from splitOdd10(). (No loops needed.)
   *
   * @param nums
   *
   * @return
   */
  public boolean splitOdd10(int[] nums) {
    return helper2(0,nums,0,0); // TODO
  }
  
  public boolean helper2(int startIndex,int[] xRay,int result1,int result2) {
    if (startIndex>=xRay.length) // too long for ternary
      return result1%10 == 0 && result2%2 == 1 || // or
             result1%2 == 1 && result2%10 == 0;
    else
      return helper2(startIndex+1,xRay,result1+xRay[startIndex],result2) ||
             helper2(startIndex+1,xRay,result1,result2+xRay[startIndex]);
  }

// Ternary below (remove comment tags and replace on other method).
/*
public boolean helper2(int startIndex,int[] xRay, int result1, int result2) {
 return startIndex>=xRay.length?
        (result1%10==0&&result2%2==1||result1%2==1&&result2%10==0): // If not do..
        (helper2(startIndex+1,xRay,result1+xRay[startIndex],result2) || //or
         helper2(startIndex+1,xRay,result1,result2+xRay[startIndex]));
}*/
  
  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that
   * the sum of the two groups is the same, with these constraints: all the values that
   * are multiple of 5 must be in one group, and all the values that are a multiple of 3
   * (and not a multiple of 5) must be in the other. (No loops needed.)
   *
   * @param nums
   *
   * @return
   */
  public boolean split53(int[] nums) {
    return helper3(0,nums,0,0);
  }
  
  public boolean helper3(int startIndex,int[] xRay,int result1,int result2) {
    if (startIndex>=xRay.length)
      return result1 == result2;
    else if (xRay[startIndex]%5 == 0)
      return helper3(startIndex+1,xRay,result1+xRay[startIndex],result2);
    else if (xRay[startIndex]%3 == 0)
      return helper3(startIndex+1,xRay,result1,result2+xRay[startIndex]);
    else
      return helper3(startIndex+1,xRay,result1+xRay[startIndex],result2) || //or
             helper3(startIndex+1,xRay,result1,result2+xRay[startIndex]);
  }

// Ternary below (remove comments and add comments to above).
  /*
  public boolean helper3(int startIndex,int[] xRay,int result1,int result2) {
    if (startIndex>=xRay.length)
      return result1==result2;
    else
      return (xRay[startIndex]%5==0) ?
       helper3(startIndex+1,xRay,result1+xRay[startIndex],result2) : // true
       xRay[startIndex]%3==0 ? // (or) false
        helper3(startIndex+1,xRay,result1,result2+xRay[startIndex]) : //true
        helper3(startIndex+1,xRay,result1+xRay[startIndex],result2)|| //or (false)
         helper3(startIndex+1,xRay,result1,result2+xRay[startIndex]);
  }
  */
}

