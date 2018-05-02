package com.forkd.crescendo.models;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String email;
    private String password;
    private String name;
    private String userPic;
    private String musicRole;
    private String musicGenre;
    private String birthday;
    private String location;
    private String district;
    private int followerCount;
    private int artworkCount;
    private Artwork artwork;

    public User(String email, String password, String name, String userPic, String musicRole, String musicGenre, String birthday, String location, String district, int followerCount, int artworkCount, Artwork artwork) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.userPic = userPic;
        this.musicRole = musicRole;
        this.musicGenre = musicGenre;
        this.birthday = birthday;
        this.location = location;
        this.district = district;
        this.followerCount = followerCount;
        this.artworkCount = artworkCount;
        this.artwork = artwork;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserPic() {
        return userPic;
    }

    public User setUserPic(String userPic) {
        this.userPic = userPic;
        return this;
    }

    public String getMusicRole() {
        return musicRole;
    }

    public User setMusicRole(String musicRole) {
        this.musicRole = musicRole;
        return this;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public User setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public User setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public User setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public User setDistrict(String district) {
        this.district = district;
        return this;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public User setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
        return this;
    }

    public int getArtworkCount() {
        return artworkCount;
    }

    public User setArtworkCount(int artworkCount) {
        this.artworkCount = artworkCount;
        return this;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public User setArtwork(Artwork artwork) {
        this.artwork = artwork;
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("email", getEmail());
        bundle.putString("password", getPassword());
        bundle.putString("userPic", getUserPic());
        bundle.putString("musicRole", getMusicRole());
        bundle.putString("musicGenre", getMusicGenre());
        bundle.putString("birthdayTimestamp", getBirthday());
        bundle.putString("location", getLocation());
        bundle.putString("district", getDistrict());
        bundle.putInt("followerCount", getFollowerCount());
        bundle.putInt("artworkCount", getArtworkCount());
        bundle.putBundle("artworks", getArtwork().toBundle());
        return bundle;
    }

    public static class Builder {
        private User user;
        private List<User> users;


        public Builder(User user, List<User> users) {
            this.user = user;
            this.users = users;
        }

        public Builder(User user) {
            this.user = user;
        }

        public Builder(List<User> users) {
            this.users = users;
        }

        public User build() {
            return user;
        }

        public List<User> buildAll() {
            return users;
        }

        public static Builder from(Bundle bundle) {
            return new Builder(new User(
                    bundle.getString("email"),
                    bundle.getString("password"),
                    bundle.getString("name"),
                    bundle.getString("usePic"),
                    bundle.getString("musicRole"),
                    bundle.getString("musicGenre"),
                    bundle.getString("birthdayTimestamp"),
                    bundle.getString("location"),
                    bundle.getString("district"),
                    bundle.getInt("followerCount"),
                    bundle.getInt("artworkCount"),
                    Artwork.Builder.from(bundle.getBundle("artworks")).build()));
        }

        public static Builder from(JSONObject jsonUser) {
            try {
                return new Builder(new User(
                        jsonUser.getString("email"),
                        jsonUser.getString("password"),
                        jsonUser.getString("name"),
                        jsonUser.getString("usePic"),
                        jsonUser.getString("musicRole"),
                        jsonUser.getString("musicGenre"),
                        jsonUser.getString("birthdayTimestamp"),
                        jsonUser.getString("location"),
                        jsonUser.getString("district"),
                        jsonUser.getInt("followerCount"),
                        jsonUser.getInt("artworkCount"),
                        Artwork.Builder.from(jsonUser.getJSONObject("artworks")).build()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static Builder from(JSONArray jsonUsers) {
            List<User> users = new ArrayList<>();
            int length = jsonUsers.length();

            for (int i = 0; i < length; i++) {
                try {
                    users.add(Builder.from(jsonUsers.getJSONObject(i)).build());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return new Builder(users);
        }
    }

}

