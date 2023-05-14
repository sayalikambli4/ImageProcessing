package finalproject;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ContrastEnhancement{
 
   public void contrast_enhancement(){
     try{
          File originalImage=new File("C:\\FinalProject\\src\\Images\\GrayScale.png");
          BufferedImage img=ImageIO.read(originalImage);
          BufferedImage otherImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
/*
Declaring hist array to store the histogram count and than we initialize it to 0
The index represent the intensity value (i.e. if we want histogram count for the intensity say 100 than the count will be store at index 100)
*/
          int hist[]=new int[256];
          for(int i=0;i<256;i++){ hist[i]=0; }

 //first Calculating the histogram count
          for(int i=0;i<img.getHeight();i++){
            for(int j=0;j<img.getWidth();j++){
                 Color c = new Color(img.getRGB(j,i)); 
                 hist[c.getRed()]++; //since the image is grayscaled - all the rbg component will have same value
            }
          }

//coumputing the cdf(v) value 
          float cdf_v[]=new float[256];
          int sum=0;
          for(int i=0;i<=255;i++){
                sum=sum+hist[i];
                cdf_v[i]=sum;
          }

//finding the min value i.e cdf_min
          float min=555;//initializing to any max value
          for(int i=0;i<=255;i++){
             if(cdf_v[i]<min)
                {min=cdf_v[i];}
          }

//now caluculating the h(v)
          int h_v[]=new int[256];
          int M_x_N=(img.getWidth()*img.getHeight());
          for(int i=0;i<=255;i++){
                h_v[i]=Math.round(((cdf_v[i]-min)*(255))/(M_x_N-1));
           }
          
//replacing the image value with the Equalized value
         for(int i=0 ;i<img.getHeight();i++){
            for(int j=0;j<img.getWidth();j++){
                Color c = new Color(img.getRGB(j,i)); 
                int r=c.getRed();
                int gr=h_v[r];

                Color gColor=new Color(gr,gr,gr);
               otherImage.setRGB(j,i,gColor.getRGB());
             }
         }
         
         //writing to an image
         ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\cont_enhan.png"));
         System.out.println("contrance enhancement done Succesfully");
   }
     
    catch(IOException e){ System.out.println("Error while reading - ContrastEnhancement part.......");}
   }
}