#前端工程師面試考題
> 請在另一張白紙上作答，並標明題號。作答時間為1個小時。 如有問題請按電鈴，找接洽人員。

## HTML
1. 什麼是`inline element`？什麼是 `block element`？什麼是 `void element`？

2. 請問 script 放在 head 和 body 的差別是？該如何決定是要放在 body 還是 head？
3. 請說明 `cookie` `session` `localStorage` `sessionStorage` 的差別。
4. 請問 `Doctype` 的作用是什麼？
5. 載入 css 時，請問使用`link` 和 `@import` 的差別是？

## CSS
1. 請問 `css selector` 有哪些？

2. 請問以下的 css 語法最後 div 會套用哪些規則？

	```
	<div id="div-id" class="div-class">
	</div>
	
	<style>
	#div-id{
		color: #00ff00;
		width: 100px !important;
	}
	
	.div-class{
		color: #ffffff;
		font-size: 12px;
	}
	
	div{
		font-size: 20px;
		color: #ff0000 !important;
		width: 1000px;
	}
	
	
	</style>
	```
3. 請問什麼是 `Pseudo-classes`？
4. 為什麼要 `初始化 css` ？
5. 請問為什麼要 `clearfix` ？
6. 你有使用 `css preprocessor` 或 `post processor` 嗎？請說明各自的用途，有的話喜歡使用哪一個呢？
7. 什麼是`RWD`？
8. 請用 css 語法畫出一個等腰三角形，底20px。

## Javascript
1. 請問 `use strict` 是什麼？有什麼好處？

2. 請說明你對 `this` 的了解。
3. 請試著用`prototype` 實現繼承。
4. 請說明你對`json`的了解。
5. `ajax` 的作用是什麼？
6. 你用過哪些`library` 和 `framework` 
7. 試著寫一個 `function` 可以將輸入的數字，輸出成每千位用逗號分割的字串。例如 `1435459` 輸出繩 `1,435,459`
8. 假設有一未排序的數字陣長度為 `N-1`，陣列的內容是 1 ~ N，但勢必會缺少一個數字(例如 [5, 6, 1, 3, 2])，請用最快最省記憶體的方式找出缺少的數字。
9. 什麼是`memory leak`，請試著寫出一段會造成`memory leak`的程式碼。
10. 請問你知道哪些 `design pattern`？
11. 請說明你對 `ES6` 和 `ES7` 的了解。
11. 請問以下輸出的結果會是什麼？

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
	
5. 請試著寫一個程式算出 1 * 2 * 3 * ..... * 99 * 100 後面有幾個零。
