class CodeDecoder{
  public static void main(String args[]){
String key= "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

  Solution s=new Solution();
 String str= s.decodeMessage(key,message);

System.out.println(str);    

}
}

class Solution{
    public String decodeMessage(String key, String message) {
        String newStr="",newStr2="",ans="";
        for(int i=0;i<key.length();i++){          
            if(newStr.indexOf(key.charAt(i))==-1) newStr+=key.charAt(i);  
        }
        for(char j='a';j<='z';j++){
            newStr2=newStr2+j;
        }
        for(int k=0;k<message.length();k++){           
           int a=newStr.indexOf(message.charAt(k));
           if(message.charAt(k)==' ')  ans=ans+' ';
           else ans=ans+newStr2.charAt(a);
        }
        return ans;
    }
}