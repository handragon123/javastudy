package collectionpkg;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class LottoUseSet {
	public static void main(String[] args) {
		
		Random n = new Random();
		Set lottoOne = new HashSet();
		while(true) {			
			int num = n.nextInt(45) + 1;
			lottoOne.add(num);
			if(lottoOne.size() == 6) break;
		}
		
		System.out.println(lottoOne);
		
		lottoOne = new TreeSet();
		while(true) {			
			int num = n.nextInt(45) + 1;
			lottoOne.add(num);
			if(lottoOne.size() == 6) break;
		}
		
		System.out.println(lottoOne);
		
	}
}
