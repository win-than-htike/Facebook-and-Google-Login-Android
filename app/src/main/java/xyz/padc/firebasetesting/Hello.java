package xyz.padc.firebasetesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by winthanhtike on 8/24/16.
 */
public class Hello {

    /**
     * A placeholder fragment containing a simple view.
     */

//        @BindView(R.id.btn_connect_with_facebook)
//        Button btnConnectWithFacebook;
//
//        @BindView(R.id.iv_profile)
//        ImageView ivProfile;
//
//        @BindView(R.id.iv_profile_cover)
//        ImageView ivProfileCover;
//
//        @BindView(R.id.tv_name)
//        TextView tvUsername;
//
//        @BindView(R.id.tv_email)
//        TextView tvEmail;
//
//        private CallbackManager mCallbackManager;
//        private AccessTokenTracker mAccessTokenTracker;
//
//        public MainActivityFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View view = inflater.inflate(R.layout.fragment_main, container, false);
//            ButterKnife.bind(this,view);
//
//            mCallbackManager = CallbackManager.Factory.create();
//            mAccessTokenTracker = new AccessTokenTracker() {
//                @Override
//                protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
//                    if (currentAccessToken == null) {
//                        //Logout from Facebook.
//                        Log.d("FirebaseApp", "Logout from Facebook");
//                    }
//                }
//            };
//
//            btnConnectWithFacebook.setOnClickListener(this);
//            LoginManager.getInstance().registerCallback(mCallbackManager,
//                    new FacebookCallback<LoginResult>() {
//                        @Override
//                        public void onSuccess(LoginResult loginResult) {
//                            processFacebookInfo(loginResult);
//                        }
//
//                        @Override
//                        public void onCancel() {
//
//                        }
//
//                        @Override
//                        public void onError(FacebookException error) {
//
//                        }
//                    });
//
//            return view;
//        }
//
//        private void processFacebookInfo(LoginResult loginResult) {
//
//            final AccessToken accessToken = loginResult.getAccessToken();
//            FacebookUtils.getInstance().requestFacebookLoginUser(accessToken, new FacebookUtils.FacebookGetLoginUserCallback() {
//                @Override
//                public void onSuccess(final JSONObject facebookLoginUser) {
//                    FacebookUtils.getInstance().requestFacebookProfilePhoto(accessToken, new FacebookUtils.FacebookGetPictureCallback() {
//                        @Override
//                        public void onSuccess(final String profilePhotoUrl) {
//                            FacebookUtils.getInstance().requestFacebookCoverPhoto(accessToken, new FacebookUtils.FacebookGetPictureCallback() {
//                                @Override
//                                public void onSuccess(final String coverPhotoUrl) {
//
//                                    onLoginWithFacebook(facebookLoginUser, profilePhotoUrl, coverPhotoUrl);
//
//                                }
//                            });
//                        }
//                    });
//                }
//            });
//
//        }
//
//        private void onLoginWithFacebook(JSONObject facebookLoginUser, String imageUrl, String coverImageUrl) {
//
//            try {
//
//                if (facebookLoginUser.has("name")){
//                    tvUsername.setText(facebookLoginUser.getString("name"));
//                }
//
//                if (facebookLoginUser.has("email")){
//                    tvEmail.setText(facebookLoginUser.getString("email"));
//                }
//
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//            Glide.with(ivProfile.getContext()).load(imageUrl).centerCrop().crossFade().error(R.mipmap.ic_launcher).into(ivProfile);
//            Glide.with(ivProfileCover.getContext()).load(coverImageUrl).centerCrop().crossFade().error(R.mipmap.ic_launcher).into(ivProfileCover);
//
//
//        }
//
//
//        @Override
//        public void onClick(View view) {
//            connectToFacebook();
//        }
//
//        private void connectToFacebook() {
//
//            if (AccessToken.getCurrentAccessToken() == null) {
//                LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList(FacebookUtils.FACEBOOK_LOGIN_PERMISSIONS));
//            } else {
//                LoginManager.getInstance().logOut();
//            }
//
//        }
//
//        @Override
//        public void onActivityResult(int requestCode, int resultCode, Intent data) {
//            super.onActivityResult(requestCode, resultCode, data);
//            mCallbackManager.onActivityResult(requestCode, resultCode, data);
//        }
//
//        @Override
//        public void onStart() {
//            super.onStart();
//            mAccessTokenTracker.startTracking();
//        }
//
//        @Override
//        public void onStop() {
//            super.onStop();
//            mAccessTokenTracker.stopTracking();
//        }
    }
