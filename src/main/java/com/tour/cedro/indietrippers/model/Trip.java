package com.tour.cedro.indietrippers.model;

import com.tour.cedro.indietrippers.enums.Trip.PlacesPreference;
import com.tour.cedro.indietrippers.enums.Trip.TripType;
import com.tour.cedro.indietrippers.enums.Trip.FoodPreference;
import com.tour.cedro.indietrippers.enums.Trip.HostPreference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "trip")
public class Trip {

    @Id @GeneratedValue
    private long Id;

    private List<TripType> tripProfile;

    private double budget;

    private List<HostPreference> hostPreferences;

    private List<FoodPreference> foodPreferences;

    private List<PlacesPreference> placesPreferences;


}
