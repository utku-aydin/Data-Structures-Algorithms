package algorithms.backtobackswe.dynamicprogramming;

import java.util.Arrays;
import java.util.Stack;

public class ParenthesisMatchedStrings {

    public void parenthesisMatch(int n) {
        char[] results = new char[n * 2];
        recursiveSolution(0, 0, results);
        //_printParenthesis(results, 0, n, 0, 0);
    }

    private void recursiveSolution(int current, int openBracketCount, char[] results) {
        if (current == results.length - 1) {
            results[current] = ')';
            System.out.println("Option: " + Arrays.toString(results));
            return;
        }

        if (openBracketCount > 0) {
            results[current] = ')';
            recursiveSolution(current + 1, openBracketCount - 1, results);
        }

        if (openBracketCount <= (results.length - current) / 2) {
            results[current] = '(';
            recursiveSolution(current + 1, openBracketCount + 1, results);
        }
    }

    static void _printParenthesis(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }

}
