/*== 以下考題都禁止使用內建函示做題，否則零分計算。會根據結果、效能和可讀性做為評分標準 ==*/
const { performance } = require('perf_hooks');
/**
 * 字串反轉
 * 分數 20
 * 
 * 例如 hello world!
 * 結果應該為
 * !dlrow olleh
 * @param {string} str
 * @return {string}
 */
var reverse = function (str){
    
}

/**
 * 爬樓梯
 * 分數 40
 * 
 * 你正在爬一個 n 階的樓梯，每一次你只能爬1階或2階請問你有種不重複的爬法？
 * 例如 n = 3
 * 結果應該為 3
 * 會有 
 * 1階 + 1階 + 1階
 * 1階 + 2階
 * 2階 + 1階
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
   
};

/**
 * 換錢
 * 分數 40
 * 
 * 有不同幣值的硬幣，給一金額，找出可以換得的硬幣最小數量。如果沒有可以換硬幣回傳 -1
 * 例如 coins = [1,2,5], amount = 7
 * 結果應該為 2 
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
var coinChange = function(coins, amount) {
    
};


let correct = 0;
let testCount = 10000;
let start = performance.now();
for (let index = 0; index < testCount; index++) {
    if(reverse('Hello world!') == '!dlrow olleH')
        correct ++;
}
let end = performance.now();
console.log('反轉字串\n\t花費:' + (end - start) + 'ms' + '\n\t正確率:' + (correct / testCount));


correct = 0;
start = performance.now();
console.log(climbStairs(4))
for (let index = 0; index < testCount; index++) {
    if(climbStairs(4) == 5)
        correct ++;
}
end = performance.now();
console.log('爬樓梯\n\t花費:' + (end - start) + 'ms' + '\n\t正確率:' + (correct / testCount));

correct = 0;
start = performance.now();

for (let index = 0; index < testCount; index++) {
    if(coinChange([1,2,5], 7) == 2)
        correct ++;
}
end = performance.now();
console.log('換錢\n\t花費:' + (end - start) + 'ms' + '\n\t正確率:' + (correct / testCount));

