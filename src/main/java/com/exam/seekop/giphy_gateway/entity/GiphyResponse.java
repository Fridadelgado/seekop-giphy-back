package com.exam.seekop.giphy_gateway.entity;

import java.util.List;

public class GiphyResponse {
    private List<DataItem> data;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public static class DataItem {
        private String type;
        private String id;
        private String url;
        private String slug;
        private String bitly_gif_url;
        private String bitly_url;
        private String embed_url;
        private String username;
        private String source;
        private String title;
        private String rating;
        private String content_url;
        private String source_tld;
        private String source_post_url;
        private int is_sticker;
        private String import_datetime;
        private String trending_datetime;
        private Images images;
        private String analytics_response_payload;
        private Analytics analytics;
        private String alt_text;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getBitly_gif_url() {
            return bitly_gif_url;
        }

        public void setBitly_gif_url(String bitly_gif_url) {
            this.bitly_gif_url = bitly_gif_url;
        }

        public String getBitly_url() {
            return bitly_url;
        }

        public void setBitly_url(String bitly_url) {
            this.bitly_url = bitly_url;
        }

        public String getEmbed_url() {
            return embed_url;
        }

        public void setEmbed_url(String embed_url) {
            this.embed_url = embed_url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getContent_url() {
            return content_url;
        }

        public void setContent_url(String content_url) {
            this.content_url = content_url;
        }

        public String getSource_tld() {
            return source_tld;
        }

        public void setSource_tld(String source_tld) {
            this.source_tld = source_tld;
        }

        public String getSource_post_url() {
            return source_post_url;
        }

        public void setSource_post_url(String source_post_url) {
            this.source_post_url = source_post_url;
        }

        public int getIs_sticker() {
            return is_sticker;
        }

        public void setIs_sticker(int is_sticker) {
            this.is_sticker = is_sticker;
        }

        public String getImport_datetime() {
            return import_datetime;
        }

        public void setImport_datetime(String import_datetime) {
            this.import_datetime = import_datetime;
        }

        public String getTrending_datetime() {
            return trending_datetime;
        }

        public void setTrending_datetime(String trending_datetime) {
            this.trending_datetime = trending_datetime;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }

        public String getAnalytics_response_payload() {
            return analytics_response_payload;
        }

        public void setAnalytics_response_payload(String analytics_response_payload) {
            this.analytics_response_payload = analytics_response_payload;
        }

        public Analytics getAnalytics() {
            return analytics;
        }

        public void setAnalytics(Analytics analytics) {
            this.analytics = analytics;
        }

        public String getAlt_text() {
            return alt_text;
        }

        public void setAlt_text(String alt_text) {
            this.alt_text = alt_text;
        }
    }

    public static class Images {
        private Original original;
        private Downsized downsized;
        private DownsizedLarge downsized_large;

        public Original getOriginal() {
            return original;
        }

        public void setOriginal(Original original) {
            this.original = original;
        }

        public Downsized getDownsized() {
            return downsized;
        }

        public void setDownsized(Downsized downsized) {
            this.downsized = downsized;
        }

        public DownsizedLarge getDownsized_large() {
            return downsized_large;
        }

        public void setDownsized_large(DownsizedLarge downsized_large) {
            this.downsized_large = downsized_large;
        }
    }

    public static class Original {
        private String url;
        private String mp4;
        private String webp;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }
    }

    public static class Downsized {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class DownsizedLarge {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class Analytics {
        private OnLoad onload;
        private OnClick onclick;
        private OnSent onsent;

        public OnLoad getOnload() {
            return onload;
        }

        public void setOnload(OnLoad onload) {
            this.onload = onload;
        }

        public OnClick getOnclick() {
            return onclick;
        }

        public void setOnclick(OnClick onclick) {
            this.onclick = onclick;
        }

        public OnSent getOnsent() {
            return onsent;
        }

        public void setOnsent(OnSent onsent) {
            this.onsent = onsent;
        }
    }

    public static class OnLoad {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class OnClick {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class OnSent {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
