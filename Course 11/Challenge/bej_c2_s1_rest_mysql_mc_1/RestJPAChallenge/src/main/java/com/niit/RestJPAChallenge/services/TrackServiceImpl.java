package com.niit.RestJPAChallenge.services;

import com.niit.RestJPAChallenge.domain.Track;
import com.niit.RestJPAChallenge.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService {
    private TrackRepository trackRepository;
    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track)
    {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks()
    {
        return (List<Track>) trackRepository.findAll();
    }

    @Override
    public Track updateTrack(Track track, int trackId) {
        Optional<Track> optionalTrack = trackRepository.findById(trackId);
        if(optionalTrack.isEmpty()){
            return null;
        }

        Track existingTrack = optionalTrack.get();
        if(track.getTrackName()!=null)
        {
            existingTrack.setTrackName(track.getTrackName());
        }
        if(track.getTrackRating()!=null)
        {
            existingTrack.setTrackRating(track.getTrackRating());
        }
        if(track.getTrackComments()!=null)
        {
            existingTrack.setTrackComments(track.getTrackComments());
        }
        if(track.getTrackArtist()!=null)
        {
            existingTrack.setTrackArtist(track.getTrackArtist());
        }
        return trackRepository.save(existingTrack);

    }

    @Override
    public boolean deleteTrackById(int trackId) {
        if(trackRepository.existsById(trackId))
        {
            trackRepository.deleteById(trackId);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public List<Track> getTrackByTrackArtist(String trackArtist) {
        return (List<Track>) trackRepository.findByTrackArtist(trackArtist);
    }

    @Override
    public List<Track> getTrackByTrackId(int trackId) {
        return (List<Track>) trackRepository.findByTrackId(trackId);
    }
}
