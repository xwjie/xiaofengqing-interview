# 晓风轻面试系列  - 语言篇（3）


> 本系列文章首发在公众号 晓风轻技术小站（xiaofengqingjava），欢迎关注。

前面2天我们练习了基本编程能力，这一块对于前台开发来说难度是非常大的，实际面试中很少有人能很好的完成。而这些能力，在工作中又是非常重要的。有很多人，面试题目准备得很好，但进入工作后实际能力很差，就是编程能力太差了。所以现在面试不管高端还是初级，我们都会加一定的手写代码题，喜欢大家重视起来。

接下来我们开始javascript的语法考核。javascript是个很特别的语言，要掌握的东西很多，这里结合面试题，讲解一下重要的语法点。

## 说说原型

基本上是必考题了，一般的面试题都有，很少碰到完全不懂的面试者。这里不详细讲解，说几点重要的地方，并延伸出一些知识点。



- 原型设计的目的

`函数`对象上有一个特殊的属性`prototype`，这就是原型，是一个对象。通过这个函数new出来的对象，都可以`共享`这个对象。

原型设计的最初目的就是为了`减少内存使用`提示效率，把数据放到一个地方大家可以访问到，有点类似java是static变量的目的。

函数的原型才能直接访问，对象的原型理论上应该是由浏览器内部使用的，所以有些浏览器是无法直接访问到的。

```js
function Dog(){

}

var dog = new Dog();

// IE下没有__proto__属性
// Chrome、Firefox 下为 true
dog.__proto__ === Dog.prototype

// IE下没有该方法
Object.getPrototypeOf(dog) === Dog.prototype
```

- 原型链

很好理解，就是一条链子，数据沿着链子查找。如何判断数据是对象本身的还是来自原型链的呢？ 使用 `Object.hasOwnProperty` 方法。

- jquery的fn是什么？

对于以前面试的时候，对于只会jquery的人来说，jquery没有啥好问的，就会问问这个：`$.funcation1 和 $.fn.funcation1 这2中方式上增加方法，区别是什么？` 一大半答不出。其实第1种是因为`方法也是对象`，相当于在对象上面增加了一个方法。

```js
$.prototype === $.fn // true
```

- 编写原型继承

在这里我们就编写最简单的原型继承，很多人不注意会写错，看着对，实际上是错的。

```js
// 原型继承

function Animal(){
    this.eat = function(){
        console.log("animal eat");
    }
}

function Dog(){
    this.bark = function(){
        console.log("dog bark");
    }
}

// 原型继承
Dog.prototype = new Animal();
Dog.prototype.constructor = Dog;

// 很多人会写成
// Dog.prototype = Animal.prototype;
// 或者这样
// Dog.prototype = Animal;

var dog = new Dog();

dog.eat();
dog.bark();
```

- 遍历对象

用for-in遍历，会把原型链上的都遍历到。而用Object.keys遍历不会。

```js
// for-in遍历
console.log('for-in遍历')
for (var key in dog) {
    console.log(key)
}

// Object.keys遍历
var keys = Object.keys(dog);
console.log('Object.keys遍历')
for (var i = 0; i < keys.length; i++) {
    console.log(keys[i]);
}
```


完整代码见： https://github.com/xwjie/xiaofengqing-interview/blob/master/web/js/7.js

### 相关面试题

实现 (5).add(3).minus(2) 功能。很明显是在原型上扩展方法。

```js
Number.prototype.add = function(x){
    return this.valueOf() + x;
    // 或者 return this + x;
}

Number.prototype.minus = function(x){
    return this.valueOf() - x;
}

(5).add(3).minus(2); //6

5..add(3).minus(2); //6
```

完整代码见： https://github.com/xwjie/xiaofengqing-interview/blob/master/web/js/8.js

## 本章代码路径

[https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js](https://github.com/xwjie/xiaofengqing-interview/tree/master/web/js)

欢迎加星加关注，持续更新。欢迎在github上提issue交流。

本文首发公众号 `晓风轻技术小站` ，扫码关注

- 公众号: xiaofengqingjava

![晓风轻技术小站](xiaofengqingjava.jpg)

- QQ群: 607679993

![晓风轻技术小站](qq.png)
