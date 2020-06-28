// When JavaScript was developed then JavaScript development team introduced JavaScript as a client-side programming language. But when people was using JavaScript then developer get to know that JavaScript can be used as a server-side programming language also. But When JavaScript was growing then the code of JavaScript became complex and heavy. Because of this, JavaScript was even not able to full fill the requirement of Object-oriented programming language. This prevents JavaScript from succeeding at the enterprise level as a server-side technology. Then TypeScript was developed by the development team to bridge this gap.
// TypesScript is known as Object oriented programming language whereas JavaScript is a scripting language.
// TypeScript has a feature known as Static typing but JavaScript does not have this feature.
// TypeScript gives support for modules whereas JavaScript does not support modules.
// TypeScript has Interface but JavaScript does not have Interface.
// TypeScript support optional parameter function but JavaScript does not support optional parameter function.
//array reverse:
var reverse = function (arr) {
    for (var i = arr.length - 1; i < 0; i--) {
        // console.log(arr[i]);
    }
};
reverse([1, 2, 3, 4, 5]);
var number = [1, 2, 3, 4, 5];
for (var i = 0; i < number.length; i++) {
    console.log(i);
}
//string reverse:
function reverseString(string) {
    var newString = "";
    for (var i = string.length - 1; i >= 0; i--) {
        newString += string[i];
    }
    console.log(newString);
    //return newString;
}
var string = "hello how are you?";
reverseString(string);
var Shape = /** @class */ (function () {
    function Shape(sides, color, width, length) {
        this.sides = sides;
        this.color = color;
        this.length = length;
        this.width = width;
    }
    Shape.prototype.getArea = function (sides) {
        if (sides < 2) {
            return -1;
        }
        else if ((sides = 3)) {
            var result = (this.width * this.length) / 2;
            return result;
        }
        else {
            var result = this.width * this.length;
            return result;
        }
    };
    return Shape;
}());
var blueTriangle = new Shape(3, "Blue", 10, 10);
console.log(blueTriangle.getArea(3));
var redSquare = new Shape(4, "Red", 20, 20);
console.log(redSquare.getArea(4));
