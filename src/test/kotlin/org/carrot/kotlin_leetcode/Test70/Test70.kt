package org.carrot.kotlin_leetcode.Test70

import org.junit.jupiter.api.Test

class Test70 {

    fun climbStairs(n: Int): Int {
        if (n<=2){
            return n
        }
        val dp = IntArray(n) { 0 }
        dp[0]=1
        dp[1]=2

        for (i in 2..<n){
            dp[i]=dp[i-2]+dp[i-1]
        }

        return dp[n-1]
    }

    @Test
    fun test70(){
        assert(climbStairs(3)==3)
    }
}