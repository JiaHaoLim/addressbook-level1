package seedu.addressbook;

import java.util.Comparator;

public class Comparators {
    static class Ascend implements Comparator<String[]> {

        /**
         * compare()
         * Overrides Comparator compare.
         * Compare input strings.
         *
         * @param s1 String 1
         * @param s2 String 2
         * @return 1 if s1 s2 is in ascending order
         *         -1 if s1 s2 is in descending order
         *         0 if s1 and s2 are the same
         */
        public int compare(String s1[], String s2[]) {
            return s1[1].compareTo(s2[1]);
        }
    }

    static class Descend implements Comparator<String[]> {

        /**
         * compare()
         * Overrides Comparator compare.
         * Compare input strings.
         *
         * @param s1 String 1
         * @param s2 String 2
         * @return 1 if s1 s2 is in descending order
         *         -1 if s1 s2 is in ascending order
         *         0 if s1 and s2 are the same
         */
        public int compare(String s1[], String s2[]) {
            return s2[1].compareTo(s1[1]);
        }
    }
}
