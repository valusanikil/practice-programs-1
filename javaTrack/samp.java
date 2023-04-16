package javaTrack;

public class samp {
	public static void main(String[] args) {
        System.out.println( VowelCounter.getNumberString("Language") );
	}

}
class VowelCounter
{
	public static String getNumberString(String s)
	{
		int counter = 0;
        for(int i = 0; i<s.length(); i++)
        {
          char g = s.charAt(i);
          if(g =='a') 
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='e')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='i')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='o')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='u')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='A')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='E')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='I')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='O')
          {
              counter++;
              s.replace(g,(char) counter);
          }
          else if(g =='U')
          {
              counter++;
              s.replace(g,(char) counter);
          }  
        }   
     return s;
	}
}
