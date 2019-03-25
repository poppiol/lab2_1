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

    @Test
    public void searchTestWhereSequenceIsNull() {
        int[] seq = null;
        try {
            BinarySearch.search(5, seq);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void searchTestWhereSequenceIsEmpty() {
        int[] seq = {};
        try {
            BinarySearch.search(5, seq);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void searchTestWhenElementsInSeqAreNegative() {
        int[] seq = {-1, -2, -3};
        SearchResult sr = BinarySearch.search(-2, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }
}
