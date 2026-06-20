class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int stone : stones) {
            pq.add(stone);
        }
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int remains = Math.abs(first - second);
            if(remains != 0)
                pq.add(remains);
        }
        if(pq.size() == 1)
            return pq.peek();
        return 0;
    }
}
