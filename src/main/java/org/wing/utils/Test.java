package org.wing.utils;
/**
 * Created by yeleia on 17-12-30.
 */
public class Test {
    public static void main(String[] args) {
        String text="1-5,1-6<br>3-1,3-2<br>";//上课时间
        String str="10-B102<br>4-B509<br>";//上课教室
        String text1="<br>";
        int count=0;
        int start=0;
        while (text.indexOf(text1,start)>=0&&start<text.length()){
            count++;
            start=text.indexOf(text1,start)+text1.length();
        }
        String s[][]=new String[count][2];
        //count为<br>的个数
        for (int j=0;j<count;j++){
            int n=text.indexOf("<",(j*8)+5);
            int m=str.indexOf("<",(j*8)+1);
            if (j==0){
                System.out.println(text.substring(0,n));
                System.out.println(str.substring(0,m));
                System.out.println(text.substring(0,n).substring(0,text.substring(0,n).indexOf(",")));
                s[0][0]=text.substring(0,n).substring(0,text.substring(0,n).indexOf(","));
                s[0][1]=str.substring(0,m);
            }else {
                int p=text.indexOf("<",((j-1)*8)+5);
                int q=str.indexOf("<",((j-1)*8)+1);
                System.out.println(text.substring(p+4,n));
                System.out.println(str.substring(q+4,m));
                s[j][0]=text.substring(p+4,n).substring(0,text.substring(p+4,n).indexOf(","));
                s[j][1]=str.substring(q+4,m);
            }
        }
        System.out.println(s.length);
        System.out.println(s[0][0]+s[0][1]);
        System.out.println(s[1][0]+s[1][1]);

    }
}
