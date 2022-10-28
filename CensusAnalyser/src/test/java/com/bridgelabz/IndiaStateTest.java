package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class IndiaStateTest {
    private static final String INDIA_STATE_CSV_FILE_PATH = "./src/test/resources/IndiaStateCode.csv";
    @Test
    public void givenIndiaStateCSVFile_ShouldReturnCorrectRecordCount(){
        try {
            IndiaState indiaState = new IndiaState();
            int numOfRecords = indiaState.loadIndiaStateCSV(INDIA_STATE_CSV_FILE_PATH);
            Assert.assertEquals(36,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}