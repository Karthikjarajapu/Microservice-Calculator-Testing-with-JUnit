package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;  // Updated import statement
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StateMgmtTest {

    @Test
    void testStateCount() {
        IStateMgmt istatemgmt = new StateManagement();
        assertTrue(istatemgmt.getStateCount() == 28);  // Using assertTrue from JUnit 5
    }

    @Test
    void testStateContent() {
        List<String> stateList = new ArrayList<>();
        stateList.add("Andhra Pradesh");
        stateList.add("Assam");
        stateList.add("Bihar");

        IStateMgmt istatemgmt = Mockito.mock(IStateMgmt.class);
        when(istatemgmt.getStateList()).thenReturn(stateList);
        Assertions.assertThat(istatemgmt.getStateList().get(0).equals("Andhra Pradesh"));
    }
}
