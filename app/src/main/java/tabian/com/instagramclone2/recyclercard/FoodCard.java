package tabian.com.instagramclone2.recyclercard;

import java.util.ArrayList;
import java.util.List;

public class FoodCard {

    String storeName;
    String reviewContent;
//    List<String> tags;
    String tag;
    String imgPath = "";


    public FoodCard(String storeName, String reviewContent, String tag, String imgPath) {
        this.storeName = storeName;
        this.reviewContent = reviewContent;
        this.tag = tag;
        this.imgPath = "../../res/drawable/food_sample.jpg";
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
