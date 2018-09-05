# 網頁前端面試考題

應試人：

應試日期：

## Javascript
### Basic

1. **What is the difference between 1 == '1' and 1 === '1' ？**


2. **wthat is the output？**

  ``` javascript
  var a = [1,2,3];
  var b = a;
  a.push[5];
  console.log(b);
  ```
3. **How to get the string `hello` ?**

  ``` javascript
  var a = { 1: 'hello', 2: 'world' };
  ```

### Advanced
1. **Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.**

  **Examples:**

  ```
  s = "leetcode"
  return 0.

  s = "loveleetcode",
  return 2.
  ```

  **Note:** You may assume the string contain only lowercase letters.

  **Solution:**

  ```javascript
  /**
  * @param String $str Input string
  *
  * @return int The index of first non-repeating character
  */
  function firstUniqChar($str) {

  }

  ```

2. **Write a function that takes a string as input and returns the string reversed.**

  **Example:**
  Given s = "hello", return "olleh".



## HTML

1. **Try to explain `inline element` 、 `block element` and `void element`？**

2. **Try to explain `cookie` `session` `localStorage` and `sessionStorage`.**

3. **What is  `Doctype`？**



# CSS


1. **List the css selector you know**

2. **Which css rules will apply to the html below？**

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

3. **Try to remove marks form list items.**

  ```html
  <ul>
      <li>list item 1</li>
      <li>list item 2</li>
  </ul>
  ```
4.  **Give gray background and white text for odd rows, white background  and red text for even rows in the html below.**

   ```html
   <ul>
       <li>list item 1</li>
       <li>list item 2</li>
       <li>list item 3</li>
       <li>list item 4</li>
       <li>list item 5</li>
       <li>list item 6</li>
       <li>list item 7</li>
       <li>list item 8</li>
       <li>list item 9</li>
   </ul>
   ```
