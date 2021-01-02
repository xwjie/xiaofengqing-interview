(function () {
    var time = [[${sleepTime}]];
    var type = [[${type}]];

    console.log("js start, type: " + type + ", block time: " + time);

    sleep(time);

    console.log("js end  , type: " + type + ", block time: " + time);
})();

