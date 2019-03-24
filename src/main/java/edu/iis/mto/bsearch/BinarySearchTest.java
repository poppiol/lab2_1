package edu.iis.mto.bsearch;


import org.junit.Test;
import org.junit.Assert;

public class BinarySearchTest {

    @Test
    public void searchTest() {
        int[] seq = {7};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertTrue(sr.isFound());
    }
}
