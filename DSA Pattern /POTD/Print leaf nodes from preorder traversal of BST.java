class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = preorder.length;
        
        for(int i=0; i<n-1; i++){
            int curr = preorder[i];
            int next = preorder[i+1];
            boolean isLeaf = false;
            
            if(next < curr)
                stack.push(curr);
            else{
                while(!stack.isEmpty() && next > stack.peek()){
                    stack.pop();
                    isLeaf = true;
                }
                if(isLeaf)
                    res.add(curr);
            }
        }
        res.add(preorder[n-1]);
        return res;
    }
}
