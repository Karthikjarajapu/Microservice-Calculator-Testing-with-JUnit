package com.wipro.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class IUtilTest {

    @Test
    public void testIsWorkdayToday() {
        LocalDate mockDate = LocalDate.of(2024, 4, 18);
        LocalDateUtils localDateUtils = Mockito.mock(LocalDateUtils.class);
        Mockito.when(localDateUtils.now()).thenReturn(mockDate);
        IUtil util = new UtilImpl(localDateUtils);
        Assertions.assertTrue(util.isWorkdayToday());
    }
    
    private static class UtilImpl implements IUtil {
        private final LocalDateUtils localDateUtils;
        public UtilImpl(LocalDateUtils localDateUtils) {
            this.localDateUtils = localDateUtils;
        }
        @Override
        public boolean isWorkdayToday() {
            DayOfWeek dayOfWeek = localDateUtils.now().getDayOfWeek();
            return !(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);
        }
    }
}
