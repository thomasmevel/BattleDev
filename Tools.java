/*
 * Tools.java
 * 
 * 
 */


public class Tools {
	
	public static void main (String[] args) {
		for(String str : decStr("Ceci.est un test",'.')){
			System.out.println(str);
		}
		for(float f : strToFloat(decStr("7.2 8 563.1 8943",' '))){
			System.out.println(f+"\t"+roundUp(f));
		}
	}
	public static String[] decStr(String str, char sep){
		char[] tab = str.toCharArray();
		int nbrSep = 0;
		for(char c:tab){
			if(c == sep){nbrSep++;}
		}
		String[] result = new String[nbrSep+1];
		str = str+sep;
		for(int n = 0; n <= nbrSep; n++){
			result[n] = str.substring(0, str.indexOf(sep));
			str = str.substring(str.indexOf(sep)+1, str.length());
		}
		return result;
	}
	public static String[] decStr(String str){
		return decStr(str, ' ');
	}
	public static float[] strToFloat(String[] tabStr){
		float[] f = new float[tabStr.length];
		try{
			for(int n = 0; n < tabStr.length; n++){
				f[n] = Float.valueOf(tabStr[n]).floatValue();
			}
		}catch(Exception e){
			return null; //plutot que de declancher une exception, renvoi un null => valeur à tester dans le main()
		}
		return f;
	}
	public static int roundUp(float f){
		int n = (int)f;
		if(n<f){n++;}
		return n;
	}
}

