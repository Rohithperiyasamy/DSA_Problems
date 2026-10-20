package Arrays;

public class ArrMinMax {
public static void main(String[] args)
{
    int numarr[]={23,43,65,41,55,66,77};
    int min=numarr[0],max=numarr[0];

    for(int i=0; i<numarr.length; i++)
    {
        if(numarr[i]<min) min=numarr[i];
        if(numarr[i]>max) max=numarr[i];
    }
    System.out.println("Minimum No:"+min);
    System.out.println("Maximum No:"+max);
}
}
