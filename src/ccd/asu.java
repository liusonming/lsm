package ccd;

import java.util.Scanner;

public class asu {
	public static void main(String[] args) {
Scanner ji=new Scanner(System.in);
int[] pp=new int[6];
pp[0]=90;
pp[1]=85;
pp[2]=77;
pp[3]=56;
pp[4]=45;
int index=0;
System.out.println("请选择你要猜测的数字");
int num=0;
index=i
num=ji.nextInt();
for(int i=0;i<pp.length;i++){
	if(num>pp[i]){
		index=i;
		break;
	}
	
}
for(int t=pp.length-1;t>index;t--){
	pp[t]=pp[t-1];
}
pp[index]=num;
for(int i=0;i<6;i++){
	System.out.print(pp[i]+"\n");
}

	}
}
