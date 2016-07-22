
/**
 * Created by jahhein on 6/16/15 at 10:45 AM.
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
public class Array2 {
  
  /**
   * Return the number of even ints in the given array. Note: the % "mod" operator computes
   * the remainder, e.g. 5 % 2 is 1.
   *
   * @param nums
   *
   * @return
   */
  public int countEvens(int[] nums) {
    int cnt=0;
    for (int u : nums)
      if (u%2 == 0)
        cnt++;
    
    return cnt;
  }
  
  /**
   * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ...
   * or 23, 24, 25.
   *
   * @param nums
   *
   * @return
   */
  public boolean tripleUp(int[] nums) {
    for (int i=0; i<nums.length-2; i++)
      if (nums[i]+1<nums[i+1] && nums[i+1]<nums[i+2] || nums[i]+1>nums[i+1] && nums[i+1]>nums[i+2])
        return true;
    return false;
  }
  
  /**
   * Given an array length 1 or more of ints, return the difference between the largest and
   * smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
   * methods return the smaller or larger of two values.
   *
   * @param nums
   *
   * @return
   */
  public int bigDiff(int[] nums) {
    int largest=0;
    for (int u=0; u<nums.length; u++)
      for (int t=0; t<nums.length-1; t++)
        if (Math.abs(nums[u]-nums[t])>largest)
          largest=(Math.abs(nums[u]-nums[t]));
    return largest;
  }
}
