## 学习笔记

这周练习的主要是树的遍历，使用回溯算法

### 下面是本周练习的代码链接：

[236.二叉树的最近公共祖先](../src/main/java/week3/lowestCommonAncestor/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(n) <br>

PS: <br>
时间复杂度：遍历数组所有元素O(n) <br>
空间复杂度：最坏情况变成一个链表，树深度是O(n) <br>


[105.从前序与中序遍历序列构造二叉树](../src/main/java/week3/constructBinaryTreeFromPreorderAndInorderTraversal/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(n) <br>

PS: <br>
时间复杂度：遍历数组所有元素O(n) <br>
空间复杂度：HashMap存储空间是O(n),递归树的深度也是O(n) <br>

由于先序的顺序的第一个肯定是根，所以先序二叉树的根节点可以知道， <br>
在中序遍历中也可以定位出根节点的位置，并以根节点的位置将中序遍历拆分为左右两个部分 <br>
这样就知道左右节点的下标范围，前序遍历和中序遍历都可以应用此信息，分别对其递归调用 <br>

[77.组合](../src/main/java/week3/combinations/Solution.java) <br>

时间复杂度O(n) <br>
空间复杂度O(n) <br>

[46.全排列](../src/main/java/week3/permutations/Solution.java)     <br>

时间复杂度O(n) <br>
空间复杂度O(n) <br>

PS: <br>
与"77.组合"类似，<br>
不同点在于那道不同的数字顺序只算一种，是一道典型的组合题，而此题是求全排列问题，还是用递归 DFS 来求解。<br>
这里需要用到一个 visited 数组来标记某个数字是否访问过，然后在 DFS 递归函数从的循环应从头开始，而不是从 start 开始，这是和 Combinations 不同的地方，<br>
其余思路大体相同。这里再说下 start 吧，其本质是记录当前已经拼出的个数，一旦其达到了 nums 数组的长度，说明此时已经是一个全排列了，因为再加数字的话，就会超出。<br>
还有就是，为啥这里的 start 要从0开始遍历，因为这是求全排列，每个位置都可能放任意一个数字，这样会有个问题，数字有可能被重复使用，由于全排列是不能重复使用数字的，<br>
所以需要用一个 visited 数组来标记某个数字是否使用过

[47.全排列 II](../src/main/java/week3/permutationsIi/Solution.java)  <br>

时间复杂度O(n) <br>
空间复杂度O(n) <br>

PS: <br>
与 "46. 全排列" 的写法类似，不同点是有重复值，在原有逻辑上就会导致重复排列 <br>

需要增加一行判断 <br>

在递归函数中要判断前面一个数和当前的数是否相等，如果相等，且其对应的 visited 中的值为1，当前的数字才能使用（下文中会解释这样做的原因），否则需要跳过，这样就不会产生重复排列了 <br>

前一个数字的 visited 值为0的时候，必须跳过。这里的前一个数 visited 值为0，并不代表前一个数字没有被处理过，实际上是递归结束后恢复状态时将 visited 值重置为0了。 <br>
表示前面已经处理过同样的数组了 <br>