public class StringTest {
    public static void main(String[] args) {
        String s = new String("Hello World!");

        String ss = "Hello World!";

        char c = s.charAt(4); // charAt(int index) - 지정된 인덱스에 있는 문자를 반환한다
        // returnType : char, 해당 변수에 저장하여 return
        System.out.println(c);

        // 문제, 아래의 문자열의 결과는 어떻게 될까?
        String s1 = "동해물과 백두산이";   // 값 자체가 리터럴임
        String s2 = "동해물과 백두산이";   // 문자열 리터럴이 같다면, 똑같은 주소값을 할당함. 새로 주지 않음
        boolean r = s1 == s2;
        System.out.println(r);
        // 결과 : true
    }
}
