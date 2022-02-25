package Day12_16;


public class Ex01 {
    public static void main(String[] args) {
        // Exception 예외처리
        // try - catch - finally

        // 또는
        // 회피 (남이 처리)

        // NullPointer Excetpion, NPE
        String str = null;
        // str.isEmpty(); // would not work, since str is NULL, wouldn't have any methods

        try {
            // System.out.println(str.isBlank());

            // 배열 범위 참조 예외
            // int[] arr = new int[3];
            // for (int i = 0; i <= arr.length; i++) {
            //     arr[i] = i;
            //     System.out.println(arr[i]);
            // }

            // 캐스팅 예외

            // Object x = new Integer(10);
            // System.out.println((String) x);

            a();

        
        } catch (NullPointerException e) {
            //TODO: handle exception
            System.out.println("NPE 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 참조 오류 발생");
        } catch (Exception e) {
            System.out.println("에러 " + e);
            e.printStackTrace();
        } finally {
            System.out.println("예외든 아니든 무조건 불려짐");
        }
        
        System.out.println("done");

    }

    public static void a() throws Exception {
        b();
    }

    public static void b() throws Exception {
        // exception
        // 1. chekced Exception
        // 2. unchecked Exception = > 프로그램이 바로 종료된다

        // throw new RuntimeException(); // unchecked Expcetion 의 종류, 프로그램 종료

        throw new Exception();
    }
    
}
