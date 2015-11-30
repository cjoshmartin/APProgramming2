import java.util.List;


public class testarrayclass {

	
	public int makeingList(List<Integer> list){
		int count=0;
		for (int i : list)
			count+= i;
		return count;
	}
	
	public static void main(String[] args) {
		
		List<String> list1 =  (List<String>) new ArrayList();
			for (String i: list1)
				System.out.println(i);
	}

}
