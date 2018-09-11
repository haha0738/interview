# PHP面試考題

> 應試人：
> 
> 面試日期：
> 
> 主考官：
> 
> 分數：


## 考題
> 請將答案另外寫在空白紙上

### PHP

1. Write a function that takes a string as input and returns the string reversed.

	**Example:**
	Given s = "hello", return "olleh".

2. Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

  **Examples:**

   ```javascript
   s = "leetcode"
   return 0.
  
   s = "loveleetcode",
   return 2.
   ```

  **Note:** You may assume the string contain only lowercase letters.

  **Solution:**

```php
class Solution {
    /**
    * @param String $str Input string
    *
    * @return int The index of first non-repeating character
    */
    class Solution {
        public function firstUniqChar($str) {

        }
    }
}
```



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
	
	**Solution:**
	
	```php
	class Solution {
		/**
     	* @param array $matrix 2D matrix
     	*
     	* @return array Rotated 2D matrix by 90 degrees(clockwise)
     	*/
    	public function rotate(array $matrix) {
        
    	}
	}
	```
	
### DATABASE

1. Table: `Person`

	```
	+-------------+---------+
	| Column Name | Type    |
	+-------------+---------+
	| PersonId    | int     |
	| FirstName   | varchar |
	| LastName    | varchar |
	+-------------+---------+
	PersonId is the primary key column for this table.
	```
	
	Table: `Address`
	
	```
	+-------------+---------+
	| Column Name | Type    |
	+-------------+---------+
	| AddressId   | int     |
	| PersonId    | int     |
	| City        | varchar |
	| State       | varchar |
	+-------------+---------+
	AddressId is the primary key column for this table.
	```
	
	Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:
	
	```
	FirstName, LastName, City, State
	```

1. Write a SQL query to delete all duplicate email entries in a table named `Person`, keeping only unique emails based on its smallest Id.
  
   ```
	+----+------------------+
	| Id | Email            |
	+----+------------------+
	| 1  | john@example.com |
	| 2  | bob@example.com  |
	| 3  | john@example.com |
	+----+------------------+
	Id is the primary key column for this table.
	```
	
	For example, after running your query, the above Person table should have the following rows:
	
	```
	+----+------------------+
	| Id | Email            |
	+----+------------------+
	| 1  | john@example.com |
	| 2  | bob@example.com  |
	+----+------------------+
	```

