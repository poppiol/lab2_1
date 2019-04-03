package edu.iis.mto.bsearch;


import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.Matchers.is;

public class BinarySearchTest {

    @Test
    public void searchTestElementIsInSequenceWithOneElement() {
        int[] seq = {7};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }

    @Test
    public void searchTestElementIsNotInSequenceWithOneElement() {
        int[] seq = {7};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test
    public void searchTestElementIsFirstInSequenceWithMoreThanOneElement() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertEquals(1, sr.getPosition());
    }

    @Test
    public void searchTestElementIsLastInSequenceWithMoreThanOneElement() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(10, seq);
        Assert.assertEquals(seq.length, sr.getPosition());
    }

    @Test
    public void searchTestElementIsInTheMiddleInSequenceWithMoreThanOneElement() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertEquals(seq.length / 2 + 1, sr.getPosition());
    }

    @Test
    public void searchTestElementIsNotInSequenceWithMoreThanOneElement() {
        int[] seq = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchResult sr = BinarySearch.search(12, seq);
        Assert.assertFalse(sr.isFound());
    }

    @Test(expected = NullPointerException.class)
    public void searchTestWhereSequenceIsNull() {
        int[] seq = null;
        BinarySearch.search(5, seq);
    }

    @Test
    public void searchTestWhereSequenceIsEmpty() {
        int[] seq = {};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test
    public void searchTestWhenElementsInSeqAreNegative() {
        int[] seq = {-1, -2, -3};
        SearchResult sr = BinarySearch.search(-2, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }

    @Test
    public void searchTestWhenElementsInSeqAreSortedInDescOrder() {
        int[] seq = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test
    public void searchTestWhenElementsInSeqAreNotSorted() {
        int[] seq = {10, 1, 9, 2, 8, 3, 7, 4, 5};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }
}
