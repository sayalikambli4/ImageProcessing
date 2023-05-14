package finalproject;
import java.awt.Color;
import java.awt.image.BufferedImage; 
import java.io.File;  
import java.io.IOException; 
import javax.imageio.ImageIO; 

public class RegionExtraction{

public void regionExtraction(String fname){
    
         int top,left,right,bottom;
         String path ="C:\\FinalProject\\src\\Images\\";
         String ip_fname=path+fname+".png";
         String op_fname=path+"Extract"+fname+".png";        

        File originalImage = new File(ip_fname);
        BufferedImage img=null;
        try{
          img=ImageIO.read(originalImage);

         int width=img.getWidth()-1;
         int height=img.getHeight()-1;

         top = (height/4);
         right = (3*width/4);
         bottom =(3*height/4);
         left = (width/4);

        int low,high,center;
        int flag;

//FOR TOP
        low=0;high=height/2;
        center=0;
        while((high-low)!=1){
            flag=0;
              center=(high+low)/2;
           for(int j=left;j<right;j++){  
             Color c = new Color(img.getRGB(j,center)); 
                int r=c.getRed();
                   if(r==0){flag=1;break;}  //if we encounter the black pixel then mark flag 1 and break;
                  }
         if(flag==1){high=center;}
           else {low=center;}
        }  
    top=high;
    
//FOR right
        low=width/2; high=width;center=0;
          while((high-low)!=1){
             flag=0;
             center=(high+low)/2;
             for(int j=top;j<bottom;j++){
                Color c = new Color(img.getRGB(center,j)); 
                   int r=c.getRed();
                 if(r==0){flag=1;break;}
               }               
           if(flag==1){ low=center;}
           else {high=center;}
          }  
         right=high;
         
  //for bottom
    high=height;low=height/2;center=0;
      while((high-low)!=1){
              flag=0;
              center=(high+low)/2;
              for(int j=left;j<right;j++){
               Color c = new Color(img.getRGB(j,center)); 
                int r=c.getRed();
               if(r==0){flag=1;break;}
               }
         if(flag==1){low=center;}
         else
           {high=center;}
      }
         bottom=high;

//FOR left
        high=width/2;low=0;center=0;
        while((high-low)!=1){
              flag=0;
             center=(high+low)/2;
             for(int j=top;j<bottom;j++){
               Color c = new Color(img.getRGB(center,j)); 
                int r=c.getRed();
               if(r==0){flag=1;break;}
             }
             if(flag==1){high=center;}
           else
               {low=center;}
      }  
        left=high;
        
 //extracting the require portion using TOP,RIGHT,BOTTOM,LEFT
 BufferedImage otherImage = new BufferedImage((right-left+1),(bottom-top+1),BufferedImage.TYPE_INT_ARGB);
 for(int i=top;i<bottom;i++){
   for(int j=left;j<right;j++){
      Color c = new Color(img.getRGB(j,i)); 
        int r=c.getRed();
      Color gColor=new Color(r,r,r);
     otherImage.setRGB(j-left,i-top,gColor.getRGB());
     }
 }
 ImageIO.write(otherImage,"png",new File(op_fname));
 System.out.println("Region Extration done.....");
  }  
catch(IOException e){System.out.println("Error while reading - Region Extraction....");}
    }
}