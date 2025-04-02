import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sulution {
  public int lengthOfLongestSubstring(String s) {

    //abcabcbb  3   4
    //dvdff   3
    //pwwkew  3
    if(s.length()==0){
      return 0;
    }
    int left = 0;
    int longestLength = 1;
    Set<Character> tempSet =new HashSet<Character>();
    tempSet.add(s.charAt(0));

    for(int right=1;right<s.length();right++){
      if(!tempSet.contains(s.charAt(right))){
        tempSet.add(s.charAt(right));
        longestLength = Math.max(longestLength, right - left + 1);
      }else{
        while (tempSet.contains(s.charAt(right))) {
          tempSet.remove(s.charAt(left));
          left++;
        }
        tempSet.add(s.charAt(right));
      }
    }

    return longestLength;
  }

}
