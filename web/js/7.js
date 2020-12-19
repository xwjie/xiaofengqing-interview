// 原型继承

function Animal() {
    this.eat = function () {
        console.log("animal eat");
    }
}

function Dog() {
    this.bark = function () {
        console.log("dog bark");
    }
}

// 原型继承
Dog.prototype = new Animal();

var dog = new Dog();

// 此时prototype是个animal对象，所以他的constructor为animal
dog.constructor; // ƒ Animal()

// 修正原型的constructor
Dog.prototype.constructor = Dog;

// 很多人会写成
// Dog.prototype = Animal.prototype;
// 或者这样
// Dog.prototype = Animal;


dog.eat();
dog.bark();




// for-in遍历
console.log('for-in遍历')
for (var key in dog) {
    console.log(key)
}


// Object.keys遍历
var keys = Object.keys(dog);
console.log('Object.keys遍历')
for (let i = 0; i < keys.length; i++) {
    console.log(keys[i]);
}