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
}
