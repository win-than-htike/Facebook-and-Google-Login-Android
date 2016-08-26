package xyz.padc.firebasetesting;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by winthanhtike on 8/24/16.
 */
public class UserVO {

    private String facebookId;

    private String username;

    private String email;

    private String profilePicture;

    private String coverPicture;

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public static UserVO initFromFacebookData(JSONObject facebookLoginUser,String imgUrl,String coverImgUrl){

        UserVO user = new UserVO();

        try {

            if (facebookLoginUser.has("id")) {
                user.setFacebookId(facebookLoginUser.getString("id"));
            }

            if (facebookLoginUser.has("name")) {
                user.setUsername(facebookLoginUser.getString("name"));
            }

            if (facebookLoginUser.has("email")) {
                user.setEmail(facebookLoginUser.getString("email"));
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

        user.setProfilePicture(imgUrl);
        user.setCoverPicture(coverImgUrl);

        return user;

    }

}
