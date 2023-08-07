package euclid

/**
 * Euclid Algorithm
 * It calculates the GCD(A,B) = Greatest Common Divisor between two numbers A and B
 */
class Euclid {

    /**
     * Implementation using recursion<BR>
     *     22/6 = 3 rest of 4
     *     6/4 = 1 rest of 2
     *     4/2 = 2 rest of 0
     * @param number
     * @param divisor
     * @return
     */
    fun gcd(number: Int, divisor: Int): Int {
        val remaining = (number % divisor);
        return if (remaining != 0) {
            gcd(divisor, remaining)
        } else {
            divisor
        }
    }

    /**
     * Implementation without recursion
     *      22/6 = 3 rest of 4
     *      6/4 = 1 rest of 2
     *      4/2 = 2 rest of 0
     *
     *      number/temp = result rest of divisor
     * @param number
     * @param divisor
     * @return
     */
    fun gcd2(_number: Int, _divisor: Int): Int {
        var number = _number
        var divisor = _divisor
        while (divisor != 0) {
            val temp: Int = divisor
            divisor = number % divisor
            number = temp
        }
        return number
    }


}