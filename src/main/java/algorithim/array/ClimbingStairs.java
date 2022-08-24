package algorithim.array;

public class ClimbingStairs {

    int rec(int n, int[] f) {

	for (int i = 1; i <= n; i++) {

	    if (i == 1)
		f[i] = 1;
	    else if (i == 2)
		f[i] = 2;
	    else {
		f[i] = f[i - 1] + f[i - 2];
	    }

	}

	return f[n];
    }

    public int climbStairs(int n) {
	if (n == 0)
	    return 0;
	if (n == 1)
	    return 1;
	if (n == 2)
	    return 2;

	int oneStepBefore = 2;
	int twoStepBefore = 1;

	int curStep = 0;
	for (int i = 3; i <= n; i++) {
	    curStep = oneStepBefore + twoStepBefore;
	    twoStepBefore = oneStepBefore;
	    oneStepBefore = curStep;
	}

	return curStep;
    }

}
