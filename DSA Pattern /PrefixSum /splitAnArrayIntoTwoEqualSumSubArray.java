class Solution {
    public boolean canSplit(int arr[]) {
        // code here
       int leftSum = 0, rightSum = 0, n = arr.length;
       for(int i=0; i<n; i++)
        leftSum += arr[i];
        
        for(int i=n-1; i>=0; i--){
            rightSum += arr[i];
            leftSum -= arr[i];
            
            if(leftSum == rightSum)
                return true;
        }
        return false;
    }
}
