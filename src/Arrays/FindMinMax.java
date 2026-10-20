 package Arrays;

public class FindMinMax
{
            public static void main(String[] args)
        {
            int numarr[]={23,43,65,41,55,66,77};
            int min,max,temp;

            for(int i=0; i<numarr.length; i++)
               for(int j=i;j<numarr.length;j++)
            {
                if(numarr[i] >numarr[j])
                {
                    temp=numarr[i];
                    numarr[i]=numarr[j];
                    numarr[j]=temp;
                }
            }
            min=numarr[0];
            max=numarr[numarr.length-1];
            System.out.println("Minimum No:"+min);
            System.out.println("Maximum No:"+max);
        }
    }


