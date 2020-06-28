var StudentsCalc;
(function (StudentsCalc) {
    function AnualFee(feeamount, term) {
        return feeamount * term;
    }
    StudentsCalc.AnualFee = AnualFee;
})(StudentsCalc || (StudentsCalc = {}));
