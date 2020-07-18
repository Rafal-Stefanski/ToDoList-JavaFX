package com.rafalstefanski.radio;

public class App {

}
// https://stackoverflow.com/questions/11098353/implement-java-fm-radio
/*
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class App //RadioConnector
{
    public static void main ( String[] args )
    {
        try
        {
            playRadioStream ( "http://radio.flex.ru:8000/radionami" );
        }
        catch ( IOException e )
        {
            e.printStackTrace ();
        }
        catch ( JavaLayerException e )
        {
            e.printStackTrace ();
        }
    }

    private static void playRadioStream ( String spec ) throws IOException, JavaLayerException
    {
        // Connection
        URLConnection urlConnection = new URL ( spec ).openConnection ();

        // If you have proxy
        //        Properties systemSettings = System.getProperties ();
        //        systemSettings.put ( "proxySet", true );
        //        systemSettings.put ( "http.proxyHost", "host" );
        //        systemSettings.put ( "http.proxyPort", "port" );
        // If you have proxy auth
        //        BASE64Encoder encoder = new BASE64Encoder ();
        //        String encoded = encoder.encode ( ( "login:pass" ).getBytes () );
        //        urlConnection.setRequestProperty ( "Proxy-Authorization", "Basic " + encoded );

        // Connecting
        urlConnection.connect ();

        // Playing
        Player player = new Player ( urlConnection.getInputStream () );
        player.play ();
    }
}*/