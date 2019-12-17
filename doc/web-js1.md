# 晓风轻面试系列  - 前端JS（1）

> 本系列文章首发在公众号 晓风轻技术小站（xiaofengqingjava），欢迎关注。

最近项目调整，又进入了每天固定面试流程。我这边主要负责的公司合作方的前端面试，平均每周面试的人大概在10个左右，不算多。说实话，整体的面试比较糟糕，你们是想象不到很多人的水平之差的程度，感觉我遇到了一堆假程序员。

![](emoj/1genengda.jpg)

有鉴于此，我想把我个人面试中的考核点列举出来，配以说明题目的目的和解法，帮助大家成长。由于我面试的是合作方员工，要求相对不高，所以我个人的面试题偏重实用为主，就是面的都是工作中能遇到的知识，都有用得上该知识的场景，没有一些非常奇怪的面试题。网上很多js的面试题，非常清新脱俗，实际上，大部分程序员一辈子都不会遇到和用到里面的知识点，毕竟大部分都是初级程序员嘛。（js真是一门bug一样的语言，我一直是这样评价js的）。

![](emoj/beishang.jpg)

所以本系列贴比较适合`初学者`，对于有基础的人来说可能觉得很简单，你也别想着学会了这些题目就能进去BAT，这里的知识还远远不够。但也不要看不起这些面试题，因为从实际面试结果来看，这些题目能及格做出来的人，我一个都还没有遇到，其中不乏工作了7，8年的开发人员。

## 面试流程简述

简历方面，我个人不太看学校，但会看专业，因为你会发现，程序员这个工作虽然是非常简单的工作，但不是科班出身的，对他们来说还真难度不大。科班出身的人，有程序思维，沟通相对容易，进步也快。但不是科班出身的人也不要灰心，我说过很多次，成为一个合格的程序员根本不需要技术多好，很多合作方的骨干员工技术也差的一逼，如后台的开发人员连多线程都没有写过，但并不妨碍他成为骨干，我说过很多次，成为合格的技术人员最重要的特征是：

1. 强烈的责任心
2. 心细如发，粗枝大叶的人不可能成为好程序员
3. 严谨的思维，一定程度上和技术知识体系有关

但首先，你要通过面试，面试不通过，你就算有成为好的程序员的资质谁又能知道呢？就好比搞对象一样，首先看外貌，然后才是内涵。

### 自我介绍

面试的过程大同小异，首先是介绍自己，这里`忌长篇大论`。我个人希望听到的是

1. 学校、专业。学校太差、不是科班出身的就不要说了。
2. 前端工作年限
3. 你使用和擅长的是哪些技术？

我对你是哪里人，为什么来深圳不感兴趣。不要超过2分钟让我打断你。

然后是项目介绍，这里有一些注意点和技巧。首先，简历上不需要些太多项目，3个左右我觉得就够了。简历上项目介绍的模板是：`项目一句话介绍 + 使用的技术 + 你承担的模块和角色 + 你解决的难点、亮点`（没有亮点这条就算了）。

### 项目介绍

然后，介绍项目的时候，一定要做到给人`有条理有结构`的感觉，不要天马行空，穿插着介绍。可以参考下面几点，这些介绍到了就差不多了。

1. 项目是干什么的。
2. 项目的面向用户是谁。
3. 项目有哪些用户角色。（可选，面试后台开发的时候需要）
4. 项目有哪些模块。
5. 你承担了哪些模块？这个项目/模块多少开发人员，你什么角色。
6. 用到了哪些技术，我在里面解决了哪些难点，这就是准备给面试官问你的点。

重要的是有条理，然后说技术点，`引导面试官往你的方向走`。当然很多时候面试官我行我素，不问你提到的难点。而我的习惯是，面试年限多的高级开发人员我会问里面的难点，如果只是初级的开发人员我不会问难点。就好比初级后台开发，我不会问你jvm等知识，就算你会，我也觉得是你为了面试背的。

这里应该控制在3-5分钟以内，言多必失，这句话放在面试里面也是适用的。

## 题目环节

首先，前端开发也是程序员，我们最近加入了很多手写代码的环节，就是因为太多的面试者，连程序员都算不上，这些都是面试通过之后工作上给我的血的教训。面试的题目简单的能答上（因为是为了面试背的），复杂的听都听不懂。搞得我很被动，我不能因为复杂的你不会就否定一个人。所以，现在加上手写代码，目的就是证明，`这个人是个程序员`！这里不会考太难的东西，甚至连算法都算不上！

下面是题目环节，先考核js，js逻辑性相对强一些，比较好考。然后是css，css点太多。

> 强烈建议大家看完题目不要急着看参考代码，自己写一下，就当现在是在面试，在规定时间内手写出来。

### 写出1加到N的递归写法

N是大于1的正整数。

这道题的考核目的：你是个程序员。难度为入门。

说实话，这道题简单到令人发指，但是！实际上的面试里面，最少1/3写不出来。我能说什么呢？我前几年面试Android开发人员，写不出来的人达到1/2。我知道大家不信，但我说的是事实。做界面相关的人（android app这些也算），有一部人算不上程序员。

参考答案：

```js
function addN(n){ 
	if(n == 1){
		return 1;    
	}else{
        return n + addN(n-1);
    }
}
```

你当然用三元运算符可以把他写成一行，还有其他写法，这些不是关键。插一句，绝大部分人不知道运算符都有哪些。

面试的时候我问这道题的时候，我都怕被人鄙视被人打。但写不出的人大有人在。这道题的目的是你能听懂什么是递归（实际工作中，递归经常用到，好写好理解），非科班出身转行可以，但你也得有点底线是不？

这道题有`一票否决权`，这道题写不出来，后面打个哈哈就结束面试了。

### 表结构转树结构

使用element ui的时候，树组件需要的数据结构如下：

```js
[{
  id: 1,
  label: '一级 1',
  children: [{
    id: 4,
    label: '二级 1-1'
  }]
}, {
  id: 2,
  label: '一级 2',
  children: [{
    id: 5,
    label: '二级 2-1'
  }, {
    id: 6,
    label: '二级 2-2'
  }]
}, {
  id: 3,
  label: '一级 3',
  children: [{
    id: 7,
    label: '二级 3-1'
  }, {
    id: 8,
    label: '二级 3-2'
  }]
}]
```

实际项目中，大部分场景后台数据库是用表存放的，所以后台返回的数据为如下：

```js
[{id:1, label:'一级 1', parentId: 0},
{id:2, label:'一级 2', parentId: 0},
{id:3, label:'一级 3', parentId: 0},
{id:4, label:'一级 1-1', parentId: 1},
{id:5, label:'一级 2-1', parentId: 2},
{id:6, label:'一级 2-2', parentId: 2},
{id:7, label:'一级 3-1', parentId: 3},
{id:8, label:'一级 3-2', parentId: 3}]
```

编写转换函数。

这道题的`考核目的`：动手能力，是个合格的程序员，是否有正常的程序员思维，以及思维的严谨性。难度为中。

这道题不是我凭空想象出来的，实际工作中就遇到。实际面试中，还没有一个能完整写出来（真的有这么难吗？可能是面试紧张导致吧。）。这道题其实考核你的动手能力，还有重点就是看你想问题是否严谨。题目中有些信息没有给出，就看你是否会想到。

1. 题目里面只有2层，你是否想象到了可能有多层？
2. 题目中，返回的数组，都是父节点在前面子节点在后面，这点是否能保证？

大家不要急着看答案，可以自己写一下，看看十分钟是否能写出来。初学者千万不要高估自己！很多人写得好复杂，最后还没有写出来。

参考答案：

```js
var data = [
    {id:1, label:'一级 1', parentId: 0},
    {id:2, label:'一级 2', parentId: 0},
    {id:3, label:'一级 3', parentId: 0},
    {id:4, label:'一级 1-1', parentId: 1},
    {id:5, label:'一级 2-1', parentId: 2},
    {id:6, label:'一级 2-2', parentId: 2},
    {id:7, label:'一级 3-1', parentId: 3},
    {id:8, label:'一级 3-2', parentId: 3},
]

function tran2tree(data){
    var result = [];

    // 保存父节点
    var parentNodes = {};

    data.forEach( item => {
		var node = {};

        node.id = item.id;
        node.label = item.label;

        // 顶层
        if(item.parentId == 0){
            result.push(node);
        }
        else{
            // 不是顶层，找到父节点加进去。
            var parent = parentNodes[item.parentId];
            
            if(!parent.children){
                parent.children = []
            }

            parent.children.push(node);
        }

        // 保存起来查询用
        parentNodes[item.id] = node;
    })

    return result;
}

var result = tran2tree(data);
console.log(JSON.stringify(result, null, '\t'));
```

这是我想到的最简单的写法，一次循环，支持多层，也很好理解。当然你可以改进一些小点，如用es6的析构，会短一点，看着专业一点。面试官也可能为问forEach和for的区别等。

所谓程序员的`正常的程序思维`就是：遍历节点，如果parentId是0，放到顶层，否则找到父节点，然后加到父节点的children里面去。

这个代码的前提是输入的数据父节点在前面子节点在后面，如果不能保证这一点，代码又应该怎么样写呢？（提示：多一次循环即可。）

PS: 最近翻面试题，发现某个BAT大公司也是这道题目。所以，做一下还是很有必要的。

### 定义二叉树的数据结构，构建并遍历树

定义二叉树的数据结构，然后构建以下树，随便一种方式遍历整个树。

![二叉树](image/tree.png)

这道题的考核目的和上一题一样，看你是否一个合格的程序员，考核初步的`面向对象思维`。难度为高。虽然对于前端开发人员来说，难度定义为高，但只要大学计算机专业课及格的应该都能轻松做出来的。

实际面试中，很多人听不懂数据结构是什么意思。我明白很多做前端的兄弟是其他专业转行过来的，我并不会对非计算机专业的人有偏见。只不过，你最起码有最基本的计算机专业知识，否则工作中沟通起来很困难。

参考答案：

```js
function Node(value){
    // 节点的值
    this.value = value

    // 左右节点
    this.left = null;
    this.right = null;
}

// 构建树，定义根节点
let root = new Node('A');

let node1 = new Node('B');
let node2 = new Node('C');

root.left = node1;
root.right = node2;

let node3 = new Node('D');
node1.left = node3;

let node4 = new Node('G');
node3.right = node4;

let node5 = new Node('E');
node2.left = node5;

let node6 = new Node('F');
node2.right = node6;

// 前序
function walk1(root){
    if(!root){
        return;
    }

    console.log(root.value);
    
    walk1(root.left);
    walk1(root.right);
}

console.log('前序遍历');
walk1(root);
```

其他的遍历写法基本上是一样的，只是位置不一样。这就是递归写法的魅力。

```js
// 中序
function walk2(root){
    if(!root){
        return;
    }

    walk1(root.left);
    console.log(root.value);
    walk1(root.right);
}

console.log('中序遍历');
walk2(root);

// 后序
function walk3(root){
    if(!root){
        return;
    }

    walk3(root.left);
    walk3(root.right);
    console.log(root.value);
}

console.log('后序遍历');
walk3(root);
```

比较难一点的是层遍历，能写出来最好，写不出来也算正常。

```js
// 层遍历
// 注意数组的 push，pop，shift，unshift 方法实现堆栈等数据结构。
// push + pop = 栈
// push + shift = 堆
function walk4(root){
    if(!root){
        return;
    }

    let nodes = [];
    nodes.push(root);

    let currentNode;
    while(currentNode = nodes.shift()){
        console.log(currentNode.value);

        if(currentNode.left){
            nodes.push(currentNode.left);
        }

        if(currentNode.right){
            nodes.push(currentNode.right);
        }
    }
}

console.log('层遍历');
walk4(root);
```

这里强调一下，数组的各种方法，使用这些方法可以轻松实现堆栈等常规数据结构。大家有兴趣提高编程动手能力的，可以把前面三张遍历写成非递归的写法。来试试吧。可以回复在代码里面的issue里面。

## 本章代码路径

[https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js](https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js)

欢迎加星加关注，持续更新。欢迎在github上提issue交流。

本章的题目代码量不多，但很具有代表性，建议准备去面试的同学背诵并默写。

本文首发公众号 `晓风轻技术小站` ，扫码关注

- 公众号: xiaofengqingjava

![晓风轻技术小站](xiaofengqingjava.jpg)

- QQ群: 607679993

![晓风轻技术小站](qq.png)
