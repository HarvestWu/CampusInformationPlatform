package org.wing.utils;

/**
 * Created by yeleia on 17-12-30.
 */
public class StringUtil {
    //a为上课时间，b为教室
    public static String[][] sub(String a,String b){
        String text1="<br>";
        int count=0;
        int start=0;
        //计算有多少节课count
        while (a.indexOf(text1,start)>=0&&start<a.length()){
            count++;
            start=a.indexOf(text1,start)+text1.length();
        }
        String s[][]=new String[count][2];
        for (int j=0;j<count;j++){
            int n=a.indexOf("<",(j*8)+5);
            int m=b.indexOf("<",(j*8)+1);
            if (j==0){
                s[0][0]=a.substring(0,n).substring(0,a.substring(0,n).indexOf(","));
                s[0][1]=b.substring(0,m);
            }else {
                int p=a.indexOf("<",((j-1)*8)+5);
                int q=b.indexOf("<",((j-1)*8)+1);
                s[j][0]=a.substring(p+4,n).substring(0,a.substring(p+4,n).indexOf(","));
                s[j][1]=b.substring(q+4,m);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String text="1-5,1-6<br>3-1,3-2<br>";//上课时间
        String str="10-B102<br>4-B509<br>";//上课教室
        String a[][]=StringUtil.sub(text,str);
        System.out.println(a.length);
        System.out.println(a[0][0]+" "+a[0][1]);
        System.out.println(a[1][0]+" "+a[1][1]);
    }
}
