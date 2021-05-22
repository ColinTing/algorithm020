## 学习笔记

这周练习前缀树 & 递归+深度优先搜索（DFS）& 广度优先搜索（BFS）<br>

### 下面是本周练习的代码链接：

【递归】 <br>

[70.爬楼梯](../src/main/java/week7/climbingStairs/Solution.java) <br>

使用HashMap + 递归 <br>

使用递归+HashMap都超时的原因是在递归前没有先判断是不是到了终点，到终点就应该返回


【前缀树（字典树）】 <br>

[208.实现 Trie (前缀树)](../src/main/java/week7/implementTriePrefixTree/Trie.java) <br>

【前缀树 & DFS 】

[212.单词搜索 II](../src/main/java/week7/wordSearchIi/Solution.java) <br>

建立一个前缀树，dfs二维数组，找字符是否和前缀树匹配能形成一个word


【DFS】

[547.省份数量](../src/main/java/week7/numberOfProvinces/Solution.java) <br>


对于某个城市，遍历其相邻城市，然后再遍历其相邻城市的相邻城市，那么就能把属于同一个省份的城市都遍历一遍，<br>
同时标记出已经遍历过的城市，然后累积省份的个数，再去对于没有遍历到的城市再找其相邻的城市，这样就能求出省份个数


[200.岛屿数量](../src/main/java/week7/numberOfIslands/Solution.java) <br>


这道求岛屿数量的题的本质是求矩阵中连续区域的个数，很容易想到需要用深度优先搜索 DFS 来解，<br>
我们需要建立一个 visited 数组用来记录某个位置是否被访问过，对于一个为 ‘1’ 且未被访问过的位置，<br>
递归进入其上下左右位置上为 ‘1’ 的数，将其 visited 对应值赋为 true，继续进入其所有相连的邻位置，<br>
这样可以将这个连通区域所有的数找出来，并将其对应的 visited 中的值赋 true，找完相邻区域后，<br>
将结果 res 自增1，然后再继续找下一个为 ‘1’ 且未被访问过的位置，以此类推直至遍历完整个原数组即可得到最终结果 <br>


[130.被围绕的区域](../src/main/java/week7/surroundedRegions/Solution.java) <br>


1.扫矩阵的四条边，如果有O，则用 DFS 遍历，将所有连着的O都变成另一个字符，比如 $，这样剩下的O都是被包围的 <br>

2.然后将这些O变成X <br>

3.把$变回O就行了 <br>

[36.有效的数独](../src/main/java/week7/validSudoku/Solution.java) <br>


这里只需要判断是不是数独，都不需要使用到dfs <br>

boxFlag[i][j]:表示第i个小方阵中的第j位是不是唯一值的判断变量 <br>

在遍历每个数字的时候，就看看包含当前位置的行和列以及 3x3 小方阵中是否已经出现该数字，<br>
这里需要三个 boolean 型矩阵，大小跟原数组相同，分别记录各行，各列，各小方阵是否出现某个数字，<br>
其中行和列标志下标很好对应，就是小方阵的下标需要稍稍转换一下 <br>

(boxFlag[3 * (i /3)  + j / 3][c] 或者 boxFlag[3 * (j /3)  + i / 3][c] 都可以，因为i = = j == 9) <br>

[37.解数独](../src/main/java/week7/sudokuSolver/Solution.java) <br>

参考[36. 有效的数独]代码，改动了一些，加了一个dfs <br>


[22.括号生成](../src/main/java/week7/generateParentheses/Solution.java) <br>

从后往前计算 <br>
open, close代表剩余的左右括号 <br>

如果在某次递归时，剩余的左括号的个数大于剩余的右括号的个数，说明此时生成的字符串中右括号的个数大于左括号的个数，<br>
即会出现 ')(' 这样的非法串，所以这种情况直接返回，不继续处理。如果 open 和 close 都为0，则可据此说明，<br>
此时生成的字符串已有3个左括号和3个右括号，且字符串合法，则存入结果中后返回。如果以上两种情况都不满足，<br>
若此时 open 大于0，则调用递归函数，注意参数的更新，若 close 大于0，则调用递归函数，同样要更新参数


[51.N皇后](../src/main/java/week7/nQueens/Solution.java) <br>

在DFS递归函数中，我们首先判断当前行数是否已经为n，是的话，说明所有的皇后都已经成功放置好了，<br>
所以我们只要将 queens 数组加入结果 res 中即可。否则的话，我们遍历该行的所有列的位置，行跟列的位置都确定后，<br>
我们要验证当前位置是否会产生冲突，那么就需要使用一个子函数来判断了，首先验证该列是否有冲突，就遍历之前的所有行，<br>
若某一行相同列也有皇后，则冲突返回false；再验证两个对角线是否冲突，就是一些坐标转换，主要不要写错了，若都没有冲突，则说明该位置可以放皇后，放了新皇后之后，再对下一行调用递归即可，注意递归结束之后要返回状态

<br>

【BFS】 <br>

[127.单词接龙](../src/main/java/week7/wordLadder/Solution.java) <br>

1.一个HashSet <br>

2.一个队列，循环取出即清除，如果找到结果值，返回路径值=变化次数+1 <br>

3.一次字符串中所有字符a～z的和HashSet循环匹配 <br>

4.如若存在，存入队列 <br>

5.变换值+1 <br>

再重复步骤2到步骤5 <br>

[433.最小基因变化](../src/main/java/week7/minimumGeneticMutation/Solution.java) <br>

和[127.单词接龙]类似，只不过这里求变化次数，那里求路径长度。路径长度会比变化次数多1。且这里返回无结果值-1，那边返回0









