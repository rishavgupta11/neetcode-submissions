//startP -> StartingPointer, endP -> EndPointer
class Solution {
    public String reverseWords(String s) {
        
        char arr[] = s.toCharArray();
        int len = arr.length;
        int startP = 0;

        for(int endP=0; endP<=len; endP++) {
            if(endP==len || arr[endP] == ' ') {
                reverse(arr,startP,endP-1);
                startP = endP+1;
            }
        }
        return new String(arr);
    }

    public static void reverse(char arr[], int startP, int endP) {
        while(startP < endP) {
            char temp = arr[startP];
            arr[startP] = arr[endP];
            arr[endP] = temp;
            startP++;
            endP--;
        }
    }
}