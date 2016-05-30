package Model;



public class Podcasts {


    private String podcast_id;
    private String podcast_title;
    private String podcast_category;
    private String podcast_description;
    private String existence_time;
    private String audio_url;
    private String video_url;

    @Override
    public String toString() {
        return "Podcasts{" +
                "podcast_id='" + podcast_id + '\'' +
                ", podcast_title='" + podcast_title + '\'' +
                ", podcast_category='" + podcast_category + '\'' +
                ", podcast_description='" + podcast_description + '\'' +
                ", existence_time='" + existence_time + '\'' +
                ", audio_url='" + audio_url + '\'' +
                ", video_url='" + video_url + '\'' +
                '}';
    }

    public String getPodcast_id() {
        return podcast_id;
    }

    public void setPodcast_id(String podcast_id) {
        this.podcast_id = podcast_id;
    }

    public String getPodcast_title() {
        return podcast_title;
    }

    public void setPodcast_title(String podcast_title) {
        this.podcast_title = podcast_title;
    }

    public String getPodcast_category() {
        return podcast_category;
    }

    public void setPodcast_category(String podcast_category) {
        this.podcast_category = podcast_category;
    }

    public String getPodcast_description() {
        return podcast_description;
    }

    public void setPodcast_description(String podcast_description) {
        this.podcast_description = podcast_description;
    }

    public String getExistence_time() {
        return existence_time;
    }

    public void setExistence_time(String existence_time) {
        this.existence_time = existence_time;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
}

