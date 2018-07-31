# iFalo inc. PHP
> ### 應試人 	________
> ### 應試日期 	________

## Database
1. There is a table `World`

	```
	+-----------------+------------+------------+--------------+---------------+
	| name            | continent  | area       | population   | gdp           |
	+-----------------+------------+------------+--------------+---------------+
	| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
	| Albania         | Europe     | 28748      | 2831741      | 12960000      |
	| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
	| Andorra         | Europe     | 468        | 78115        | 3712000       |
	| Angola          | Africa     | 1246700    | 20609294     | 100990000     |
	+-----------------+------------+------------+--------------+---------------+
	```
	
	A country is big if it has an area of bigger than 3 million square km or a population of more than 25 million.
	
	Write a SQL solution to output big countries' name, population and area.
	
	For example, according to the above table, we should output:
	
	```
	+--------------+-------------+--------------+
	| name         | population  | area         |
	+--------------+-------------+--------------+
	| Afghanistan  | 25500100    | 652230       |
	| Algeria      | 37100000    | 2381741      |
	+--------------+-------------+--------------+
	```

2. Write a SQL query to find all duplicate emails in a table named `Person`.

	```
	+----+---------+
	| Id | Email   |
	+----+---------+
	| 1  | a@b.com |
	| 2  | c@d.com |
	| 3  | a@b.com |
	+----+---------+
	```
	For example, your query should return the following for the above table:
	
	```
	+---------+
	| Email   |
	+---------+
	| a@b.com |
	+---------+
	```
	**Note**: All emails are in lowercase.

## PHP
1. Write a function that takes a string as input and returns the string reversed.
	
	**Example:**
	Given s = "hello", return "olleh".

2. Given an integer, write a function to determine if it is a power of three.

	**Follow up:**
	Could you do it without using any loop / recursion?


