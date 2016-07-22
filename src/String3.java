
/**
 * Created by jahhein on 6/11/15 at 7:03 PM.
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
public class String3 {
  
  public int countYZ(String str) {
    String[] sRay=str.split(" ");
    int cnt=0;
    for (String s : sRay)
      if (s.charAt(s.length()) == 'z' || s.charAt(s.length()) == 'y')
        cnt++;
    
    return cnt;
  }
  
  /**
   * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with
   * "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example
   * the
   * "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
   *
   * @param str
   *
   * @return
   */
  public String notReplace(String str) {
    return null;
  }
}
