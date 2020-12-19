Number.prototype.add = function(x){
    return this.valueOf() + x;
    // 或者 return this + x;
}

Number.prototype.minus = function(x){
    return this.valueOf() - x;
}

(5).add(3).minus(2); //6

5..add(3).minus(2); //6