package com.example.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth.examples.tonr.GoogleService;
import org.springframework.stereotype.Component;

@Path("/picasa")
@Produces(MediaType.APPLICATION_JSON)
@Component
public class PicasaService {

    @Autowired
    private GoogleService googleService;

    @GET
    public String getFirstPictureUrl() {
        List<String> lastTenPicasaPictureURLs = googleService.getLastTenPicasaPictureURLs();
        return lastTenPicasaPictureURLs.get(0);
    }
}
