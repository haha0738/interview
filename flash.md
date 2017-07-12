# Flash 面試考題
> 請在另一張白紙上作答，並標明題號。作答時間為1個小時。 如有問題請按電鈴，找接洽人員。

1. 試比較 `Array` 和 `Vector<>` 的差別。

2. 試著不用as3內建的功能寫一個function判斷一個字串是否為數字。

3. 試著解釋MVC架構，以及說明優缺點。

4. 假設有一長度為N-1的未排序的數列，裡面會有1到N的數字，但是必定會缺少其中一個數字，例如[5,1,2,4]。請想出一個最快又節省記憶體的方式，找出缺少的數字。

5. 請問 Starling 有哪些優化效能的方式？

6. 請問 Starling 專案build出來的swf檔案太大，有哪些方式可以降低他的檔案大小。

7. 試著寫一個 `Arrayutils class` 實作 `Array` 的 `reverse` 和 `shuffle`

8. 請問 memory leak 是什麼？以及什麼情況下會造成 memory leak？

9. 試著說出 `int` `uint` `number` 的差別。

10. 假設台幣只有 1000、500、100、50、10、5和1元這幾種面額，試著寫一個程式輸入消費者給付金額和商品消費總額，然後算最佳化的面額和數量。

8. 試著翻譯以下的內容，專有名詞可以不用翻譯。

```
Pivot Points are a feature you won't find in the traditional display
list. In Starling, display objects contain two additional properties:
pivotX and pivotY. The pivot point of an object (also know as
“origin”, “root” or “anchor”) defines the root of its coordinate
system.

Per default, the pivot point is at (0, 0); in an image, that is the 
top left position. Most of the time, this is what you want. Sometimes,
however, you want to have that root at a different position — e.g.
when you want to rotate an image around its center.
```