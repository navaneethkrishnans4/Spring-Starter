package com.niit.RestJPAChallenge.services;

import com.niit.RestJPAChallenge.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);
    List<Track> getAllTracks();
    Track updateTrack(Track track, int trackId);
    boolean deleteTrackById(int trackId);
    List<Track> getTrackByTrackArtist(String trackArtist);
    List<Track> getTrackByTrackId(int trackId);

}
