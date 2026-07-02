class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int bottlesDrunk = emptyBottles;
        int fullBottles = 0;
        numBottles = 0;

        while (emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            fullBottles ++;
            numExchange ++;

            if (emptyBottles <= numExchange) {
                emptyBottles += fullBottles;
                bottlesDrunk += fullBottles;
                fullBottles = 0;
            }
        }

        return bottlesDrunk;
    }
}
