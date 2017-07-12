# 磊德資訊PHP面試考題

- 應試人：

- 應試日期：

- 面試官：

- 分數：


## 考題

3. 如何避免mysql race condition。
	<br>
	<br>
	<br>
	<br>
	<br>
	

4. 請問什麼是MVC架構，你知道有哪些 framework 是採用 MVC 架構的？
	
	<br>
	<br>
	<br>
	<br>
	<br>

6. 請問什麼是資料庫正規化？一般做到第幾正規化，以及原因。
	
	<br>
	<br>
	<br>
	<br>
	<br>


8. 請問什麼是RESTful。

	<br>
	<br>
	<br>
	<br>
	<br>

9. 請問什麼是SQL injection，該如何避免？
	<br>
	<br>
	<br>
	<br>
	<br>


10. 請寫出可以計算`費氏數列`的function，以下為`費氏數列`的定義。

	```
	f(0) = 0
	f(1) = 1
	f(n) = f(n-1) + f(n-2) (n >= 2)
	```
	
	<br>
	<br>
	<br>
	<br>
	<br>


12. 什麼是call by value 和 call by reference。
	<br>
	<br>
	<br>
	<br>
	<br>

14. 假設有一長度為N-1的未排序的數列，裡面會有1到N的數字，但是必定會缺少其中一個數字，例如[5,1,2,4]。請想出一個最快又節省記憶體的方式，找出缺少的數字。
	
	<br>
	<br>
	<br>
	<br>
	<br>

16. 資料庫用index為何可以增加查詢的效能？過度使用index又會有什麼影響？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
17. 請問在Mysql中 `primary key`, `index`, `unique`的差別是什麼？

	<br>
	<br>
	<br>
	<br>
	<br>
	
17. 請問以下程式碼的執行結果是什麼？
	
	``` php
	interface Animal
	{
		function move();
	}
	
	abstract class Bird implement Animal
	{
		public function move()
		{
			echo 'fly';
		}
	}
	
	class Starling extends Bird
	{
	
	}
	
	class Ostrich extends Bird
	{
		public function move()
		{
			echo 'walk';
		]
	}
	$starling = new Starling();
	$starling->move();
	
	$ostrich = new Ostrich();
	$ostrich->move();
	
	$bird = new Bird();
	$bird->move();
	
	$animal = new Animal();
	$animal->move();
	```
	<br>
	<br>
	<br>
	<br>
	<br>

1. 試著用程式輸出一個九九乘法表，用以下的格式呈現。

	```
	1 * 1 = 1		2 * 1 = 2		3 * 1 = 3		
	1 * 2 = 2		2 * 2 = 4		3 * 2 = 6		
	1 * 3 = 3		2 * 3 = 6		3 * 3 = 9		
	1 * 4 = 4		2 * 4 = 8		3 * 4 = 12		
	1 * 5 = 5		2 * 5 = 10		3 * 5 = 15		
	1 * 6 = 6		2 * 6 = 12		3 * 6 = 18		
	1 * 7 = 7		2 * 7 = 14		3 * 7 = 21		
	1 * 8 = 8		2 * 8 = 16		3 * 8 = 24		
	1 * 9 = 9		2 * 9 = 18		3 * 9 = 27    
	
	4 * 1 = 4		5 * 1 = 5		6 * 1 = 6		
	4 * 2 = 8		5 * 2 = 10		6 * 2 = 12		
	4 * 3 = 12		5 * 3 = 15		6 * 3 = 18		
	4 * 4 = 16		5 * 4 = 20		6 * 4 = 24		
	4 * 5 = 20		5 * 5 = 25		6 * 5 = 30		
	4 * 6 = 24		5 * 6 = 30		6 * 6 = 36		
	4 * 7 = 28		5 * 7 = 35		6 * 7 = 42		
	4 * 8 = 32		5 * 8 = 40		6 * 8 = 48		
	4 * 9 = 36		5 * 9 = 45		6 * 9 = 54    
	
	7 * 1 = 7		8 * 1 = 8		9 * 1 = 9		
	7 * 2 = 14		8 * 2 = 16		9 * 2 = 18		
	7 * 3 = 21		8 * 3 = 24		9 * 3 = 27		
	7 * 4 = 28		8 * 4 = 32		9 * 4 = 36		
	7 * 5 = 35		8 * 5 = 40		9 * 5 = 45		
	7 * 6 = 42		8 * 6 = 48		9 * 6 = 54		
	7 * 7 = 49		8 * 7 = 56		9 * 7 = 63		
	7 * 8 = 56		8 * 8 = 64		9 * 8 = 72		
	7 * 9 = 63		8 * 9 = 72		9 * 9 = 81    
	```
	
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

1. 請問以下輸出結果會是什麼？

	``` php
	<?php
	$datas = [
		['姓名', '成績', '學號'],
		['大雄', 0, '00653'],
		['靜香', 100, '00655'],
		['胖虎', 50, '00659'],
		['小夫', 60, '00651'],
	]; 
	
	$output = [];
	foreach ($datas as $data) {
		$output[] = implode(",\t", $data);
	}
	
	echo implode("\r\n", $output);
	
	```
	<br>
	<br>
	<br>
	<br>
	<br><br>
	<br>
	<br>
	<br>
	<br>

17. 請問你常用的開發環境是什麼？
	<br>
	<br>
	<br>
	<br>
	<br>
	
17. 假如你在工作上遇到問題，請問你會如何解決？
	<br>
	<br>
	<br>
	<br>
	<br>
	

