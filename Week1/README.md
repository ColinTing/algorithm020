##学习笔记

本周主要练习的是数组和链表数据结构会使用到的常用算法，
如：双指针、递归、计数法

以前自己写完代码都不会分析时间复杂度和空间复杂度，
本周也对其有了系统的了解，之后每写段代码，
都应对代码进行时间复杂度和空间复杂度的分析

###下面是本周练习的代码链接：

[删除排序数组中的重复项(双指针法)](../src/main/java/week1/removeDuplicates/Solution.java)

时间复杂度O(n)
空间复杂度O(1)

[删除排序数组中的重复项(计数法)](../src/main/java/week1/removeDuplicates/Solution1.java)

时间复杂度O(n)
空间复杂度O(1)

[旋转数组](../src/main/java/week1/rotate/Solution.java)
时间复杂度O(n)
空间复杂度O(1)

[合并两个有序链表](../src/main/java/week1/mergeTwoLists/Solution.java)
时间复杂度O(n)
空间复杂度O(n)
PS:递归调用函数空间复杂度不仅仅看代码中是否创建了空间对象，因为递归调用函数时需要消耗栈空间，栈空间的大小取决于递归调用的深度。结束递归调用时mergeTwoLists函数最多调用n次，因此空间复杂度为O(n).
   

[合并两个有序数组](../src/main/java/week1/merge/Solution.java)
时间复杂度O(n)
空间复杂度O(1)


[两数之和](../src/main/java/week1/toSum/Solution.java)
时间复杂度O(n)
空间复杂度O(n)
PS:空间复杂度为O(n)主要是创建了一个哈希表

[移动零](../src/main/java/week1/moveZeroes/Solution.java)
时间复杂度O(n)
空间复杂度O(1)

[加一](../src/main/java/week1/plusOne/Solution.java)
时间复杂度O(n)
空间复杂度O(n)

[爬楼梯](../src/main/java/week1/climbStairs/Solution.java)
时间复杂度O(n)
空间复杂度O(n)