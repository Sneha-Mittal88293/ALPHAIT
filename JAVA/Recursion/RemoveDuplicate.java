class RemoveDuplicate{
    public static void newString(String str, int idx, StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            newString(str,idx+1,newStr,map);
        }
        else{
         map[currChar - 'a'] = true;
         newString(str,idx+1,newStr.append(currChar),map);
        }
        
    }
    public static void main(String args[]){
         String str = "snehamittal";
        newString(str,0,new StringBuilder(""),new boolean[26]);
    }
}