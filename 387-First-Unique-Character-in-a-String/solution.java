public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>  characterhashtable= 
                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= s.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=s.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        for (i =0 ; i < length ; i++ )
        {
            c= s.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return i;
        }
        return -1;
    }
 }
        
