class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i=0; i<points.length-1; i++){
            time = time + calculateTime(points[i], points[i+1]);
        }
        return time;
    }

    public static int calculateTime(int[] to, int[] from){
        int xDiff = Math.abs(from[0] - to[0]);
        int yDiff = Math.abs(from[1] - to[1]);

        return Math.max(xDiff, yDiff);
    }
}