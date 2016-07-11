
/**
 * Created by jahhein on 6/16/15 at 10:46 AM.
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
public class Array1 {
  
  /**
   * Given an array of ints, return true if 6 appears as either the first or last element in the array. 
   * The array will be length 1 or more.
   *
   * @param nums
   *
   * @return
   */
  public boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length - 1] == 6;
  }
  
  /**
   * Given an array of ints, return true if the array is length 1 or more, and the first element and the last
   * element are equal.
   *
   * @param nums
   *
   * @return
   */
  public boolean sameFirstLast(int[] nums) {
    return  nums.length>=1 && nums[0] == nums[nums.length - 1];
  }
  
  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
   *
   * @return
   */
  public int[] makePi() {
    return new int[]{3,1,4};
  }
  
  /**
   * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same
   * last element. Both arrays will be length 1 or more.
   *
   * @param a
   * @param b
   *
   * @return
   */
  public boolean commonEnd(int[] a,int[] b) {
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
  }
  
  /**
   * Given an array of ints length 3, return the sum of all the elements.
   *
   * @param nums
   *
   * @return
   */
  public int sum3(int[] nums) {
    int result=0;
    for (int u=0; u<3; u++) {
      result+=nums[u];
    }
    return result;
    
    return nums.length>0 && nums[nums.length-1]+sum3()
  }
  
  /**
   * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields
   * {2, 3, 1}.
   *
   * @param nums
   *
   * @return
   */
  public int[] rotateLeft3(int[] nums) {
    return new int[]{nums[1],nums[2],nums[0]};
  }
  
  /**
   * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
   * becomes {3, 2, 1}.
   *
   * @param nums
   *
   * @return
   */
  public int[] reverse3(int[] nums) {
    int[] result={nums[2],nums[1],nums[0]};
    return result;
  }
  
  /**
   * Given an array of ints length 3, figure out which is larger between the first and last elements in the
   * array, and set all the other elements to be that value. Return the changed array.
   *
   * @param nums
   *
   * @return
   */
  public int[] maxEnd3(int[] nums) {
    int x=0;
    if (nums[0]>nums[2]) {
      x=nums[0];
    } else
      x=nums[2];
    for (int u=0; u<nums.length; u++) {
      nums[u]=x;
    }
    return nums;
  }
}

