package com.forkd.crescendo.models;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Artwork {
    private String videoUrl;
    private String description;
    private String title;

    public Artwork(String videoUrl, String description, String title) {
        this.videoUrl = videoUrl;
        this.description = description;
        this.title = title;
    }

    public Artwork() {
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Artwork setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Artwork setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Artwork setTitle(String title) {
        this.title = title;
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("videoURL", getVideoUrl());
        bundle.putString("description", getDescription());
        bundle.putString("title", getTitle());
        return bundle;
    }

    public static class Builder {
        private Artwork artwork;
        private List<Artwork> artworks;

        public Builder() {
            this.artwork = new Artwork();
            this.artworks = new ArrayList<>();
        }

        public Builder(Artwork artwork) {
            this.artwork = artwork;
        }

        public Builder(List<Artwork> artworks) {
            this.artworks = artworks;
        }

        public Artwork build() {
            return artwork;
        }

        public List<Artwork> buildAll() {
            return artworks;
        }

        public static Builder from(Bundle bundle) {
            return new Builder(new Artwork(
                    bundle.getString("videoURL"),
                    bundle.getString("name"),
                    bundle.getString("title")));
        }

        public static Builder from(JSONObject jsonArkwork) {
            try {
                return new Builder(new Artwork(
                        jsonArkwork.getString("videoURL"),
                        jsonArkwork.getString("name"),
                        jsonArkwork.getString("title")));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static Builder from(JSONArray jsonArkworks) {
            int length = jsonArkworks.length();
            List<Artwork> artworks = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                try {
                    artworks.add(Builder.from(jsonArkworks.getJSONObject(i)).build());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return new Builder(artworks);
        }
    }
}

