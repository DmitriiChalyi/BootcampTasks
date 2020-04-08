package Episode7p1.task2;

public class Solution {
	public static void main(String[] args) {
		System.out.println(getObjectType(new AZI3()));
		System.out.println(getObjectType(new V1()));
		System.out.println(getObjectType(new BB8()));
		System.out.println(getObjectType(new R2D2()));
	}
	public static String getObjectType(Object o) {
		if(o instanceof AZI3){
			return "AZI3";
		} else if(o instanceof V1){
			return "V1";
		} else if(o instanceof BB8){
			return "BB8";
		} else if(o instanceof R2D2){
			return "R2D2";
		}
		else return "Unknown droid";
	}
	public static class AZI3 {
	}
	public static class V1 {
	}
	public static class BB8 {
	}
	public static class R2D2 {
	}
}
