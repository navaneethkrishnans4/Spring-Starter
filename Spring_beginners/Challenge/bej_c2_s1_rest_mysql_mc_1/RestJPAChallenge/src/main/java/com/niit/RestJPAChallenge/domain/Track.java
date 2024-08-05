package com.niit.RestJPAChallenge.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TrackTable")
public class Track {
    @Id
    int trackId;
    String trackName;
    Float trackRating;
    String trackComments;
    String trackArtist;


    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Float getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(Float trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }
}
