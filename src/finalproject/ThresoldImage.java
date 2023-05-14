package finalproject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ThresoldImage {
    
    int getThresoldValue(){    
         int hist[]= new int[256];  for(int i=0;i<=255;i++){ hist[i]=0;}
         int sum=0;
     
//histogram count
     try{
         File originalImage=new File("C:\\FinalProject\\src\\Images\\cont_enhan.png");
         BufferedImage img=ImageIO.read(originalImage);    
         
//first Calculating the histogram count
          for(int i=0;i<img.getHeight();i++){
            for(int j=0;j<img.getWidth();j++){
                 Color c = new Color(img.getRGB(j,i)); 
                 hist[c.getRed()]++; //since the image is grayscaled - all the rbg component will have same value
            }
          }
          
//initializing the sum variable
        sum=img.getWidth()*img.getHeight();
    }
catch(IOException e){
System.out.println("Error while reading - computing thresold");
}


//Thresholding algorithm computation
          //computing foreground weight
          double weight_f[]=new double[256];
          double mean_f[]=new double[256];
          double variance_f[]=new double[256];

          double weight_b[]=new double[256];
          double mean_b[]=new double[256];
          double variance_b[]=new double[256];

          double within_class_var[]= new double[256];
          double weight,mean,variance;


          for(int i=0;i<=255;i++){ 
//for foreground 
          weight=0;mean=0;variance=0;
          for(int j=0;j<i;j++){
             weight+=((double)hist[j]/(double)sum); 
             mean+=((double)hist[j]/(double)sum)*(double)j;//same like mean+=weight*j;
           }

          weight_f[i]=weight;
          mean_f[i]=mean;

          for(int k=0;k<i;k++){
            double ans = (double)(Math.pow(k - mean_f[i],2)); //k determine Xi- value which are fall below
            variance+=ans*((double)hist[k]/(double)sum);
          }

          variance_f[i]=variance;

//for background  
         weight=0;mean=0;variance=0;
          for(int j=i;j<=255;j++){
             weight+=((double)hist[j]/(double)sum); 
             mean+=((double)(hist[j]/(double)sum))*(double)j;
           }

            weight_b[i]=weight;
            mean_b[i]=mean;

          for(int k=i;k<=255;k++){
            double ans = (double) (Math.pow(k - mean_b[i],2));
            variance+=ans*((double)hist[k]/(double)sum);
          }
          variance_b[i]=variance;

        //with in class varience 
          within_class_var[i]=((weight_b[i]*variance_b[i])+(weight_f[i]*variance_f[i]));

        }

        int Thresold=0;
        double minimum=999999999;

        for(int p=0;p<=255;p++){
          if(within_class_var[p]<minimum){
            minimum=within_class_var[p];
            Thresold=p;
          }
        }

        System.out.println("Thresold value is : "+Thresold);
        return Thresold;
}
    
       
//thresolding image 
public void thresoldImage(){
     try{
         File originalImage = new File("C:\\FinalProject\\src\\Images\\cont_enhan.png");
         BufferedImage img=ImageIO.read(originalImage);
         BufferedImage otherImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);

         
         int thresold = getThresoldValue();
         for(int i=0;i<img.getHeight();i++){
             for(int j=0;j<img.getWidth();j++){
             //taking rgb color of of each pixel;
                 Color c = new Color(img.getRGB(j,i)); 
                 int gr=c.getRed();

             if(gr>=thresold)
                   {gr=255;}  //white
             else
                   {gr=0;} //black

             Color gColor=new Color(gr,gr,gr);
             otherImage.setRGB(j,i,gColor.getRGB());
             }
           }
          ImageIO.write(otherImage,"png",new File("C:\\FinalProject\\src\\Images\\Thresold.png"));
          System.out.println("Thresolding done succeesfully");
      }
  catch(IOException e){System.out.println("Error while reading - in Thresolding part");}
   }
  }