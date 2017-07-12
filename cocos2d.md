#Javascript 考題
> 請在另一張白紙上作答，並標明題號。作答時間為1個小時。 如有問題請按電鈴，找接洽人員。

1. 請問以下輸出的結果會是什麼？

	```
	if(true) {
		function foo(){
			return 'a';
		}
	}
	else{
		function foo(){
			return 'b';
		}
	}
	
	console.log(foo());
	```
	
2. 請問以下輸出的結果會是什麼？
	
	```
	var a = [1, 2, 3, 4];
	var b = a;
	a.push(5);
	console.log(b);
	```
3. 請問以下輸出的結果會是什麼？
	
	```
	function foo(){
		foo.bar = function(){
			console.log('abc');
		};
		
		this.bar = function(){
			console.log('def');
		}
		
		var bar = function(){
			console.log('ghi');
		}
		
	}
	
	foo.prototype.bar = function(){
		console.log('xyz');
	}
	
	var f = new foo();
	f.bar();
	foo.bar();
	bar();
	```
4. 請問以下的輸出結果是什麼？

	```
	var a = function(){
		return {
			a: 'a'
		}
	}
	
	var b = function(){
		return 
		{
			b: 'b'
		}
	}
	
	console.log(a());
	console.log(b());
	```
> 以下題目不限使用 `javascript` 作答
5. 請試著寫一個程式算出 1 * 2 * 3 * ..... * 99 * 100 後面有幾個零。
6. 假設有一未排序的數字陣長度為 `N-1`，陣列的內容是 1 ~ N，但勢必會缺少一個數字(例如 [5, 6, 1, 3, 2])，請用最快最省記憶體的方式找出缺少的數字。
7. 試著寫一個 `function` 可以將輸入的數字，輸出成每千位用逗號分割的字串。例如 `1435459` 輸出繩 `1,435,459`。
8. 請問你為何使用 cocos2d？並請說明他的優點和缺點。
9. 請問你對 es5 和 es6 是否熟悉，如果熟悉請大略說明其特點。