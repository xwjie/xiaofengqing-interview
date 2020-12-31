package backtracking;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 数组排列组合
 *
 * @Date 2020/12/12 0012
 * @Author 晓风轻 https://github.com/xwjie
 */
public class Demo2 {
    public static void main(String[] args) {
        // 打印1-N的排列组合
        int[] numbers = {5, 2, 6, 4};

        System.out.println("排列");
        Stack<Integer> tempNumbers = new Stack<>();

        List<Integer[]> result1 = new ArrayList<>();
        pailie(numbers, tempNumbers, result1);
        printResult(result1);

        // 打印组合
        System.out.println("组合");
        tempNumbers.clear();
        List<Integer[]> result2 = new ArrayList<>();
        zuhe(numbers, 0, tempNumbers, result2);
        printResult(result2);
    }

    private static void printResult(List<Integer[]> result) {
        System.out.println("Size: " + result.size());
        result.forEach(item -> System.out.println(Arrays.toString(item)));
    }

    /**
     * 组合第二种写法
     *
     * @param number
     * @param index       从哪个数字开始
     * @param tempNumbers
     * @param result2
     */
    private static void zuhe(int[] numbers, int index, Stack<Integer> tempNumbers, List<Integer[]> result) {
        // 是否满足条件
        addResult(tempNumbers, result);

        // 遍历所有情况
        for (int i = index; i < numbers.length; i++) {
            // 不需要剪枝

            // 往前一步，当前数字入栈
            tempNumbers.push(numbers[i]);

            // 递归
            // 用过的数不能重复，设置遍历开始的下标为下一个
            zuhe(numbers, i + 1, tempNumbers, result);

            // 退回来，当前数字出栈
            tempNumbers.pop();
        }
    }

    /**
     * 排列
     */
    private static void pailie(int[] numbers, Stack<Integer> tempNumbers, List<Integer[]> result) {
        // 是否满足条件
        if (tempNumbers.size() == numbers.length) {
            addResult(tempNumbers, result);
            // 这里应该退出
            // 不退出也没有关系，下面的剪枝会把全部跳过
            return;
        }

        // 遍历所有情况
        for (int i = 0; i < numbers.length; i++) {
            // 剪枝
            if (tempNumbers.contains(numbers[i])) {
                continue;
            }

            // 往前一步，当前数字入栈
            tempNumbers.push(numbers[i]);

            // 递归
            pailie(numbers, tempNumbers, result);

            // 退回来，当前数字出栈
            tempNumbers.pop();
        }
    }

    private static void addResult(Stack<Integer> tempNumbers, List<Integer[]> result) {
        // Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
        // result.add((Integer[]) tempNumbers.toArray());

        // 不能用int[]，编译不通过
        Integer[] ints = new Integer[tempNumbers.size()];
        tempNumbers.toArray(ints);

//        for (Object o : tempNumbers.toArray()) {
//            System.out.println(o.getClass());
//        }

        // java中的强制类型转换只是针对单个对象的，将整个数组转换成另外一种类型的数组是不行的
        // System.out.println((Integer[])tempNumbers.toArray());

        result.add(ints);
    }
}