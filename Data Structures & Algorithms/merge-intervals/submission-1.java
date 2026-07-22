class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length == 0 || intervals.length == 1)
           return intervals;

        ArrayList<int[]> mergedIntervals = new ArrayList<>();

        //Sort intervals on the basis of start element 
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        mergedIntervals.add(intervals[0]);

       for(int i=1; i< intervals.length;i++){

            int firstEnd = mergedIntervals.get(mergedIntervals.size() - 1)[1];
            int secondStart = intervals[i][0];

            if(firstEnd >= secondStart){
                int[] mergedElement = {mergedIntervals.get(mergedIntervals.size() - 1)[0],
                Math.max(intervals[i][1],mergedIntervals.get(mergedIntervals.size() - 1)[1])};
                mergedIntervals.set(mergedIntervals.size() - 1,mergedElement);
                
            }else{
                mergedIntervals.add(intervals[i]);
            }
       }

       int[][] resultIntervals = new int[mergedIntervals.size()][2];

       for(int i=0;i<mergedIntervals.size();i++){
         resultIntervals[i] = mergedIntervals.get(i);
       }

       return resultIntervals;

    }
}
