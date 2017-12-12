import java.io.*;
import java.util.*;

public class golf

{

	public static void main(String[] args) throws IOException
	{
		//String fileName = "golf18.txt";
		int par = 0;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		int totalPar =0;
		int totalp1 = 0;
		int totalp2 = 0;
		int totalp3 = 0;
		int totalp4 = 0;

		Random rand = new Random();
		
		//Scanner scan = new Scanner(new File(fileName));
		System.out.println("hole\tpar\tplayer1\tplayer2\tplayer3\tplayer4");
		for(int i = 0; i < 18; i++)
		{
			par = rand.nextInt(4)+3;
			p1 = rand.nextInt(9)+1;
			p2 = rand.nextInt(9)+1;
			p3 = rand.nextInt(9)+1;
			p4 = rand.nextInt(9)+1;
			
			System.out.println((i+1)+ "\t" +par + "\t " + p1+"\t " +p2+"\t " +p3+"\t " +p4);
			totalPar += par;
			totalp1 += p1;
			totalp2 += p2;
			totalp3 += p3;
			totalp4 += p4;
			
		}
		System.out.println("Total: \t" + totalPar +"\t" + totalp1+"\t"+ totalp2+"\t"+ totalp3+"\t"+ totalp4);
		System.out.println("scores: \t" + (totalPar-totalp1)+"\t"+(totalPar-totalp2)+"\t"+(totalPar-totalp3)+"\t"+(totalPar-totalp4));
		int winner = totalp1;
		int num = 1;
		if(totalp2<winner)
		{
			winner = p2;
			num = 2;
		}
		if(totalp3<winner)
		{
			winner = p3;
			num = 3;
		}
		if(totalp4<winner)
		{
			winner = p4;
			num = 4;
		}
		System.out.println("The winner is player " + num);
	}
}
