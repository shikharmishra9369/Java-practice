public class main{
  public static void main(String[]args){
     String s = "Shikhar Mishra";
     int count = 0;

     for(int i=0; i < s.length(); i++){
      char ch = Character.toLowerCase(s.charAt(i));
      if(ch>='a'&& ch<='z'){
        if(ch!= 'a'&&ch!= 'e'&&ch!= 'i'&& ch!= 'o'&&ch!= 'u'){
          count++;
        }
      }
     }
     System.out.println("consonants="+count);
  }
}
