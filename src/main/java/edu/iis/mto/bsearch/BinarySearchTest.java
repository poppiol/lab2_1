package edu.iis.mto.bsearch;


import org.junit.Test;
import org.junit.Assert;

public class BinarySearchTest {

    @Test
    public void searchTestElementIsInSeq() {
        int[] seq = {7};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void searchTestElementIsNotInSeq() {
        int[] seq = {7};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertFalse(sr.isFound());
    }

    @Test
    public void searchTestElementIsFirstInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertEquals(1,sr.getPosition());
    }

    @Test
    public void searchTestElementIsLastInSeq() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(10, seq);
        Assert.assertEquals(11,sr.getPosition());
    }
}
