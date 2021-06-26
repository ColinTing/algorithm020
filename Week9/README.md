## 学习笔记

这周练习了字符串算法，高级动态规划 <br>

### 下面是本周练习的代码链接：

[387. 字符串中的第一个唯一字符](../src/main/java/week9/firstUniqueCharacterInAString/Solution.java) <br>


[541. 反转字符串 II](../src/main/java/week9/reverseStringIi/Solution.java) <br>

时间复杂度 O(N) <br>
空间复杂度 O(N) <br>


[151. 翻转字符串里的单词](../src/main/java/week9/reverseWordsInAString/Solution.java) <br>

Explain: <br>
两次反转法 <br>
1.反转整个字符串 <br>
2.反转每个单词 <br>


[557. 反转字符串中的单词 III](../src/main/java/week9/reverseWordsInAStringIii/Solution1.java) <br>

时间复杂度 O(N) <br>
空间复杂度 O(N) <br>

Explain: <br>

类似 [151. 翻转字符串里的单词] 中的 第2步，只反转每个单词 <br>

[917. 仅仅反转字母](../src/main/java/week9/reverseOnlyLetters/Solution.java) <br>

Explain: <br>

双指针，一个在字符串头部，一个在字符串尾部 <br>
碰到非字符就移动，碰到字符就置换 <br>

[205. 同构字符串](../src/main/java/week9/isomorphicStrings/Solution.java) <br>

Explain: <br>
m1[s.charAt(i)] = i + 1; <br>
m2[t.charAt(i)] = i + 1; <br>
不是m1[s.charAt(i)]++,m2[t.charAt(i)]++是为了保证映射的唯一性 <br>


[680. 验证回文字符串 Ⅱ](../src/main/java/week9/validPalindromeIi/Solution.java) <br>

Explain: <br>
双指针 <br>

[63. 不同路径 II](../src/main/java/week9/uniquePathsIi/Solution.java) <br>

Explain: <br>
动态规划 <br>
每个位置只能由其上面和左面的位置移动而来，所以也是由其上面和左边的dp值相加来更新当前的dp值，如下所示： <br>

dp[i][j] = dp[i-1][j] + dp[i][j-1] <br>


[300. 最长递增子序列](../src/main/java/week9/longestIncreasingSubsequence/Solution.java) <br>

Explain: <br>

i, j两个指针，i < j 并不断靠近j，比较nums[i],nums[ j] 两点的大小，nums[j] > nums[i]，更新dp[j]值，值 + 1，并查看是不是比最长子序列长，如果更长更新最长子序列 <br>

[91. 解码方法](../src/main/java/week9/longestIncreasingSubsequence/Solution.java) <br>

Explain: <br>

长度为1时，解码个数就是个位数的解码个数,但个位数时需要判断是不是等于0 <br>
dp[i] = ... ? 0 : dp[i - 1] <br>

长度大于等于2时，且解码位置值不为0，解码个数 = 个位数的解码个数 + 十位数的解码个数 <br>
dp[i] = dp[i -1] + dp[i - 2]，类似斐波那契数列 <br>
但也有0的情况 <br>
dp[i] = 0 + dp[i - 2] <br>
这里就可以合并了dp[i] = dp[i] + dp[i -2]  <br>


[438. 找到字符串中所有字母异位词](../src/main/java/week9/findAllAnagramsInAString/Solution.java) <br>

Explain: <br>

两个指针，left，right。一开始right先挪动，挪动到p的长度时，left开始挪一格，right开始挪一格 <br>
。如果是匹配到了单字符，还需要把cnt加回去 <br>

[5. 最长回文子串](../src/main/java/week9/longestPalindromicSubstring/Solution.java) <br>

Explain: <br>

与[647. 回文子串]类似，但这里需要记录最长子串，并返回它。所以有多几个变量记录中途状态 <br>


[32. 最长有效括号](../src/main/java/week9/longestValidParentheses/Solution.java) <br>

Explain: <br>

dp[i]数组表示在此位置（i），最长合法子串长度是多少 <br>

1.从后往前遍历，因为必须保证是‘（’起始，所以，位置定位在字符串长度的倒数第二个位置（n-2） <br>
2.si = ')' 不用管
3.si = '('，则需要找到右括号和它匹配，可以跳过以i + 1开头的合法子串。i+1开头的合法子串有多长，有dp[i+1]个长度 <br>
4.取这些长度之后的一位，即j = i + dp[i+1] + 1; <br>
5.如果j位是')',dp[i] = dp[i+1] + 2 <br>
6.如果j位没有到达末尾，还要加上j+1位的dp值 <br>


[44. 通配符匹配](../src/main/java/week9/wildcardMatching/Solution.java) <br>

Explain: <br>
动态规划 <br>

创建一个二维数组，想象一个棋盘，s字符串表示Y轴的刻度，p通配符表示X轴的刻度 <br>

如果p中第j个字符是*（星号），那么dp[i-1][j]为true，dp[i][j]也为true（*可以匹配任何字符串，只要之前的字符串(i - 1)是匹配的） <br>
或者dp[i][j - 1]为true，dp[i][j]也为true（此时*匹配了空字符串） <br>

如果p中第j个字符是？（疑问号），需要dp[i-1][j-1]是true，dp[i][j]也为true。 <br>

如果p中第j个字符是除星号和疑问号的字符（*/？），这时如果s[i] == p[j]，也需要dp[i-1][j-1]是true，dp[i][j]也为true。 <br>


[115. 不同的子序列](../src/main/java/week9/distinctSubsequences/Solution.java) <br>

Explain: <br>

这题不是推导出来的，dp表达式是画图观察出来的，就如经验主义大师休谟说的，结论不是推导出来的是观察出来的。 <br>