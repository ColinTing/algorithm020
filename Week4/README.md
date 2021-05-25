## 学习笔记

这周主要练习的是贪心算法&广度优先搜索&深度优先搜索&二分查找

### 下面是本周练习的代码链接：

【贪心算法】<br>

[860.柠檬水找零](../src/main/java/week4/lemonadeChange/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(1) <br>


[121.买卖股票的最佳时机](../src/main/java/week4/bestTimeToBuyAndSellStock/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(1) <br>

Explain: 只需要遍历一次数组，用一个变量记录遍历过数中的最小值，然后每次计算当前值和这个最小值之间的差值最为利润，然后每次选较大的利润来更新。当遍历完成后当前利润即为所求

[122.买卖股票的最佳时机 II](../src/main/java/week4/bestTimeToBuyAndSellStockIi/Solution.java)

时间复杂度O(n) <br>
空间复杂度O(1) <br>

Explain：我们都知道炒股想挣钱当然是低价买入高价抛出，那么这里我们只需要从第二天开始，如果当前价格比之前价格高，<br>
则把差值加入利润中，因为我们可以昨天买入，今日卖出，若明日价更高的话，还可以今日买入，明日再抛出。以此类推，遍历完整个数组后即可求得最大利润

[455.分发饼干](../src/main/java/week4/assignCookies/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(1) <br>

Explain：这道题给了我们一堆cookie，每个cookie的大小不同，还有一堆小朋友，每个小朋友的胃口也不同的，<br>
问我们当前的cookie最多能满足几个小朋友。这是典型的利用贪婪算法的题目，我们可以首先对两个数组进行排序，<br>
让小的在前面。然后我们先拿最小的cookie给胃口最小的小朋友，看能否满足，能的话，我们结果res自加1，<br>
然后再拿下一个cookie去满足下一位小朋友；如果当前cookie不能满足当前小朋友，那么我们就用下一块稍大一点的cookie去尝试满足当前的小朋友。当cookie发完了或者小朋友没有了我们停止遍历

[55.跳跃游戏](../src/main/java/week4/jumpGame/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(1) <br>

Explain：因为这里并不是很关心每一个位置上的剩余步数，而只希望知道能否到达末尾，也就是说我们只对最远能到达的位置感兴趣，<br>
所以维护一个变量 reach，表示最远能到达的位置，初始化为0。遍历数组中每一个数字，如果当前坐标大于 reach，<br> 
或者 reach 已经抵达最后一个位置则跳出循环，否则就更新 reach 的值为其和 i + nums[i] 中的较大值，其中 i + nums[i] 表示当前位置能到达的最大位置 <br>

[45.跳跃游戏 II](../src/main/java/week4/jumpGameIi/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(1) <br>

Explain：这里 curFathest 是当前能到达的最远位置，curEnd 是上一步能到达的最远位置，遍历数组，<br>
首先用 i + nums[i] 更新 curFarthest，这个在上面解法中讲过了，然后判断如果当前位置到达了 curEnd，<br>
即上一步能到达的最远位置，如果是当前位置时，说明需要再跳一次了，将 curEnd 赋值为 curFarthest，并且步数 jumps 自增1 <br>


【广度优先算法（BFS）】<br>

[127.单词接龙](../src/main/java/week4/wordLadder/Solution.java) <br>

时间复杂度O(m*n*26) <br>
空间复杂度O(n) <br>

Explain: for循环遍历完当前队列中的个数后，层数就自增1，因为是0开始计数的，所以层数最后加1就是最短路径长度 <br>

[126.单词接龙 II](../src/main/java/week4/WordLadderIi/Solution.java) <br>

时间复杂度O(n*26) <br>
空间复杂度O(m*n) <br>

【深度优先算法（DFS）】<br>

[200.岛屿数量](../src/main/java/week4/numberOfIslands/Solution.java) <br>

时间复杂度O(m*n) 其中 m 和 n 分别为行数和列数。 <br>
空间复杂度O(m*n) 在最坏情况下，整个网格均为陆地，深度优先搜索的深度达到 mn <br>

Explain：这道求岛屿数量的题的本质是求矩阵中连续区域的个数，很容易想到需要用深度优先搜索 DFS 来解，<br>
我们需要建立一个 visited 数组用来记录某个位置是否被访问过，对于一个为 ‘1’ 且未被访问过的位置，<br>
递归进入其上下左右位置上为 ‘1’ 的数，将其 visited 对应值赋为 true，继续进入其所有相连的邻位置，<br>
这样可以将这个连通区域所有的数找出来，并将其对应的 visited 中的值赋 true，找完相邻区域后，<br>
将结果 res 自增1，然后再继续找下一个为 ‘1’ 且未被访问过的位置，以此类推直至遍历完整个原数组即可得到最终结果 <br>

[529.扫雷游戏](../src/main/java/week4/minesweeper/Solution.java) <br>

时间复杂度O(m*n) <br>
空间复杂度O(m*n) <br>

Explain：对于当前需要点击的点，我们先判断是不是雷，是的话直接标记X返回即可。如果不是的话，我们就数该点周围的雷个数，<br>
如果周围有雷，则当前点变为雷的个数并返回。如果没有的话，我们再对周围所有的点调用递归函数再点击即可 <br>


【二分查找】<br>

[33.搜索旋转排序数组](../src/main/java/week4/searchInRotatedSortedArray/Solution.java) <br>

时间复杂度O(logN) <br>
空间复杂度O(1) <br>

Explain：找中点，并对比左右两边哪边是有序的，如果目标值在有序的那边，缩小搜索范围 <br>

[74.搜索二维矩阵](../src/main/java/week4/searchA2dMatrix/Solution.java) <br>

时间复杂度O(logMN) <br>
空间复杂度O(1) <br>

Explain： 二分法，先用二分法找到行数，再用二分法找到列数，和"153. 寻找旋转排序数组中的最小值"很相似，<br>
需要注意的就是行数如果大于0需要减1，因为要把行数变成矩阵中的索引下标 <br>

[153.寻找旋转排序数组中的最小值](../src/main/java/week4/findMinimumInRotatedSortedArray/Solution.java) <br>

时间复杂度O(logN) <br>
空间复杂度O(1) <br>

Explain：用中间的值 nums[mid] 和右边界值 nums[right] 进行比较，若数组没有旋转或者旋转点在左半段的时候，<br>
中间值是一定小于右边界值的，所以要去左半边继续搜索，反之则去右半段查找，最终返回 nums[right] 即可