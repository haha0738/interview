# 網頁前端

應試人：

應試日期：

<table width="100%">
	<thead>
		<tr>
			<th>面試官</th>
			<th colspan="3"></th>
		</tr>
		<tr>
			<th>科目</th>
			<th>Javascript</th>
			<th>HTML</th>
			<th>CSS</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align:center;">分數</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</tbody>
</table>

## Javascript
### 基本測驗

1. 1 == '1' 和 1 === '1' 的結果為何？

	<br>
	<br>
	<br>
	<br>
		
	
2. 請問下列 b 輸出的值是什麼？

	``` javascript
	var a = [1,2,3];
	var b = a;
	a.push[5];
	console.log(b);
	```
	<br>
	<br>
	<br>
	<br>
3. 請問如何從以下程式碼取得 `hello` 這個字串

	``` javascript
	var a = { 1: 'hello', 2: 'world' };
	```
<br>
	<br>
	<br>
	<br>
4. 請問下列程式碼分別輸出的結果
	
	``` javascript 
	typeof function(){};
	typeof [];
	typeof {};
	typeof new FormData();
	```
	<br>
	<br>
	<br>
	<br>
5.  請問 `setTimeout` 和 `setInterval` 的差別
	<br>
	<br>
	<br>
	<br>
	
### 進階題

1. 請問以下輸出的結果會是什麼？

	``` javascript
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
	<br>
	<br>
	<br>
	<br>	
2. 請問以下輸出的結果會是什麼？
	
	``` javascript
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
	<br>
	<br>
	<br>
	<br>
	
3. 請問以下輸出的結果是什麼？
	
	``` javascript 
	$('foo').click(function(e){
		console.log(this);
		setTimeout(function(){
			console.log(this);
		}, 1000);
	});
	```
	<br>
	<br>
	<br>
	<br>
	
4. 有個 array 如下，請實作 reverse 和 join
	
	``` javascript
	var a = [1,2,3];
	console.log(a.reverse().join(',')); // 輸出 "3,2,1"
	console.log(a); //輸出 "1,2,3"
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
	<br>
	<br>
	<br>
	<br>
	
5. 請試著寫一個程式算出 `100!` (1 * 2 * 3 * ..... * 99 * 100) 後面有幾個零。
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
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
## HTML

1. 什麼是`inline element`？什麼是 `block element`？什麼是 `void element`？
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

2. 請問 script 放在 head 和 body 的差別是？該如何決定是要放在 body 還是 head？
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
3. 請說明 `cookie` `session` `localStorage` `sessionStorage` 的差別。
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
4. 請問 `Doctype` 的作用是什麼？
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
5. 載入 css 時，請問使用`link` 和 `@import` 的差別是？
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
# CSS
1. 請問 `css selector` 有哪些？
	<br>
	<br>
	<br>
	<br>
	<br>

2. 請問以下的 css 語法最後 div 會套用哪些規則？

	``` css
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
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
3. 請問什麼是 `Pseudo-classes`？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
4. 為什麼要 `初始化 css` ？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
5. 請問為什麼要 `clearfix` ？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
6. 你有使用 `css preprocessor` 或 `post processor` 嗎？請說明各自的用途，有的話喜歡使用哪一個呢？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
7. 什麼是`RWD`？
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
8. 請用 css 語法畫出一個等腰三角形，底20px。
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
