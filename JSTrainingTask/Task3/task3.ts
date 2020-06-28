// When JavaScript was developed then JavaScript development team introduced JavaScript as a client-side programming language. But when people was using JavaScript then developer get to know that JavaScript can be used as a server-side programming language also. But When JavaScript was growing then the code of JavaScript became complex and heavy. Because of this, JavaScript was even not able to full fill the requirement of Object-oriented programming language. This prevents JavaScript from succeeding at the enterprise level as a server-side technology. Then TypeScript was developed by the development team to bridge this gap.

// TypesScript is known as Object oriented programming language whereas JavaScript is a scripting language.
// TypeScript has a feature known as Static typing but JavaScript does not have this feature.
// TypeScript gives support for modules whereas JavaScript does not support modules.
// TypeScript has Interface but JavaScript does not have Interface.
// TypeScript support optional parameter function but JavaScript does not support optional parameter function.

//array reverse:
var reverse = function (arr: number[]) {
  for (let i = arr.length - 1; i < 0; i--) {
    // console.log(arr[i]);
  }
};
reverse([1, 2, 3, 4, 5]);
let number = [1, 2, 3, 4, 5];
for (let i = 0; i < number.length; i++) {
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

//Namespace is the interanl modules
// for example
// namespace StudentsCalc {
//   export function TotalFees(anualfee: number, donation: number) {
//     return anualfee + donation;
//   }
// }

//In app.ts
//calling namespace using  triple slash "///"
//  /// <reference path="StudentCalc.ts"/>
// let totalFee = StudentsCalc.AnualFee(1000, 4);
// console.log("Total Fee: " + totalFee);

//when we compile StudentsCalc.ts and app.ts it will give StudentsCalc.js and app.js.
// However, when we compile app.js, it will show "ReferenceError: StudentsCalc is not defined". Thus, normal compile: "tsc app.js" is not working, we have to use "tsc --target es6 app.ts --outFile out.js" to compile the app.ts instead.

// function Shape(sides: number, color: string) {
//   this.sides = sides;
//   this.color = color;
// }

// let redSquare = new Shape(4, "Red");

// console.log(redSquare.sides);
// console.log(redSquare.color);

//class implements interface
interface Graphic {
  sides: number;
  getArea: (number) => number;
}

class Shape implements Graphic {
  color: string;
  sides: number;
  width: number;
  length: number;

  getArea(sides: number): number {
    if (sides < 2) {
      return -1;
    } else if ((sides = 3)) {
      let result = (this.width * this.length) / 2;
      return result;
    } else {
      let result = this.width * this.length;
      return result;
    }
  }

  constructor(sides: number, color: string, width: number, length: number) {
    this.sides = sides;
    this.color = color;
    this.length = length;
    this.width = width;
  }
}

let blueTriangle = new Shape(3, "Blue", 10, 10);
console.log(blueTriangle.getArea(3));
let redSquare = new Shape(4, "Red", 20, 20);
console.log(redSquare.getArea(4));
