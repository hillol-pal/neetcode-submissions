class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>((a,b) -> a - b);
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
    }
    
    public void addNum(int num) {

        int minSize = minHeap.size();
        int maxSize = maxHeap.size();

        
        // if 
        if(maxSize < 1 || num <= maxHeap.peek() ){
            maxHeap.offer(num);
            maxSize++;
            if(maxSize - minSize > 1 ){
                int exchange = maxHeap.poll();
                minHeap.offer(exchange);
            }

        }else{
            minHeap.offer(num);
            minSize++;
            if(minSize - maxSize > 0 ){
                int exchange = minHeap.poll();
                maxHeap.offer(exchange);
            }
        }

        
    }
    
    public double findMedian() {

        int minSize = minHeap.size();
        int maxSize = maxHeap.size();

        double result;

        if((minSize + maxSize) %2 == 0 ){
           result = (double)(maxHeap.peek() + minHeap.peek())/2;

        }else{
            result = (double)maxHeap.peek();
        }
        
        return result;
    }
}
