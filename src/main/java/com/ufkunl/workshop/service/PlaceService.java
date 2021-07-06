package com.ufkunl.workshop.service;

import com.ufkunl.workshop.util.GenericServiceResult;
import org.json.simple.parser.ParseException;

public interface PlaceService {

    GenericServiceResult getPlaces(String longitude, String latitude, String radius) throws ParseException;

}
