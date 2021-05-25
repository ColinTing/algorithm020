## 学习笔记

这周练习了 位运算 & 排序算法 &  <br>
实现LRU 缓存机制 & <br>
n皇后问题 <br>

### 下面是本周练习的代码链接：

[231.2的幂](../src/main/java/week8/powerOfTwo/Solution.java) <br>

时间复杂度 O(1) <br>
空间复杂度 O(1) <br>

Explain: <br>
2的幂的特性：<br>

n的最高位是1外，其余位都是0 <br>

n-1的最高位是0外，其余位都是1 <br>


[1122.数组的相对排序](../src/main/java/week8/relativeSortArray/Solution.java) <br>



[242.有效的字母异位词](../src/main/java/week8/validAnagram/Solution.java) <br>

Explain: <br>
「1122.数组的相对排序」和「242.有效的字母异位词」解法 类似，用一个数组存储出现的次数或者位置 <br>

[146.LRU 缓存机制](../src/main/java/week8/LruCache/LRUCache.java) <br>

Explain: <br>
重写LinkedHashMap removeEldestEntry(...)方法 <br>

[56.合并区间](../src/main/java/week8/mergeIntervals/Solution.java) <br>

时间复杂度 O(nlogN) <br>

空间复杂度 O(n^2) <br>

Explain: 排序花费 O(nlogN)，合并花费 O(n) <br>

1.先排序，根据start索引位值大小排序 <br>
Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));<br>

2. 循环比对结果集和已知集合是否重叠 <br>

3. 不重叠，直接加入结果集 <br>

4. 重叠，比较两者的end值，把结果集的end值更新成最大的值 <br>

[51.N 皇后](../src/main/java/week8/nQueens/Solution.java) <br>

Explain: <br>
在递归函数中，我们首先判断当前行数是否已经为n，是的话，说明所有的皇后都已经成功放置好了，<br> 
所以我们只要将 queens 数组加入结果 res 中即可。否则的话，我们遍历该行的所有列的位置，行跟列的位置都确定后，<br> 
我们要验证当前位置是否会产生冲突，那么就需要使用一个子函数来判断了，首先验证该列是否有冲突，就遍历之前所有行，<br> 
若某一行相同列也有皇后，则冲突返回false；再验证两个对角线是否冲突，就是一些坐标转换，主要不要写错了，若都没有冲突，则说明该位置可以放皇后，放了新皇后之后，再对下一行调用递归即可，注意递归结束之后要返回状态

[52.N皇后 II](../src/main/java/week8/nQueensIi/Solution.java) <br>

Explain: <br>
与「51. N 皇后」类似，只不过把之前的坐标值从‘Q’、‘.’ 换成了 “true” 、 “false” <br>