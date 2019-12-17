# 晓风轻面试系列  - 前端JS（2）回溯法


> 本系列文章首发在公众号 晓风轻技术小站（xiaofengqingjava），欢迎关注。

今天继续上次的话题，练习编程能力，今天的题目难度中高，后台开发也可以练习一下。

重点练习 `回溯法` ，不管是前后台，掌握了他，能解决很多问题，实在太好用了！！

`回溯法`写法比较统一，就是`循环对所有数据执行入栈，递归，然后出栈`。多写几次就能顺利掌握。

## 在树结构上找到指定节点的完整路径

在上一题的基础上，找到从根节点到对应节点的完整路径。

如输入G，输出['A', 'B', 'D','G'], 如果找不到，返回 []。难度为中高。

这也是一道对前后台都很`实用`的题目。

### 参考答案

```js
function findFullPath(root, value){
    function _find(node, value, result){
        // 放入当前节点
        result.push(node.value);
        
        if(node.value == value){
            return result;
        }
        
        // 找左边
        if(node.left){
            let find = _find(node.left, value, result);
            
            if(find){
                return find;
            }
        }

        // 找右边
        if(node.right){
            let find = _find(node.right, value, result);
            
            if(find){
                return find;
            }
        }

        // 找不到就把当前节点弹出
        result.pop();
    }

    return _find(root, value, []) || [];
}
```

完整代码见： https://github.com/xwjie/xiaofengqing-interview/blob/master/web/js/5.js



## 打印指定数组的排列、组合

示例：

输入[1,2,3]

输出：

排列为6种：[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]

组合为8种：[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]

难度为高。

### 参考答案

- 排列
  
```js
function printPailie(data) {
    function _print(data, result) {
        // 数据长度相同，表示是一组结果
        if (result.length == data.length) {
            console.log(result);
        }

        for (let i = 0; i < data.length; i++) {
            // 如果不包含当前节点，则尝试
            if (result.indexOf(data[i]) < 0) {
                // 入栈
                result.push(data[i]);

                // 递归
                _print(data, result);

                // 出栈
                result.pop();
            }
        }
    }
    _print(data, []);
}
```

- 组合

```js
function printZuhe(data) {
    // 组合的不能重复，多了一个下标参数
    function _print(data, index, result) {
        console.log(result);

        // 注意下标不是从0开始
        for (let i = index; i < data.length; i++) {
            // 组合不会有重复数据，不需要判断重复
            // 入栈
            result.push(data[i]);

            // 下标加1，递归
            _print(data, i + 1, result);

            // 出栈
            result.pop();
        }
    }
    _print(data, 0, []);
}
```



完整代码见： https://github.com/xwjie/xiaofengqing-interview/blob/master/web/js/6.js

## 本章代码路径

[https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js](https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js)

欢迎加星加关注，持续更新。欢迎在github上提issue交流。

本文首发公众号 `晓风轻技术小站` ，扫码关注

- 公众号: xiaofengqingjava

![晓风轻技术小站](xiaofengqingjava.jpg)

- QQ群: 607679993

![晓风轻技术小站](qq.png)
