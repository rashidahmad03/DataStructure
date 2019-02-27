package hackerearth;

import java.util.Scanner;

public class MonkvisitsCoderland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long x=sc.nextLong();
        for(int i=0;i<x;i++)
        {
            Long v=sc.nextLong();
            Long a[][]=new Long[Math.toIntExact(v)][2];

            for (Long j=0l;j<v;j++)
            {
                for (Long k=0l;k<2;k++)
                {
                    a[Math.toIntExact(j)][Math.toIntExact(k)]=sc.nextLong();

                }

            }
            sum(a);

        }
    }
    public static void sum(Long b[][]){
        Long c[]=new Long[b.length];
        for(Long i=0l;i<b.length;i++){

            Long d=1l;
            for(Long j=0l;j<2;j++)
            {
                d*=b[Math.toIntExact(i)][Math.toIntExact(j)];

            }
            c[Math.toIntExact(i)]=d;



        }


    }
}
