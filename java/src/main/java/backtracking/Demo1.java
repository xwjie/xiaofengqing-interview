package backtracking;


import java.util.Stack;

/**
 * 数组排列组合
 *
 * @Date 2020/12/12 0012
 * @Author 晓风轻 https://github.com/xwjie
 */
public class Demo1 {
    public static void main(String[] args) {
        // 打印1-N的排列组合
        int number = 4;

        System.out.println("排列");
        Stack<Integer> tempNumbers = new Stack<>();
        pailie(number, tempNumbers);

        // 打印组合
        System.out.println("组合");
        tempNumbers.clear();
        zuhe(number, tempNumbers);

        //
        System.out.println("组合2");
        tempNumbers.clear();
        zuhe2(number, 1, tempNumbers);
    }

    /**
     * 组合第二种写法
     *
     * @param number
     * @param index   从哪个数字开始
     * @param tempNumbers
     */
    private static void zuhe2(int number, int index, Stack<Integer> tempNumbers) {
        // 是否满足条件
        System.out.println(tempNumbers);

        // 遍历所有情况
        for (int i = index; i <= number; i++) {
            // 不需要剪枝

            // 往前一步，当前数字入栈
            tempNumbers.push(i);

            // 递归
            // 用过的数不能重复，设置遍历开始的下标为下一个
            zuhe2(number, i + 1, tempNumbers);

            // 退回来，当前数字出栈
            tempNumbers.pop();
        }
    }

    /**
     * 组合
     */
    private static void zuhe(int number, Stack<Integer> tempNumbers) {
        // 是否满足条件
        System.out.println(tempNumbers);

        // 遍历所有情况
        for (int i = 1; i <= number; i++) {
            // 剪枝
            // 排列是往后走，如果里面有数有比之前的大，是走过的分支
            if (moreThen(tempNumbers, i)) {
                continue;
            }

            // 往前一步，当前数字入栈
            tempNumbers.push(i);

            // 递归
            zuhe(number, tempNumbers);

            // 退回来，当前数字出栈
            tempNumbers.pop();
        }
    }

    /**
     * 排列
     */
    private static void pailie(int number, Stack<Integer> tempNumbers) {
        // 是否满足条件
        if (tempNumbers.size() == number) {
            System.out.println(tempNumbers);

            // 这里应该退出
            // 不退出也没有关系，下面的剪枝会把全部跳过
            return;
        }

        // 遍历所有情况
        for (int i = 1; i <= number; i++) {
            // 剪枝
            if (tempNumbers.contains(i)) {
                continue;
            }

            // 往前一步，当前数字入栈
            tempNumbers.push(i);

            // 递归
            pailie(number, tempNumbers);

            // 退回来，当前数字出栈
            tempNumbers.pop();
        }
    }

    private static boolean moreThen(Stack<Integer> tempNumbers, int i) {
        for (Integer item : tempNumbers) {
            if (item >= i) {
                return true;
            }
        }

        return false;
    }
}