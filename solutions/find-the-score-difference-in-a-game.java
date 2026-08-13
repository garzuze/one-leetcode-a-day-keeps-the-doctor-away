class Player {
    private int points;
    private boolean active;
    
    Player(int points, boolean active) {
        this.points = points;
        this.active = active;
    }

    int points() {
        return this.points;
    }

    boolean active() {
        return this.active;
    }

    void setPoints(int points) {
        this.points = points;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    void increasePoints(int amount) {
        setPoints(points() + amount);
    }
}



class Solution {
    public int scoreDifference(int[] nums) {
        Player p1 = new Player(0, true);
        Player p2 = new Player(0, false);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                swap(p1, p2);
            }
            
            if ((i + 1) % 6 == 0) {
                swap(p1, p2);
            }

            getActive(p1, p2).increasePoints(nums[i]);
        }

        return p1.points() - p2.points();
    }

    void swap(Player p1, Player p2) {
        p1.setActive(!p1.active());
        p2.setActive(!p2.active());
    }

    Player getActive(Player p1, Player p2) {
        return p1.active() ? p1 : p2; 
    }
}
