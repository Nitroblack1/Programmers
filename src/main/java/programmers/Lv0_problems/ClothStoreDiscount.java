package programmers.Lv0_problems;

//        ClothStoreDiscount clothStoreDiscount = new ClothStoreDiscount();
//
//                int[] prices = {150_000, 580_000, 10, 150_530};
//
//                for(int price : prices) {
//                System.out.println(clothStoreDiscount.solution(price));
//                }

public class ClothStoreDiscount {
    public int solution(int price) {
        if (price >= 500_000) {
            return (int)(Math.floor(price * 0.8));
        } else if (price >= 300_000) {
            return (int)(Math.floor(price * 0.9));
        } else if (price >= 100_000) {
            return (int)(Math.floor(price * 0.95));
        } else {
            return price;
        }
    }
}
