package conditionalex;

public class VarScope {

    public static void main(String[] args) {
        int i = 1; // 지역 변수
        {
            int j = 10; // 지역 변수
            int inner = i + j; // 상위의 값은 사용 가능
        }

        //int outer = i + j; // Errror
    }

}