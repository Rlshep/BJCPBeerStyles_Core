package io.github.rlshep.bjcp2015beerstyles.constants;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BjcpConstantsTest {

    @Test
    public void getKeyValueReturnsCorrectKey() {
        assertEquals("2015 BJCP Mead", BjcpConstants.getKeyValue(BjcpConstants.MEAD_MAP, BjcpConstants.BJCP_MEAD_2015));
        assertEquals("2026 BJCP Mead", BjcpConstants.getKeyValue(BjcpConstants.MEAD_MAP, BjcpConstants.BJCP_MEAD_2026));
        assertEquals(BjcpConstants.BJCP_MEAD_2015, BjcpConstants.MEAD_MAP.get("2015 BJCP Mead"));
        assertEquals(BjcpConstants.BJCP_MEAD_2026, BjcpConstants.MEAD_MAP.get("2026 BJCP Mead"));

        assertEquals("2015 BJCP Cider", BjcpConstants.getKeyValue(BjcpConstants.CIDER_MAP, BjcpConstants.BJCP_CIDER_2015));
        assertEquals("2025 BJCP Cider", BjcpConstants.getKeyValue(BjcpConstants.CIDER_MAP, BjcpConstants.BJCP_CIDER_2025));
        assertEquals(BjcpConstants.BJCP_CIDER_2015, BjcpConstants.CIDER_MAP.get("2015 BJCP Cider"));
        assertEquals(BjcpConstants.BJCP_CIDER_2025, BjcpConstants.CIDER_MAP.get("2025 BJCP Cider"));

    }

}
