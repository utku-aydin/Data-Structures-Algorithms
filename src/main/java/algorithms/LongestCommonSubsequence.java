package algorithms;

public class LongestCommonSubsequence {

    public String lcSubsequence(String former, String latter) {
        return recursiveSolution(former, latter);
    }

    private String recursiveSolution(String former, String latter) {
        if (former.length() == 0 || latter.length() == 0)
            return "";
        if (former.charAt(0) == latter.charAt(0)) {
            return former.charAt(0) + recursiveSolution(former.substring(1), latter.substring(1));
        } else {
            String leftCut = recursiveSolution(former.substring(1), latter);
            String rightCut = recursiveSolution(former, latter.substring(1));
            if (leftCut.length() > rightCut.length())
                return leftCut;
            return rightCut;
        }
    }

}
