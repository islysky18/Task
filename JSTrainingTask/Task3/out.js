var StudentsCalc;
(function (StudentsCalc) {
    function AnualFee(feeamount, term) {
        return feeamount * term;
    }
    StudentsCalc.AnualFee = AnualFee;
})(StudentsCalc || (StudentsCalc = {}));
/// <reference path="StudentsCalc.ts" />
let totalFee = StudentsCalc.AnualFee(1000, 4);
console.log("Total Fee: " + totalFee);
