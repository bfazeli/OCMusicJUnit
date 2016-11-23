package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.Assert.*;

import static junit.framework.Assert.*;

/**
 * Created by bijanfazeli on 11/22/16.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {

        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test Title");
        mMusicEvent.setDate("09102020");
        mMusicEvent.setDay("Monday");
        mMusicEvent.setTime("90:34");
        mMusicEvent.setLocation("Norwalk");
        mMusicEvent.setAddress1("10824 Tonibar st");
        mMusicEvent.setAddress2("Norwalk, Ca 90650");
        mMusicEvent.setImageName("BenFoldsAndAPiano");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        //assertEquals("You done goofed.", "", mMusicEvent.getTitle());
        //assertNull("Expected the title to be NULL", mMusicEvent.getTitle());
        assertEquals("Test title", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertNotNull(mMusicEvent.getDate());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("Saturday", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("10:30", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("Norwalk", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("10824 Tonibar st", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {
        assertEquals("Norwalk, Ca 90650", mMusicEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception {
        assertNotNull(mMusicEvent.getImageName());
    }

}