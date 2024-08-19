package binary_search;

/*
https://leetcode.com/problems/guess-number-higher-or-lower/description/
374. Guess Number Higher or Lower
Easy

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

    -1: Your guess is higher than the number I picked (i.e. num > pick).
    1: Your guess is lower than the number I picked (i.e. num < pick).
    0: your guess is equal to the number I picked (i.e. num == pick).

Return the number that I picked.
 */

public class GuessNumberHigherOrLower_374 {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid = 0;
        int result = 0;
        do {
            mid = r - (r - l) / 2;
            result = guess(mid);
            switch (result) {
                case -1 -> r = mid - 1;
                case 1 -> l = mid + 1;
            }
        } while (result != 0);
        return mid;
    }

    int guess(int x) {
        int num = 6;
        return Integer.compare(num, x);
    }
}
