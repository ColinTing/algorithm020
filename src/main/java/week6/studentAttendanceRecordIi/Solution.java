package week6.studentAttendanceRecordIi;

/**
 * @program: algorithm020
 * @description: 552. 学生出勤记录 II
 * {@link: <a href="https://leetcode-cn.com/problems/student-attendance-record-ii/">}
 * @author: Colin Ting
 * @create: 2021-05-17 23:09
 **/
public class Solution {
    static final int M = (int) (1e9 + 7);

    public int checkRecord(int n) {

        long[] p_or_l = new long[n + 1];
        long[] p = new long[n + 1];
        p_or_l[0] = p[0] = 1;
        p[1] = 1;
        p_or_l[1] = 2;

        for (int i = 2; i <= n; i++) {
            p[i] = p_or_l[i - 1];
            p_or_l[i] = (p[i] + p[i - 1] + p[i - 2]) % M;
        }
        long res = p_or_l[n];
        for (int i = 1; i <= n; i++) {
            long s = (p_or_l[i - 1] * p_or_l[n - i]) % M;
            res = (res + s) % M;
        }
        return (int) res;
    }
}
