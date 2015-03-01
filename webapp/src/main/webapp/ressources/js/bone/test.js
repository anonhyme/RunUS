/**
 * Created by anonhyme on 2/20/2015.
 */
var b = require('bonescript');
b.pinMode('USR0', b.OUTPUT);

var inputPin = "P9_36";
var ledStatus = 0;
var ledValue = b.HIGH;

loop();

function loop() {
    var value = b.analogRead(inputPin);
    if(b.valueOf()){
        var valueD = b.digitalWrite('USR0', b.LOW)
    } else {
        var valueD = b.digitalWrite('USR0', b.HIGH)
    }
    // console.log(value);
    setTimeout(loop, 1);
}