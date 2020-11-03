package algorithms.leetcode;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;
import utilities.OutputUtils;

public class AddBinary implements GeneralAlgorithm {

    String a;
    String b;

    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        a = inputUtils.stringInputUtil();
        b = inputUtils.stringInputUtil();
    }

    @Override
    public void executeAlgorithm() {
        String result = addBinary(a, b);
        OutputUtils outputUtils = new OutputUtils();
        outputUtils.printString(result);
    }

    private String addBinary(String a, String b) {
        int carry = 0;
        int result = 0;
        StringBuilder sum = new StringBuilder();

        int pointer = 1;
        while (pointer <= a.length() || pointer <= b.length()) {
            result += carry;
            if (pointer <= a.length())
                result += '0' - a.charAt(a.length() - pointer);
            if (pointer <= b.length())
                result += '0' - b.charAt(b.length() - pointer);
            if (result >= 2)
                carry = 1;
            else
                carry = 0;
            result = result % 2;
            sum.insert(0, "" + result);
            pointer++;
        }

        if (carry > 0)
            sum.insert(0, "" + carry);

        return sum.toString();
    }

}
