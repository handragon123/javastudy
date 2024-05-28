package classex;

public class VariableArgument {
	  void printInfo(String ...infos){
	        if(infos.length != 0){
	            for(int i=0;i<infos.length;i++){
	                System.out.print(infos[i] + " ");
	            }
	            System.out.println();
	        }
	        else{
	            System.out.println("인자가 없네요.");
	        }
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        VariableArgument vt = new VariableArgument();
	        System.out.print("인자값 없이 : ");
	        vt.printInfo();
	        System.out.print("인자값 한 개 : ");
	        vt.printInfo("aaa");
	        System.out.print("인자값 두 개 : ");
	        vt.printInfo("aaa","bbb");
	        System.out.print("인자값 세 개 : ");
	        vt.printInfo("aaa","bbb","ccc");
	    }

}
