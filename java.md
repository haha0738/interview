#  JAVA面試考題

> 應試人：
> 
> 面試日期：
> 
> 主考官：
> 
> 分數：


## 考題（程式題請不要使用內建函式作答，否則零分計。可以用pseudocode作答）
> 請將答案另外寫在空白紙上

1. Given an array of integers, return indices of the two numbers such that they add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

  **example:**

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```


2. Write a function that takes a string as input and returns the string reversed.

    **Example:**
    Given s = "hello", return "olleh".

3. You are given an n x n 2D matrix representing an image.
    Rotate the image by 90 degrees (clockwise).

      **Note:**
      	You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

  **Example 1:**

```
Given input matrix = 
[
[1,2,3],
[4,5,6],
[7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
[7,4,1],
[8,5,2],
[9,6,3]
]
```

​

**Example 2:**

```
Given input matrix =
[
[ 5, 1, 9,11],
[ 2, 4, 8,10],
[13, 3, 6, 7],
[15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
[15,13, 2, 5],
[14, 3, 4, 1],
[12, 6, 8, 9],
[16, 7,10,11]
]
```

​

**Solution:**

```java
class Solution {
    public void rotate(int[][] matrix) {
		
    }
}
```

4. There is a table `courses` with columns: **student** and **class**
   Please list out all classes which have more than or equal to 5 students.
   For example, the table:

```
+---------+------------+
| student | class      |
+---------+------------+
| A       | Math       |
| B       | English    |
| C       | Math       |
| D       | Biology    |
| E       | Math       |
| F       | Computer   |
| G       | Math       |
| H       | Math       |
| I       | Math       |
+---------+------------+
```

Should output:
```
+---------+
| class   |
+---------+
| Math    |
+---------+
```
**Note:**
The students should not be counted duplicate in each course.