package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/8/17.
 */
public class CDTest {
    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        CD cd = new CD("CD 1");
        assertEquals(true, cd instanceof CD);
    }

    @Test
    public void PostInstantiatesWithContent_true() throws Exception {
        CD cd = new CD("CD 1");
        assertEquals("CD 1", cd.getContent());
    }

    @After
    public void tearDown() {
        CD.clearAllPosts(); //clear out all the posts before each test.
    }

    @Test
    public void AllPostsAreCorrectlyReturned_true() {
        CD cd = new CD("CD 1");
        CD othercd = new CD ("How to pair successfully");
        assertEquals(2, CD.getAll().size());
    }

    @Test
    public void AllPostsContainsAllPosts_true() {
        CD cd = new CD("CD 1");
        CD othercd = new CD ("How to pair successfully");
        assertTrue(CD.getAll().contains(cd));
        assertTrue(CD.getAll().contains(othercd));
    }
}