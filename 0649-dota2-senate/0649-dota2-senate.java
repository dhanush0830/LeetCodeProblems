class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i<n;i++){
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }else
            dire.offer(i);
            
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.peek() < dire.peek()){
                int s = radiant.poll();
                dire.poll();
                radiant.offer(s + n);
            }else{
                int s = dire.poll();
                radiant.poll();
                dire.offer(s + n);
            }
        }

        return radiant.isEmpty()?"Dire":"Radiant";
        
    }
}