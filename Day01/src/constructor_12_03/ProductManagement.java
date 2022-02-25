package constructor_12_03;

public class ProductManagement {

    // // 제품 관리 Class를 설계 하세요.
    // // 제품 관리 Class 를 통해서 아래 내용을 출력 하세요.
    // // 출력 예시
    
    // // 이름 : 새우깡
    // // 가격 : 1300 
    // // 유통기한 : 2022-12-22 
    
    // // 제품 5개의 가격 : 6500
    // // 제품 13개의 가격 : 16900
    // // 판매 가능 상품
    // 유통기한이 지나지 않았을 경우 "판매 가능상품", 유통기한이 지났을 경우 "판매 불가 상품"

    private String name;
    private int price;
    private String expire;

    public ProductManagement(String name, int price, String expire) {
        this.name = name;
        this.price = price;
        this.expire = expire;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPrice(int count) {
        return getPrice() * count;
    }

    public String getExpire() {
        return this.expire;
    }

    public boolean isExpired() {

        //String current[] = java.time.LocalDate.now().toString().split("-");
        //String expire[] = this.expire.split("-");

        // compareTo
        // return 1, if string is bigger than basis
        // return 0, if string is same as basis
        // return -1, if string is smaller than basis
        return this.expire.compareTo(java.time.LocalDate.now().toString()) >= 0 ? false : true;

        // if (Integer.valueOf(current[0]) <= Integer.valueOf(expire[0])) {
        //     if (Integer.valueOf(current[1]) <= Integer.valueOf(expire[1])) {
        //         if (Integer.valueOf(current[2]) < Integer.valueOf(expire[2])) {
        //             flag = false;
        //         }
        //     }
        // }
        // else {
        //     flag = true;
        // }

        // return flag;


    }


}
