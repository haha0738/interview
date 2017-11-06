# 艾法諾科技 - PHP面試考題

- 應試人：

- 應試日期：

- 面試官：

- 分數：


## 考題

### 資料庫

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


### PHP


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
	
1. 試著寫一個 `parse_url` function 可以將`註1`的連結用`註2`的格式回傳(不可使用內建 function)
	
	\[註1\]
	
	```
	https://admin:pass@localhost:8080/path/to/somewhere?q=query#fragment 
	```
	
	\[註2\]
	
	```php
	[
		'scheme' => 'https',
		'host' => 'localhost',
		'port' => '8080',
		'user' => 'admin'
		'pass' => 'pass',
		'path' => 'path/to/somewhere',
		'query' => 'q=query',
		'fragment' => 'fragment'
	]
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

### 資料結構

1. 試著解釋 `Stack`、`Queue`和 `Linked List`
	<br>
	<br>
	<br>
	<br>
	<br><br>
	<br>
	<br>
	<br>
	<br>
2. 請列舉常見的資料排序方法，並從中挑選一個嘗試解釋它的排序方法。
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
3. 請嘗試說明一下 binary tree，並請說明他可以有哪些用途。
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

