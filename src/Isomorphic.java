import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> isoMap = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i++){
            Character sCurr = s.charAt(i);
            Character tCurr = t.charAt(i);

            // Check if mapping for sCurr exists
            if(isoMap.containsKey(sCurr)){
                if(!isoMap.get(sCurr).equals(tCurr)){ // compare against mapping
                    return false;
                }
            }else if(isoMap.containsValue(tCurr)){ // verify tCurr is not already a key value
                return false;
            }else{ // add the mapping
                isoMap.put(sCurr, tCurr);
            }
        }

        return true;
    }
}