package finalproject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CheckGroup {
 
    public static double std_deviation(int[] a,int m) { 
            int sum=0;
            double s=0;
            for(int k=0;k<m;k++) { sum+=a[k]; } 
            double avg = sum/a.length;
            for(int k=0;k<m;k++)
            {s+=(a[k]-avg)*(a[k]-avg)/m;
            }
            double s1=Math.sqrt(s);       
                return s1;
        }

  public boolean CheckIfPositive(String fname){
       String file = "C:\\FinalProject\\src\\Images\\"+fname+".png"; 
       File originalImage=new File(file);
       BufferedImage img=null;
       int h,w;

    try{
       img=ImageIO.read(originalImage);
        h=img.getHeight();
        w=img.getWidth();
      int ar[][]=new int[h][w];

      //storing entire image in array as 1 and 0 form
      for(int i=0;i<h;i++){
         for(int j=0;j<w;j++){
          Color c = new Color(img.getRGB(j,i)); 
                int r=c.getRed();   
                if(r==0)
                     { r=1; }
                else 
                     { r=0; }
                ar[i][j]=r;
             }
         }

//Determing the Threshold vlaue i.e standard deviation for the full row with all pixel as black
      int y1[]=new int[w];
           for(int i=0;i<w;i++)
             { y1[i]=i+1; }
            double y=std_deviation(y1,w);
         //System.out.println("\n Threshold Value="+y);
          
          int num[]=new int[w];
          int sum[]=new int[h];
          double mean[]=new double[h];
          double sd[]=new double[h];
          int c=0,cnt=0,ag=0,ng=0,m=0;
          for(int i=0;i<h;i++) {  
             sum[i]=0;
             mean[i]=0.0;
             sd[i]=0.0;
          }
          
          /*
          Calculate the standard deviation of each row and store it in the sd array
          k is number of black pixels in an single row
          */
          
          int k;
          for(int i=0;i<h;i++) {
              k=0;
              for(int j=0;j<w;j++){
                 if(ar[i][j]==1)
                    { num[k]=j;k++;}
                  }
              sd[i]=std_deviation(num,k);
          }

      for(int i=0;i<h;i++){
          if(y==sd[i]) cnt++;
          if(y<sd[i])  ag++;
          if(y>sd[i])  ng++;
          }
        //determing whether agglutination is occur or not
      if(ag>=(ag+ng)*0.25)   { return true;}
      else   { return false;}
    }
    catch(IOException e){ System.out.println("Error while reading\n"); } 
    return false;    
       }
}