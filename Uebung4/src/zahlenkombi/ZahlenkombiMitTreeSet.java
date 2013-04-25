package zahlenkombi;

import java.util.Random;
import java.util.TreeSet;

public class ZahlenkombiMitTreeSet implements IZahlenkombi{
	
	private int max;
	private TreeSet<Integer> tree = new TreeSet<Integer>();
	
	public ZahlenkombiMitTreeSet(int max){
		this.max = max;
		Random rand= new Random();
		for(int i = 0; i <= max; i++){
			tree.add(rand.nextInt(max));
		}
	}
	
	@Override public int getMax() {
		return max;
	}

	@Override public boolean istEnthalten(int zahl){
		return (tree.contains(zahl));
	}

	
}
