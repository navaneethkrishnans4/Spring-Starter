package com.niit.RestJPAChallenge.repository;

import com.niit.RestJPAChallenge.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

    List<Track> findByTrackArtist(String trackArtist);
    List<Track> findByTrackId(int trackId);

}
