public class WarmupAgain1 {

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
         * we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if
         * we sleep in.
         *
         * @param weekday
         * @param vacation
         * @return
         */
        public boolean sleepIn(boolean weekday, boolean vacation) {
            return (!weekday || vacation);
        }

        /**
         * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is
         * smiling. We are in trouble if they are both smiling or if neither of them is smiling.
         * Return true if we are in trouble.
         *
         * @param aSmile
         * @param bSmile
         * @return
         */
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return (aSmile && bSmile) || (!aSmile && !bSmile);
        }

        /**
         * Given two int values, return their sum. Unless the two values are the same, then return
         * double their sum.
         *
         * @param a
         * @param b
         * @return
         */
        public int sumDouble(int a, int b) {
            return a == b ? (a + b) * 2 : a + b;
        }

        /**
         * Given an int n, return the absolute difference between n and 21, except return double the
         * absolute difference if n is over 21.
         *
         * @param n
         * @return
         */
        public int diff21(int n) {
            return n < 21 ? Math.abs(n - 21) : Math.abs(n - 21) * 2;
        }

        /**
         * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
         * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
         * Return true if we are in trouble.
         *
         * @param talking
         * @param hour
         * @return
         */
        public boolean parrotTrouble(boolean talking, int hour) {
            if (talking && (hour < 7 || hour > 20))
                return true;
            return false;
        }

        /**
         * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
         *
         * @param a
         * @param b
         * @return
         */
        public boolean makes10(int a, int b) {
            if (a + b == 10 || ((a == 10 || b == 10)))
                return true;
            return false;
        }

        /**
         * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
         * computes
         * the absolute value of a number.
         *
         * @param n
         * @return
         */
        public boolean nearHundred(int n) {
            if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10)
                return true;
            return false;
        }

        /**
         * Given 2 int values, return true if one is negative and one is positive. Except if the
         * parameter "negative" is true, then return true only if both are negative.
         *
         * @param a
         * @param b
         * @param negative
         * @return
         */
        public boolean posNeg(int a, int b, boolean negative) {
            return false;
        }

        /**
         * Given a string, return a new string where "not " has been added to the front. However, if
         * the string already begins with "not", return the string unchanged. Note: use .equals() to
         * compare 2 strings.
         *
         * @param str
         * @return
         */
        public String notString(String str) {
            String not = "not";
            if (str.length() >= 3 && str.substring(0, 3).equals(not)) {
                return str;
            }
            return not + " " + str;
        }

        /**
         * Given a non-empty string and an int n, return a new string where the char at index n has
         * been removed. The value of n will be a valid index of a char in the original string (i.e.
         * n
         * will be in the range 0..str.length()-1 inclusive).
         *
         * @param str
         * @param n
         * @return
         */
        public String missingChar(String str, int n) {
            return str.substring(0, n) + str.substring(n + 1, str.length());
        }

        /**
         * Given a string, return a new string where the first and last chars have been exchanged.
         *
         * @param str
         * @return
         */
        public String frontBack(String str) {
            if (str.length() >= 1) {
                String result = str.substring(1, str.length());
                result = str.charAt(str.length() - 1) + result + str.charAt(str.length() - 1);
            }
            return "";
        }
    }
}
