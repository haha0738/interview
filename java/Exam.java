/*== 以下考題都禁止使用內建函示做題，否則零分計算。會根據結果、效能和可讀性做為評分標準 ==*/

import java.util.Arrays;
import java.util.List;

public class Exam{
    public static void main(String[] args){
        int correct = 0;
        int testCount = 1000;
        long start = System.currentTimeMillis();
        for (int index = 0; index < testCount; index++) {
            if(reverse("Hello world!").equals("!dlrow olleH"))
                correct ++;
        }
        long end =  System.currentTimeMillis();
        System.out.println("反轉字串\n\t花費:" + (end - start) + "ms" + "\n\t正確率:" + (correct / testCount));
        
        correct = 0;
        start = System.currentTimeMillis();
        for (int index = 0; index < testCount; index++) {
            if(climbStairs(4) == 5)
                correct ++;
        }
        end =  System.currentTimeMillis();
        System.out.println("爬樓梯\n\t花費:" + (end - start) + "ms" + "\n\t正確率:" + (correct / testCount));

        correct = 0;
        start = System.currentTimeMillis();
        List<Integer> coins = Arrays.asList(1, 5, 10);
        for (int index = 0; index < testCount; index++) {
            if(coinChange(coins, 11) == 2)
                correct ++;
        }
        end =  System.currentTimeMillis();
        System.out.println("換硬幣\n\t花費:" + (end - start) + "ms" + "\n\t正確率:" + (correct / testCount));
        
    }
    /**
     * 字串反轉
     * 分數 20
     * 
     * 例如 hello world!
     * 結果應該為
     * !dlrow olleh
     * @param str
     * @return
     */
    protected static String reverse(String str){
        
        return str.intern();
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
     * @param n
     * @return
     */
    protected static Integer climbStairs(Integer n){
        return 0;
    }

    /**
     * 換錢
     * 分數 40
     * 
     * 有不同幣值的硬幣，給一金額，找出可以換得的硬幣最小數量。如果沒有可以換硬幣回傳 -1
     * 例如 coins = [1,2,5], amount = 7
     * 結果應該為 2 
     * @param coins
     * @param amount
     * @return
     */
    protected static Integer coinChange(List<Integer> coins, Integer amount){
        return 0;
    }
}